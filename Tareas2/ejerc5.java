import java.util.Scanner;

public class funcion_senox{

  public static void main(String[] args){

    double x,y;

    senox seno = new senox();

    Scanner valor =new Scanner(System.in);
    System.out.printf("digite el valor de grados= ");
     double g=valor.nextDouble();
     x=g*3.1415/180.0;
     y=seno.senox(x);

     System.out.println("Sen(" + g + ") = " + y);
  }
}