package com.diegofula.ejercicio14;

//  importamos la libreria Scanner
import java.util.Scanner;

public class ejercicio14 {
    
    public static void main(String[] args) {
        //  Declaramos el Scanner con la variable scan
        Scanner scan = new Scanner(System.in);
        
        //  Dejamos al ususario elgir el dato que va a ser guardado en la variable num
        System.out.println("Digite el número de su elección");
        int num = scan.nextInt();
        
        int pot2 = num * num;
        int pot3 = num * num * num;
        
        System.out.println("\nEl cuadrado de " + num + " es = " +pot2 +"\n");
        System.out.println("El cubo de " + num + " es = "+pot3);
        
    }
    
}
