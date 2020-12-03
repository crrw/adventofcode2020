package day2;

import java.util.*;
import java.io.*;

public class day2Part1{
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
          for(String str : trv){
              if(str.equals(toCheck))curr++;
          }
          if(curr >= start && curr <= end) cnt++;
          System.out.println(toCheck);
      }
      System.out.println(cnt);
   }
}