import java.util.Scanner;

public class baekjoon14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();

        int[] num = new int[test];
        String[] words = new String[test];


        for(int i=0 ; i<test ; i++) {
           num[i] = scanner.nextInt();
           words[i] = scanner.next();     
        }

        for(int i=0 ; i<num.length ; i++) {

             String[] word = new String[words[i].length()];

             for(int j=0 ; j<words[i].length() ; j++) {
                 word[j] = words[i].substring(j, j+1);
             }

            
             for(int j=0 ; j<word.length ; j++) {
                 System.out.print(word[j].repeat(num[i]));
             }
            System.out.println();
        }
        scanner.close();
    }
    
}
