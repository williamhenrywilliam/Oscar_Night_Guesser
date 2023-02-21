package com.walton.oscarNightGuesser.dao;

import com.walton.oscarNightGuesser.model.Category;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcCategoryDao implements CategoryDao{

    private final JdbcTemplate jdbcTemplate;
    public JdbcCategoryDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();
        String sql = "SELECT * FROM categories";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            categories.add(mapRowToCategory(results));
        }
        return categories;
    }

    @Override
    public Category getCategoryById(int categoryId) {
        String sqlCategoryId = "SELECT * FROM categories WHERE id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sqlCategoryId, categoryId);
        if(results.next()){
            return mapRowToCategory(results);
        } else {
            return null;
        }
    }

    private Category mapRowToCategory(SqlRowSet rowSet){
        Category category = new Category();
        category.setCategoryId(rowSet.getInt("id"));
        category.setName(rowSet.getString("category"));
        category.setNominationOneTop(rowSet.getString("nomination_1_top"));
        category.setNominationOneBottom(rowSet.getString("nomination_1_bottom"));
        category.setNominationTwoTop(rowSet.getString("nomination_2_top"));
        category.setNominationTwoBottom(rowSet.getString("nomination_2_bottom"));
        category.setNominationThreeTop(rowSet.getString("nomination_3_top"));
        category.setNominationThreeBottom(rowSet.getString("nomination_3_bottom"));
        category.setNominationFourTop(rowSet.getString("nomination_4_top"));
        category.setNominationFourBottom(rowSet.getString("nomination_4_bottom"));
        category.setNominationFiveTop(rowSet.getString("nomination_5_top"));
        category.setNominationFiveBottom(rowSet.getString("nomination_5_bottom"));
        return category;
    }
}
