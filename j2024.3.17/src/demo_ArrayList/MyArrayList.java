package demo_ArrayList;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-17
 * Time: 19:08
 */
public class MyArrayList {

    //定义顺序表的基本元素
    public int[] elem;
    //记录当前顺序表当中有多少个有效数据
    public int usedSize;//0

    //默认容量
    private static final int DEFAULT_SIZE = 10;

    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
    }

    /**
     * 打印顺序表:
     *   根据usedSize判断即可
     */
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(elem[i]+" ");
        }
        System.out.println();

    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        //判断是否满了，如果满了就扩容
        if(isFull()){
            resize();//扩容
        }
        elem[usedSize++] = data;

    }

    private void resize(){
        elem = Arrays.copyOf(elem,elem.length * 2);
    }

    /**
     * 判断当前的顺序表是不是满的！
     * @return true:满   false代表空
     */
    public boolean isFull() {
        if(usedSize == elem.length){
            return true;
        }else{
            return false;
        }
    }


    private boolean checkPosInAdd(int pos) {

        return pos < usedSize && pos >= 0;
        //合法
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
    //先检查pos位置是否合法
        if(!checkPosInAdd(pos)){
        //if(pos < 0 || pos > usedSize){
            throw new ArrayListBoundsOutException("下标位置不合法！");

        }
        //再判断是否满了
        if(isFull()){
            //满了就扩容
            resize();
        }
        //开始移动数据，在pos下标后面的往后移
        for(int i = usedSize - 1; i >= pos ;i--){
            elem[i+1] = elem[i];
        }
        //存放数据
        elem[pos] = data;
        usedSize++;
    }

    // 判定是否包含某个元素
    //依次遍历直到找到
    public boolean contains(int toFind) {
    for(int i = 0 ;i < usedSize; i++){
        if(elem[i] == toFind){
            return true;
        }
    }
    return false;
    }
    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
    //
    for(int i = 0 ;i < usedSize; i++){
        if(elem[i] == toFind){
            return i;
        }
    }
    return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
    //先判断pos位置是否合法
    if(!checkPosInAdd(pos)){
        throw new ArrayListBoundsOutException("下标位置不合法！");
    }
    return elem[pos];
    }

    private boolean isEmpty() {
        return usedSize == 0;

    }
    // 给 pos 位置的元素设为【更新为】 value
    public void set(int pos, int value) {
    if(!checkPosInAdd(pos)){
        throw new ArrayListBoundsOutException("下标位置不合法！");
    }
    elem[pos] = value;
    }

    /**
     * 删除第一次出现的关键字key
     * @param key
     */
    public void remove(int key) {
    //如果为空
    if(isEmpty()){
        return;
    }

    //先获取key元素的下标位置,
    int index = indexOf(key);
    //如果没有这个关键字，也需要判断一下
    if(index != -1){
        while(index < usedSize-1){
            elem[index] = elem[index + 1];
            index ++;
        }
    }
    usedSize--;
    }

    // 获取顺序表长度
    public int size() {
    return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
    usedSize = 0;
    }
}
