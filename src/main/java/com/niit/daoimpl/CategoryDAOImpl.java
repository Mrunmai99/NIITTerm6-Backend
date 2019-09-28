package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Category> getCategoryList() {
		@SuppressWarnings("unchecked")
		List<Category> categorylist =sessionFactory.getCurrentSession().createQuery("from Category").list();
		return categorylist;
		
	}

	public Category getCategoryById(int categoryId) {
		Category categoryidlist = sessionFactory.getCurrentSession().get(Category.class, categoryId);
		return categoryidlist;
	}

	

	public boolean addCategory(Category category) {
		sessionFactory.getCurrentSession().save(category);
		return true;
	}

	public boolean updateCategory(Category category) {
		sessionFactory.getCurrentSession().update(category);
		return true;
	}

	public boolean deleteCategory(Category category) {
		sessionFactory.getCurrentSession().delete(category);
		return true;
	}

	public List<Category> getCategoryByName(String categoryName) {
		return (List<Category>) sessionFactory.getCurrentSession().createQuery("from Category where categoryName =" + "'"+ categoryName + "'" ).list();
	
		}

}
