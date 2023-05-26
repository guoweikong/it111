package package_person_homework;

public class PersonDetails {

    public static void main (String[] args) {

        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;
        // in the process of creating an object from my Person class

        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();

        // we will be entering the info, but assigning values to our fields.

        firstPerson.name = "Cathy Jones";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;


        secondPerson.name = "Kendall Black";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 2015;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Arial";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.car = 2020;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;


        double monthlyRate = 0;
        double adjustedRate = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for " + firstPerson.name + ": " + firstPerson.getRate(monthlyRate) + " dollars.");
        System.out.println("Adjustments based on Gender: " + firstPerson.assumeGender(adjustedRate) + " dollars");
        System.out.println("Adjustments based on Car Age: " + firstPerson.carAge(adjustedRate) + " dollars");
        System.out.print("Here is " + firstPerson.name +  "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate) + firstPerson.carAge(adjustedRate));

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " + secondPerson.name + ": " + secondPerson.getRate(monthlyRate) + " dollars.");
        System.out.println("Adjustments based on Gender: " + secondPerson.assumeGender(adjustedRate) + " dollars");
        System.out.println("Adjustments based on Car Age: " + secondPerson.carAge(adjustedRate) + " dollars");
        System.out.print("Here is " + secondPerson.name +  "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate) + secondPerson.carAge(adjustedRate));


        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate for " + thirdPerson.name + ": " + thirdPerson.getRate(monthlyRate) + " dollars.");
        System.out.println("Adjustments based on Gender: " + thirdPerson.assumeGender(adjustedRate) + " dollars");
        System.out.println("Adjustments based on Car Age: " + thirdPerson.carAge(adjustedRate) + " dollars");
        System.out.print("Here is " + thirdPerson.name +  "'s total monthly premium: ");
        System.out.println(thirdPerson.assumeGender(adjustedRate) + thirdPerson.getRate(monthlyRate) + thirdPerson.carAge(adjustedRate));


    }
}
