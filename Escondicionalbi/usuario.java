import java.io.Console;
import java.util.Scanner;
public class EstCiclicas{  
static Scanner sc=new Scanner(System.in);
static void validarcontrasenha(){

  //definir variable
  String mensaje, password, usuario,msgrespuesta="";
  int contador=1;
  //datos de entrada
  System.out.println("ingrese su usuario");
usuario=sc.next();

//proceso
do{
System.out.println("ingrese su password:");
password=sc.next();
if(password.equals("123456d")){ 
msgrespuesta="En hora buena";
System.out.println(msgrespuesta);

//contador=4
break;
}else if(contador<3){ 
msgrespuesta="lo siento password equivocado!";
 System.out.println(msgrespuesta);
//contador=contador+1
}else{ 
  msgrespuesta="oportunidades agotadas";
  System.out.println(msgrespuesta);
}
contador++;
}while(contador<=3);
//datos de salida
//System.out.println(msgrespuesta);
}
public static void main(String[] arg){
validarcontrasenha();
}
}