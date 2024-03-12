/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-12
 * Time: 11:07
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        //先求出word1和word2的长度
        int len1 = word1.length();
        int len2 = word2.length();
        int m = 0;//word1下标
        int n = 0;//word2下标

        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < len1 + len2;i++){
            if(i % 2 ==0){
                ret.append(word1.charAt(m++));
            }else{
                ret.append(word2.charAt(n++));
            }

            //word1长度比word2短，并且word1 已经到了最后一个字符
            if(m == len1 && n != len2){
                String  str1 = word2.substring(n);
                ret.append(str1);
                break;
            }

            //word2长度比word1短，并且word2 已经到了最后一个字符
            if(m != len1 && n == len2){
                String str2 = word1.substring(m);
                ret.append(str2);
                break;

            }
        }
        //ret 转换成String
        String ret1 = ret.toString();
        return ret1;

    }
}
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String ret = solution.mergeAlternately("ab","de");
        System.out.println(ret);
    }
}
