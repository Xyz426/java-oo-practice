package com.twu;

public class HotSearch {
    private String name;

    private Integer num;

    private Integer rank;

    private boolean isBuyRank;

    private boolean isSuperHotSearch;
    public HotSearch(String name, Integer num) {
        this.name = name;
        this.num = num;
    }
    public HotSearch(String name, Integer num,boolean flag) {
        this.name = name;
        this.num = num;
        this.isSuperHotSearch = flag;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void addNum(int n){
        num += n;
    }

    public boolean isBuyRank() {
        return isBuyRank;
    }

    public void setBuyRank(boolean buyRank) {
        isBuyRank = buyRank;
    }

    public boolean isSuperHotSearch() {
        return isSuperHotSearch;
    }

    public void setSuperHotSearch(boolean superHotSearch) {
        isSuperHotSearch = superHotSearch;
    }
}
