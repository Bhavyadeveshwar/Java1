import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.next();
        System.out.println("You entered: " + name);
        sc.close();
    }
}