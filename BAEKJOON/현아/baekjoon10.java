import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num = scanner.nextInt();
        int count = 0;

        for(int i=1 ; i<=num ; i++) {
            int num2 = i;
            boolean check = true;
            if(num2<100) {
                count++;
            } else {
                while(num2 >= 10){
                    int number = num2%10;
                    num2=num2/10;
                    int number2 = num2%10;
                    list.add(number2-number);
                }

                for(int j=0 ; j<list.size()-1 ; j++) {
                    if(list.get(j)!=list.get(j+1)) {
                        check = false;                                                 
                    }
                }
                if(check) {
                    count++;
                }
                list.clear();               
            }
        }
        System.out.println(count);
        scanner.close();
    } 
}
