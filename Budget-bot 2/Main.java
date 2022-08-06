import java.util.Scanner;

class Main {
  public static double balance;
  
  public static void main(String[] args) 
  {
    introMethod();
    
  } 

  public static void introMethod()
  {
    Scanner keyB = new Scanner(System.in);
    System.out.println("Welcome to BudgetBot 2021! \nPlease enter your name...");
    String c1Name = keyB.nextLine();
    System.out.println("Thank you for choosing BudgetBot " + c1Name + "!");
    System.out.println("How old are you?");
    int c1Age = keyB.nextInt();
    System.out.println("To get started, we will need some numbers to determine your monthly budget... What is your monthly salary?\nPlease only input numbers (ex. 5000 not $5,000).");
    double c1Sal = keyB.nextDouble();
    System.out.println("Okay " + c1Name + ", we will be working with your budget of $" + c1Sal);
    balance = c1Sal;
    System.out.println("You have $" + balance + " remaining. \nPlease enter your monthly dues for HOUSING");
    double housing = keyB.nextDouble();
    balance = balance - housing;
    balanceCheck();
    System.out.println("You have $" + balance + " remaining. \nPlease enter your monthly dues for FOOD");
    double food = keyB.nextDouble();
    balance = balance - food;
    balanceCheck();
    System.out.println("You have $" + balance + " remaining. \nPlease enter your monthly dues for INSURANCE");
    double insurance = keyB.nextDouble();
    balance = balance - insurance;
    balanceCheck();
    System.out.println("You have $" + balance + " remaining. \nPlease enter your monthly dues for TRANSPORTATION");
    double transportation = keyB.nextDouble();
    balance = balance - transportation;
    balanceCheck();
    leftoverCheck();
          
  
   
    
  } //end of introMethod




  public static void balanceCheck()
  {
    if (balance < 0)
    {
      System.out.println("Your monthly expenses have exeeded your monthly budget. Restart or try again later.");
      System.exit(0);
    
    }
    
    
  }

  public static void leftoverCheck()
  {
    if (balance > 1)
    {
      System.out.println("You still have $" + balance + " remaining. You are free to spend the rest or save it for later!");
      
    }
  }
  
 
} // end of class main
