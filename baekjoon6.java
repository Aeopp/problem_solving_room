import java.util.Scanner;

public class baekjoon6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        String[]  question = new String[num];
        int count = 0;
        int sum = 0;

        for(int i=0 ; i<num ; i++) {
            if(i==0) {
                scanner.nextLine();
            }           
            question[i] = scanner.nextLine();
        }

        for(int i=0 ; i<num ; i++) {
            for(int j=0 ; j<question[i].length() ; j++) {
                if(question[i].substring(j,j+1).equalsIgnoreCase("o")) {
                    ++count;
                    sum+=count;
                } else {
                    count=0;
                }            
            }
            System.out.println(sum);
            sum=0;
            count=0;
        }
        scanner.close();
    }
}
