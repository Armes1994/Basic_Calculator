package Package;
class Log extends UserInput implements ScientificFunctionInt {
    @Override
    public double scientificFunction() {
        return Math.log(getX());
    }
}
