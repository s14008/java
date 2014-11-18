public class TriangleArea {
    public static void main(String[] args){

      Scanner scanner = new scanner(System.in);

      System.out.print("３辺の長さを入力　: ");
      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      double c = scanner.nextDouble();

      scanner.close();

      double s = (a + b + c) / 2.0;
      double ss = Math.sqrt(s * (s - a) * (s - b) * (s - c));


      System.out.println("面積 : " +ss);


    }



}
