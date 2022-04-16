import java.util.Scanner;

public class baekjoon17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number1 = scanner.next();
        String number2 = scanner.next();

        String[] numArr1 = new String[3];
        String[] numArr2 = new String[3];

        for(int i=0 ; i<3 ; i++) {
            numArr1[i] = number1.substring(2-i, 3-i);
            numArr2[i] = number2.substring(2-i, 3-i);
        }

        for(int i=0 ; i<3 ; i++) {
           System.out.println("numArr1 : " + numArr1[i]);
           System.out.println("numArr2 : " + numArr2[i]);
        }

        int numm1 = Integer.parseInt(numArr1[0] + numArr1[1] + numArr1[2]);
        System.out.println("numm1: " + numm1);
        int numm2 = Integer.parseInt(numArr2[0] + numArr2[1] + numArr2[2]);
        System.out.println("numm2: " + numm2);

        if(numm1 > numm2) {
            System.out.println(numm1);
        } else {
            System.out.println(numm2);
        }

        scanner.close();
    }
    
}
