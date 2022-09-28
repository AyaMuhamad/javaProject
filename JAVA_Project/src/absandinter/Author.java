package absandinter;
public class Author {
    protected static int id =0;
    private final int count;
    private  String name;
    private String phone;
    private String email;



  
 

    public Author( String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.count= ++id;  

    }


public int getId(){
return id;
}
    @Override
    public String toString(){
    return "# Author Name "+name+"\n"+"# Author Id "+id+"\n"+"# Author Email "+ email+"\n"+"# Author Phone "+phone+"\n";
    }

}
