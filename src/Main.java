import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws FileNotFoundException {
        System.out.println("Hello world!");
        Scanner fs = new Scanner(new File("input-day1a.txt"));

        int ans = 0;
        int cur = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(fs.hasNextLine()) {
            String line = fs.nextLine();
            if(line.length() == 0) {
                ans = Math.max(ans, cur);
                res.add(cur);
                cur = 0;
            }
            else {
                cur += Integer.parseInt(line);
            }
            // ans = Math.max(ans, cur);
        }
        res.add(cur);
        Collections.sort(res);
        ans = res.get(res.size()-1) + res.get(res.size()-2) + res.get(res.size() -3);
        System.out.println(ans);
    }
}