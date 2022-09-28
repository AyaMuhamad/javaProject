package absandinter;

import java.util.ArrayList;

public class Library {



    public ArrayList<Book> BOOKS = new ArrayList<>();
    public ArrayList<Author> AUTHORS = new ArrayList<>();

    public void add_Author(Author a) {

        AUTHORS.add(a);

    }

    public void Remove_author(int id) {
        try {
            AUTHORS.remove(id - 1);
        } catch (Exception e) {
            System.out.println("Enter Valid Id");
        }

    }

    public void Print_Author(int id) {
        System.out.println(AUTHORS.get(id - 1).toString());
    }

    public void Print_Author_books(int id) {
        try {
            if (AUTHORS.get(id - 1).getId() == id) {
                for (int i = 0; i < BOOKS.size(); i++) {
                    BOOKS.get(i).BookAuthorDetails();
                }
            }
        } catch (Exception e) {
            System.out.println("Invaild ID");
        }

    }

    public void Add_Book(Book B) {
        BOOKS.add(B);
    }

    public void Remove_book(int id) {
        try {
            BOOKS.remove(id - 1);
        } catch (Exception e) {
            System.out.println("Enter Valid Id");
        }

    }

    public void Print_book(int id) {
        try {
                BOOKS.get(id - 1).BookDetails();
            

        } catch (Exception e) {
            System.out.println("Invaid ID "+e);
        }
    }

}
