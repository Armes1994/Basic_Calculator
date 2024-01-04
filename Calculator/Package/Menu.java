package Package;
import java.util.InputMismatchException;
class Menu extends BAUserInput implements MenuInt {
    @Override
    public void menu() {

    System.out.println("\nWelcome (* ^ v ^ *)> User ");
    System.out.println(" ");
    System.out.println("1. Basic Arithmetic ");
    System.out.println("2. Scientific Function ");
    System.out.println("3. Exit ");

        try{

            while(true) {

                System.out.print("Pick action between 1-3: ");
                int option = input.nextInt();

                switch(option) {
                    case 1 -> {
                        BasicArithmeticController basic = new BasicArithmeticController();
                        basic.basicOperation();
                        return;
                    }
                    case 2 -> {
                        ScientificFunctionController scientific = new ScientificFunctionController();
                        scientific.scientificFunction();
                        return;
                    }
                    case 3 -> {
                        Exit exit = new Exit();
                        exit.exit();
                        return;
                    }
                    default ->  System.out.println("\nAre you blind? : RETRY ");

                }// close switch
            }
        }
        catch(InputMismatchException e) {
            System.out.println("\nYOU MESSED UP !!!");
            input.next();
        }

        input.close();
    }

}
 
