package com.niit.dao;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDAO {

	public List<Category> getCategoryList();
	
	public Category getCategoryById(int categoryId);
	
	public List<Category> getCategoryByName(String categoryName);
	
	public boolean addCategory(Category category);
	
	public boolean updateCategory(Category category);
	
	public boolean deleteCategory(Category category);
	
}
