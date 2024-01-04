package Package;
class Multiplication extends BAUserInput implements BasicArithmeticInt {
    @Override
    public double basicOperation() {
        return getNum1() * getNum2();
    }
}
