
package com.mycompany.op2;

import java.util.Scanner;

public class Op2 {
    //comenzando por segunda vez
    public static void main(String[] args) {
        do{
        //Creacion de Variables
        
        int n1,n2,suma,resta,mult,div;
        String op;
        
        // importamos la clase scanner
        Scanner a1 = new Scanner(System.in);
        // Priemra visualizacion
        System.out.print("INGRESE SU OPCION \n 1: SUMA \n 2: RESTA \n 3: MULTIPLICACION \n 3: DIVISION \n Opcion: ");
        op = a1.next();
        
        switch(op){
            //Suma
            case "1":
                System.out.print("\t suma \n ingresa el primer numero: ");
                n1 = a1.nextInt();
                System.out.print("ingresa el segundo numero: ");
                n2 = a1.nextInt();
                
                suma = n1+n2;
                
                System.out.println("la suma es: "+suma+"\n");
                break;
            // Resta
            case "2":
                System.out.println("\t Resta \n ingresa el primer numero: ");
                n1 = a1.nextInt();
                System.out.println("ingesa el segundo numero: ");
                n2 = a1.nextInt();
                
                resta = n1 - n2;
                
                System.out.println("La resta es : "+resta+"\n");
                break;
    }
    }while(10==10);
}
}
