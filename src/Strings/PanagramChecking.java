package Strings;

import java.util.Scanner;

public class PanagramChecking {
    static boolean checkPanagram(String str) {
        int n = str.length();
        if(n < 26)
            return false;
        boolean[] visited = new boolean[26];
        for(int i=0; i<n; i++) {
            char x = str.charAt(i);
            if(x >= 'a' && x <='z') {
                visited[x - 'a'] = true;
            }
            if(x >= 'A' && x <='Z') {
                visited[x-'A'] = true;
            }
        }
        for(int i =0; i<26; i++) {
            if(!visited[i])
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(checkPanagram(str));
    }
}
