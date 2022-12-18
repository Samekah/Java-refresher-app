import java.util.Scanner;

public class Fibonacci implements Applications {

    @Override
    public void subMenu(Scanner userInput) {
        String response = " ";
        int input = 0;
        // Scanner userInput = new Scanner(System.in);

        System.out.println("Fibonacci is a program that outputs a sequence of numbers where the next number equas the addition of the previous 2 numbers\n");
        while(true){
            System.out.println("**********************\n         Menu\n**********************\n\nWhat would you like to do?\n");
            System.out.println("[1] Run a demo, \n[2] Play Fibonacci, \n[3] View step through explanation, \n-> Exit");
            
            if(userInput.hasNext()){
                response = userInput.nextLine();
            }                

            if(response.equals("Run a demo") || response.equals("1")){
                demo();
            }
            else if(response.equals("Play Fibonacci") || response.equals("2")){
                
                System.out.println("Please enter the length of our Fibonacci sequence");

                try{
                    input = Integer.valueOf(userInput.nextLine());
                }
                catch(Exception e){
                    System.out.println("\nUnfortunately, the inputted value was not a whole number, so the defauly value of 10 will be used.");
                    input = 10;
                }
                //edit start method
                System.out.printf("\nThe inputted length was %d and the outputted sequence is:\n",input);
                fibonacci(input);
                
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
        System.out.println("\nWe will now run the demo. The number that we will use to demonstrate this program is 15, this will be the length of our sequence!");
        System.out.println("Once we enter the number 15, the program will start at 1 and loop through the numbers until 15, For this length it will do the following calculation:");
        System.out.println("Fn = Fn-1 + Fn-2 \n\nThis means that the next number in the sequence equals the first number plus the previous number.");
        System.out.printf("\nTherefore the inputted length of %d will output the sequence :\n",15);
        fibonacci(15); 
        
    }

    public void fibonacci(int sequence){
        int firstTerm = 1, secondTerm = 1, nextTerm = 0; 
        for(int x = 1; x <= sequence; x++){
            System.out.printf("%d, ",firstTerm);
            
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;           
        }
        System.out.println("\n");
    }

    @Override
    public void stepThrough() {
        System.out.println("\nwelcome to the step through, here we will explain line by line how Fibonacci works!");
        System.out.println("First we have the user submit a value, we'll call this x. We then use x to create a range that we want to loop through, this being 1 to x.");
        System.out.println("We then set 3 variables - firstTerm = 1, secondTerm = 1 and nextTerm = 0\n");
        System.out.println("On each value of x, we output the value held within the variable firstTerm, then calculate the next term by adding the first term with the second term");
        System.out.println("Finally we set the firstTerm to equal secondTerm and the secondTerm to equal nextTerm");
        System.out.println("For example if the length of our sequence is 5 then our output will be \n1, 1, 2, 3, 5 \nWhich is the same as: \n1, 1, 1+1=2, 2+1=3, 3+2=5\n");
        
    }
    
}
