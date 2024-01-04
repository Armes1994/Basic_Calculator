package Package;

import java.util.Scanner;

public class ScientificFunctionController implements ScientificFunctionInt {
    public double x;
    public double y;
    public double result = 0;
    Scanner input = new Scanner(System.in);
    @Override
    public void scientificFunction(){
        System.out.println("\nScientific Function");
        System.out.println("1. Square Root(x)");
        System.out.println("2. Cube Root(x)");
        System.out.println("3. Cosine(x)");
        System.out.println("4. Sine(x)");
        System.out.println("5. Tan(x)");
        System.out.println("6. (x) Raised to Power (y)");
        System.out.println("7. Log(x)");
        System.out.println("8. Exp(x)");
        System.out.println("9. ->> Menu");
        

        try{
            while(true){
                
                System.out.print("Pick between action 1-9: ");
                int option = input.nextInt();
                
                switch (option){//START SWITCH
                    
                    case 1 -> {
                        SquareRoot squareRoot = new SquareRoot();
                        result = squareRoot.squareRoot();

                    }
                    case 2 -> {
                        CubeRoot cubeRoot = new CubeRoot();
                        result = cubeRoot.cubeRoot();

                    }
                    case 3 -> {
                        Cosine cosine = new Cosine();
                        result = cosine.cosine();

                    }
                    case 4 -> {
                        Sine sine = new Sine();
                        result = sine.sine();

                    }
                    case 5 -> {
                        Tan tan = new Tan();
                        result = tan.tan();

                    }
                    case 6 -> {
                        Power power = new Power();
                        result = power.power();

                    }
                    case 7 -> {
                        Log log = new Log();
                        result = log.log();

                    }
                    case 8 -> {
                        Exp exp = new Exp();
                        result = exp.exp();

                    }
                    case 9 -> {
                        Menu menu = new Menu();
                        menu.menu();
                        return;

                    }
                    default -> System.out.println("Are you blind? : RETRY ");

                }//END SWITCH
           }
        }
        catch(Exception e){
            System.out.println("YOU MESSED UP !!!");
            input.next();

        }
        input.close();
    }
    
}
