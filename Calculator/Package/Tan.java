package Package;
class Tan extends UserInput implements ScientificFunctionInt {
    @Override
    public double scientificFunction() {
        return Math.tan(getX());
    }
}
