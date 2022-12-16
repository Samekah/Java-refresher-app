/**
 * MagicNumberFive
 */

 import java.util.Scanner;

public class MagicNumberFive {
    //complete
    public void subMenu(){
            String response = " ";
            int input = 0;
            Scanner magicInput = new Scanner(System.in);

            System.out.println("Magic Number 5 is a program that will always output the number 5 no matter what number the user inputs!\n");
            while(true){
                System.out.println("**********Main Menu**********\n-----------------------------\n\nWhat would you like to do?\n");
                System.out.println("[1] Run a demo, \n[2] Play Magic Number 5, \n[3] View step through explanation, \n-> Exit");

                if(magicInput.hasNextLine()){
                    response = magicInput.nextLine();
                }
                else{
                    System.err.println("here");
                }
                

                if(response.equals("Run a demo") || response.equals("1")){
                    demo();
                }
                else if(response.equals("Play Magic Number 5") || response.equals("2")){
                    //add loop to make sure input is an integer
                    System.out.println("Please enter a number and watch the magic!");
                    // input = magicInput.nextInt();
                    input = 5;
                    System.out.printf("\nThe inputted number was %d and the outputted number is %d!\n\n", input, beginMagic(input));
                    
                }
                else if(response.equals("View step through explanation") || response.equals("3")){
                    stepThrough();
                }
                else if(response.equals("Exit") || response.equals("exit")){
                    System.out.println("\nReturning to main menu\n\n");
                    // magicInput.close();
                    break;
                }
                else{
                    System.out.printf("\n\nUnfortunately, %s is not a valid option!\n", response);
                }

            }
    }

    //add methos for hangling user input - input directory

    public void demo(){
        System.out.println("\nWe will now run the demo. The number that we will use to demonstrate this program is 12!");
        System.out.println("Once we enter the number 12, the program will run some calculations, as described above, and will only output the number 5.");
        System.out.println(beginMagic(12));
    }

    public int beginMagic(int startnum){
        return ((((startnum + 3)*2)-4) - (startnum * 2) + 3);
    }

    public void stepThrough(){
        System.out.println("welcome to the step through, here we will explain line by line how Magic Number 5 works!");
        System.out.println("First we have the user submit a value, we'll call this x, and then we do the following equation:\n");
        System.out.println("((((x + 3)*2)-4) - (x * 2) + 3)");
        System.out.println("\nSo if our number was 8, we would do:\n");
        System.out.println("[1] 8 + 3 = 11 \n[2] 11 * 2 = 22 \n[3] 22 - 4 = 18 \n[4] 18 - (2 * 8) = 2 \n[5] 2 + 3 = 5");
    }
}