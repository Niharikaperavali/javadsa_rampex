import java.util.*;
class Book{
    String title;
    String author;
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    Book(String title){
        this.title=title;
        this.author="unknown";
    }
    void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
}


class BookTest{
public static void main(String[] args) {
    //Book b=new Book("hello moon", "john");
    Book b1=new Book("hello sun");
    b1.displayInfo();
} 
}
