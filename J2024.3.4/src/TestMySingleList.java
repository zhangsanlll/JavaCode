/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-04
 * Time: 15:31
 */
public class TestMySingleList {

    //代码主要测试实现需要放在主方法中，类似c
    public static void main(String[] args) {
        //MySingleList是代码实现，还是一个类，所以在测试类中需要new一个新对象
        MySingleList mySingleList = new MySingleList();
        //调用方法
       // mySingleList.creatList();
       // mySingleList.showList();
        //System.out.println(mySingleList.size());
        //System.out.println(mySingleList.contains(1));
       mySingleList.addFirst(111);
        mySingleList.addFirst(11);
        mySingleList.addFirst(11);
        mySingleList.addFirst(11);
        mySingleList.addFirst(7);
        mySingleList.addFirst(44);
        mySingleList.addFirst(11);
        mySingleList.addLast(2);
        mySingleList.showList();

       /* try{
            mySingleList.addIndex(3,3);

        }catch(IndexOutOfBounds indexOutOfBounds){
            indexOutOfBounds.printStackTrace();
        }*/
     //   mySingleList.remove(551);
       // mySingleList.removeAllKey(11);
       // mySingleList.showList();
        mySingleList.clear();
        mySingleList.showList();

    }

}
