package Stringss;

public class reverseVowel {
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (i < j && !isVowel(arr[i])) {
                i++;
            }
            while (i < j && !isVowel(arr[j])) {
                j--;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String ans = String.valueOf(arr);
        System.out.println(ans);
    }
}
