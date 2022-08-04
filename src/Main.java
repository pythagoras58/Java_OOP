public class Main {
    public static void main(String[] args) {

        ContactManager myContactManager = new ContactManager();

        //1
        String _name = "Abena";
        String _phoneNumber = "0129012121";
        Contact contact = new Contact();
        contact.name = _name;
        contact.phone = _phoneNumber;


        myContactManager.addContact(contact);

        // 2
        String _name1 = "Pokua";
        String _phoneNumber1 = "012934232";
        Contact contact1 = new Contact();
        contact1.name = _name1;
        contact1.phone = _phoneNumber1;

        myContactManager.addContact(contact1);

        //3
        String _name2 = "Nyamekye";
        String _phoneNumber2 = "021329918";
        Contact contact2 = new Contact();
        contact2.name = _name2;
        contact2.phone = _phoneNumber2;

        myContactManager.addContact(contact2);

        //search
        Contact _output = myContactManager.searchContact(_name2);

        System.out.println("[PHONE]-> "+  _output.phone);
        System.out.println("[NAME]-> "+  _output.name);

    }
}
