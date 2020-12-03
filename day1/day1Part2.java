package day1;

import java.util.*;
import java.io.*;

public class day1Part2 {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println(solve());
    }

    public static long solve() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input2.txt"));
        List<Long> list = new ArrayList();
        Collections.sort(list);
        
        while(sc.hasNext()){
            list.add(sc.nextLong());
        }

        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){
                for(int k=0; k<list.size(); k++){
                    if(list.get(i) + list.get(j) + list.get(k) == 2020 && i != j && j != k && k != i) return list.get(i) * list.get(j) * list.get(k);
                }
            }
        }
        return -1;
    }
}
