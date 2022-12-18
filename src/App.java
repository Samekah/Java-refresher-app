import java.util.Scanner;

public class App {
    /* This code will allow a user to run 4 basic apps, these being
     *  [1] Magic number 5
     *  [2] Counting application
     *  [3] Cm to Ft and inches
     *  [4] Fibonacci sequence
     *  [5] Cylinder volume calculator
    */
    public static void main(String[] args) throws Exception {
        String response = "";
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Hello, welcome to my Java refresher app! \nThis code will allow a user to run 5 basic apps, these being:");
            System.out.println("\n[1] Magic number 5, \n[2] FizzBuzz, \n[3] Cm to Ft and inches, \n[4] Fibonacci sequence, \n[5] Cylinder volume calculator \n-> Exit \n");
            System.out.println("Each program will have their own instructions on how they can be used and an explination of what they can do!");
            System.out.println("Please select an option to run, either by name or number");

            //section to retrieve input
            response = input.nextLine();
            if(response.equals("Magic number 5") || response.equals("1")){
                System.out.println("\nMagic Number 5 selected");
                MagicNumberFive game = new MagicNumberFive();
                game.subMenu(input);
               
            }
           else if(response.equals("FizzBuzz") || response.equals("2")){
                System.out.println("\nFizzBuzz selected");
                FizzBuzz fizzBuzz = new FizzBuzz();
                fizzBuzz.subMenu(input);
            }    
           else if(response.equals("Cm to Ft and inches") || response.equals("3")){
                System.out.println("\nCm to Ft and inches conversion selected");
                CmConversion cmToFeet = new CmConversion();
                cmToFeet.subMenu(input);
            }
            else if(response.equals("Fibonacci sequence") || response.equals("4")){
                System.out.println("\nFibonacci sequence selected");
                Fibonacci fibonacci = new Fibonacci();
                fibonacci.subMenu(input);
            }
            else if(response.equals("Cylinder volume calculator") || response.equals("5")){
                System.out.println("\nCylinder volume calculator selected");
                VolumeCalculator cylinderVolume = new VolumeCalculator();
                cylinderVolume.subMenu(input);
            }
            else if(response.equals("Exit") || response.equals("exit")){
                System.out.println("\nThank you for using this appication!");
                input.close();
                break;
            }
            else{
                System.out.printf("\n\nUnfortunately, %s is not a valid option!\n", response);
            }
       }
       
    }
}
