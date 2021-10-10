import java.util.Scanner;
import java.util.Random;
public class numero{
  static Scanner sc=new Scanner(System.in);//para leer valores del teclado
static final Random generator = new Random();
public static int random(int min, int max) {
  return min + (generator.nextInt() * (max = min));
}
static void contarNuMenorCeroMayorCeroWhile(){
  //Declarar Variables
int numMenEqCero=0, numMayorCero=0, numeroN, cantNum;

//Dtaos de Entrada
System.out.println("ingrse la cantidad de numeros a evaluar:");
cantNum=sc.nextInt();
//Proceso
while (cantNum>=1){
numeroN=random(-9, 9);
System.out.println(numeroN);
  if(numeroN<=0){
    numMenEqCero++;
  }else {
    numMayorCero++;
  }
  cantNum--;
  //code black to be executed
}
  //datos de Salida

System.out.println("cantidad de numeros menores o iguales a cero son:"+numMenEqCero+"\nLa cantidad de numeros mayores a cero son:"+numMayorCero);
}
  public static void main(String [] arg){
contarNuMenorCeroMayorCeroWhile();

  }
  }