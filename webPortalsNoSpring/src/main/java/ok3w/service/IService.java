package ok3w.service;

import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ok3w.entity.Admin;
import ok3w.entity.Article;
import ok3w.entity.Clazz;
import ok3w.entity.UrlLink;
@Remote
public interface IService {

	List<Article> QueryArticlesByAttr(String attr, Object value, String paixu);

	List<UrlLink> getUrlLinks();

	Article getMoveArticle();

	List<Article> getPicList();

	/**
		 * @param pageNum 页码
		 * @param numsPerPage 每页记录数
		 * @return  分页导航条
		 */
	String articlePagination(int pageNum, int numsPerPage);

	/**
	 * @param pageNum 页码
	 * @param numsPerPage 每页记录数
	 * @return  
	 */
	List<Article> listArticlesByPage(int pageNum, int numsPerPage);

	/**
	 * 
	 * @return 
	 * the first String is sortName,second is url 
	 */
	
	Map<String, String> getArticlePath(Article art);
	Map<String, String> getClassPath(Clazz clazz);
	Map<String, String> getClassPathInAdmin(Clazz clazz);
	Map<String, String> getSortNames();

	//only called by ArticleAdmin.prepare()
	List<Clazz> buildListSorts(List<Clazz> in);

	/**
	 * must called before buildListSorts(),
	 */
	List<Clazz> listSorts();

	void articleSaveOrUpdate(Article art);

	void addArticleHits(Article art);

	void setArticleProperry(String cmd, int articleId);

	/**
	 * 
	 * @param id is the article's id
	 * @return an article with all property including 
	 * the property of content
	 */

	Article getArticleFull(int id);

	/**
	 * 
	 * @param id is the article's id
	 * @return a simple article without 
	 * the property of content
	 */
	Article getArticleSimple(int id);

	/**
	 * 
	 * @param id the parent id
	 * @return Clazz of child
	 */
	List<Clazz> listClassChild(int id);

	//获得所有此分类下（包括子分类）的文章列表
	List<Article> getClassArticles(int id);

	List<Article> getClassArticles(int id, int count);

	List<Article> getClassArticlesOrderByHits(int id, int count);

	List<Article> getClassArticlesOrderAddTime(int id, int count);

	Clazz getClassWithChild(int id);

	Clazz getClass(int id);

	Clazz getClass(int parentId, int orderId);

	void delClass(Clazz clazz);

	void ClassSaveOrUpdate(Clazz clazz);

	/**
	 * 
	 * @param user
	 * @param pwd
	 * @return 验证用户名密码
	 */
	boolean validate(String user, String pwd);

	Admin getAdmin(String name);

	int updateAdmin(Admin user);

}