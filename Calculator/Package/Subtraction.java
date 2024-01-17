package Package;
class Subtraction extends UserInput implements BasicArithmeticInt {
    @Override
    public double basicOperation() {
        return getNum1() - getNum2();
    }
}
