public class Invoice {
    private String invoiceNumber;
    private String date;
    private double tradeInAllowance;
    private String dealerOptions;
    private double finalPrice;
    private double taxes;
    private double licenseFees;

    private Customer customer;
    private Salesperson salesperson;
    private Vehicle purchasedVehicle;
    private Vehicle tradeInVehicle;

    public Invoice(String invoiceNumber, String date, double tradeInAllowance, String dealerOptions,
                   double finalPrice, double taxes, double licenseFees,
                   Customer customer, Salesperson salesperson,
                   Vehicle purchasedVehicle, Vehicle tradeInVehicle) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.tradeInAllowance = tradeInAllowance;
        this.dealerOptions = dealerOptions;
        this.finalPrice = finalPrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.customer = customer;
        this.salesperson = salesperson;
        this.purchasedVehicle = purchasedVehicle;
        this.tradeInVehicle = tradeInVehicle;
    }
}
