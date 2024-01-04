package Package;
class Subtraction extends BAUserInput implements BasicArithmeticInt {
    @Override
    public double basicOperation() {
        return getNum1() - getNum2();
    }
}
