import java.util.Scanner;

public class baekjoon11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String number = scanner.nextLine();
        String[] numArr = new String[num];
        int sum = 0;

        for(int i=0 ; i<num ; i++) {
            numArr[i] = number.substring(i,i+1);
            sum+=Integer.parseInt(numArr[i]);
        }
        
        System.out.println(sum);
        
    }
}
