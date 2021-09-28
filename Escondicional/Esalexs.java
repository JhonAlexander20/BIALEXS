import java.util.Scanner;

public class Eaalexs{

static Scanner sc = new Scanner(System.in);
  static void ventalapices(){

//Datos de variables
int cantidadlap;
double pago;
//Datos de entrada
System.out.print("ingrese la cantidad de lapices a comprar");
cantidadlap=sc.nextInt();
//Proceso
if (cantidadlap>=1000){
pago=cantidadlap*0.85;
} else { pago=cantidadlap*0.90;
}
//Datos de salida
System.out.println("elpago a realizar es:"+pago);
}
public static void main(String[] args) {
System.out.println("Hello World");
    ventalapices();
  }
}