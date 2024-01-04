package Package;
import java.util.Scanner;

class Addition implements BasicArithmeticInt {
    private double num1;
    private double num2;
    private final Scanner input;

    public Addition() {
        this.input = new Scanner(System.in);
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

    @Override
    public void getInput() {
        System.out.println("Enter the first number:");
        setNum1(input.nextDouble());
        System.out.println("Enter the second number:");
        setNum2(input.nextDouble());
    }

    @Override
    public double basicOperation() {
        return getNum1() + getNum2();
    }
}
