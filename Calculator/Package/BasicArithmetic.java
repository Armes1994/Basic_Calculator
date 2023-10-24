package Package;
import java.util.Scanner;

class BasicArithmetic implements Calculator {
    double num1;
    double num2;
    double result = 0;

    Scanner input = new Scanner(System.in);

    @Override
    public void basicArithmetic() {
        System.out.println("\nBasic Arithmetic ");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: ->> Menu");

        try {

            while(true){
            
                System.out.print("Pick between action 1-5: ");
                int option = input.nextInt();

                switch(option){

                    case 1 -> {
                        Addition add = new Addition();
                        result = add.add(num1,num2);
                        System.out.print("answer = "+result+"\n");
                        break;
                    }
                    case 2 -> {
                        Subtraction subtract = new Subtraction();
                        result = subtract.subtract(num1,num2);
                        System.out.print("answer = "+result+"\n");
                        break;
                    }
                    case 3 -> {
                        Multiplication multiply = new Multiplication();
                        result = multiply.multiply(num1,num2);
                        System.out.print("answer = "+result+"\n");
                        break;
                    }
                    case 4 -> {
                        Division divide = new Division();
                        result = divide.divide(num1,num2);
                        System.out.print("answer = "+result+"\n");
                        break;
                    }
                    case 5 -> { 
                        Menu menu = new Menu();
                        menu.menu();
                        return;
                    }
        
                    default ->  System.out.println("Invalid: RETRY ");
                }//END SWITCH

            }

        }
        catch(Exception e){
            System.out.println("YOU MESSED UP !!!");
            input.next();

        }

        input.close();
            
    } 
    
    @Override
    public void scientificFunction(){

    }
    @Override
    public void exit() {
       
    }
    @Override
    public void menu() { 
        
    }    

}

  



