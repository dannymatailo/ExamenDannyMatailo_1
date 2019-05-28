/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendannymatailo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class ExamenDannyMatailo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in); 
        boolean entradaValida=true; 
        do{         
         try{
        System.out.println("ingrese su edad \n");
        int edad=sc.nextInt();
        System.out.println("Su edad es        = \n" +edad);
        entradaValida=false;
        }
catch (InputMismatchException ex){
    System.out.println("Intente nuevamente: debe Ingresar un  entero");
            sc.nextLine();
}           
    }while(entradaValida);
    }
    
}
