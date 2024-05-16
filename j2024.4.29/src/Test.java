import javax.swing.tree.TreeNode;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-04-29
 * Time: 13:40
 */
public class Test {
    //内部类定义二叉树
    static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public TreeNode root;


    /*搜索
    *
    * */
    public TreeNode search(int val){
        TreeNode cur = root;
        while(cur != null){
            if(cur.val > val){
                cur = cur.left;
            }else if(cur.val < val){
                cur = cur.right;
            }else{
                return cur;
            }
        }

        return null;
    }

    /*插入
    * */
    public boolean insert(int key){
        TreeNode node = new TreeNode(key);
        //如果插入的是根节点
        if(root == null){
            root = node;
            return true;
        }
        TreeNode cur = root;
        TreeNode parent = null;//记录cur的前一个节点
        while(cur != null){
        if(cur.val > key){
            parent = cur;
            cur = cur.left;
        }else if(cur.val < key){
            parent = cur;
            cur = cur.right;
        }else{//一样的值不能插入
            return false;
        }
        }
        //走到这儿之后说明找到合适的位置插入了
        //再判断是插左子树还是右子树
        if(parent.val > key){
            parent.left = node;
        }else{
            parent.right = node;
        }
        return true;
    }

    /*
    * 删除
    * */
  /*  public void removeNode(int key){
        TreeNode  tp = cur;
        TreeNode t = cur.right;
        while(t.left != null){

        }
    }*/

    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("aello",3);
        map.put("afcd",3);
        System.out.println("aaaa");
        
    }
}
