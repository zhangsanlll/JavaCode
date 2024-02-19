/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-02-18
 * Time: 22:27
 */
public class SeqList {
    //定义一个数组
    private int[] elem;
    //记录数组中有多少个有效数据
    private int usedSize;

    //静态常量数字规定数组的长度，不可改变,自己定义
    private  static final int DEFAULT_CAPACITY = 10;

    //构造函数初始化数组
    public SeqList(){
        this.elem = new int[DEFAULT_CAPACITY];
    }

    //打印顺序表
    public void display(){
        for(int i = 0; i < this.usedSize; i++){//数组和usedSize都是私有的，必须要用this
            System.out.print(this.elem[i] + " ");
        }

    }

    //判定是否包含某个元素
    public boolean contains(int toFind){
        //先判断该顺序表是否为空
        if(isEmpty()){
            System.out.println("该顺序表为空，无法查找元素！");
            return false;
        }
        for(int i = 0; i < usedSize;i++){
            if(elem[i] == toFind){
                return true;
            }
        }
        return false;

    }
    public boolean isEmpty(){
        return usedSize == 0;
    }

    //删除第一次出现的关键字key
    public void remove(int key){
        if(isEmpty()){
            return;
        }
        int index = 0;
        for (int i = 0; i < usedSize; i++) {
            //找到要删除的数据在哪儿
            if(key == this.elem[i]){
                index = i;
            }
        }
        while(index < usedSize-1){
            this.elem[index] = this.elem[index+1];
            index ++;
        }
        usedSize--;
    }

}
