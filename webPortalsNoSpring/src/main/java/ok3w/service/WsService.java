package ok3w.service;

import java.util.List;
import java.util.Map;

import ok3w.entity.Admin;
import ok3w.entity.Article;
import ok3w.entity.Clazz;
import ok3w.entity.UrlLink;
import wsClient.IServiceWsImp;
import wsClient.IServiceWsImpService;

public class WsService implements IService {
	private static IServiceWsImp wsPort=null;
	private IServiceWsImp getWsPort()
	{
		if(wsPort==null)
			wsPort= new IServiceWsImpService().getIServiceWsImpPort();
	    return wsPort;
	}
	@Override
	public List<Article> QueryArticlesByAttr(String attr, Object value, String paixu) {
		
		return getWsPort().queryArticlesByAttr(attr, value, paixu);
	}

	@Override
	public List<UrlLink> getUrlLinks() {
		
		return getWsPort().getUrlLinks();
	}

	@Override
	public Article getMoveArticle() {
		
		return getWsPort().getMoveArticle();
	}

	@Override
	public List<Article> getPicList() {
		
		return getWsPort().getPicList();
	}

	@Override
	public String articlePagination(int pageNum, int numsPerPage) {
		
		return getWsPort().articlePagination(pageNum, numsPerPage);
	}

	@Override
	public List<Article> listArticlesByPage(int pageNum, int numsPerPage) {
		
		return getWsPort().listArticlesByPage(pageNum, numsPerPage);
	}

	@Override
	public Map<String, String> getArticlePath(Article art) {
		
		return getWsPort().getArticlePath(art).toMap();
	}

	@Override
	public Map<String, String> getClassPath(Clazz clazz) {
		
		return getWsPort().getClassPath(clazz).toMap();
	}

	@Override
	public Map<String, String> getClassPathInAdmin(Clazz clazz) {
		
		return getWsPort().getClassPathInAdmin(clazz).toMap();
	}

	@Override
	public Map<String, String> getSortNames() {
		
		return getWsPort().getSortNames().toMap();
	}

	@Override
	public List<Clazz> buildListSorts(List<Clazz> in) {
		
		return getWsPort().buildListSorts(in);
	}

	@Override
	public List<Clazz> listSorts() {
		
		return getWsPort().listSorts();
	}

	@Override
	public void articleSaveOrUpdate(Article art) {
		
		getWsPort().articleSaveOrUpdate(art);
	}

	@Override
	public void addArticleHits(Article art) {
		
		getWsPort().addArticleHits(art);
	}

	@Override
	public void setArticleProperry(String cmd, int articleId) {
		
		getWsPort().setArticleProperry(cmd, articleId);
	}

	@Override
	public Article getArticleFull(int id) {
		
		return getWsPort().getArticleFull(id);
	}

	@Override
	public Article getArticleSimple(int id) {
		
		return getWsPort().getArticleSimple(id);
	}

	@Override
	public List<Clazz> listClassChild(int id) {
		
		return getWsPort().listClassChild(id);
	}

	@Override
	public List<Article> getClassArticles(int id) {
		
		return getWsPort().getClassArticles1P(id);
	}

	@Override
	public List<Article> getClassArticles(int id, int count) {
		
		return getWsPort().getClassArticles2P(id, count);
	}

	@Override
	public List<Article> getClassArticlesOrderByHits(int id, int count) {
		
		return getWsPort().getClassArticlesOrderByHits(id, count);
	}

	@Override
	public List<Article> getClassArticlesOrderAddTime(int id, int count) {
		
		return getWsPort().getClassArticlesOrderAddTime(id, count);
	}

	@Override
	public Clazz getClassWithChild(int id) {
		
		return getWsPort().getClassWithChild(id);
	}

	@Override
	public Clazz getClass(int id) {
		
		return getWsPort().getClass1P(id);
	}

	@Override
	public Clazz getClass(int parentId, int orderId) {
		
		return getWsPort().getClass2P(parentId, orderId);
	}

	@Override
	public void delClass(Clazz clazz) {
		
		getWsPort().delClass(clazz);
	}

	@Override
	public void ClassSaveOrUpdate(Clazz clazz) {
		
		getWsPort().classSaveOrUpdate(clazz);
	}

	@Override
	public boolean validate(String user, String pwd) {
		
		return getWsPort().validate(user, pwd);
	}

	@Override
	public Admin getAdmin(String name) {
		
		return getWsPort().getAdmin(name);
	}

	@Override
	public int updateAdmin(Admin user) {
		
		return getWsPort().updateAdmin(user);
	}

}
