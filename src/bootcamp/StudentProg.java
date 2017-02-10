package bootcamp;

import java.util.Scanner;

public class StudentProg {

    public static void main(String[] args) {
	//Create 3 arrays for Name, Age, and favorite food
    String names[] = {"Arnim Zola", "Mac Gargan", "Pete Wisdom", "Richard Fisk",
    "Steve Rogers", "Tony Stark", "Robin Chapel", "Virginia Dare", "Venus Demilo",
    "William Stryker", "Queen Quasimodo", "Naoko Nebula", "Dani Moonstar",
    "Deena Pilgrim", "Rick Grimes", "Carl Grimes", "Darryl Dixon",
    "Abraham Ford", "Maggie Rhee", "Negan Negan"};

    String favFoods[] = {"Fig & Olive", "Mammoth", "Mustard Lamb", "Cranberry Trout",
    "Butter Pizza", "Guava Wafer", "Omelette Du Fromage", "Nutmeg Custard", "Cockles",
    "Cashew Bonbons", "Pigeon", "Lime Tuna", "Mushroom Alligator", "Grape Pud", "Frog",
    "Infused Tofu", "Venison Truffles", "Hazelnut Roll", "Ginger Herring", "Olive Nuts"};

    int ages[] = {50, 16, 45, 17, 19, 23, 33, 30, 24, 24, 80,
            100, 41, 4, 19, 19, 35, 47, 15, 5};

        //Initialize Scanner for User Input
        Scanner user = new Scanner(System.in);

        //Set Variables
        String student;
        String favFood;
        int age;
        int carryOn;


        //Welcome User
        System.out.println("Welcome to the Super Class Student Inquiry Form");
        System.out.println(" ");


            do { System.out.println("Which student would you like to know more about?\n" +
                    "(Enter a number between 1 and 20): " );
                    int studNum = user.nextInt();



                for (int i = 0; i <= names.length; i++) {
                    if (studNum == i) {
                        student = names[i-1];
                        System.out.println(student); //prints student name
                        System.out.println("What Would you like to know?\n1 for Age, 2 for " +
                                "Favorite Food,or 0 to Quit\n(Enter a Number: ");
                        int answer = user.nextInt();

                        if (answer < 1 || answer > 2) {
                            System.out.println("You didn't follow the rules. Goodbye");
                            System.exit(0);
                        }
                        else if (answer == 1){
                            for (i = 0; i <= ages.length; i++) {
                                if (studNum == i ) {
                                    age = ages[i-1];
                                    System.out.println(age);
                                    System.out.println(" ");

                                }
                            }
                        }
                        else {
                            for (i = 0; i <= favFoods.length; i++) {
                               if(studNum == i) {
                                    favFood = favFoods[i-1];
                                   System.out.println(" ");
                                    System.out.println(favFood);
                                    System.out.println(" ");

                               }
                            }
                        }
                   //
                   //lse if (studNum == 20) { studNum = names[20];
                    }
                }

                System.out.println("Would you like to know about another student?" +
                        "\nType 1 to continue or 2 to quit");
                carryOn = user.nextInt();

            } while (carryOn == 1);//End of Do-While Loop


        System.out.println("In the words of the great Cashier,\nApu Nahasapeemapetilon... "
                + "\n\"Tank You! Come Agan!\"");



    }
}

//Make a variable for selected student
//loop to get student
//loop to information
