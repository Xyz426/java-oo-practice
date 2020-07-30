package com.twu;


import java.util.*;


public class RankingList {
    private List<HotSearch> hotSearches = new ArrayList<>();
    //map用于统计购买热搜
    private Map<Integer,Integer> map = new HashMap<>();

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
                if(hotSearches.get(i).isSuperHotSearch()){
                    hotSearches.get(i).addNum(2*num);
                }else {
                    hotSearches.get(i).addNum(num);
                }
            }
        }
    }

    public void buyHot(String name,int rank,int money){
        for (int i = 0; i < hotSearches.size(); i++) {
            if(hotSearches.get(i).getName() == name){
                hotSearches.get(i).setRank(rank);
                map.put(rank,money);
            }
        }
    }

    public List<HotSearch> getHotSearches() {
        return hotSearches;
    }

    public void setHotSearches(List<HotSearch> hotSearches) {
        this.hotSearches = hotSearches;
    }

    public Map<Integer, Integer> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Integer> map) {
        this.map = map;
    }
}
