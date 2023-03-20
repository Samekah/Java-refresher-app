import java.util.Scanner;

public class VolumeCalculator implements Applications{

    @Override
    public void subMenu(Scanner userInput) {
        String response = " ";
        double input = 0;
        double radius = 0;
        // Scanner userInput = new Scanner(System.in);

        System.out.println("Cylinder volume calculator is a program that calculates the volume of a cylinder based on the inputted height and radius\n");
        while(true){
            System.out.println("**********************\n         Menu\n**********************\n\nWhat would you like to do?\n");
            System.out.println("[1] Run a demo, \n[2] Calculate Volume, \n[3] View step through explanation \n-> Exit");
            
            if(userInput.hasNext()){
                response = userInput.nextLine();
            }                

            if(response.equals("Run a demo") || response.equals("1")){
                demo();
            }
            else if(response.equals("Calculate volume") || response.equals("2")){
                
                System.out.println("Please enter the radius of the cylinder");

                try{
                    radius = Double.valueOf(userInput.nextLine());
                    System.out.println("Please enter the height of the cylinder");
                    input = Double.valueOf(userInput.nextLine());
                }
                catch(Exception e){
                    System.out.println("\nUnfortunately, the inputted value was not a whole number, so the defauly value of 10 will be used.");
                    input = 10;
                }
                //edit start method
                System.out.printf("\nThe inputted height was %.2f, the radius was %.2f and the outputted volume is %.2f\n\n",input, radius, calculateVolume(radius, input));
                        
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
        System.out.println("\nWe will now run the demo. The numbers that we will use to demonstrate this program are 5 for the radius and 15 for the height!");
        System.out.println("Once we enter the radius x and the height y, the program the following calculation.");
        System.out.println("\n PI(r*r)h");
        System.out.printf("\nSo with an inputted radius of %d and a height of %d the outputted volume will be %.2f\n\n",5,15,calculateVolume(5, 15));       
    }

    public double calculateVolume(double radius, double height){
        return (Math.PI * Math.pow(radius, 2)) * height;
    }

    @Override
    public void stepThrough() {
        System.out.println("welcome to the step through, here we will explain line by line how Cylinder volume calculator works! For this our radius and height will be 24 6");
        System.out.println("First we have the user submit 2 values being the radius and height of the cylinder, we'll call these r and h, and then we do the following equation:\n");
        System.out.println("PI(r*r)h - which is equivelant to (PI * (24 * 24) * 6)");
        System.out.println("This would give us a volume of 10857.34");
    }
    
}
