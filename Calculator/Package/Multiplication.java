package Package;
class Multiplication extends UserInput implements BasicArithmeticInt {
    @Override
    public double basicOperation() {
        return getNum1() * getNum2();
    }
}
