package demo_ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-17
 * Time: 19:08
 */
public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.display();
        //System.out.println(myArrayList.isFull());
        myArrayList.add(3,8);
        myArrayList.display();
        System.out.println(myArrayList.contains(4));
        //System.out.println(myArrayList.indexOf(9));
        //myArrayList.remove(4);
        //myArrayList.display();
       // System.out.println(myArrayList.size());
        myArrayList.clear();
        myArrayList.display();

    }

}
