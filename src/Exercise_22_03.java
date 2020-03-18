import java.util.Scanner;

public class Exercise_22_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter a string s2: ");
        String s2 = input.nextLine();

        int index = 0;
        int matchIndex = -1;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(index);
            if (c1 == c2) {
                index++;
                if (index == s2.length()) {
                    matchIndex = i - (index - 1);
                    break;
                }
            } else {
                index = 0;
            }
        }

        if (matchIndex == -1) {
            System.out.println("no match");
        } else {
            System.out.println("match at index " + matchIndex);
        }
    }
}