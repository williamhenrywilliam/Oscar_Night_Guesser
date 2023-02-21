package com.walton.oscarNightGuesser.controller;

import com.walton.oscarNightGuesser.dao.CategoryDao;
import com.walton.oscarNightGuesser.model.Category;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/categories")
public class CategoryController {

    private CategoryDao categoryDao;
    private JdbcTemplate jdbcTemplate;

    public CategoryController(CategoryDao categoryDao){
        this.categoryDao = categoryDao;
    }

    @RequestMapping(path = "/id/{id}", method = RequestMethod.GET)
    public Category getCategoryById(@PathVariable int id){
        return categoryDao.getCategoryById(id);
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Category> getAllCategories(){
        return categoryDao.getAllCategories();
    }


}
