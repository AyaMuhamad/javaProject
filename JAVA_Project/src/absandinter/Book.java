
package absandinter;
public class Book {
    protected static int Book_id=0;
    private final int count;
    private String title;
    private String published_date;
    private int version;
    Author author;


    public Book( String title, String published_date, int version, Author author) {
        this.count= ++Book_id;
        this.title = title;
        this.published_date = published_date;
        this.version = version;
        this.author = author;
    }
 public int getBookId(){
return Book_id;
}

    public void BookDetails(){
        System.out.println("# Book Name "+title+"\n"+"# Book Version "+version+"\n"+"# Author's Book "+"\n"+"# Book Id"+Book_id);
    }
    public void BookAuthorDetails(){
         System.out.println( "# Book Id"+Book_id+"# Book Name "+title+"\n"+"# Book Version "+version+"\n"+"\n"+"\n"+"- Author's Data "+ author.toString());
}
}
