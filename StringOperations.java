import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        
        int length = str.length();
        System.out.println("Length of the string: " + length);

        
        if (length >= 4) {
            System.out.println("Character at the second position: " + str.charAt(1)); 
            System.out.println("Character at the fourth position: " + str.charAt(3)); 
        } else {
            System.out.println("The string is too short to access the second or fourth character.");
        }

        
        System.out.print("Enter the start index for substring (0 to " + (length - 1) + "): ");
        int startIndex = scanner.nextInt();
        if (startIndex >= 0 && startIndex < length) {
            String substringStart = str.substring(startIndex);
            System.out.println("Substring starting from index " + startIndex + ": " + substringStart);
        } else {
            System.out.println("Invalid start index.");
        }

        
        System.out.print("Enter the end index for substring (0 to " + (length - 1) + "): ");
        int endIndex = scanner.nextInt();
        if (startIndex >= 0 && startIndex < length && endIndex >= startIndex && endIndex <= length) {
            String substringStartEnd = str.substring(startIndex, endIndex);
            System.out.println("Substring from index " + startIndex + " to " + (endIndex - 1) + ": " + substringStartEnd);
        } else {
            System.out.println("Invalid start or end index.");
        }

       
        scanner.nextLine(); 
        System.out.print("Enter a string to concatenate: ");
        String toConcatenate = scanner.nextLine();
        String concatenatedString = str + toConcatenate;
        System.out.println("Concatenated string: " + concatenatedString);

        
        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.nextLine().charAt(0);
        System.out.print("Enter the new character: ");
        char newChar = scanner.nextLine().charAt(0);
        String replacedString = str.replace(oldChar, newChar);
        System.out.println("String after replacement: " + replacedString);

        
        System.out.print("Enter the string to check if it starts with: ");
        String startString = scanner.nextLine();
        boolean startsWith = str.startsWith(startString);
        System.out.println("Does the string start with '" + startString + "'? " + startsWith);

        
        String lowerCaseString = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerCaseString);

        
        String upperCaseString = str.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseString);

        
        scanner.close();
    }
}
