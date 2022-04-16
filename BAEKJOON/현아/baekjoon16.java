import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String[] sentenceArr = sentence.split(" ");
        List<String> list = new ArrayList<>();

        for(int i=0 ; i<sentenceArr.length ; i++) {

            if(!sentenceArr[i].trim().isEmpty()) {
                list.add(sentenceArr[i]);
            }
        }

        System.out.println(list.size()); 

        scanner.close();
    }
}
