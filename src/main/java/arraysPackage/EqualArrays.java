package arraysPackage;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        String[] stringsCompare= scanner.nextLine().split(" ");
        int count=0;
        int sum=0;
        boolean isIdentical=true;
        for(String string:strings)
        {
            sum+=Integer.parseInt(string);
            if(!string.equals(stringsCompare[count])){
                System.out.println("Arrays are not identical. Found difference at "+ count +" index.");
                isIdentical=false;
                break;
            }
            count++;
        }
        if(isIdentical)System.out.println("Arrays are identical. Sum: "+sum);
    }
}
