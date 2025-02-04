public class SalesTaxCalculator {    
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java SalesTaxCalculator <StateName> <SaleAmount>");
            return;
        }

        String stateName = args[0];
        double saleAmount = Double.parseDouble(args[1]);

        State state = null;

        switch (stateName) {
            case "Indiana": 
                state = new Indiana();
                break;
            case "Alaska": 
                state = new Alaska();
                break;
            case "Hawaii": 
                state = new Hawaii();
                break;
            default:
                System.out.println("Invalid state entered.");
                return;
        }

        state.showTax(saleAmount);
    }
}
