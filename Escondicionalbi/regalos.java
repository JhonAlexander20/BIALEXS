
import java.util.Scanner;

public class regalos{

static Scanner sc = new Scanner(System.in);

public static void algoritmoregalos(){
//Declarar variables
double monto=0;
String regalo="";
//Datos de entrada
System.out.println("ingrese el monto disponible:");
monto=sc.nextDouble();
//Proceso
if(monto >=1 && monto<=10){
regalo+="\ntarjeta";
}else if(monto>=11 && monto<=100){
  regalo="\nchocolate\ntarjeta";
}else if(monto>=101 && monto<=250){
  regalo="\nflores\nchocolate\ntarjeta";
}else if(monto>250){
  regalo="\nanillo\nflores\nchocolate\ntarjeta";
}else{
  regalo="ninguno";
}
//Datos de salida
System.out.println("yo puedo elegirlos siguientes:"+ regalo);
}
public static void main(String[] arg){
algoritmoregalos();
}
}

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
