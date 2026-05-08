package week2.HomeAssignment;


public class Library {

    public String addBook(String bookTitle)
{

 System.out.println(bookTitle +" "+ "Book added successfully");
return(bookTitle);
}

public void issueBook()
{
    System.out.println("Book issued successfully");
}


    public static void main(String[] args) {
        Library add=new Library();
        add.addBook("Atomic habits");
        Library issue = new Library();
        issue.issueBook();
    }

}
