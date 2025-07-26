package Arrays.ArrayList;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] as) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.print("enter element:-");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isPalindrom = checkPalindrome(arr);
        System.out.println("is palindrim " + isPalindrom);
    }

    public static boolean checkPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
