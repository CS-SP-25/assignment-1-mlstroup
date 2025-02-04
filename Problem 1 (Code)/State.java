public class State {
    // State name
    private String name;
    protected SalesTaxBehavior taxBehavior;

    // Getter / Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Displays final output
    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.println("The sales tax on $" + value + " in " + this.getName() + " is $" + tax);
    }

}