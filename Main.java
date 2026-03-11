import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double totalIncome=0.0;
        double totalExpenses=0.0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Name");
        String userName=scanner.nextLine();
        System.out.println("Hello"+userName+"! Lets Track your finances ");
        while(true){
        System.out.println("=== Main Menu===");
        System.out.println("1.Add Income");
        System.out.println("2.Add Expenses");
        System.out.println("3.View Salary");
        System.out.println("4.Exit");
        System.out.println("Please choose an option(1-4):");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the amount of income");
                double income=scanner.nextDouble();
                if(income>0){
                    totalIncome+=income;
                    System.out.println("Successfully added your Income");
                }
                else{
                    System.out.println("Invaid Amount");
                }
                break;
                case 2:
                    System.out.println("Enter amount expenses:");
                    double Expense=scanner.nextDouble();
                    if(Expense>0){
                        if(Expense<=(totalIncome-totalExpenses)){
                            System.out.println("choose category for this expense");
                            System.out.println("1.food");
                            System.out.println("2.Transportaion");
                            System.out.println("3.Entertainment");
                            System.out.println("4.other");
                            int category=scanner.nextInt();
                            String categoryName;
                            switch(category){
                                case 1:
                                    categoryName="food";
                                    break;
                                case 2:
                                    categoryName="Transportaion";
                                    break;
                                case 3:
                                    categoryName="Entertainment";
                                    break;
                                case 4:
                                    categoryName="other";
                                    break;
                                default:
                                System.out.println("invalid category");
                                continue;
                            }
                            totalExpenses+=Expense;
                            System.out.println("Successfully added");
                        }
                    }else{
                        System.out.println("Invalid amount");
                    }
                        break;
                case 3:
                    double remainingBalance=totalIncome-totalExpenses;
                    System.out.println("=== Financial summary");
                    System.out.println(" total Income"+totalIncome+"totalExpense"+totalExpenses+"Balance"+remainingBalance);
                            break;
                case 4:
                                System.out.println("Thank you for using expense Tracker");
                                System.exit(0);
                            default:
                            System.out.println("Invalid choice");
                    }
        }
    }
}
        
                    
