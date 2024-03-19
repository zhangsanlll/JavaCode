/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-19
 * Time: 11:30
 */
public class Main {

    class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public ListNode head;//指向头节点


    /*public void addLast(int data){
        ListNode node = new ListNode(data);

        //如果链表中一个节点都没有的话
        if(head == null){
            head = node;
            last = head;
            return ;

        }
        this.last.next = node;
        node.prev = this.last;
        this.last = node;//last = last.next;

    }*/
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        int length = size();
        ListNode temp = head;
        if(head ==null){
            head = node;
            // head.next = node;
            //必须要有return，否则代码会继续运行下去，导致出错
            return;
        }

        //找到最后一个节点
          /*  for(int i = 1; i< length; i++){
                temp = temp.next;
            }*/
        //或者这种方法
        while(temp.next != null){
            temp = temp.next;

        }
        temp.next = node;

    }

    //得到单链表的长度
    public int size(){
        ListNode temp = head;
        int count = 0;
          /*  //先判空
            if(temp ==null){
                return -1;
            }
*/
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        return count;
    }
    public void display(){
        ListNode tmp = head;
        while(tmp != null){
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            //思路：还是可以使用快慢指针，相交节点之后的长度是一样的，
            //所以两个链表的长度不同在前面，所以只需要快指针多走两个链表长度之差，然后再一起走
            //如果他们相遇了（slow.next == fast.next）就找到相交节点了


            //1、首先先求出两链表的长度
            //先假设headA的长度要长
            int lenA = 0;
            int lenB = 0;
            ListNode tmpHA = headA;
            ListNode tmpHB = headB;
            ListNode fast = null;
            ListNode slow = null;
            while(tmpHA != null){
                tmpHA = tmpHA.next;
                lenA ++;
            }
            while(tmpHB != null){
                tmpHB = tmpHB.next;
                lenB ++;
            }

            //2、求差值
            int len = lenA - lenB;
            if(len < 0){//说明lenB的长度长
                len = lenB - lenA;
                fast = headB;
                slow = headA;
            }else {
                fast = headA;
                slow = headB;
            }

            //3、先让fast多走len步
            while(len > 0){
                fast = fast.next;
                len--;
            }

            //4、slow和fast同步走，直到相遇
            while(fast != null && fast.next != null){
                fast = fast.next;
                slow = slow.next;
                if(slow.next == fast.next){
                    return slow.next;
                }
            }
            return null;

        }

}
