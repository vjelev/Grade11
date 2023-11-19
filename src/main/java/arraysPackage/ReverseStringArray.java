package arraysPackage;

import java.util.Scanner;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        String[] reversed = new String[strings.length];
        int count = 0;
        for(int i = strings.length-1;i>=0;i--)
        {
            reversed[count++] = strings[i];
        }
        for(String string:reversed)
        {
            System.out.print(string+ " ");
        }
    }
}
