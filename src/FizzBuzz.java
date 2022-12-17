import java.util.Scanner;

public class FizzBuzz implements Applications {

    @Override
    public void subMenu(Scanner magicInput) {
        String response = " ";
        int input = 0;
        // Scanner magicInput = new Scanner(System.in);

        System.out.println("FizzBuzz is a program that will output fizz, buzz or fizzbuzz if the number is divisible by either or both 3 and 5\n");
        while(true){
            System.out.println("**********************\n         Menu\n**********************\n\nWhat would you like to do?\n");
            System.out.println("[1] Run a demo, \n[2] Play FizzBuzz, \n[3] View step through explanation, \n-> Exit");
            
            if(magicInput.hasNext()){
                response = magicInput.nextLine();
            }                

            if(response.equals("Run a demo") || response.equals("1")){
                demo();
            }
            else if(response.equals("Play FizzBuzz") || response.equals("2")){
                
                System.out.println("Please enter the length of our FizzBuzz sequence");

                try{
                    input = Integer.valueOf(magicInput.nextLine());
                }
                catch(Exception e){
                    System.out.println("\nUnfortunately, the inputted value was not a whole number, so the defauly value of 15 will be used.");
                    input = 15;
                }
                //edit start method
                System.out.printf("\nThe inputted length was %d and the outputted sequence is:\n",input);
                fizzBuzz(input);
                
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
        System.out.println("\nWe will now run the demo. The number that we will use to demonstrate this program is 30, this will be the length of our sequence!");
        System.out.println("Once we enter the number 30, the program will start at 1 and loop through the numbers until 30, using logic to replace numbers that meet the following criteria.");
        System.out.println("[1] If number is divisible by 3 - replace with \"Fizz\", \n[2] If number is divisible by 5 - replace with \"Buzz\", \n[3] If number is divisible by 3 and 5 - replace with \"FizzBuzz\"\n [4] If none of these criteria is met do nothing");
        System.out.printf("\nThe inputted length was %d and the outputted sequence is:\n",30);
        fizzBuzz(30);
        
    }

    public void fizzBuzz(int sequence){
        for(int x = 1; x <= sequence; x++){
            if (x % 3 == 0) {
                System.out.print("Fizz, ");
            } 
            else if (x % 5 == 0){
                System.out.print("Buzz, ");
            }
            else if ((x % 3 == 0) && (x % 5 == 0)){
                System.out.print("FizzBuzz, ");
            }
            else{
                System.out.printf("%d, ",x);
            }
        }
        System.out.println("\n");
    }

    @Override
    public void stepThrough() {
        System.out.println("\nwelcome to the step through, here we will explain line by line how FizzBuzz works!");
        System.out.println("First we have the user submit a value, we'll call this x. We then use x to create a range that we want to loop through, this being 1 to x");
        System.out.println("On each value of x we check 3 cases:\n");
        System.out.println("[1] Is the number divisible by 3, \n[2] Is the number divisible by 5, \n[3] Is the number divisible by 3 and 5\n");
        System.out.println("If x % 3 = 0, then the number is divisible by 3 and will be replaced by \"Fizz\"");
        System.out.println("If x % 3 = 0, then the number is divisible by 3 and will be replaced by \"Fizz\"");
        System.out.println("If divisible by both 3 and 5, x will be replaced by \"FizzBuzz\" \nIf it doesnt meet these cases, then x will be printed as is - providing the following sequence if x = 15\n ");
        System.out.println("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz\n");        
    }
    
}
