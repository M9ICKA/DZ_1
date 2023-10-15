

import java.util.Locale;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {

// первое задание

        String myName = "Андрей ";
        String mySecondName = "Залуцкий ";
        int Age = 35;
        float Weight = 94.5F;

        System.out.println("\n Hi! My name is " + myName + mySecondName);
        System.out.println("Age - " + Age + "years" + "\nWeigth - " + Weight + "kg");
        System.out.println("\n ================================================================================");
// второе задание

        byte xbyte = 9;
        short xshort = 32000;
        int xint = 2000300;
        long xlong = 123456789987654321l;
        float xfloat = 3.14f;
        double xdouble = 3.333333515;
        boolean xboolean = true;
        char xchar = 'G';
        String xString = "I know variable types: byte, short, int, long, float, double, char";
        System.out.println(xString);
        System.out.println(xbyte + "\n" + xshort + "\n" + xint + "\n" + xlong + "\n" + xfloat + "\n" + xdouble + "\n" + xboolean + "\n" + xchar);
        System.out.println("\n ================================================================================");
// Третье задание
        System.out.println("Enter your name ");
        Scanner scan = new Scanner(System.in);
        String firstString = scan.nextLine();

        if (firstString.isEmpty()) {
            System.out.println("You enter empty string !!!!");
            firstString = scan.nextLine();
        }

        System.out.println("Good afternoon " + firstString);

        System.out.println("\n Hmm.... Your name has a " + firstString.length() + " characters");

        if (firstString.length() >= 3) {
            System.out.println("\n And the third character in your name is  \"" + firstString.charAt(2) + "\"");
        }

        String repitName;

        System.out.println("\n Repeat your name please");

        repitName = scan.nextLine();

        System.out.println(" Do the names entered match???? (register sensitive) - " + firstString.equals(repitName));

        System.out.println("\n Do the names entered match???? (register insensitive) - " + firstString.equalsIgnoreCase(repitName));

        System.out.println("\n Does your name start with the letter \"V\"??? " + repitName.startsWith("V"));

        System.out.println("\n Does your name end with \"m\"??? " + repitName.endsWith("m"));

        System.out.println("\n Your name without the letter \"A\" looks like this - " + repitName.replace("a",""));

        System.out.println("\n Your name in lowercase - " + repitName.toLowerCase());

        System.out.println("\n Your name is in uppercase - " + repitName.toUpperCase());

        String youSay = String.format("\nThe first time you entered the name \"%s\", and the second time you entered \"%s\".", firstString,repitName);
        System.out.println(youSay);

        StringBuffer buffer = new StringBuffer(repitName);

        buffer.append("\n  " + repitName.toLowerCase() + " " + repitName.toUpperCase());

        System.out.println("\n" + buffer);
    //String myAddress = String.format("I live at %s , house %d, flat %d", homeStreet, houseNr, flatNr);
    // System.out.println(myAddress);

        System.out.println("\n ================================================================================");

    }
}


