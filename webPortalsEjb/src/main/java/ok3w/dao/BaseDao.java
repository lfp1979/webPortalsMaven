package ok3w.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao<T>
{
	@PersistenceContext(unitName="mysql")
	protected EntityManager em;
	
	protected static Class getGenericType(Class clazz){
		Type genType = clazz.getGenericSuperclass();//得到泛型父类  
		Type[] types = ((ParameterizedType) genType).getActualTypeArguments();
		if (!(types[0] instanceof Class)) {
            return Object.class;   
        } 
		return (Class) types[0];
	}
	 public EntityManager getEm() {
		return em;
	}
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	public T get(int id)
	  {
		  T rt= (T) em.find(getGenericType(this.getClass()), id);
		  return rt;
	  }
	public int saveOrUpdate(T obj)
	  {
		em.merge(obj);
		return 0;
	  }
	public int update(T obj)
	  {
		 em.merge(obj);
	      return 0;
	  }
	public int add(T obj)
	  {
		   em.persist(obj);
		   return 0;
	  }
	
	public int delete(T obj)
	    {
		    em.remove(obj);
			return 0;
	    }
	public int getCount()
	  {
		 String sql="select count(c) from "+getGenericType(getClass()).getName()+" c";
		  Object obj = em.createQuery(sql).getSingleResult();
		  int result=((Long) obj).intValue();;
		  return result;
	  }
	public List<T> list()
	  {
		 ArrayList<T> alist=new ArrayList<T> ();
		 String sql="from "+getGenericType(getClass()).getName();
		  alist = (ArrayList<T>) em.createQuery(sql).getResultList();
		  return alist;
	  }
	public int del(Object id) {
		em.remove(get((int) id));
		return 0;
	}
	public List<T> QueryByAttr(String attr,Object value, String paixu)
	  {
		
		 String className=getGenericType(getClass()).getName();
		 ArrayList<T> alist=new ArrayList<T> ();
		 String sql="from "+className+" where "+attr+" like :value order by "+paixu+" DESC";
		  alist = (ArrayList<T>) em.createQuery(sql)
				  .setParameter("value", "%"+value+"%").getResultList();
	
		  return alist;
	  }

}
