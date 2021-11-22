package pe.edu.upeu.app.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leerteclado{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


public int leer(int valor, String msg){
System.out.print(msg+": ");
try{
  valor=integer.parse.Int(br.readLine());
}catch(Exception e){valor=leer(valor, msg);


}
  return 0;
}

public int leer(long valor, String msg){
  return 0;
}
public int leer(char valor, String msg){
  return ' ';
}
public int leer(String valor, String msg){
  return "";
}



}






}