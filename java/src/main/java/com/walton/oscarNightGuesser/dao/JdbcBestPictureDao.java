package com.walton.oscarNightGuesser.dao;

import com.walton.oscarNightGuesser.model.BestPicture;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class JdbcBestPictureDao implements BestPictureDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcBestPictureDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<BestPicture> getBestPictures() {
        List<BestPicture> bestPictures = new ArrayList<>();
        String sql = "SELECT * FROM categories";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            bestPictures.add(mapRowToBestPicture(results));
        }
        return bestPictures;
    }

    private BestPicture mapRowToBestPicture(SqlRowSet rowSet){
        BestPicture bestPicture = new BestPicture();
        bestPicture.setBestPictureId(rowSet.getInt("id"));
        bestPicture.setNominationOneTop(rowSet.getString("nomination_1_top"));
        bestPicture.setNominationTwoTop(rowSet.getString("nomination_2_top"));
        bestPicture.setNominationThreeTop(rowSet.getString("nomination_3_top"));
        bestPicture.setNominationFourTop(rowSet.getString("nomination_4_top"));
        bestPicture.setNominationFiveTop(rowSet.getString("nomination_5_top"));
        bestPicture.setNominationSixTop(rowSet.getString("nomination_6_top"));
        bestPicture.setNominationSevenTop(rowSet.getString("nomination_7_top"));
        bestPicture.setNominationEightTop(rowSet.getString("nomination_8_top"));
        bestPicture.setNominationNineTop(rowSet.getString("nomination_9_top"));
        bestPicture.setNominationTenTop(rowSet.getString("nomination_10_top"));
        bestPicture.setUserSelection(rowSet.getInt("user_selection"));
        bestPicture.setWinner(rowSet.getInt("winner"));
        bestPicture.setUserResults(rowSet.getString("user_results"));
        return bestPicture;
    }
}
