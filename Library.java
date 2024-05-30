import java.util.ArrayList;

public class Library {
    private ArrayList <Film> films;
    //Constructor
    public Library(){
        films = new ArrayList<>();
    }
    /**
     * @param film is film that is added
     */ 
    public void addFilm(Film film){
        films.add(film);
    }

    /**
     * 
     * @param title film title
     * @return film of that title
     */
    public Film searchFilm(String title){
        for(Film b : films){
            if(b.getTitle().equalsIgnoreCase(title)) return b;
        }
        return null;
    }
    //display films
    public void displayFilms(){
        for(Film b : films){
            b.display();
        }
    }

    /**
     * 
     * @param title of film
     * @return price of the film
     */
    public double checkOut(String title){
        for(Film b : films){
            if(b.getTitle().equalsIgnoreCase(title)){
                    return b.getPrice();
                }
            }
            return 0;
        }

    //display
    public void display(){
        for(Film b : films){
            b.display();
        }
    }
}
