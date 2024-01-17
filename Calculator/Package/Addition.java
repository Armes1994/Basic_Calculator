package Package;

class Addition extends UserInput implements BasicArithmeticInt {
    @Override
    public double basicOperation() {
        return getNum1() + getNum2();
    }
}
