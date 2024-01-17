package Package;
public class ScientificFunctionController extends UserInput {
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
                        squareRoot.input2();
                        System.out.println("answer = " + squareRoot.scientificFunction() + "\n");

                    }
                    case 2 -> {
                        CubeRoot cubeRoot = new CubeRoot();
                        cubeRoot.input2();
                        System.out.println("answer = " + cubeRoot.scientificFunction() + "\n");

                    }
                    case 3 -> {
                        Cosine cosine = new Cosine();
                        cosine.input2();
                        System.out.println("answer = " + cosine.scientificFunction() + "\n");

                    }
                    case 4 -> {
                        Sine sine = new Sine();
                        sine.input2();
                        System.out.println("answer = " + sine.scientificFunction() + "\n");

                    }
                    case 5 -> {
                        Tan tan = new Tan();
                        tan.input2();
                        System.out.println("answer = " + tan.scientificFunction() + "\n");

                    }
                    case 6 -> {
                        Power power = new Power();
                        power.input3();
                        System.out.println("answer = " + power.scientificFunction() + "\n");

                    }
                    case 7 -> {
                        Log log = new Log();
                        log.input2();
                        System.out.println("answer = " + log.scientificFunction() + "\n");

                    }
                    case 8 -> {
                        Exp exp = new Exp();
                        exp.input2();
                        System.out.println("answer = " + exp.scientificFunction() + "\n");

                    }
                    case 9 -> {
                        Menu menu = new Menu();
                        menu.menu();
                        return;

                    }
                    default -> System.out.println("\nAre you blind? : RETRY ");

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
