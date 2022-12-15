/**
 * MagicNumberFive
 */
public class MagicNumberFive {
    
    public void subMenu(){
            String response = " ";
            while(!(response.equals("Exit")) || !(response.equals("exit"))){
                System.out.println("Magic Number 5 is a program that will always output the number 5 no matter what number the user inputs!");
                System.out.println("**********Main Menu**********\n-----------------------------\nWhat would you like to do?");
                System.out.println("[1] run a demo, \n[2] Try Magic Number 5, \n[3] View program explination");
            }
    }

    public void demo(){
        System.out.println("We will now run the demo. The number that we will use to demonstrate this program is 12!");
        System.out.println("Once we enter the number 12, the program will run some calculations, as described above, and will only output the number 5.");
        beginMagic(12);
    }

    public int beginMagic(int startnum){
        return ((((startnum + 3)*2)-4) - (startnum * 2) + 3);
    }

    public void stepThrough(){
        System.out.println("welcome to the step through, here we will explain line by line how Magic Number 5 works!");
        System.out.println("FIrst we have the user submitted value, we'll call this x, and then we do the following equation:");
        System.out.println("((((x + 3)*2)-4) - (x * 2) + 3)");
        System.out.println("\nSo if our number was 8, we would do:");
        System.out.println("[1] 8 + 3 = 11 \n[2] 11 * 2 = 22 \n[3] 22 - 4 = 18 \n[4] 18 - (2 * 8) = 2 \n[5] 2 + 3 = 5");
    }
}