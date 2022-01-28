import java.util.Scanner;

public class baekjoon1 {
        public static void main(String[] args) {
            int[] numberArr;

            Scanner scanner = new Scanner(System.in);

            int numberSize = scanner.nextInt();

            numberArr = new int[numberSize];

            for (int i = 0; i <numberSize; i++) {
                numberArr[i] = scanner.nextInt();
            }

//            for (int i = 0; i < numberArr.length - 1; i++) {
//
//                if (numberArr[i] > numberArr[i + 1]) {
//
//                    int temp = numberArr[i];
//                    numberArr[i] = numberArr[i + 1];
//                    numberArr[i + 1] = temp;
//
//                    i=-1;
//                }
//            }
            int max = 0;
            int min = 0;

            for(int i=0 ; i<numberArr.length ; i++) {

                if (numberArr[i] > max) {
                    max = numberArr[i];
                } else {
                    min = numberArr[i];
                }
            }
            System.out.println(min + " " + max);

            scanner.close();
        }
}
