package com.walton.oscarNightGuesser.controller;

import com.walton.oscarNightGuesser.dao.BestPictureDao;
import com.walton.oscarNightGuesser.model.BestPicture;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class BestPictureController {
    private BestPictureDao bestPictureDao;

    private JdbcTemplate jdbcTemplate;

    public BestPictureController(BestPictureDao bestPictureDao){
        this.bestPictureDao = bestPictureDao;
    }

    @GetMapping(value = "/pictures")
    public List<BestPicture> getBestPictures(){
        return bestPictureDao.getBestPictures();
    }

}
