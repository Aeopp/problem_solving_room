import java.util.Scanner;

public class baekjoon5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] scoreFirst = new int[size];

        double max = 0;
        double score = 0;

        for(int i=0 ; i<size ; i++) {
            scoreFirst[i] = scanner.nextInt();
            if(max<scoreFirst[i]) {
                max = scoreFirst[i];
            }
        }
 
        double[] scoreSecond = new double[size];
        for(int i=0 ; i<size ; i++) {
            scoreSecond[i] = scoreFirst[i]/max*100;
            score += scoreSecond[i];
        }
        double avr = score/size;

        System.out.println(avr);

        scanner.close();
    }
}

