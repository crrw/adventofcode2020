import java.util.*;
import java.io.*;

public class day2Part2{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String get = sc.nextLine();
      String[] arr = new String[] {get};

      int cnt = 0;

      for(String s : arr){
          String[] input = s.split(":");
          String password = input[1].trim();
          input[0] = input[0].trim();
          String[] mm = input[0].split(" ");
          String toCheck = mm[1];
          mm = mm[0].split("-");
          int start = Integer.parseInt(mm[0]);
          int end = Integer.parseInt(mm[1]);
          int curr = 0;
          String[] trv = password.split("");
          if(trv[start-1].equals(toCheck)) curr++;
          if(trv[end-1].equals(toCheck)) curr++;

          if(curr == 1) cnt++;
      }
      System.out.println(cnt);
   }
}