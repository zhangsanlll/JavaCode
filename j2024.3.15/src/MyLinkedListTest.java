/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-15
 * Time: 19:20
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.addLast(10);
    myLinkedList.addLast(23);
    myLinkedList.addLast(34);
    myLinkedList.addLast(11);
    myLinkedList.addLast(55);
    myLinkedList.display();
    MyLinkedList myLinkedList2 = new MyLinkedList();
    myLinkedList2.addLast(1);
    myLinkedList2.addLast(2);
    myLinkedList2.addLast(3);
    myLinkedList2.addLast(1);
    myLinkedList2.addLast(5);
    myLinkedList2.display();
    }
}
