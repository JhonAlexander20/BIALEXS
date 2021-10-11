import java.util.Scanner;

public class bono{

static Scanner sc = new Scanner(System.in);

public static void algoritmobono(){
  //Declarar variable

double monto=0;
String bono="";

  //Datos de entrada
System.out.println("ingrese el monto de bono disponible:");
monto=sc.nextDouble();

  //Proceso
if(monto >=0 && monto<=100){
bono+="\nsalario1";
}else if(monto>=101 && monto<=150){
  bono="\nsalario1\nsalmin2";
}else if(monto>=151){
  bono="\nsalario1\nsalmin2\nsalmin3";
}else{
  bono="ninguno";
}
  //Datos de salida

  System.out.println("que salario le  corresponde:"+ bono);
}
public static void main(String[] arg){
algoritmobono();
}
}