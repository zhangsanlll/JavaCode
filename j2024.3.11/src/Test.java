import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-11
 * Time: 19:01
 */
public class Test {

    public static List<List<Integer>> Generate(int numRows){
        //杨辉三角的本质其实是个二维数组
        //每行都是一个List
        //首先先定义接收的数组
        List<List<Integer>> ret = new ArrayList<>();

        //第一行自己定义出来,是个一维数组
        List<Integer> list = new ArrayList<>();
        list.add(1);

        ret.add(list);

        //接着向下，每一行都是一个List
        for (int i = 1; i < numRows ; i++) {
            //每循环一次，一行List就定义出来
            List<Integer> curRows = new ArrayList<>();
            //第一个数字是1，直接添加
            curRows.add(1);
            List<Integer> prev = ret.get(i-1);
            //添加中间的数字,一行有几个数字就是第几行
            for (int j = 1; j < i ; j++) {
                //hand.get(j).add(card);
                int val = prev.get(j)+prev.get(j-1);
                //或者按自己的方法也行,但是加回来的是一个值，需要一个中间变量接受，而不能直接添加
                //         获取上一行     上一行的j下标的值
               //int val =  ret.get(i-1).get(j)+ret.get(i-1).get(j-1);
                curRows.add(val);
            }

            //添加最后一个1
            curRows.add(1);

            //添加到ret中
            ret.add(curRows);
        }
        return ret;
    }

    public static void main(String[] args) {
    }
}
