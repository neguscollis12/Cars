import java.util.Scanner;

public class Cars {



    public  void takeInput () {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the year of your car: ");
        int year = input.nextInt();
        input.nextLine();

        System.out.println("Please enter the make of your car: ");
        String make = input.nextLine();

        System.out.println("Please enter the model of your car: ");
        String model = input.nextLine();

        System.out.println("Please enter the color of your car: ");
        String color = input.nextLine();

        System.out.println("Please enter the engine size of your car: ");
        double engineSize = input.nextDouble();

        Cars carObj = new Cars();
        carObj.printInput(year, make, model, color, engineSize);

    }

    public  void printInput (int year, String make, String modelOfTheCar, String colorOfTheCar, double engineSize) {
        System.out.println(" Year: " + year +
                "\n Make: " + make +
                "\n Model: " + modelOfTheCar +
                "\n Color: " + colorOfTheCar +
                "\n Engine size: " + engineSize
        );

    }




}
