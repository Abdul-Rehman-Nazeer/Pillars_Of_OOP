public class You_guessed_it_More_Inheritance {
    public static void main(String[] args) {
        Category1 book1 = new Category1(1, "Java Programming", "abc", "1234567890", 29.99, "Java");
        Category1 book2 = new Category1(2, "C++ Programming", "ijk", "0987654321", 24.99, "C++");
        Category1 book3 = new Category1(3, "Python for Beginners", "xyz", "5432109876", 19.99, "Python");
        System.out.println("Book Details in Category1:");
        book1.display();
        System.out.println("\n");
        book2.display();
        System.out.println("\n");
        book3.display();
    }
}
class Books {
    protected int bookID;
    protected String bookName;
    protected String bookAuthor;
    protected String ISBN;
    protected double price;
    public Books(int bookID, String bookName, String bookAuthor, String ISBN, double price) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
        this.price = price;
    }
}
class Category1 extends Books {
    private String category;
    public Category1(int bookID, String bookName, String bookAuthor, String ISBN, double price, String category) {
        super(bookID, bookName, bookAuthor, ISBN, price);
        this.category = category;
    }
    public void display() {
        System.out.println("Category: " + category);
        System.out.println("Book ID: " + bookID);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: " + price);
    }
}