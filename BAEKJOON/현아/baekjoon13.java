import java.util.Scanner;

public class baekjoon13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        

        for(int i=97 ; i<=122 ; i++) {
            boolean check = false;
            for(int j=0 ; j<answer.length() ; j++) {
                char word = answer.charAt(j);
                int number = (int)word;

                if(i==number) {
                    System.out.print(j + " ");
                    check = true;
                    break;
                } 
            }

            if(!check) {
                System.out.print("-1 ");
            }
        }
        scanner.close();
    }
}
