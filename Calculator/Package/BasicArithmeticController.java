package Package;
class BasicArithmeticController extends UserInput {
    public void basicOperation() {
        System.out.println("\nBasic Arithmetic ");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: ->> Menu");

        try {

            while(true) {
            
                System.out.print("Pick between action 1-5: ");
                int option = input.nextInt();

                switch(option) {

                    case 1 -> {
                        Addition add = new Addition();
                        add.input1();
                        System.out.println("answer = " + add.basicOperation() + "\n");
                    }
                    case 2 -> {
                        Subtraction subtract = new Subtraction();
                        subtract.input1();
                        System.out.print("answer = " + subtract.basicOperation() + "\n");
                    }
                    case 3 -> {
                        Multiplication multiply = new Multiplication();
                        multiply.input1();
                        System.out.print("answer = " +  multiply.basicOperation() + "\n");
                    }
                    case 4 -> {
                        Division divide = new Division();
                        divide.input1();
                        System.out.print("answer = " + divide.basicOperation() + "\n");
                    }
                    case 5 -> { 
                        Menu menu = new Menu();
                        menu.menu();
                        return;
                    }
        
                    default ->  System.out.println("Are you blind? : RETRY ");
                }//END SWITCH

            }

        }
        catch(Exception e) {
            System.out.println("YOU MESSED UP !!!");
            input.next();

        }

        input.close();
            
    } 

}

  



