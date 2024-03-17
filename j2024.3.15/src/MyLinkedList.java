/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-15
 * Time: 19:16
 */
public class MyLinkedList {
    static class ListNode{
        public int val;
        public ListNode prev;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }
    public static ListNode head ;
    public static ListNode last ;
    //头插法
    public void addFirst(int data){
        //要考虑特殊情况

        ListNode node = new ListNode(data);
        //如果链表中一个节点都没有的话
        if(head == null){
            head = node;
            //没有返回还会继续执行下面的代码，可以用else或者直接return

            //永远记录链表的最后一个节点，后续对数据的增删查改有比较大的帮助
            //单向链表也可以
            last = head;
            return ;
        }
        //如果有节点
        node.next = head;
        head.prev = node;
        head = node;
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);

        //如果链表中一个节点都没有的话
        if(head == null){
            head = node;
            last = head;
            return ;

        }
        last.next = node;
        node.prev = last;
        last = node;//last = last.next;

    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        //分三种情况
        //1、在

        //修改四个地方，比较抽象，画图理解
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){}
    //删除所有值为key的节点
    public void removeAllKey(int key){}

    //得到单链表的长度
    public int size(){
    ListNode tmp = head;
    int count = 0;
    while(tmp != null){
        tmp = tmp.next;
        count++;
    }
    return count;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode tmp = head;
        while(tmp != null){
            if(tmp.val == key){
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }
    public void display(){
        ListNode tmp = head;
        while(tmp != null){
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
    public void clear(){}
}
