package Package;
import java.util.Scanner;
abstract class UserInput {
    private double num1;
    private double num2;
    private double x;
    private double y;
    Scanner input = new Scanner(System.in);
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
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
    public void input1() {
        System.out.println("Enter the first number:");
        setNum1(input.nextDouble());
        System.out.println("Enter the second number:");
        setNum2(input.nextDouble());
    }
    public void input2() {
        System.out.print("Enter the value of x: ");
        setX(input.nextDouble());
    }
    public void input3() {
        System.out.print("Enter the value of x: ");
        setX(input.nextDouble());
        System.out.print("Enter the value of y: ");
        setY(input.nextDouble());
    }

}
