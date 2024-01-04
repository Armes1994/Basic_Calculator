package Package;
class Power extends ScientificFunctionController {
    double power(){
        System.out.print("Enter the value of x: ");
        x = input.nextDouble();
        System.out.print("Enter the value of y: ");
        y = input.nextDouble();
        return result = Math.pow(x,y);
    }
}
