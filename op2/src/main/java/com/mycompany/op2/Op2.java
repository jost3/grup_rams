/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.op2;

/**
 *
 * @author Alumno
 */
public class Op2 {
    //comenzando por segunda vez
    public static void main(String[] args) {
        //Creacion de Variables
        
        int n1,n2,suma,resta,mult,div;
       String op;
        switch(op){
         
            //multiplicacion
            case "3":
                System.out.println("\t multiplicacion \n ingresa el primer numero: ");
                n1 = a1.nextInt();
                System.out.println("ingesa el segundo numero: ");
                n2 = a1.nextInt();
                
                mult = n1 * n2;
                
                System.out.println("La multiplicacion es : "+mult+"\n");
                break;
            //division
            case "4":
                System.out.println("\t Division \n ingresa el primer numero: ");
                n1 = a1.nextInt();
                System.out.println("ingesa el segundo numero: ");
                n2 = a1.nextInt();
                
                div = n1 / n2;
                
                System.out.println("La division es : "+div+"\n");
                break;
                
            default:
                System.out.println("\n OPCION NO VALIDA");
                break;
    }while(10==10);
}
}
        
