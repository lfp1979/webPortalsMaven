package ok3w.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import ok3w.entity.Admin;
import ok3w.util.MD5;
@Stateless(name="adminDao")
public class AdminDao extends BaseDao<Admin> {
	
	public boolean validate(String user,String pwd) {
		MD5 md5=new MD5();
		pwd=md5.getMD5ofStr(pwd);  
		List list=(List) getEm()
				.createQuery("from Admin where adminName=:adminName and adminPwd=:adminPwd")
				.setParameter("adminName", user).setParameter("adminPwd", pwd)
				.getResultList();
		return  !list.isEmpty();
	    }
	
	public Admin get(String name)  {
		Admin admin=(Admin) getEm()
				.createQuery("from Admin where adminName=:adminName")
				.setParameter("adminName", name)
				.getSingleResult();
		return  admin;
	  }
}
