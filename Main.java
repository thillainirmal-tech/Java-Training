<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Bank");

        //  Add branches
        bank.addBranch("Chennai");
        bank.addBranch("Mumbai");

        //  Add customers with initial deposit
        bank.addCustomer("Chennai", "Alice", 1000.0);
        bank.addCustomer("Chennai", "Bob", 2000.0);
        bank.addCustomer("Mumbai", "Charlie", 1500.0);

        //  Add transactions
        bank.addCustomerTransaction("Chennai", "Alice", 500.0);
        bank.addCustomerTransaction("Chennai", "Bob", -200.0);
        bank.addCustomerTransaction("Mumbai", "Charlie", 300.0);

        // List customers with transactions
        bank.listCustomers("Chennai", true);
        bank.listCustomers("Mumbai", true);
    }
}
=======
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
>>>>>>> polymorphism1-branch
