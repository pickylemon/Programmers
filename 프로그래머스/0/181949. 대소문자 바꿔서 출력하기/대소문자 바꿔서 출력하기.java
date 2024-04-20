import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] tmp = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int diff = 'a'-'A';
        for(char c : tmp){
            sb.append(c<='Z'? (char)(c+diff) : (char)(c-diff));
        }
        
        System.out.println(sb.toString());
    }
}