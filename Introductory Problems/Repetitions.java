import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int n = s.length();
        int len = 1, maxLen = 1;
        int currentChar = s.charAt(0);
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == currentChar) {
                len++;
            } else {
                maxLen = Math.max(len, maxLen);
                currentChar = s.charAt(i);
                len = 1;
            }
        }

        maxLen = Math.max(len, maxLen);
        System.out.println(maxLen);
    }
}
