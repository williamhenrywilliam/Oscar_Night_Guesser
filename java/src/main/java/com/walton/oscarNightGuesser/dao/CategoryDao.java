package com.walton.oscarNightGuesser.dao;

import com.walton.oscarNightGuesser.model.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> getAllCategories();

    Category getCategoryById(int categoryId);
}
