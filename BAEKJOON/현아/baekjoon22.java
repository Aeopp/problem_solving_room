import java.util.Scanner;

public class baekjoon22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int count = 1;
        int set = 1;

        while(count<number) {

            count += 6*set;
            set++;

        }


        System.out.println(set);

        scanner.close();
    }
}
