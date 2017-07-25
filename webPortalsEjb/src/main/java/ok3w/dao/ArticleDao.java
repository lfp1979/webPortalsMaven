package ok3w.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import ok3w.entity.Article;
@Stateless(name="articleDao")
public class ArticleDao extends BaseDao<Article> {
	
	
	public Article getMoveArticle()
	{
		String sql="from Article where isMove=true and isPass=true";
		List list =getEm().createQuery(sql).getResultList();
		Article a=(Article) list.get(0);
		return a;
		
	}
	public List<Article> getPicList()
	{
		String sql="from Article where isPlay=true and isPass=true";
		List list = getEm().createQuery(sql).getResultList();
		return list;
		
	}
	/**
	 * 
	 * @param id classid,count number limit
	 * @return 获得所有此分类下（包括子分类）的文章列表
	 */
	public List<Article> getClassArticles(int id,int count)
	{
		String sql="SELECT * from ok3w_article WHERE FIND_IN_SET(:id,SortPath)"
				+ " and isPass=true ORDER BY isTop DESC,isCommend DESC,addTime DESC";
		List<Article> list =(List<Article>) getEm().createNativeQuery(sql,Article.class)
				.setMaxResults(count).setParameter("id", id).getResultList();
		return list;
		
	}
	public List<Article> getClassArticles(int id)
	{
		String sql="SELECT * from ok3w_article WHERE FIND_IN_SET(:id,SortPath)"
				+ "and isPass=true ORDER BY isTop DESC,isCommend DESC,addTime DESC";
		List<Article> list =(List<Article>) getEm().createNativeQuery(sql,Article.class)
				.setParameter("id", id).getResultList();
		return list;
		
	}
	public List<Article> getClassArticlesOrderByHits(int id,int count)
	{
		String sql="SELECT * from ok3w_article WHERE FIND_IN_SET(:id,SortPath)"
				+ " and isPass=true ORDER BY Hits DESC";
		List<Article> list =(List<Article>) getEm().createNativeQuery(sql,Article.class)
				.setMaxResults(count).setParameter("id", id).getResultList();
		return list;
	}
	public List<Article> getClassArticlesOrderAddTime(int id,int count)
	{
		String sql="SELECT * from ok3w_article WHERE FIND_IN_SET(:id,SortPath)"
				+ " and isPass=true ORDER BY addTime DESC";
		List<Article> list =(List<Article>) getEm().createNativeQuery(sql,Article.class)
				.setMaxResults(count).setParameter("id", id).getResultList();
		return list;
	}
	public List<Article> listDesc()
	{
		String sql="from Article ORDER BY isTop DESC,isCommend DESC,addTime DESC";
		List list = getEm().createQuery(sql).getResultList();
		return list;
		
	}
	/**
	 * 分页显示
	 * @param page 页码
	 * @param count 每页记录数
	 * @return
	 */
	public List<Article> listPage(int page,int count)
	{
		String sql="from Article ORDER BY id";
		List list = getEm().createQuery(sql)
				.setFirstResult((page-1)*count)
				.setMaxResults(count)
				.getResultList();
		return list;
		
	}
}
