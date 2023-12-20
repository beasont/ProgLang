package practice;

import java.io.*;

public class assignment3 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        String text;

        do {
            System.out.println("Input the text. To finish inputting, input END: ");
            text = input.readLine();

            if (!"END".equals(text)) {
                int length = text.length();
                int weight = weight(text);

                System.out.println("Length: " + length);
                System.out.println("Weight: " + weight);
            }
        } while (!"END".equals(text));
    }

    private static int weight(String text) {
        int weight = 0;
        for (int i = 0; i < text.length(); i++) {
            weight += text.charAt(i);
        }
        return weight;
    }
}
