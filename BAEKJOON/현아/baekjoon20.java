import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class baekjoon20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int word = scanner.nextInt();
        String[] wordArr = new String[word];
        int count = 0;

        for(int i=0 ; i<word ; i++) {
            wordArr[i] = scanner.next();
        }

        for(int i=0 ; i<wordArr.length ; i++) {
            
            List<String> wordList = new ArrayList<String>();
            
            boolean check1 = true;

            for(int z=0 ; z<wordArr[i].length() ; z++) {
                boolean check = true;
                
                List<Integer> indexArr = new ArrayList<>();
                String a = wordArr[i].charAt(z)+"";

                for(int j=0 ; j<wordList.size() ; j++) {
                    if(a.equals(wordList.get(j))){
                        check = false;
                    }
                }

                if(check) {
                    for(int j=0 ; j<wordArr[i].length() ; j++) {

                        if(a.equals(wordArr[i].charAt(j)+"")) {
                            indexArr.add(j);
                        }
                    }
                    wordList.add(a);
                }

                for(int j=0 ; j<indexArr.size()-1 ; j++) {
                    if(indexArr.get(j+1) - indexArr.get(j) > 1) {
                        check1 = false;
                    }
                }
            }

            if(check1) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}

