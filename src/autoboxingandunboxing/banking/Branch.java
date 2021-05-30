package autoboxingandunboxing.banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i <= customers.size() - 1; i++) {
            if (customers.get(i).getName().equals(customerName)) {
                return customers.get(i);
            }
        }
        return null;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        if (findCustomer(customerName) != null) {
            findCustomer(customerName).addTransaction(transaction);
            return true;
        }
        return false;
    }

}
