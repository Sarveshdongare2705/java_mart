import java.util.Scanner;

public class Money {
    public static int val(String text){
        switch (text){
            case "one": return 1;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
            case "seven": return 7;
            case "eight": return 8;
            case "nine": return 9;
            case "ten": return 10;
            case "eleven": return 11;
            case "twelve": return 12;
            case "thirteen": return 13;
            case "fourteen": return 14;
            case "fifteen": return 15;
            case "sixteen": return 16;
            case "seventeen": return 17;
            case "eighteen": return 18;
            case "nineteen": return 19;
            case "twenty": return 20;
            case "thirty": return 30;
            case "forty": return 40;
            case "fifty": return 50;
            case "sixty": return 60;
            case "seventy": return 70;
            case "eighty": return 80;
            case "ninety": return 90;
            default: return 0;
        }
    }

    public static int multipliers(String text){
        switch (text){
            case "hundred": return 100;
            case "thousand": return 1000;
            case "lakh": return 100000;
            case "million": return 10000000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in text : ");
        String amount = sc.nextLine();

        int value = 0;
        int currentValue = 0;  // This will store the current value before multiplication
        String[] terms = amount.split(" ");

        for (int i = 0; i < terms.length; i++) {
            String term = terms[i];

            // Skip 'and'
            if (term.equals("and")) {
                continue;
            }

            // If it's a number
            int number = val(term);
            if (number > 0) {
                currentValue += number;  // Add the current number to the currentValue
            }

            // If it's a multiplier
            int multiplier = multipliers(term);
            if (multiplier > 0) {
                currentValue *= multiplier;
                value += currentValue;
                currentValue = 0;
            }
        }

        // Add any remaining current value to the total
        value += currentValue;

        System.out.println("Total Value: " + value);  // Final result
    }
}
