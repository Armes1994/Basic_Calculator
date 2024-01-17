package Package;
class Cosine extends UserInput implements ScientificFunctionInt {
    @Override
    public double scientificFunction() {
        return Math.cos(getX());
    }
}
