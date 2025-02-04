public class Alaska extends State{
    public Alaska() {
        this.taxBehavior = new NoTax(); // 0% for AK
        this.setName("Alaska");
    }

    @Override
    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, this.getName(), tax);
    }
}