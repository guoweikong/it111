public class MyATM {

    public static void main(String[] args) {
        int withdrawal, amount;
        withdrawal = 20;
        amount = 200;

        while(amount != 0) {  // != is not; amount is not 0;
            amount -= withdrawal;   // -= subtracting; subtracting the withdrawal from the amount;
//            amount = amount - withdrawal;     Another way to write the subtracting.
//            System.out.println("Your present amount after the withdrawal is " + amount + " dollars");

            if(amount == 0) {
                System.out.println("Your have no money!!");
            } else {
                System.out.println("Your present amount after the withdrawal is " + amount + " dollars");
            }
        }  // end while loop

            // A While Loop performs an action as long as the certain condition is TRUE (Repeating instructions over and over again)! Once the condition is FALSE, the while loop stops.
           // if withdrawal = 30, it never zeroed out, it will continuously running until terminate the program.
          // if withdrawal = 20 or 40, it will zeroed out,
    }
}
