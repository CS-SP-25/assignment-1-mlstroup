public class SevenPercent implements SalesTaxBehavior{
    @Override
    public double compute(double value) {
        return value * 0.07; // 7% tax
    }
}
