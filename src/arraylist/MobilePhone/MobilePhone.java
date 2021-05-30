package arraylist.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            myContacts.add(contact);
            return true;
        } else if (findContact(contact) > -1)
            return false;
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.contains(oldContact)) {
            for (int i = 0; i <= myContacts.size() - 1; i++) {
                if (myContacts.get(i).equals(oldContact)) {
                    myContacts.set(i, newContact);
                }
            }
            return true;
        } else return false;
    }

    public boolean removeContact(Contact contact) {
        return findContact(contact) != -1 && myContacts.remove(contact);
    }

    private int findContact(Contact contact) {
        if (!myContacts.contains(contact)) {
            return -1;
        } else return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i <= myContacts.size() - 1; i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        if (findContact(name) > -1) {
            return myContacts.get(findContact(name));
        } else return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i <= myContacts.size() - 1; i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).toString());
        }
    }
}
