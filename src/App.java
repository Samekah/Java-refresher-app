public class App {
    /* This code will allow a user to run 4 basic apps, these being
     *  [1] Magic number 5
     *  [2] Counting application
     *  [3] Cm to Ft and inches
     *  [4] Fibonacci sequence
     *  [5] Cylinder volume calculator
    */
    public static void main(String[] args) throws Exception {
        String response = "Exit";
       
        while(!response.equals("Exit") && !response.equals("exit")){
            System.err.println(!response.equals("Exit"));
            System.out.println("Hello, welcome to my Java refresher app! \nThis code will allow a user to run 5 basic apps, these being:");
            System.out.println("[1] Magic number 5, \n[2] Counting application, \n[3] Cm to Ft and inches, \n[4] Fibonacci sequence, \n[5] Cylinder volume calculator\n");
            System.out.println("Each program will have their own instructions on how they can be used and an explination of what they can do!");
            System.out.println("Please select an option to run, either by name or number");

            //section to retrieve input

            if(response.equals("Magic number 5") || response=="1"){
                System.out.println("Magic Number 5 selected");
               
            }
           else if(response.equals("Counting application") || response=="2"){
                System.out.println("Counting application selected");

            }    
           else if(response.equals("Cm to Ft and inches") || response=="3"){
                System.out.println("Cm to Ft and inches conversion selected");
         
            }
            else if(response.equals("Fibonacci sequence") || response=="4"){
                System.out.println("Fibonacci sequence selected");
            }
            else if(response.equals("Cylinder volume calculator") || response=="5"){
                System.out.println("Cylinder volume calculator selected");
            }
            else{
                System.out.println("Unfortunately, " + response + " is not a valid option!");
            }
       }
       System.out.println("Thank you for using this appication!");
        
        //select option
        //give explination
        //play demo
        //ask if user would like to select another option or use proogram - if yes run sub menu, if no back to main menu



    }
}
