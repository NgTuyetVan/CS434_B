
import java.util.Scanner;

public class lab2_cs434 {
   public static void main(String[] args)
   {
      int n;
      System.out.println("Nhap vao mot so nguyen:");
      Scanner sc = new Scanner(System.in);

      n = sc.nextInt();

      if (n >= 0){
         System.out.println("Đây là một số nguyên dương");
      } 
      else {
         System.out.println("Đây là số nguyên âm");
      }
   }
}

