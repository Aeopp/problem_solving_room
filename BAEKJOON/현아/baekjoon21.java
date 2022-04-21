import java.util.Scanner;

public class baekjoon21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int price1 = scanner.nextInt();
        int price2 = scanner.nextInt();
        int price3 = scanner.nextInt();

        int qua = 1;

        if(price2>=price3) {
            qua = -1;
        } else {               
            qua = price1/(price3-price2)+1;
         }

        System.out.println(qua);
        scanner.close();
    }
}
