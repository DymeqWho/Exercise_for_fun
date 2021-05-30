package autoboxingandunboxing.banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i <= branches.size() - 1; i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) == null) {
            return false;
        } else {
            return findBranch(branchName).newCustomer(customerName, initialTransaction);
        }
    }


    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) == null) {
            return false;
        } else {
            return findBranch(branchName).addCustomerTransaction(customerName, transaction);
        }
    }


    public boolean listCustomers(String branchName, boolean printTransactions) {
        if (branches == null) {
            return false;
        }
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        int customerListSize = branch.getCustomers().size() - 1;
        if (printTransactions) {
            System.out.println("Customer details for branch " + branchName);
            for (int i = 0; i <= customerListSize; i++) {
                System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
                System.out.println("Transactions");
                for (int j = 0; j <= branch.getCustomers().get(i).getTransactions().size() - 1; j++) {
                    System.out.println("[" + (j + 1) + "]" + "  Amount " + branch.getCustomers()
                            .get(i)
                            .getTransactions()
                            .get(j));
                }
            }
        } else {
            System.out.println("Customer details for branch " + branchName);
            for (int i = 0; i <= customerListSize; i++) {
                System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
            }
        }
        return true;
    }
}
