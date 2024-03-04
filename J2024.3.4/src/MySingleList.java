/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-04
 * Time: 15:06
 */
public class MySingleList {
    //创建一个链表，用实例化内部类实现
    class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public ListNode head;//指向头节点


    //手动创建一个链表
    public void creatList(){
        //ListNode也是一个类，按照创建类对象的方式创建一个节点
        ListNode node1 = new ListNode(12);
        ListNode node2 = new ListNode(13);
        ListNode node3 = new ListNode(15);
        ListNode node4 = new ListNode(58);
        ListNode node5 = new ListNode(11);
        ListNode node6 = new ListNode(2);
        ListNode node7 = new ListNode(9);

        //上面只给了他们值，并没有把这些节点串联起来，下面代码就是将所有节点连接起来
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        head = node1;
    }

    //打印链表

    public void showList(){
        ListNode temp = head;
        //从头开始打印
        while(temp !=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
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


    //头插法
        public void addFirst(int data){
            //在头节点的前面插入一个节点
            ListNode node = new ListNode(data);
            node.next = head;
            head = node;
        }


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


        //任意位置插入,第一个数据节点为0号下标
        public void addIndex(int index,int data){
            ListNode node = new ListNode(data);
            ListNode temp = head;

        //1、判断index的合法性
            if(index == 0){
                addFirst(data);
                return ;

            }
            if(index == size()){
                addLast(data);
                return ;

            }
            if(index < 0 || index >size()){
                throw new IndexOutOfBounds("下标位置不合法！");
               // System.out.println("下标不合法！");


            }
            //2、找到index下标,也可以封装成下标
            for(int i = 1; i < index ;i++ ){
                temp = temp.next ;
            }
            //3、插入
            node.next =temp.next;
            temp.next = node;
        }


        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key){
        ListNode temp = head;
       // int flg = 0;
        while(temp != null){
            //如果val是引用类型，则需要用.equals()
            if(temp.val ==key){
                return true;
            }
            temp = temp.next;
        }
        return false;
        }


        //删除第一次出现关键字为key的节点
        public void remove(int key){

       // int flg = 0;
        if(head ==  null){
            return;
        }
        //key的位置需要分情况讨论
            // 1、key的位置在头节点
            if(head.val == key){
                head  = head.next;
                return ;
            }
            //找到要删除的前驱节点
            ListNode prev = searchKey(key);
            if(prev == null){
                System.out.println("没有找到这个数据！");
                return ;
            }
            ListNode del = prev.next;
            prev.next = del.next;
            //2、key的位置在中间以及结尾
            //也可以把这个封装成一个函数
            /*while(prev.next != null){
                if(prev.next.val == key){
                    prev.next = prev.next.next;
                    flg = 1;
                }
                prev = prev.next;
            }
            //3、没有找到这个数据
            if(flg ==0){
                System.out.println("没有找到这个数据！");
            }*/
        }

        //找出key对应的节点并返回这个节点，为啥是私有的，因为这个函数只为类中（删除）的方法服务，不服务于其他方法
        private ListNode searchKey(int key) {
            ListNode prev = head;
            while (prev.next != null) {
                if (prev.next.val == key) {
                   return prev;//画图理解
                }else{
                    prev =prev.next;
                }
            }
            return null;
        }

        //删除所有值为key的节点
        public void removeAllKey(int key){
        ListNode prev = head;
        ListNode temp = prev.next;
        while(temp != null){
            if(temp.val == key){
                prev.next = temp.next;
                temp = temp.next;
            }else{
                prev = temp;//既然两个不相等了，就直接比下两个
                temp = temp.next;

            }
        }
        if(head.val == key){
            head = head.next;
        }
        }


        public void clear() {
            if(head == null){
                return;
            }
            head =null;
        }



}
