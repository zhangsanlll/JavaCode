package Book;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-21
 * Time: 20:46
 */
public class BookList {
    private Book[] book = new Book[10];
    private int usedSize;//记录当前书架有几本书

    //初始化
    public BookList(){
        book[0] = new Book("三国演义","罗贯中",19,"小说");
        book[1] = new Book("西游记","吴承恩",20,"小说");
        book[2] = new Book("水浒传","施耐庵",30,"小说");
        this.usedSize = 3;
    }

    public Book getBook(int pos){
        return book[pos];
    }
    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
