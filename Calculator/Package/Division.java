package Package;
class Division extends BasicArithmeticController {
    double divide(double num1,double num2){
        System.out.print("Enter First number: ");
        num1 = input.nextDouble();
        System.out.print("Enter Second number: ");
        num2 = input.nextDouble();
        if(num2 == 0){
            System.out.println("Error due to Invalid denominator");
        }
        
        return result = (num1 / num2);
    }
    
}
