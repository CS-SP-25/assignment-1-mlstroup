public class NoTax implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return 0.0; // No tax applies
    }
}
