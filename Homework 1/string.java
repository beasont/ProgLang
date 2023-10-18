package string;
public class string {
    public static void main(String[] args) {
        String input = "Tristan";
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);
        char middleChar;
        int middleIndex = input.length() / 2;

        if (input.length() % 2 == 0) {
            middleChar = input.charAt(middleIndex - 1);
        } else {
            middleChar = input.charAt(middleIndex);
        }

        int sum = (int) firstChar + (int) lastChar + (int) middleChar;

        char maxChar = (char) Math.max(Math.max(firstChar, lastChar), middleChar);
        System.out.println("My string is: " + input + ".");
        System.out.println("Its first character is: " + firstChar + ".");
        System.out.println("Its last character is: " + lastChar + ".");
        System.out.println("Its middle character is: " + middleChar + ".");
        System.out.println("The sum of these characters is: " + sum + ".");
        System.out.println("The character with the largest value of these three is: " + maxChar + ".");
    }
}
