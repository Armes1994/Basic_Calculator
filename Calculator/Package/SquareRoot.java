package Package;
class SquareRoot extends UserInput implements ScientificFunctionInt {
    @Override
    public double scientificFunction() {
        return Math.sqrt(getX());
    }
}
