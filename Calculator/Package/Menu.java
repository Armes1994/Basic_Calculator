package Package;

import java.util.InputMismatchException;
import java.util.Scanner;

class Menu implements MenuInt {
   
    @Override 
    public void menu(){
    Scanner input = new Scanner(System.in);
    
    System.out.println("\nWelcome (* ^ v ^ *)> User ");
    System.out.println(" ");
    System.out.println("1. Basic Arithmetic ");
    System.out.println("2. Scientific Function ");
    System.out.println("3. Exit ");
    System.out.print("Pick action between 1-3: ");
    int option = input.nextInt();
    try{
        while(true){
            switch(option){
                case 1 -> {
                        BasicArithmeticController basicArithmeticController = new BasicArithmeticController();
                        basicArithmeticController.basicOperation();
                        return;
                }
                case 2 -> {
                        ScientificFunctionController scientificFunctionController = new ScientificFunctionController();
                        scientificFunctionController.scientificFunction();
                        return;
                }
                case 3 -> {
                        Exit exit = new Exit();
                        exit.exit();
                        return;
                }

            }// close switch
        }
    }
    catch(InputMismatchException e){
        System.out.println("\nYOU MESSED UP !!!");
        input.next();

    }

    input.close();
}

}
 
