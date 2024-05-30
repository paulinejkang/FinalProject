/**
 * The Book class represents a book with a title, author, ISBN, and availability status.
 */
public class Film {
    private String title;
    private String producer;
    private String label;
    private double price;

    /**
     * Constructing Book Object
     * @param title of book
     * @param author of book
     * @param isbn of book
     */

    public Film(String title, String author, String isbn, double price){
        this.title = title;
        this.producer = author;
        this.label = isbn;
        this.price = price;
    }
    /**
     * @return title of book
     */
    public String getTitle(){
        return title;
    }
    /**
     * @return author of the book
     */
    public String getProducer(){
        return producer;
    }
    /**
     * @return isbn of the book
     */
    public String getLabel(){
        return label;
    }
    /**
     * @return availability of the 
     */
    public double getPrice(){
        return price;
    }

    /**
     * Set Availablity
     * @param availability
     */

    public void display(){
        System.out.println("Title: " + title + " Director: " + producer + " Distributor: " + label + " Need to Pay: $" + price);
    }
}
