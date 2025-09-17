public class Person {
    private String personID;
    private String name;
    private String contactInfo;

    public Person(String personID, String name, String contactInfo) {
        this.personID = personID;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getPersonID() { return personID; }
    public String getName() { return name; }
    public String getContactInfo() { return contactInfo; }
}
