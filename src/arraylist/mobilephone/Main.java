package arraylist.mobilephone;

public class Main {
    public static void main(String[] args) {
        Contact ron = new Contact("Ron", "123456");
        Contact ron2 = new Contact("Ron", "123456");
        Contact kakkarekokko = new Contact("Kakkarekokko", "658654");

        MobilePhone m = new MobilePhone("123456");
        System.out.println("adding Ron: " + m.addNewContact(ron));
        System.out.println("2-nd time adding Ron: " + m.addNewContact(ron2));
        System.out.println("Deleting not existing contact: " + m.updateContact(kakkarekokko, kakkarekokko));
        m.printContacts();
        System.out.println("Adding Kakkarekokko: " + m.addNewContact(kakkarekokko));
        m.printContacts();
        System.out.println("Removing Ron: " + m.removeContact(ron));
        System.out.println("Removing Ron 2nd time: " + m.removeContact(ron));
        System.out.println("Removing no one existing: " + m.removeContact(new Contact("Dupa", "123456")));
        System.out.println("Is Ron available in contacts? " + m.queryContact("Ron"));
        System.out.println("Is kakkarekokko available in contacts? " + m.queryContact("Kakkarekokko"));
        m.updateContact(kakkarekokko, new Contact("KAKAKAKAKAkkarekokko", "123456"));
        System.out.println("Updated?: " + m.queryContact("KAKAKAKAKAkkarekokko"));
    }
}
