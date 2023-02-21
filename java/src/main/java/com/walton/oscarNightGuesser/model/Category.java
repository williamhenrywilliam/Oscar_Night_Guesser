package com.walton.oscarNightGuesser.model;


public class Category {
    int categoryId;
    String name;
    String nominationOneTop;
    String nominationOneBottom;
    String nominationTwoTop;
    String nominationTwoBottom;
    String nominationThreeTop;
    String nominationThreeBottom;
    String nominationFourTop;
    String nominationFourBottom;
    String nominationFiveTop;
    String nominationFiveBottom;

    public Category(int categoryId, String name, String nominationOneTop, String nominationOneBottom, String nominationTwoTop,
                    String nominationTwoBottom, String nominationThreeTop, String nominationThreeBottom, String nominationFourTop,
                    String nominationFourBottom, String nominationFiveTop, String nominationFiveBottom) {
        this.categoryId = categoryId;
        this.name = name;
        this.nominationOneTop = nominationOneTop;
        this.nominationOneBottom = nominationOneBottom;
        this.nominationTwoTop = nominationTwoTop;
        this.nominationTwoBottom = nominationTwoBottom;
        this.nominationThreeTop = nominationThreeTop;
        this.nominationThreeBottom = nominationThreeBottom;
        this.nominationFourTop = nominationFourTop;
        this.nominationFourBottom = nominationFourBottom;
        this.nominationFiveTop = nominationFiveTop;
        this.nominationFiveBottom = nominationFiveBottom;
    }

    public Category(){
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNominationOneTop() {
        return nominationOneTop;
    }

    public void setNominationOneTop(String nominationOneTop) {
        this.nominationOneTop = nominationOneTop;
    }

    public String getNominationOneBottom() {
        return nominationOneBottom;
    }

    public void setNominationOneBottom(String nominationOneBottom) {
        this.nominationOneBottom = nominationOneBottom;
    }

    public String getNominationTwoTop() {
        return nominationTwoTop;
    }

    public void setNominationTwoTop(String nominationTwoTop) {
        this.nominationTwoTop = nominationTwoTop;
    }

    public String getNominationTwoBottom() {
        return nominationTwoBottom;
    }

    public void setNominationTwoBottom(String nominationTwoBottom) {
        this.nominationTwoBottom = nominationTwoBottom;
    }

    public String getNominationThreeTop() {
        return nominationThreeTop;
    }

    public void setNominationThreeTop(String nominationThreeTop) {
        this.nominationThreeTop = nominationThreeTop;
    }

    public String getNominationThreeBottom() {
        return nominationThreeBottom;
    }

    public void setNominationThreeBottom(String nominationThreeBottom) {
        this.nominationThreeBottom = nominationThreeBottom;
    }

    public String getNominationFourTop() {
        return nominationFourTop;
    }

    public void setNominationFourTop(String nominationFourTop) {
        this.nominationFourTop = nominationFourTop;
    }

    public String getNominationFourBottom() {
        return nominationFourBottom;
    }

    public void setNominationFourBottom(String nominationFourBottom) {
        this.nominationFourBottom = nominationFourBottom;
    }

    public String getNominationFiveTop() {
        return nominationFiveTop;
    }

    public void setNominationFiveTop(String nominationFiveTop) {
        this.nominationFiveTop = nominationFiveTop;
    }

    public String getNominationFiveBottom() {
        return nominationFiveBottom;
    }

    public void setNominationFiveBottom(String nominationFiveBottom) {
        this.nominationFiveBottom = nominationFiveBottom;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", nominationOneTop='" + nominationOneTop + '\'' +
                ", nominationOneBottom='" + nominationOneBottom + '\'' +
                ", nominationTwoTop='" + nominationTwoTop + '\'' +
                ", nominationTwoBottom='" + nominationTwoBottom + '\'' +
                ", nominationThreeTop='" + nominationThreeTop + '\'' +
                ", nominationThreeBottom='" + nominationThreeBottom + '\'' +
                ", nominationFourTop='" + nominationFourTop + '\'' +
                ", nominationFourBottom='" + nominationFourBottom + '\'' +
                ", nominationFiveTop='" + nominationFiveTop + '\'' +
                ", nominationFiveBottom='" + nominationFiveBottom + '\'' +
                '}';
    }
}
