import java.util.Scanner;

public class bomba {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        pies tunaObject = new pies();

        System.out.println("A jak masz na imie, napisz: ");
        String name= input.nextLine();

        tunaObject.greeting(name);
    }

}
