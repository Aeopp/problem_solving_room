import java.util.Scanner;

public class baekjoon2 {
    public static void main(String[] args) {
        final int num = 9;
        int userNum;
        int[] numArr = new int[num];

        Scanner scanner = new Scanner(System.in);

        for(int i=0 ; i<num ; i++) {

            userNum = scanner.nextInt();
            numArr[i] = userNum;

        }

        int max=0;
        int index=0;

        for(int i=0 ; i<numArr.length ;i++) {
                if (numArr[i] > max) {
                    max = numArr[i];
                    index = i;
                }
        }

        System.out.println(max);
        System.out.println(index+1);

        scanner.close();
    }
}
