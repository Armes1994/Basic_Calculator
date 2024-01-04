package Package;
import java.util.Scanner;
abstract class BAUserInput {
    private double num1;
    private double num2;
    Scanner input = new Scanner(System.in);
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public void input() {
        System.out.println("Enter the first number:");
        setNum1(input.nextDouble());
        System.out.println("Enter the second number:");
        setNum2(input.nextDouble());
    }

}
