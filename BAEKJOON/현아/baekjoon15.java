import java.util.Scanner;

public class baekjoon15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char answer = '0';
        int maxCount = 0;
        int[] wordNums = new int[word.length()];
        int wordNum = 0;

        for(int i=0 ; i<word.length() ; i++) {

            if((int)word.charAt(i)>96) {
                wordNum = (int)word.charAt(i)-32;
        
            } else {
                wordNum = (int)word.charAt(i);
            }

            wordNums[i] = wordNum;
        }

        for(int i=65 ; i<91 ; i++) {
            int count = 0;

            for(int j=0 ; j<wordNums.length ; j++) {
                
                if(i == wordNums[j]) {
                    count++;
                }
            }

            if(count > maxCount) {
                maxCount = count;
                answer = (char)i;
            } else if (count==maxCount) {
                answer = '?';
            }

        }

        System.out.println(answer);
        scanner.close();
    }
}
