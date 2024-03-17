/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-16
 * Time: 10:38
 */
public class Test {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(12);
        myStack.push(13);
        myStack.push(88);
        System.out.println("========");
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
    }


}
