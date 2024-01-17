package Package;
class CubeRoot extends UserInput implements ScientificFunctionInt {
    @Override
    public double scientificFunction() {
        return Math.cbrt(getX());
    }
}
