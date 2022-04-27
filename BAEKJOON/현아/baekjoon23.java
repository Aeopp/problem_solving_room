import java.util.Scanner;

public class baekjoon23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int num = 1;
        int min = 1;
        int max = 1;

        int mom = 1;

        while(number > max) {

            min += num;
            max = min + num;
            num++;
        }

        if(num%2==0) {
            mom = num;
            for(int i=min ; i<number ; i++) {
                mom -= 1;
            }
        } else {
            mom = 1;
            for(int i=min ; i<number ; i++) {
                mom += 1;
            }
        }

        int chi = num+1-mom;

        String answer = chi + "/" + mom ;

        System.out.println(answer);
        scanner.close();
    }
}
