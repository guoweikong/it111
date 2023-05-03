import java.util.Scanner;

public class dailySpecials2 {

    public static void main(String[] args) {

        String specials; // the user will enter the value to variabale specials
        int order;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the day of the week excluding weekends (Monday - Friday only)");

        specials = input.next(); // assign input to specials

//        input.close(); //close input

        // in the world of coffee, I need a name of a coffee beverage and a price

        String coffee;
        double price;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if(saturday || sunday) {

            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();

        }


        switch (specials) {

            // my cases will be the day of the week
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would like to order?");
                order = Integer.parseInt(input.next());

                if(order == 0) {
                    System.out.println("Looks like you don't like " + coffee +"s! So sad!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else if (order > 1) {
                    System.out.println(order + " " + coffee + "s have been ordered totalling ");
                    System.out.print("$");
                    System.out.printf("%.2f", order * price);
                    System.out.println(" dollars.");
                }


            }
            case "Tuesday" -> {
                coffee = "Frapp";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would like to order?");
                order = Integer.parseInt(input.next());

                if(order == 0) {
                    System.out.println("Looks like you don't like " + coffee +"s! So sad!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else if (order > 1) {
                    System.out.println(order + " " + coffee + "s have been ordered totalling ");
                    System.out.print("$");
                    System.out.printf("%.2f", order * price);
                    System.out.println(" dollars.");
                }
            }

            case "Wednesday" -> {
                coffee = "Cappucino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would like to order?");
                order = Integer.parseInt(input.next());

                if(order == 0) {
                    System.out.println("Looks like you don't like " + coffee +"s! So sad!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else if (order > 1) {
                    System.out.println(order + " " + coffee + "s have been ordered totalling ");
                    System.out.print("$");
                    System.out.printf("%.2f", order * price);
                    System.out.println(" dollars.");
                }
            }


            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would like to order?");
                order = Integer.parseInt(input.next());

                if(order == 0) {
                    System.out.println("Looks like you don't like " + coffee +"s! So sad!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else if (order > 1) {
                    System.out.println(order + " " + coffee + "s have been ordered totalling ");
                    System.out.print("$");
                    System.out.printf("%.2f", order * price);
                    System.out.println(" dollars.");
                }
            }


            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + "s would like to order?");
                order = Integer.parseInt(input.next());

                if(order == 0) {
                    System.out.println("Looks like you don't like " + coffee +"s! So sad!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                } else if (order > 1) {
                    System.out.println(order + " " + coffee + "s have been ordered totalling ");
                    System.out.print("$");
                    System.out.printf("%.2f", order * price);
                    System.out.println(" dollars.");
                }
            }

//            default:
//                System.out.println("Please enter a valid day, or check your spelling.");

            



        }



    }
}
