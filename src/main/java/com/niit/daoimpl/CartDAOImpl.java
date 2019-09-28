package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CartDAO;
import com.niit.model.Cart;
import com.niit.model.User;

@Repository
@Transactional
public class CartDAOImpl implements CartDAO {

	@Autowired(required=true)
	SessionFactory sessionFactory;
	
	public final static Logger logger = Logger.getLogger(UserDAOImpl.class);
	
	public boolean addCart(Cart cart) {
		sessionFactory.getCurrentSession().createQuery("from Cart").list();
		return true;
	}

	public boolean deleteCart(Cart cart) {
		sessionFactory.getCurrentSession().delete(cart);
		return true;
	}

	public List<Cart> getCartList() {
		@SuppressWarnings("unchecked")
		List<Cart> getUserList = sessionFactory.getCurrentSession().createQuery("from cart").list();
		return getCartList();
		
	}

	public Cart getCartById(int cartId) {
		Cart cart = (Cart) sessionFactory.getCurrentSession().createQuery("from cart where cartId like "+ "'%"+cartId + "%'").list();
		return cart;
	}

	
}
