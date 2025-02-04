public class Indiana extends State {
    public Indiana() {
        this.taxBehavior = new SevenPercent(); // %7 for IN
        this.setName("Indiana");
    }

    @Override
    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, this.getName(), tax);
    }
}