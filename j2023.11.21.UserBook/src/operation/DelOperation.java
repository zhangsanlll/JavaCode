package operation;

import Book.Book;
import Book.BookList;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-02-05
 * Time: 21:38
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你要删除的图书姓名：");
            String name = scanner.nextLine();
            int currentSize = bookList.getUsedSize();
            int delIndex = -1;
            int  i = 0;

            for (; i < currentSize; i++) {
                Book book = bookList.getBook(i);
                if(book.getName().equals(name)){
                    delIndex = i;
                    return;
                }
            }
            if(i == currentSize){
                System.out.println("没有你要查找的这本书！");
                return ;
            }

        for (int j = delIndex; j < currentSize-1; j++) {
            Book book = bookList.getBook(j+1);
            bookList.setBook(j,book);
        }

        bookList.setBook(currentSize-1,null);
        bookList.setUsedSize(currentSize-1);;
        System.out.println("删除成功！");
        }
    }

