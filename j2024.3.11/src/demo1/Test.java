package demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-11
 * Time: 16:33
 */
public class Test {
    private static final String[]  SUITS = {"♥","♣","♦","♠"};
    public static List<Card> buyCard(){
        //将牌放在cards中
        List<Card > cards = new ArrayList<>();
        //生成顺序的54张牌
        for (int i = 0; i < SUITS.length; i++) {
            for(int j = 1; j <= 13;j++){
                Card card = new Card(SUITS[i],j);
                cards.add(card);
            }
        }
        return cards;

        }

        public static void shuffle(List<Card> cards){

        //随机打乱牌，用随机数组，画图理解
            Random random = new Random();
            //从后面开始随机生成数组
            for (int i = cards.size()-1; i > 0 ; i--) {
                int j = random.nextInt(i);//随机生成0-i的下标
                //交换
                Card tmp = cards.get(i);
                cards.set(i,cards.get(j));
                cards.set(j,tmp);
            }
        }

    public static void main(String[] args) {
        List<Card> cards = buyCard();
        System.out.println(cards);
        System.out.println("洗牌");
        shuffle(cards);
        System.out.println(cards);

        //发牌,每个人都是一个独立的List
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();
        //相当于是一个二维数组
        List<List<Card>> hand = new ArrayList<>();
        //添加进来
        hand.add(hand1);
        hand.add(hand2);
        hand.add(hand3);

        //三个人，每个人轮流揭牌5张
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                //揭牌的动作
                Card card = cards.remove(0);
                //翻到指定人的手里，获取j下标的hand数组然后尾插一个牌给他
                hand.get(j).add(card);
            }
        }
        System.out.println("第1个人的牌");
        System.out.println(hand1);
        System.out.println("第2个人的牌");
        System.out.println(hand2);
        System.out.println("第3个人的牌");
        System.out.println(hand3);
        System.out.println("剩下的牌");
        System.out.println(cards);


    }
}
