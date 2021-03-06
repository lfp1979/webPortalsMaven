package ok3w.service;

import java.util.*;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagementType;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;

import ok3w.dao.AdminDao;
import ok3w.dao.ArticleDao;
import ok3w.dao.ClassDao;
import ok3w.dao.UrlLinkDao;
import ok3w.entity.Admin;
import ok3w.entity.Article;
import ok3w.entity.Clazz;
import ok3w.entity.UrlLink;
import ok3w.util.Util;
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class IServiceImp implements IService {
	@EJB(beanName="articleDao")
	private ArticleDao articleDao;
	@EJB(beanName="urlLinkDao")
	private UrlLinkDao urlLinkDao;
	@EJB(beanName="adminDao")	
	private AdminDao adminDao;
	@EJB(beanName="classDao")
	private ClassDao classDao;
	
	/* (non-Javadoc)
	 * @see ok3w.service.IService#QueryArticlesByAttr(java.lang.String, java.lang.Object, java.lang.String)
	 */
	@Override
	public List<Article> QueryArticlesByAttr(String attr,Object value, String paixu)
	  {
			return  articleDao.QueryByAttr(attr, value,paixu);
	  }
	
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getUrlLinks()
	 */
	@Override
	public List<UrlLink> getUrlLinks()
	{
		return  urlLinkDao.list();
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getMoveArticle()
	 */
	@Override
	public Article getMoveArticle()
	{
		return articleDao.getMoveArticle();
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getPicList()
	 */
	@Override
	public List<Article> getPicList()
	{
		return  articleDao.getPicList();
	}
		/* (non-Javadoc)
		 * @see ok3w.service.IService#articlePagination(int, int)
		 */
	@Override
	public String articlePagination(int pageNum,int numsPerPage)
	{
		int recordCount=articleDao.getCount();
		int pageCount=recordCount/numsPerPage+1;
		String pageUrl="Article_list";
		return Util.getPagination(pageNum, pageCount, recordCount, pageUrl);
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#listArticlesByPage(int, int)
	 */
	@Override
	public List<Article> listArticlesByPage(int pageNum,int numsPerPage)
	{
		return  articleDao.listPage(pageNum, numsPerPage);
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getArticlePath(ok3w.entity.Article)
	 */
	@Override
	public Map<String,String> getArticlePath(Article art)
	{
		
		 Map<String,String> path=new LinkedHashMap();
		 Map<String, String> sortNames = getSortNames();
		 String pathStr[]=art.getSortPath().split(",");
		 String name,url;
		 for(String id:pathStr)
		 {
			 if(id.equals("0"))
			 {
				 name="网站首页";
				 url="/webPortals/Article_index";
			 }
			 else
			 {
				 name=sortNames.get(id);
				 url="Article_getClassArticles?classId="+id;
			 }
			 path.put(name, url);
		 }
		return path;
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getClassPath(ok3w.entity.Clazz)
	 */
	@Override
	public Map<String,String> getClassPath(Clazz clazz)
	{
		 Map<String,String> path=new LinkedHashMap();
		 Map<String, String> sortNames = getSortNames();
		 String pathStr[]=clazz.getSortPath().split(",");
		 String name,url;
		 for(String id:pathStr)
		 {
			 if(id.equals("0"))
			 {
				 name="网站首页";
				 url="/webPortals/Article_index";
			 }
			 else
			 {
				 name=sortNames.get(id);
				 url="Article_getClassArticles?classId="+id;
			 }
			 path.put(name, url);
		 }
		return path;
	}
	
	

	/* (non-Javadoc)
	 * @see ok3w.service.IService#getClassPathInAdmin(ok3w.entity.Clazz)
	 */
	@Override
	public Map<String,String> getClassPathInAdmin(Clazz clazz)
	{
		 Map<String,String> path=new LinkedHashMap();
		 Map<String, String> sortNames = getSortNames();
		 String pathStr[]=clazz.getSortPath().split(",");
		 String name,url;
		 for(String id:pathStr)
		 {
			 if(id.equals("0"))
			 {
				 name="顶级类别";
			 }
			 else
			 {
				 name=sortNames.get(id);
			 }
			 url="Class_list?id="+id;
			 path.put(name, url);
		 }
		return path;
	}
	
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getSortNames()
	 */
	@Override
	public  Map<String,String> getSortNames()
	{
		 LinkedHashMap<String,String> map=new LinkedHashMap();
		 map.put("0", "最近更新");
		 ArrayList<Clazz> list=(ArrayList<Clazz>) classDao.list();
		 for(Clazz cla:list)
			 map.put(String.valueOf(cla.getId()) , cla.getSortName());
		return map;
		
	}
	//only called by ArticleAdmin.prepare()
	/* (non-Javadoc)
	 * @see ok3w.service.IService#buildListSorts(java.util.List)
	 */
	@Override
	public  List<Clazz> buildListSorts(List<Clazz> in)
	{
		List<Clazz> out=new ArrayList<>();
		for(Clazz c:in)
		 {
			if(c.getParent()!=null)
			if(c.getParent().getId()==0)
				buildListSorts(c.getId(),in,out);
		 }
		return out;
	}
	private  void buildListSorts(int classId,List<Clazz> in,List<Clazz>out)
	{
		
		for(Clazz c:in)
		 {
			if (c.getId() == classId) {
				out.add(c);
				// change sortName to "|--sortName"
				int layer = c.getSortPath().split(",").length - 2;
				StringBuffer sf = new StringBuffer();
				sf.append('|');
				for (int i = 0; i < layer; i++) {
					sf.append("--");
				}
				sf.append(c.getSortName());
				c.setSortName(sf.toString());
			}
		}
		for(Clazz c:in)
		 {
			if(c.getParent()!=null)
			if(c.getParent().getId()==classId)
				buildListSorts(c.getId(),in,out);
		 }
	}
	
	/* (non-Javadoc)
	 * @see ok3w.service.IService#listSorts()
	 */
	@Override
	public List<Clazz> listSorts()
	{
		return (List<Clazz>) classDao.list();
	}
	
	/* (non-Javadoc)
	 * @see ok3w.service.IService#articleSaveOrUpdate(ok3w.entity.Article)
	 */
	@Override
	public void articleSaveOrUpdate(Article art)
	{
		if(art.getId()==0)
		{
			art.setClazz(classDao.get(art.getClazz().getId()));
			articleDao.add(art);
		}
		else
		{
			art.setClazz(classDao.get(art.getClazz().getId()));
			articleDao.update(art);
		}
		
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#addArticleHits(ok3w.entity.Article)
	 */
	@Override
	public void addArticleHits(Article art)
	{
		art.setHits(art.getHits()+1);
		articleDao.update(art);
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#setArticleProperry(java.lang.String, int)
	 */
	@Override
	public void setArticleProperry(String cmd,int articleId)
	{
		Article art=articleDao.get(articleId);
		switch (cmd)
		{
			case "commend":
				art.setIsCommend(true);
				break;
			case "uncommend":
				art.setIsCommend(false);
				break;
			case "pic":
				art.setIsPic(true);
				break;
			case "unpic":
				art.setIsPic(false);
				break;
			case "del":
				articleDao.del(articleId);
			
				return;
			case "top":
				art.setIsTop(true);
				break;
			case "untop":
				art.setIsTop(false);
				break;
			case "pass":
				art.setIsPass(true);
				break;
			case "unpass":
				art.setIsPass(false);
				break;
		}
		articleDao.update(art);
	}
	
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getArticleFull(int)
	 */
	
	@Override
	public Article getArticleFull(int id)
	{
		return articleDao.get(id);
		
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getArticleSimple(int)
	 */
	@Override
	public Article getArticleSimple(int id)
	{
		return null;
		
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#listClassChild(int)
	 */
	@Override
	public List<Clazz> listClassChild(int id) 
	{
		
			return   classDao.getChild(id);
		
	}
	//获得所有此分类下（包括子分类）的文章列表
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getClassArticles(int)
	 */
	
	@Override
	public List<Article> getClassArticles(int id)
	{
		return  articleDao.getClassArticles(id);
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getClassArticles(int, int)
	 */
	
	@Override
	public List<Article> getClassArticles(int id,int count)
	{
		return  articleDao.getClassArticles(id,count);
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getClassArticlesOrderByHits(int, int)
	 */
	@Override
	public List<Article> getClassArticlesOrderByHits(int id,int count)
	{
		return  articleDao.getClassArticlesOrderByHits(id, count);
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getClassArticlesOrderAddTime(int, int)
	 */
	@Override
	public List<Article> getClassArticlesOrderAddTime(int id,int count)
	{
		return  articleDao.getClassArticlesOrderAddTime(id, count);
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getClassWithChild(int)
	 */
	@Override
	public Clazz getClassWithChild(int id)
	{
	    Clazz clazz= classDao.get(id);
	    clazz.setChild(classDao.getChild(id));
	    return clazz;
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getClass(int)
	 */
	
	@Override
	public Clazz getClass(int id)
	{
		return classDao.get(id);
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getClass(int, int)
	 */

	@Override
	public Clazz getClass(int parentId,int orderId)
	{
		return classDao.find(parentId,orderId);
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#delClass(ok3w.entity.Clazz)
	 */
	@Override
	public void delClass(Clazz clazz)
	{
		 classDao.del(clazz.getId());
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#ClassSaveOrUpdate(ok3w.entity.Clazz)
	 */
	@Override
	public void ClassSaveOrUpdate(Clazz clazz)
	{
		if(clazz.getId()==0)
		{
			clazz.setParent(classDao.get(clazz.getParent().getId()));
			classDao.add(clazz);
			clazz.setSortPath(clazz.getParent().getSortPath() + clazz.getId() + ",");
			classDao.add(clazz);
		}
		else
		{
			clazz.setParent(classDao.get(clazz.getParent().getId()));
			classDao.update(clazz);
			clazz.setSortPath(clazz.getParent().getSortPath() + clazz.getId() + ",");
			classDao.update(clazz);
		}
		
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#validate(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean validate(String user,String pwd)
	{
		return adminDao.validate(user, pwd);
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#getAdmin(java.lang.String)
	 */
	@Override
	public Admin getAdmin(String name)  
	{
		return adminDao.get(name);
	}
	/* (non-Javadoc)
	 * @see ok3w.service.IService#updateAdmin(ok3w.entity.Admin)
	 */
	@Override
	public int updateAdmin(Admin user)  
	{
		return adminDao.update(user);
	}

}
