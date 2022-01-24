import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String address = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in your address");
        address = input.nextLine();
        String temp = address.substring(0, address.indexOf(","));
        System.out.println(temp);








    }



}
