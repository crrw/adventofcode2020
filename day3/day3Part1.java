package day3;
import java.util.*;
import java.io.*;

public class day3Part1{
  public static void main(String[] args)throws IOException{
      Scanner sc = new Scanner(new File("input3part1.txt"));
      List<List<String>> list = new ArrayList();

      while(sc.hasNext()){
          List<String> curr = new ArrayList();
          String s = sc.nextLine();
          curr.add(s);
          list.add(curr);
          curr.clear();
      }

      int n = list.size();
      int m = list.get(0).size();

      int cnt = 0, y =0;
      for(int i=0; i<n; i++){
          if(list.get(i).get(y%m).equals("#")) cnt++;
          y += 3;
      }
      System.out.println(cnt);
   }
}