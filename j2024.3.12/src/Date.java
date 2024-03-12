/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-12
 * Time: 21:35
 */
public class Date {
    public int year;
    public int month;
    public int day;

    public void setDate(int y,int m,int d){
        year = y;
        month = m;
        day = d;

    }

    public void printDate(){
        System.out.println(year+" "+month+ " "+day);

    }

    public static void main(String[] args) {
        Date date = new Date();
        date.setDate(2024,3,12);
        date.printDate();
    }
}
