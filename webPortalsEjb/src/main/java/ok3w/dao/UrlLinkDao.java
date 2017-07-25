package ok3w.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import ok3w.entity.UrlLink;
@Stateless(name="urlLinkDao")
public class UrlLinkDao extends BaseDao<UrlLink> {
	
}
