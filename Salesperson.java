public class Salesperson extends Person {
    private String employeeID;

    public Salesperson(String personID, String name, String contactInfo, String employeeID) {
        super(personID, name, contactInfo);
        this.employeeID = employeeID;
    }
    public void createInvoice() {
        System.out.println("Salesperson " + getName() + " created an invoice.");
    }
}

