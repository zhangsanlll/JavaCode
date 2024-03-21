import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-20
 * Time: 17:36
 */
public class MinStack {

        //一个栈用来存放数据，一个栈来存放最小数据
        Stack<Integer> stack ;
        Stack<Integer> minStack ;
        public int usedSize;

        public MinStack() {
            stack =  new Stack<>();
            minStack = new Stack<>();
        }

        //压栈
        public void push(int val) {

            //判断是不是第一个压栈
            if(stack.empty()){
                stack.push(val);
                minStack.push(val);
            }else {
                //如果不是，就跟minStack栈中的栈顶元素进行比较，
                //如果stack栈中的元素小，就压入minStack中
                stack.push(val);
                if(stack.peek() <= minStack.peek()){
                    minStack.push(val);
                }
            }
            usedSize ++ ;
        }

        //出栈，出stack中的栈，首先栈不能为空，然后再与minStack进行比较，
        //如果两个栈中的元素一样，则一起出栈，否则只出stack中的元素
        public void pop() {
            if(isEmpty()){
                return;
            }
            int ret1 = stack.peek();
            int ret2 = minStack.peek();

            if(ret1 == ret2) {
                minStack.pop();
            }
            stack.pop();
            usedSize -- ;
        }

        private boolean isEmpty(){
            return usedSize == 0;
        }

        public int top() {
            if(isEmpty()){
                return -1;
            }
            return stack.peek();

        }

        public int getMin() {
            return minStack.peek();
        }

    public static void main(String[] args) {
        MinStack minStack1 = new MinStack();
        minStack1.push(512);
        minStack1.push(-1024);
        minStack1.push(-1024);
        minStack1.push(512);
        minStack1.pop();
        System.out.println(minStack1.getMin());
        minStack1.pop();
        System.out.println(minStack1.getMin());
        minStack1.pop();
        System.out.println(minStack1.getMin());


    }
}
