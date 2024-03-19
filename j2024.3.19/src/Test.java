import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-19
 * Time: 11:32
 */
public class Test {
    public static void main1(String[] args){
        LinkedList<Integer> linkedList = new LinkedList();

    }
    public static void main(String[] args) {
        Main head1 = new Main();
        Main head2 = new Main();
        Main test = new Main();
        head1.addLast(1);
        head1.addLast(9);
        head1.addLast(1);
        head1.addLast(2);
        head1.addLast(4);
        head1.display();

        head2.addLast(3);
        head2.addLast(2);
        head2.addLast(4);

        head2.display();
        Main.ListNode node = test.getIntersectionNode(head1.head,head2.head);
        System.out.println(node);
    }

}
