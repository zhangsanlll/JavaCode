import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-03
 * Time: 16:17
 */
public class test {

    public static String setstring(String str) {

        //String拼接速度很慢，可以用StringBuffer 
        // write code here
        char ch;
        String ret = "";
        int[] count = new int[123];
       /* for(int i = 0 ;i < str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i = 0 ;i < str.length();i++){
            if(2 >= count[str.charAt(i)]){
                count[str.charAt(i)] = 1;
            }
        }*/
        for(int i = 0 ;i < str.length();i++){
            if(0 == count[str.charAt(i)]){
                ret +=str.charAt(i);
                count[str.charAt(i)] = 1;
            }
        }
        return ret;
    }

  /*  public void merge(int A[], int m, int B[], int n) {

    }*/

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ret = setstring(str);
        System.out.println(ret);
    }

}
