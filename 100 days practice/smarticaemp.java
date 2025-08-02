import java.util.*;
public class smarticaemp {
    public static void main(String[] args) {
        Scanner Inp=new Scanner(System.in);
        System.out.println("Intial deposit in rupees.");
        int Intail_deposit=Inp.nextInt();
        List<String> transactionlist=new ArrayList<>();
        boolean runnning=true;
        // transactionlist.add(Intail_deposit);
        while (runnning) { 
        System.out.println("Enter your choice (1-4).");
        System.out.println("1.Deposit");
        System.out.println("2.withdraw");
        System.out.println("3.Balance");
        System.out.println("4.exit");
        int choice=Inp.nextInt();
        switch (choice){
            case 1:
            System.out.println("Enter the Depoist amount in rupees.");
            int deposit=Inp.nextInt();
            Intail_deposit=Intail_deposit+deposit;
            // System.out.println("Depoisted: "+deposit);
            transactionlist.add("Depisted: "+deposit);
            break;
            case 2:
            System.out.println("Enter the withdraw amount.");
            int withdraw=Inp.nextInt();
            int withdrawn_amount=Intail_deposit-withdraw;
            // System.out.println("Amount of Rupees "+withdrawn_amount+" is debited");
            transactionlist.add("Withdrawn amount: "+withdrawn_amount);
            break;
            case 3:
            // System.out.println("Current Balance: "+Intail_deposit);
            transactionlist.add("current Balance "+Intail_deposit);
            break;
            case 4:
            System.out.println("------Transaction details------");
            for(String entry:transactionlist){
                System.out.println(entry);
            }
            System.out.println("Existing...");
            System.exit(0);
            break;
            default:System.out.println("Enter the valid choice");
        }
        if(choice>4){
            runnning=false;
        }
        }
    }
    
}
