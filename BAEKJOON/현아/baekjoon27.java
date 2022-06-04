import java.util.Scanner;

public class baekjoon27 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gram = scanner.nextInt();
        
        //나눌 수 있는지 없는지 확인
        boolean check = false;

        //자루 개수
        int num = 0;

        if(gram%3==0){
            num = gram/3; //가장 많은 갯수
        }

        if(gram%5==0){







            num = gram/5;
        }






        System.out.println(num);

        scanner.close();

    }
}
