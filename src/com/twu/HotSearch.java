package com.twu;

public class HotSearch {
    private String name;

    private Integer num;

    //购买的热搜位置
    private Integer rank;

    //购买热搜的钱数
    private Integer money;


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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
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
