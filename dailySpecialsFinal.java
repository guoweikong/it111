import java.util.Scanner;

public class dailySpecialsFinal {

    public static void main(String[] args) {

        String specials = null; // the user will enter the value to variabale specials
        int order;

        String coffee = null;
        double price = 0;

        Scanner input = new Scanner(System.in);

        boolean wrongDay = true;
        while(wrongDay) {
            System.out.println("Please enter a weekday, excluding weekends!");
            specials = input.next(); // assign input to specials




            switch (specials) {

                // my cases will be the day of the week
                case "Monday" -> {
                    wrongDay = false;
                    coffee = "Latte";
                    price = 4.95;
                }

                case "Tuesday" -> {
                    wrongDay = false;
                    coffee = "Frapp";
                    price = 5.95;
                }

                case "Wednesday" -> {
                    wrongDay = false;
                    coffee = "Cappucino";
                    price = 4.35;
                }


                case "Thursday" -> {
                    wrongDay = false;
                    coffee = "Regular Joe";
                    price = 2.95;
                }


                case "Friday" -> {
                    wrongDay = false;
                    coffee = "Green Tea Latte";
                    price = 6.95;
                }

            }


        }

        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
        System.out.println("How many " + coffee + "s would like to order?");
        order = Integer.parseInt(input.next());

        if(order == 0) {
            System.out.println("Looks like you don't like " + coffee +"s! So sad!!");
        } else if (order == 1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today totalling $" + price + " dollars.");
        } else if (order > 1 && order <= 4) {
            System.out.print(order + " " + coffee + "s have been ordered totalling ");
            System.out.printf("$%.2f", order * price);
            System.out.println(" dollars.");
        } else if (order >4 && order <= 9 ) {
            System.out.print("Looks like you qualify for a group discount! Your regular price is ");
            System.out.printf("$%.2f", order * price);
            System.out.println(" dollars.");

            System.out.print("You have ordered " + order + " " + coffee + "s but will be only charged ");
            System.out.printf("$%.2f", (order * price) * 0.9);
            System.out.println(" dollars.");
        } else if (order >= 10) {
            System.out.print("A bigger group discount! Your regular price is ");
            System.out.printf("$%.2f", order * price);
            System.out.println(" dollars.");

            System.out.print("You have ordered " + order + " " + coffee + "s but will be only charged ");
            System.out.printf("$%.2f", (order * price) * 0.8);
            System.out.print(" dollars.");
        }
    }
}
