matriz= [[1,2,3,4],
    [5,6,7,8],
    [9,10,11,12],
    [13,14,15,16]]
def transponer (m):
     t = []

for i in range (len(m[4])):

 for j in range (len(m)):
 t[i].append(m[j][i])

 retur t
 tranpuesta= transponer(matriz)
 for linea in matriz:
   for elemento in linea:
 print(elemento,end=" ")
 print()
 print(" ")

 for linea in transpuesta:

 for elemento in linea:
 print(elemento, end=" ")
 print()