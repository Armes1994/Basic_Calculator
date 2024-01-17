package Package;
class Exp extends UserInput implements ScientificFunctionInt {
    @Override
    public double scientificFunction() {
        return Math.exp(getX());
    }
}
