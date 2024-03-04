import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-02-25
 * Time: 9:59
 */
public class Test {

    //str1 welcome to bit
    //str2:come
    //ret:wl t bit
    public static void func(String str1,String str2){
        //遍历str2,将str2存入字符串中
       /* List<String> list2 = new ArrayList<>();
        for (char x:str2) {
            list2.add(str2.charAt(x));
        }
        */
        //遍历str1,通过与str2比较将没有包含的字符存入List中
        List<Character> ret = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            //取每个字符出来
            char ch = str1.charAt(i);
            //判断该字符是否在str2中
            //不能判断一个字符，如果要判断就要转换成字符串
            if(!str2.contains(ch + "")){
                //如果没有包含，就存入数组中
                ret.add(ch);
            }
        }

        //ArrayList中父类已经重写了toString这个方法，所有打印出来就是有【】
       // System.out.println(ret);

        //也可以用ArrayList的遍历
        for (int i = 0; i < ret.size(); i++) {
            System.out.print(ret.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        func("welcome to bit","come");
    }


    public static void main1(String[] args) {
        //不带参的构造方法
        List<Integer> list = new ArrayList<>();
        list.add(5);
        System.out.println("=========");

    }
}
