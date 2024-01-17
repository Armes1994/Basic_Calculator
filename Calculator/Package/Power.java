package Package;
class Power extends UserInput implements ScientificFunctionInt {
    @Override
    public double scientificFunction() {
        return Math.pow(getX(),getY());
    }
}
