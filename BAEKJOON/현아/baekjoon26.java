import java.util.Scanner;

public class baekjoon26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        
        int[] answerArr = new int[test];

        for(int i=0 ; i<test ; i++) {
            int cnt = 1;

            int k = scanner.nextInt(); //층
            int n = scanner.nextInt(); //호

            int[][] peopleArr = new int[k+1][n];

            //0층 배분
            for(int j=0 ; j<n ; j++) {
                System.out.println("cnt : " + cnt);
                peopleArr[0][j] = cnt;
                cnt++;
            }

            for(int j=1 ; j<=k ; j++) {

                for(int q=0 ; q<n ; q++) {

                    if(q==0) {

                        peopleArr[j][q] = 1;

                    } else {

                        peopleArr[j][q] = peopleArr[j-1][q] + peopleArr[j][q-1];

                    }

                }

            }

            answerArr[i] = peopleArr[k][n-1];

        }

        for(int i=0 ; i<test ; i++) {
            System.out.println(answerArr[i]);
        }

        scanner.close();
    }
}
