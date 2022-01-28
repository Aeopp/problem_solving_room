import java.util.ArrayList;
import java.util.List;

public class baekjoon9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=1 ; i<10000 ; i++) {
           int num = i;
           int sum = 0;

           while(num != 0) {
                sum += num%10;
                num = num/10;
           }
            sum += i;

            if(sum < 10000) {
                list.add(sum);
            }
        }

        for(int i=1 ; i<10000 ; i++) {
            boolean check = true;
            for(int j=0 ; j<list.size() ; j++) {
                
                if(i == list.get(j)) {
                    check = false;
                }
            }

            if(check) {
                System.out.println(i);
            }
        }
    }
}