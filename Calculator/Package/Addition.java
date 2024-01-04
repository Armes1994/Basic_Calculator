package Package;

class Addition extends BAUserInput implements BasicArithmeticInt {
    @Override
    public double basicOperation() {
        return getNum1() + getNum2();
    }
}
