package com.niit.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Service.CategoryService;
import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDAO categorydao;
	
	public List<Category> getCategoryList() {
		return categorydao.getCategoryList() ;
	}

	public Category getCategoryById(int categoryId) {
		return categorydao.getCategoryById(categoryId);
	}

	public List<Category> getCategoryByName(String categoryName) {
		return categorydao.getCategoryByName(categoryName);
	}

	public boolean addCategory(Category category) {
		categorydao.addCategory(category);
		return true;
	}

	public boolean updateCategory(Category category) {
		categorydao.updateCategory(category);
		return true;
	}

	public boolean deleteCategory(Category category) {
		categorydao.deleteCategory(category);
		return true;
	}

}
