import java.util.Scanner;

public class baekjoon25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        int[] H = new int[test];
        int[] W = new int[test];
        int[] N = new int[test];

        for(int i=0 ; i<test ; i++) {
            H[i] = scanner.nextInt();
            W[i] = scanner.nextInt();
            N[i] = scanner.nextInt();
        }   

        for(int i=0 ; i<test ; i++) {
            String YY = "";
            String XX = "";

            if(N[i] <= H[i]) {
                YY="1";
                XX = N[i] + "";
            } else {
                YY = N[i]%H[i] + "";
                XX = N[i]/H[i] + 1 + "";
            }

            if(Integer.parseInt(XX)<10) {
                XX = "0" + XX;
            }

            System.out.println(YY+XX);
        }
    
        scanner.close();
    }
    
}
