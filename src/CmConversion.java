import java.util.Scanner;

public class CmConversion implements Applications{

    @Override
    public void subMenu(Scanner UserInput) {
        String response = " ";
        int input = 0;
        // Scanner UserInput = new Scanner(System.in);

        System.out.println("Cm to Ft and inches is a program that converts cm measurements to feet and inches!\n");
        while(true){
            System.out.println("**********************\n         Menu\n**********************\n\nWhat would you like to do?\n");
            System.out.println("[1] Run a demo, \n[2] Convert a number, \n[3] View step through explanation, \n-> Exit");
            
            if(UserInput.hasNext()){
                response = UserInput.nextLine();
            }                

            if(response.equals("Run a demo") || response.equals("1")){
                demo();
            }
            else if(response.equals("Convert a number") || response.equals("2")){
               
                System.out.println("Please enter a centimetre measurement to convert to feet and inches");

                try{
                    input = Integer.valueOf(UserInput.nextLine());
                }
                catch(Exception e){
                    System.out.println("\nUnfortunately, the inputted value was not a whole number, so the defauly value of 0 will be used.");
                    input = 0;
                }
                convert(input);      
            }
            else if(response.equals("View step through explanation") || response.equals("3")){
                stepThrough();
            }
            else if(response.equals("Exit") || response.equals("exit")){
                System.out.println("\n**********************\nReturning to main menu\n**********************\n\n");
                break;
            }
            else{
                System.out.printf("\n\nUnfortunately, %s is not a valid option!\n\n", response);
            }

        }
        
    }

    @Override
    public void demo() {
        System.out.println("\nWe will now run the demo. The number that we will use to demonstrate this program is 199cm!");
        System.out.println("Once we enter the number x, the program will perform 3 calculation. ");
        System.out.println("A total conversion from cm to inches - x / 2.54, a conversion from inches to feet, and a calculation to find any remaining inches after the feet conversion");
        System.out.printf("\nAfter doing these conversions and calculations, we complete the conversion from cm to feet and inches.\n So with an input of %d cm the output will be\n",199);
        convert(199);         
    }

    //2.54cm -> 1 inch
    //12 inches -> 1 foot
    public void convert(int input){
        double totalInches = input / 2.54;
        double feet = Math.floor(totalInches / 12); 
        double inches = totalInches % 12;
        System.out.printf("\nThe inputted measurement was %d cm and the outputted number is %.2f foot and %.2f inches!\n\n",input, feet, inches);

    }

    @Override
    public void stepThrough() {
        System.out.println("\nwelcome to the step through, here we will explain line by line how FizzBuzz works!");
        System.out.println("First we have the user submit a value, we'll call this x. x will be the measurement in cm that we will convert to feet and inches");
        System.out.println("To do this we will do 3 calculations:\n");
        System.out.println("A total conversion from cm to inches - x / 2.54, \nA conversion from inches to feet - totalInches / 12, \nA calculation to find any remaining inches after the feet conversion - totalInches % 12");
        System.out.printf("\nSo with an input of %d cm the output will be",166);
        convert(166);         
    }
    
}
