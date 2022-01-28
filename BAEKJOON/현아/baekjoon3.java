import java.util.Scanner;

public class baekjoon3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int num3 = num*num1*num2;
        String number = num3+ "";

        for(int j=48 ; j<=57 ; j++) {
            int count =0;
         for(int i=0; i<number.length(); i++) {
             if(number.charAt(i) ==  j){
                 count++;
             }
         }
         System.out.println(count);
        }

        scanner.close();
    }
}
