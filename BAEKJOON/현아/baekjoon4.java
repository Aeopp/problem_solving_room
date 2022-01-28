import java.util.Scanner;

public class baekjoon4 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        Scanner scanner = new Scanner(System.in);

        for(int i=0 ; i<10 ; i++) {
            numArr[i] = scanner.nextInt()%42;
        }

        int count = 0;

        for(int i=0 ; i<=41 ; i++) {
            for(int j=0 ; j<numArr.length ; j++) {
                if(i==numArr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);

        scanner.close();
    }
}



