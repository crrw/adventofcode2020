import java.util.*;
import java.io.*;

public class day1Part1 {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println(solve());
    }

    public static long solve() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        List<Integer> list = new ArrayList();
        
        
        while(sc.hasNext()){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        int start = 0, end = list.size()-1;
        while(start < end){
            if(list.get(start) + list.get(end) == 2020) return list.get(start) * list.get(end);
            else if(list.get(start) + list.get(end) < 2020) start++;
            else end--;
        }
        return -1;
    }
}
