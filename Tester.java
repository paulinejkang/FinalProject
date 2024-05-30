import java.util.Scanner;
public class Tester{
    public static void main(String[] args){
    Library library = new Library();
    Scanner scan = new Scanner(System.in);

    while(true){
        int choice = 0;
        System.out.println("1. Add Film, 2. Search Film, 3. Purchase Film, 4. Display Film Information, 5. Display User Information, 6. Exit");
        choice = scan.nextInt();
        scan.nextLine();
        if(choice == 1){
            //Add Film to Library
            System.out.println("Title");
            String title = scan.nextLine();
            System.out.println("Director");
            String producer = scan.nextLine();
            System.out.println("Distributor");
            String label = scan.nextLine();
            System.out.println("Price");
            double price = scan.nextDouble();
            scan.nextLine();
            library.addFilm(new Film(title, producer, label, price));
        }
        else if(choice == 2){
            //Search Film in Library
            System.out.println("Title");
            String title = scan.nextLine();
            Film film = library.searchFilm(title);
            if(film == null) System.out.println("Film Not Found");
            else { film.display(); }
        }
        else if(choice == 3){
            //Purchase Film
            System.out.println("Title");
            String title = scan.nextLine();
            if(library.checkOut(title) > 0) System.out.println("You must pay " + library.checkOut(title));
            else if(library.checkOut(title) == 0) System.out.println("Free Purchase");
            else { System.out.println("Film not available");}
        }
        else if(choice == 4){
            //Display all films
            library.display();
        }
        else if(choice == 5){
            //Display information about the user signing in
            System.out.println("1. Staff, 2. User");
            int user = scan.nextInt();
            scan.nextLine();
            if(user == 1){
                //If User is Staff
                System.out.println("Name");
                String name = scan.nextLine();
                System.out.println("User ID");
                String id = scan.nextLine();
                System.out.println("Staff Id");
                String staffid = scan.nextLine();
                Staff staff = new Staff(name, id, staffid);
                //Credit for helping users
                System.out.println("How many times did you help a person today?");
                int help = scan.nextInt();
                scan.nextLine();
                staff.setHelp(help);
                staff.display();
            }
            User using = null;
            if(user == 2){
                //If User is Guest/Regular User
                System.out.println("Name");
                String name = scan.nextLine();
                System.out.println("User ID");
                String id = scan.nextLine();
                System.out.println("Password");
                String password = scan.nextLine();
                System.out.println("Credit");
                double credit = scan.nextDouble();
                scan.nextLine();
                //Make a list of all the books on hold
                System.out.print("Do you have films you are loaning (Y/N)?");
                String bool = scan.nextLine();
                if(bool.equals("Y")){
                    System.out.println("How many films?");
                    int films = scan.nextInt();
                    scan.nextLine();
                    String[] b = new String[films];
                    for(int i = 0; i<films; i++){
                        System.out.print("Title: ");
                        b[i] = scan.nextLine();
                    }
                    using = new User(name, id, password, credit, b);
                }
                else{
                    using = new User(name, id, password, credit, null);
                }
                using.display();
            }
        }
        else{
            break;
        }
    }
}
}
