package com.twu;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class RankingList {
    private List<HotSearch> hotSearches = new ArrayList<>();


    public void addHosSearch(HotSearch hotSearch){
        if(hotSearches.contains(hotSearch)){
            System.out.println("该热搜已被添加过!");
        }
        hotSearches.add(hotSearch);
        System.out.println("添加热搜成功");
    }

    //查看热搜排行榜
    public void getRanking(){
        Collections.sort(hotSearches, new Comparator<HotSearch>() {
            @Override
            public int compare(HotSearch o1, HotSearch o2) {
                return o2.getNum()-o1.getNum();
            }
        });
        for (int i = 0; i < hotSearches.size(); i++) {
            System.out.println(hotSearches.get(i).getName()+" "+hotSearches.get(i).getNum());
        }
    }

    public void vote(String hotSearch,int num){
        for (int i = 0; i < hotSearches.size(); i++) {
            if(hotSearches.get(i).getName() .equals(hotSearch) ){
                hotSearches.get(i).addNum(num);
            }
        }
    }

    public void buyHot(String name,int rank){
        for (int i = 0; i < hotSearches.size(); i++) {
            if(hotSearches.get(i).getName() == name){
                hotSearches.get(i).setRank(rank);
            }
        }
    }
}
