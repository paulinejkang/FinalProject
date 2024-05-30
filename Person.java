public class Person {
    private String name;
    private String id;

    //Constructor
    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }
    /**
     * 
     * @return name of person
     */
    public String getName(){
        return name;
    }
    /**
     * 
     * @return id of person
     */
    public String id(){
        return id;
    }
    //display
    public void display(){
        System.out.println("Name: " + name + " ID: " + id);
    }
}

