package Package;
class Division extends UserInput implements BasicArithmeticInt {
    @Override
    public double basicOperation() {
        if(getNum2() == 0){
            System.out.println("Error due to Invalid denominator");
        }
        return getNum1() / getNum2();
    }
}
