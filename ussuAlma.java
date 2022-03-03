import java.util.Scanner;

/**
 * ussuAlma
 */
public class ussuAlma {

  public static void main(String[] args) {

    int n, u, total =1;

    Scanner take = new Scanner(System.in);

    System.out.print("Bir Sayı Giriniz: ");
    n = take.nextInt();
    System.out.print("Sayının Üssünü Giriniz: ");
    u = take.nextInt();

    for (int i = 1; i <= u; i++){

      total *= n;
    }

    System.out.println(n + " üzeri " + u + " = " + total);

    take.close();
    
  }
}