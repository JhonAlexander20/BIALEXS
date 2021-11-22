class ejercicio4 {
static int [] vec = {13, 94, 16, 7, 4};

void ordenar (int [] v, int cant) {
if (cant > 1) {
for (int f = 0 ; f < cant - 1 ; f++)
if (v [f] > v [f + 1]) {
int aux = v [f];
v [f] = v [f + 1];
v [f + 1] = aux;
}
ordenar (v, cant - 1);
}
}

void imprimir () {
for (int f = 0 ; f < vec.length ; f++)
System.out.print (vec [f] + "  ");
System.out.println("\n");
}

public static void main (String [] ar)  {
ejercicio4 r = new ejercicio4 ();
r.imprimir ();
r.ordenar (vec, vec.length);
r.imprimir ();
}
}