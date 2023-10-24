package Package;

import java.util.InputMismatchException;
import java.util.Scanner;

class Menu implements Calculator {
   
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
                        BasicArithmetic basicArithmetic = new BasicArithmetic();
                        basicArithmetic.basicArithmetic();
                        return;
                }
                case 2 -> {
                        ScientificFunction scientificFunction = new ScientificFunction();
                        scientificFunction.scientificFunction();
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

    @Override
    public void basicArithmetic() {
      
    }

    @Override
    public void exit() {
        
    }

    @Override
    public void scientificFunction() {
        
    }
}
 
