public class User extends Person{
    private String password;
    private double credit;
    private String[] loans;

    //Constructor
    public User(String name, String id, String password, double credit, String[] loans){
        super(name, id);
        this.password = password;
        this.credit = credit;
        this.loans = loans;
    }

    /**
     * 
     * @return password of user
     */
    public String getPassword(){
        return password;
    }
    /**
     * 
     * @return the loans of user
     */
    public String[] getLoans(){
        return loans;
    }
    @Override
    //display
    public void display(){
        System.out.print("Name: " + super.getName() + " Password: " +  password + " Credit: $" + credit + "Loans: ");
        if(loans != null){
            for(String b : loans){
            System.out.print(b + ", ");
        }
        System.out.println();
    } 
    }
}
