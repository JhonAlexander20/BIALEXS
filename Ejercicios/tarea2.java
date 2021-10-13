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
bono+="\ntarjeta";
}else if(monto>=101 && monto<=150){
bono="\nsalirio1";
}else if(monto>=101 && monto<=250){
  regalo="\nsalario1\nsalmin2";
}else if(monto>=151){
  bono="\nsalario1\nsalmin2\nsalmin3";
}else{
  bono="ninguno";
}
  //Datos de salida

  System.out.println("yo pue:"+ regalo);
}
public static void main(String[] arg){
algoritmoregalos();
}
}