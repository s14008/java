


import java.io.*;

public class ToZero {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("整数を入力してね｡ ヾ(・ω・ｏ) :");
    int n = Integer.parseInt(reader.readLine());

      if (n > 0) {

      for (int i = n; i >= 0; i--) {
       System.out.println(i);
      }

    } else {
       for (int i = n; i <= 0; i++) {
         System.out.println(i);
       }
    }
  }
}
