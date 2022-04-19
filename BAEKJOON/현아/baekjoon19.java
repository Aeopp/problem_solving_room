import java.util.Scanner;

public class baekjoon19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        int count = 0;

        for(int i=0 ; i<word.length() ; i++) {

            String a = word.charAt(i)+"";

            if(i<word.length()-2) {

                if(a.equals("d")) {
                    if( word.substring(i, i+3).equals("dz=")) {
                        i++;
                        i++;
                    }
                }

            }

            if(i<word.length()-1) {

                if(a.equals("c")) {

                    if(word.substring(i, i+2).equals("c=") || word.substring(i, i+2).equals("c-")) {     
                        i++;
                    }

                }

                if(a.equals("d")) {

                    if(word.substring(i, i+2).equals("d-")) {                    
                        i++;
                    }

                }

                if(a.equals("l")) {

                    if(word.substring(i, i+2).equals("lj")) {             
                        i++;
                    }

                }
                
                if(a.equals("n")) {

                    if(word.substring(i, i+2).equals("nj")) {
                        i++;
                    }

                }

                if(a.equals("s")) {

                    if(word.substring(i, i+2).equals("s=")) {              
                        i++;
                    }

                }

                if(a.equals("z")) {

                    if(word.substring(i, i+2).equals("z=")) {                  
                        i++;
                    }
                    
                }
            }

            count ++;

        }
    
        System.out.println(count);
        
        scanner.close();
    }
}