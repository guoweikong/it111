public class GallonsLiters {

    public static void main(String[] args) {

        double liter, gallon;
        int counter = 1;


        for (gallon = 1; gallon <= 100; gallon = gallon + 4, counter ++) {
            liter = gallon * 3.79;

            if (gallon == 1) {
//            System.out.println(liter + " liters = " + gallon +" Gallon");
//            System.out.print(" gallon is = " );
//            System.out.printf("%.2f", liter);
//            System.out.print("liters");


                System.out.printf("%.2f", liter);
                System.out.println(" liters = " + gallon + " Gallon");

            } else {

                System.out.printf("%.2f", liter);
                System.out.println(" liters = " + gallon + " Gallons");
            }
            
            if (counter % 5 == 0) {
                System.out.println();
            }
            
        }
        System.out.println("We are Done!");
    }
}


