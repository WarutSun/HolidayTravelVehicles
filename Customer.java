public class Customer extends Person {
    private String customerID;
    private String customerName;
    private String customerAddress;
    private int customerPhoneNumber;
    public Customer(String personID, String name, String contactInfo, String customerID, String customerName, String customerAddress, int customerPhoneNumber) {
        super(personID, name, contactInfo);
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void signInvoice() {
        System.out.println(getName() + " signed the invoice.");
    }
    public void requestPurchase(){
        System.out.println(getName() + " request to purchase.");
    }
    public String getCustomerID() {
        return customerID; }
}

