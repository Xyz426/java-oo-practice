package com.twu;

import java.util.Scanner;

public class Main {

    private static Scanner scanner;
    private static RankingList rankingList;
    private static Person person;
    private static Manager manager;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        rankingList = new RankingList();
        question();
        while (true) {
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    user();
                    break;
                case 2:
                    admin();
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void question() {
        System.out.println("欢迎来到热搜排行榜，你是？");
        System.out.println("1.用户");
        System.out.println("2.管理员");
        System.out.println("3.退出");
    }

    public static void user() {
        System.out.println("请输入呢称");
        String name = scanner.next();
        person = new Person(name, 10);
        while (true) {
            userMenu(name);
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    rankingList.getRanking();
                    break;
                case 2:
                    System.out.println("请输入你要投票的热搜名称:");
                    String str = scanner.next();
                    if (person.num == 0) {
                        System.out.println("不好意思，你的票数已用完");
                    }
                    System.out.println("请输入你要投票的热搜票数:(你目前还有：" + person.getNum() + "票)");
                    int j = scanner.nextInt();
                    if(j > person.getNum()){
                        System.out.println("你票数不够");
                        break;
                    }
                    person.setNum(person.getNum()-j);
                    rankingList.vote(str, j);
                    System.out.println("投票成功");
                    break;
                case 3:
                    System.out.println("请输入需要购买的热搜:");
                    String buy = scanner.next();
                    System.out.println("请输入要购买的热搜排名");
                    int ranking = scanner.nextInt();
                    if(rankingList.getMap().containsKey(ranking)){
                        System.out.println("请输入购买的钱数,需大于"+rankingList.getMap().get(ranking));
                    }else{
                        System.out.println("请输入购买的钱数");
                    }
                    int money = scanner.nextInt();
                    rankingList.buyHot(buy, ranking,money);
                    System.out.println("购买成功");
                    break;
                case 4:
                    System.out.println("请输入你要添加的热搜");
                    String s = scanner.next();
                    rankingList.addHosSearch(new HotSearch(s, 0));
                    break;
                case 5:
                    return;
            }
        }
    }

    public static void userMenu(String name) {
        System.out.println("你好" + name + ",你可以:");
        System.out.println("1.查看热搜排行榜");
        System.out.println("2.给热搜事件投票");
        System.out.println("3.购买热搜");
        System.out.println("4.添加热搜");
        System.out.println("5.退出");
    }

    public static void admin() {
        System.out.println("请输入您的呢称");
        String name = scanner.next();
        person = new Person(name);
        while (true){
            adminMenu(name);
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    rankingList.getRanking();
                    break;
                case 2:
                    System.out.println("请输入想要添加的热搜名称");
                    rankingList.addHosSearch(new HotSearch(scanner.nextLine(), 0));
                    System.out.println("添加成功");
                    break;
                case 3:
                    System.out.println("请输入想要添加的超级热搜名称");
                    rankingList.addHosSearch(new HotSearch(scanner.nextLine(), 0,true));
                case 4:
                    return;
            }

        }
    }

    public static void adminMenu(String name) {
        System.out.println("你好" + name + ",你可以:");
        System.out.println("1.查看热搜排行榜");
        System.out.println("2.添加热搜");
        System.out.println("3.添加超级热搜");
        System.out.println("4.退出");
    }
}
