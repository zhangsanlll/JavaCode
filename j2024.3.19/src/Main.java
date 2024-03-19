/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-19
 * Time: 11:30
 */
public class Main {

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

    public void addLast(int data){
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
