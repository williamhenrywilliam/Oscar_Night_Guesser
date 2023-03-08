package com.walton.oscarNightGuesser.model;

public class BestPicture {



    int bestPictureId;

    String nominationOneTop;
    String nominationTwoTop;
    String nominationThreeTop;
    String nominationFourTop;
    String nominationFiveTop;
    String nominationSixTop;
    String nominationSevenTop;
    String nominationEightTop;
    String nominationNineTop;
    String nominationTenTop;

    int userSelection;
    int winner;
    String userResults;

    public int getBestPictureId() {
        return bestPictureId;
    }

    public void setBestPictureId(int bestPictureId) {
        this.bestPictureId = bestPictureId;
    }

    public BestPicture(int bestPictureId, String nominationOneTop, String nominationTwoTop, String nominationThreeTop, String nominationFourTop, String nominationFiveTop, String nominationSixTop, String nominationSevenTop, String nominationEightTop, String nominationNineTop, String nominationTenTop, int userSelection, int winner, String userResults) {
        this.bestPictureId = bestPictureId;
        this.nominationOneTop = nominationOneTop;
        this.nominationTwoTop = nominationTwoTop;
        this.nominationThreeTop = nominationThreeTop;
        this.nominationFourTop = nominationFourTop;
        this.nominationFiveTop = nominationFiveTop;
        this.nominationSixTop = nominationSixTop;
        this.nominationSevenTop = nominationSevenTop;
        this.nominationEightTop = nominationEightTop;
        this.nominationNineTop = nominationNineTop;
        this.nominationTenTop = nominationTenTop;
        this.userSelection = userSelection;
        this.winner = winner;
        this.userResults = userResults;
    }

    public BestPicture(){

    }

    public String getNominationOneTop() {
        return nominationOneTop;
    }

    public void setNominationOneTop(String nominationOneTop) {
        this.nominationOneTop = nominationOneTop;
    }

    public String getNominationTwoTop() {
        return nominationTwoTop;
    }

    public void setNominationTwoTop(String nominationTwoTop) {
        this.nominationTwoTop = nominationTwoTop;
    }

    public String getNominationThreeTop() {
        return nominationThreeTop;
    }

    public void setNominationThreeTop(String nominationThreeTop) {
        this.nominationThreeTop = nominationThreeTop;
    }

    public String getNominationFourTop() {
        return nominationFourTop;
    }

    public void setNominationFourTop(String nominationFourTop) {
        this.nominationFourTop = nominationFourTop;
    }

    public String getNominationFiveTop() {
        return nominationFiveTop;
    }

    public void setNominationFiveTop(String nominationFiveTop) {
        this.nominationFiveTop = nominationFiveTop;
    }

    public String getNominationSixTop() {
        return nominationSixTop;
    }

    public void setNominationSixTop(String nominationSixTop) {
        this.nominationSixTop = nominationSixTop;
    }

    public String getNominationSevenTop() {
        return nominationSevenTop;
    }

    public void setNominationSevenTop(String nominationSevenTop) {
        this.nominationSevenTop = nominationSevenTop;
    }

    public String getNominationEightTop() {
        return nominationEightTop;
    }

    public void setNominationEightTop(String nominationEightTop) {
        this.nominationEightTop = nominationEightTop;
    }

    public String getNominationNineTop() {
        return nominationNineTop;
    }

    public void setNominationNineTop(String nominationNineTop) {
        this.nominationNineTop = nominationNineTop;
    }

    public String getNominationTenTop() {
        return nominationTenTop;
    }

    public void setNominationTenTop(String nominationTenTop) {
        this.nominationTenTop = nominationTenTop;
    }

    public int getUserSelection() {
        return userSelection;
    }

    public void setUserSelection(int userSelection) {
        this.userSelection = userSelection;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public String getUserResults() {
        return userResults;
    }

    public void setUserResults(String userResults) {
        this.userResults = userResults;
    }


}
