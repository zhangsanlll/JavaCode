import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-16
 * Time: 10:38
 */
public class MyStack {
    private int[] elem;

    //记录栈中的有效数据的数量
    private int usedSize;

    //初始化数组，给他赋值10个
    public MyStack() {
        this.elem = new int[10];
    }

    //放元素在栈顶

    public void push(int val){
        //先判断是否满了
        if(isFull()){
            //2倍扩容
            elem = Arrays.copyOf(elem,2*elem.length);
        }
        elem[usedSize ++] = val;
    }

    public boolean isFull(){
        return usedSize == elem.length;
    }
    public boolean empty(){
        return usedSize == 0 ? false : true;
    }

    public  int pop(){
        //判断栈不为空
        if(!empty()){
            throw new StackEmptyException("栈为空");
            //或者抛出异常
            //return -1;
        }
        return elem[--usedSize];
    }

    public  int peek(){
        //判断栈不为空
        if(!empty()){
            throw new StackEmptyException("栈为空");
            //或者抛出异常
            //return -1;
        }
        return elem[usedSize-1];
    }
}
