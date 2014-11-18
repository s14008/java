 import java.util.Scanner;
public class Test {

   public static void main(String[] args) {

   Test test = new Test();
   test.run();
   }
  public void run() {

        Scanner stdin = new Scanner(System.in);

        System.out.print("message :");
        int input = stdin.nextInt();
        System.out.println(input);


  }
}
