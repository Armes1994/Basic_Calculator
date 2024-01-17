package Package;
class Sine extends UserInput implements ScientificFunctionInt {
    @Override
    public double scientificFunction() {
        return Math.sin(getX());
    }
}
