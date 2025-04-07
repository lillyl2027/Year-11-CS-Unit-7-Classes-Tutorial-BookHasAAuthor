public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;

    public Book (String name, Author author, double price, int quantity){
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return quantity;
    }

    public void setQty(int quantity){
        this.quantity = quantity;
    }

    public String toString(){
        return "'" + this.name + "' by " + this.author.toString();
    }

    public static void main(String[] args) {
        Author author = new Author("Dr. Seuss", "drseuss@gmail.com", 'M');
        Book book = new Book("In Cold Blood", author, 50.00, 50);
        System.out.println(book.toString());
    }
}