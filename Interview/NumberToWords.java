package Interview;

public class NumberToWords {

    // Array for single-digit and teen numbers
    private static final String[] ones = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    // Array for tens place
    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    // Converts a number to words
    public static String convertToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        return convert(number).trim();
    }

    // Recursive helper function
    private static String convert(int number) {
        if (number < 20) {
            return ones[number];
        } else if (number < 100) {
            return tens[number / 10] + " " + ones[number % 10];
        } else if (number < 1000) {
            return ones[number / 100] + " hundred " + convert(number % 100);
        } else if (number < 1_000_000) {
            return convert(number / 1000) + " thousand " + convert(number % 1000);
        } else if (number < 1_000_000_000) {
            return convert(number / 1_000_000) + " million " + convert(number % 1_000_000);
        } else {
            return convert(number / 1_000_000_000) + " billion " + convert(number % 1_000_000_000);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int number = 345678;
        System.out.println("Number in words: " + convertToWords(number));
    }
}
