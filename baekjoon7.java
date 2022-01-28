import java.util.Scanner;

public class baekjoon7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double[] avrArr = new double[num];

        for(int i=0 ; i<num ; i++) {
            int test = scanner.nextInt();
            int[] testArr = new int[test];
            int sum = 0;
            double avr = 0;
            int count = 0;

            for(int j=0 ; j<test ; j++) {
                testArr[j] = scanner.nextInt();
                sum += testArr[j];
            }
            avr = (double)sum / test;

            for(int z=0 ; z<testArr.length ; z++) {
                if(avr<testArr[z]) {
                    count++;
                }
            }
            avrArr[i] = (double)count/test*100;          
        }
        for(int i=0 ; i<num ; i++) {
            System.out.printf("%.3f%%\n", avrArr[i]);
        }
        scanner.close();
    }    
}



