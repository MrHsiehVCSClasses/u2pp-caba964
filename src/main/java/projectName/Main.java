package projectName;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Welcome to primeape factory big daddies. (im horny)");
        System.out.print("You can choose between a monkey or gorilla (;");
        System.out.println("\n");

        primeapes myPrimeapes = new primeapes();
        monkey myMonkey = new monkey("weak",10, "Monke", 6.6, true, false);
        gorilla myGorilla = new gorilla("strong", 15, "Winston", 1.2, true);

        System.out.println("\n");
        System.out.println("Our default standards for monkey is: " + myMonkey.toString());

        System.out.println("\n");
        System.out.println("Our default standards for gorilla is: " + myGorilla.toString());

        System.out.println("\n");
        System.out.println("Customize your monkey below");
        
        Scanner input = new Scanner(System.in);
        int choice = 1;

        while (choice>0) {
            System.out.println("Choose between monkey or gorilla input 1 for monkey, 2 for gorilla, and 0 to quit");
            choice = input.nextInt();
            input.nextLine();
            if (choice==1) {
                System.out.println("Do you want your monkey strong, weak, or average???");
                String strengthInput = input.nextLine();
                myMonkey.setStrength(strengthInput);
                System.out.println("Monkey is " + myMonkey.getStrength());

                System.out.println("How old do you want your monkey?");
                int ageInput = input.nextInt();
                myMonkey.setAge(ageInput);
                System.out.println("Monkey is " + myMonkey.getAge() + " years old.");

                System.out.println("Whats your monkey's name???");
                String nameInput = input.next();
                myMonkey.setName(nameInput);
                System.out.println("My monkey name is: " + myMonkey.getName());

                System.out.println("Whats your monkey's penis size in inches???");
                Double PenisSizeInput = input.nextDouble();
                myMonkey.setPenisSize(PenisSizeInput);
                System.out.println("My monkey penis size in inches is " + myMonkey.getPenisSize());

                System.out.println("Does your monkey have a tail??? (true or false)");
                Boolean TailInput = input.nextBoolean();
                myMonkey.sethasTail(TailInput);
                System.out.println("Monkey has tail: " + myMonkey.gethasTail());

                System.out.println("Does your monkey have a banana??? (true or false)");
                Boolean BananaInput = input.nextBoolean();
                myMonkey.sethasBanana(BananaInput);
                System.out.println("Monkey has banana: " + myMonkey.gethasBanana());

                System.out.println("\nHere is your freshly made monkey:" + "\n" + myMonkey.toString());

            } else if (choice==2) {
                System.out.println("Do you want your gorilla strong, weak, or average???");
                String strengthInput = input.nextLine();
                myGorilla.setStrength(strengthInput);
                System.out.println("Gorilla is " + myGorilla.getStrength());

                System.out.println("How old do you want your monkey?");
                int ageInput = input.nextInt();
                myGorilla.setAge(ageInput);
                System.out.println("Gorilla is " + myGorilla.getAge() + " years old.");

                System.out.println("Whats your gorilla's name???");
                String nameInput = input.next();
                myGorilla.setName(nameInput);
                System.out.println("My gorilla name is: " + myGorilla.getName());

                System.out.println("Whats your gorilla's penis size in inches???");
                Double PenisSizeInput = input.nextDouble();
                myGorilla.setPenisSize(PenisSizeInput);
                System.out.println("My gorilla penis size in inches is " + myGorilla.getPenisSize());

                System.out.println("Does your gorilla have muscles?? (true or false)");
                Boolean MusclesInput = input.nextBoolean();
                myGorilla.sethasMuscles(MusclesInput);
                System.out.println("Gorilla has muscles: " + myGorilla.gethasMuscles());

                System.out.println("\nHere is your freshly made gorilla:" + "\n" + myGorilla.toString());
            }
        }
        input.close();
    }
}
