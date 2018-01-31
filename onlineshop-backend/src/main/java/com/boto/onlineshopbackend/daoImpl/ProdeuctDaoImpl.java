package com.boto.onlineshopbackend.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.criterion.DetachedCriteria;import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.boto.onlineshopbackend.dao.ProdeuctDao;
import com.boto.onlineshopbackend.dto.Prodeuct;

@Repository("prodeuctDao")
@Transactional
public class ProdeuctDaoImpl implements ProdeuctDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	/*
	 * get single Prodeuct by id
	 */
	public Prodeuct getProdeuctById(Integer id) {

		return hibernateTemplate.get(Prodeuct.class, id);
	}

	/*
	 * Get all Prodeuct
	 * */
	
	
	@SuppressWarnings("unchecked")
	public List<Prodeuct> FindAllProdeuct() {
		
		return (List<Prodeuct>) hibernateTemplate.findByNamedQuery("Prodeuct.findall");
	}

	
	

	@SuppressWarnings("unchecked")
	public List<Prodeuct> ListActiveProdeuct() {
		// TODO Auto-generated method stub
		return (List<Prodeuct>) hibernateTemplate.findByNamedQueryAndNamedParam("Prodeuct.findallActive", "active", true);
	}

	@SuppressWarnings("unchecked")
	public List<Prodeuct> ListActiveProdeuctByCategory(Integer categoryId) {
		
		String query = "From Prodeuct Where active = :active and categoryId = :categoryid"; 
		return (List<Prodeuct>) hibernateTemplate.findByNamedParam(query, new String[]{"active","categoryid"}, new Object[]{true,categoryId});
	}

	@SuppressWarnings("unchecked")
	public List<Prodeuct> getLatsetActiveProdeucts(Integer count) {
		// TODO Auto-generated method stub
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Prodeuct.class);
		detachedCriteria.add(Restrictions.eq("active", true));

		return (List<Prodeuct>) hibernateTemplate.findByCriteria(detachedCriteria, 0, count);
	}

	

	public Boolean add(Prodeuct Prodeuct) {
		hibernateTemplate.persist(Prodeuct);
		return true ;
	}

	public Boolean update(Prodeuct Prodeuct) {
		hibernateTemplate.update(Prodeuct);
		return true ;
	}
 
	public Boolean delete(Prodeuct Prodeuct) {
		Prodeuct.setActive(false);
		hibernateTemplate.update(Prodeuct);
		return true ;
	}

}
