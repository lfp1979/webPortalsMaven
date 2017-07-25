package ok3w.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import ok3w.entity.Clazz;
@Stateless(name="classDao")
public class ClassDao extends BaseDao<Clazz> {
	public List<Clazz> getChild(int id)
	{
		return getEm().createQuery("select c from Clazz as c where c.parent.id=:parentId order by orderID")
		.setParameter("parentId", id).getResultList();
	}
	public Clazz find(int parentId,int orderId)
	{
		Clazz clazz=(Clazz) getEm()
		.createQuery("select  c from Clazz as c where c.parent.id=:parentId and c.orderID=:orderId")
		.setParameter("parentId", parentId).setParameter("orderId", orderId).getSingleResult();
		return clazz;
		
	}
	
}
