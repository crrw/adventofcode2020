import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args)throws IOException{
      Scanner sc = new Scanner(new File("day6inputs.txt"));
      Set<Character> set = new HashSet();
      int cnt =0;
      while(sc.hasNext()){
          String curr = sc.nextLine();
          if(curr.equals("")){
              cnt += set.size();
              set = new HashSet();
          }
          else{
              for(int i=0; i<curr.length(); i++){
                  set.add(curr.charAt(i));
              }
          }
      }
      cnt += set.size();
      System.out.println(cnt);
   }
}