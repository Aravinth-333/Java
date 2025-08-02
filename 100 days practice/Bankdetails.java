
import java.util.*;

public class Bankdetails {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        System.out.println("Intial deposit:");
        int Intail_deposit = Inp.nextInt();
        List<String> transaList = new ArrayList<>();
        transaList.add("Intail Depoist: " + Intail_deposit + ".0");
        Bank b = new Bank();
        boolean running = true;
        while (running) {
            System.out.println("\nEnter Your choice (1-4).");
            System.out.println("1.Deposit");
            System.out.println("2.withdraw");
            System.out.println("3.Balance");
            System.out.println("4.exit");
            int choice = Inp.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the depoist amount.");
                    int depoist = Inp.nextInt();
                    Intail_deposit += depoist;
                    // System.out.print("Deposited:" + b.Depoist(depoist));
                    transaList.add("Depoisted: " + b.Depoist(depoist) + ".0");
                    break;
                case 2:
                    System.out.println("Enter the withdrawn amount:");
                    int withdraw = Inp.nextInt();
                    // System.out.println("withdrawn amount: " + b.withdrawn(withdraw, Intail_deposit));
                    transaList.add("withdrawn amount: " + b.withdrawn(withdraw, Intail_deposit) + ".0");
                    break;
                case 3:
                    // System.out.println("Balance: " + b.Balance(Intail_deposit));
                    transaList.add("Balance: " + b.Balance(Intail_deposit) + ".0");
                    break;
                case 4:
                    for (String entry : transaList) {
                        System.out.println(entry);
                    }
                    System.out.println("Existing...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid choice(1-4)");
                    if (choice > 4) {
                        running = false;
                    }
            }

        }
    }
}

class Bank {

    public int Depoist(int depoist) {
        return depoist;
    }

    public int withdrawn(int withdraw_amount, int Intail_deposit) {
        if (withdraw_amount > Intail_deposit) {
            return withdraw_amount;
        }
        String result = "You cannot withdrawn an amount of rupees-" + withdraw_amount + "because the balance was-" + Intail_deposit;
        return 1;
    }

    public int Balance(int Intail_deposit) {
        return Intail_deposit;
    }
}
