/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-17
 * Time: 10:50
 */

//用单链表实现队列的方法
public class MyQueue {
    //先定义一个实例内部类的单链表
    static class ListNode{
        public int val;
       public ListNode  next;


       //初始化
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode head;
    public ListNode last;

    public int usedSize;

    public void offer(int val){
        //使用尾插法
        ListNode node = new ListNode(val);
        if(head == null){
            head = node;
            last = node;
        }else {
            last.next = node;
            last = last.next;
        }
        usedSize ++;
    }

    public int getUsedSize(){
        return usedSize;
    }

    public void poll(){
        if(head == null){

        }
    }

    public void peek(){
        
    }

}
