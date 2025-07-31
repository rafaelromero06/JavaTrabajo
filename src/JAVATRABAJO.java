

import java.util.Scanner;
public class JAVATRABAJO{

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
    int[] listado = {2,4,6,8,10};
    int sum = 0;

    for (int i = 0; i < listado.length; i++){
        sum = sum + listado[i];
    }

System.out.println("La suma de los números en el arreglo es" +sum);

    }

}