package absandinter;

import java.util.ArrayList;

public class FinalProject {
    public static void main(String[] args) {

    ArrayList<Book> BOOKS=new ArrayList();
        Author a1=new Author("aya","0100","aya@gmail.com");
        Author a2=new Author("alaa","01000","alaa@gmail.com");
        Author a3=new Author("nour","01011","nour@gmail.com");
        Author a4=new Author("nada","1111","nada@gmail.com");

        Book b1= new Book("java","2000",2,a1);
        Book b2= new Book("c++","2001",4,a2);
        Book b3= new Book("python","2002",6,a3);
        Book b4= new Book("c#","2003",8,a4);


 Library L= new Library();
    L.Add_Book(b1);
    L.Add_Book(b2);
    L.Add_Book(b3);
    L.Add_Book(b4);

    L.add_Author(a1);
    L.add_Author(a2);
    L.add_Author(a3);
    L.add_Author(a4);

 L.Print_Author(4);


    }
    
}
