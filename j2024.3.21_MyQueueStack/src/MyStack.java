import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-21
 * Time: 20:05
 */
class MyStack {
    private Queue<Integer> qu1;
    private Queue<Integer> qu2;

    public MyStack() {
        qu1 = new LinkedList<>();
        qu2 = new LinkedList<>();
    }

    public void push(int x) {
        //哪个队列不为空就放在哪个队列中
        //如果都为空，规定放在第一个队列中
        if(!qu1.isEmpty()){
            qu1.offer(x);
        }else if(!qu2.isEmpty()){
            qu2.offer(x);
        }else {
            qu1.offer(x);
        }

    }

    public int pop() {
        //如果1队列不为空，说明元素都在1队列中，
        //这时将1队列的size-1放入2队列中
        //两个栈为空
        if(empty()){
            return -1;
        }
        if(! qu1.isEmpty()){
            int count1 = qu1.size()-1;
            for(int i = 0; i< count1;i++){
                int val = qu1.poll();
                qu2.offer(val);
            }
            return qu1.poll();
        }
        if(! qu2.isEmpty()){
            int count2 = qu2.size()-1;
            for(int i = 0; i< count2;i++){
                int val = qu2.poll();
                qu1.offer(val);
            }
            return qu2.poll();
        }
        return -1;
    }


    public int top() {
        if(empty()){
            return -1;
        }
        int val = -1;

        if(! qu1.isEmpty()){
            int count = qu1.size();
            for(int i = 0; i< count;i++){
                val = qu1.poll();
                qu2.offer(val);
            }
        }
        if(! qu2.isEmpty()){
            int count2 = qu2.size();
            for(int i = 0; i< count2;i++){
                val = qu2.poll();
                qu1.offer(val);
            }
        }
        return val;
    }

    public boolean empty() {
        return qu1.isEmpty() && qu2.isEmpty();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}

