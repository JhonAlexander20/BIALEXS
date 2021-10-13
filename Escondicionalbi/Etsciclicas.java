import java.util.Scanner;
public class Estciclicas{
static Scanner sc = new Scanner(System.in); 
static void factorial(){
//Definir Variables
int n, resulF=1;
//datos de entrada
System.out.println("Ingrese un numero para calcular el Factorial:");
n=sc.nextInt();
//Proceso
if(n>1){
for(int i=1; i<=n;i++){
resulF=resulF*i;
System.out.println("i="+i+ " resulF="+resulF);
}
}
//Datos de salida
System.out.println("El faltorial de "+n+"  es:"+resulF);
}
}
