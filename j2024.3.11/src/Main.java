import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-11
 * Time: 16:09
 */


public class Main {
    public static  void func(String str1,String str2){
        //将ret定义成List，直接调用add这个方法
        List<Character> ret = new ArrayList<>();
//1、遍历str1字符串
        for(int i = 0; i<str1.length(); i++){
            char ch = str1.charAt(i);//拿单个字符

            //2、判断str2是否包含ch
            if(!str2.contains(ch+"")){ //contains返回的是字符串，所以加上一个空字符转换成字符串
                ret.add(ch);
            }
        }
       // System.out.println(ret);
       for(int i = 0; i < ret.size();i++ ){
           System.out.print(ret.get(i));
       }
        System.out.println();
    }
    public static void main(String[] args) {
        func("welcome to csdn","come");
    }
}
