import java.util.Scanner;

public class baekjoon18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.next();
        int count = 0;

        for(int i=0 ; i<word.length() ; i++) {
            char ch = word.charAt(i);
            int asc = (int)ch;

            if(asc>=65 & asc<=67) {
                count += 3;
            }

            if(asc>=68 & asc<=70) {
                count += 4;
            }

            if(asc>=71 & asc<=73) {
                count += 5;
            }

            if(asc>=74 & asc<=76) {
                count += 6;
            }

            if(asc>=77 & asc<=79) {
                count += 7;
            }

            if(asc>=80 & asc<=83) {
                count += 8;
            }

            if(asc>=84 & asc<=86) {
                count += 9;
            }

            if(asc>=87 & asc<=90) {
                count += 10;
            }

        }

        System.out.println(count);

        scanner.close();
    }
}