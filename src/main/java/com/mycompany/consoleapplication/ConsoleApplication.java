
import java.io.Console;
import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {

        
        int x = 0;
        while (x < 1) {
            Console console = new Console();
            console.getConsoleType();
            console.getStore();
            console.getTotalSales();
            
            //Display report
            
            System.out.println("Do you want to enter another console sale? (yes/no)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                x++;
            }
        }
    } 
}        


