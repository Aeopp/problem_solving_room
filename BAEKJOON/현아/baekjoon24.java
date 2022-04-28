import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int go = Integer.parseInt(st.nextToken());
        int sleep = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int day = (height-sleep)/(go-sleep);

        if((height-sleep)%(go-sleep)!=0) {
            day++;
        }

        System.out.println(day);
    }    
}
