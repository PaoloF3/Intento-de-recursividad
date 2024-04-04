/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//no pude hacerlo perdon profesora no logre encontrar mi error
package Recursividad;

import java.util.Scanner;
/**
 *
 * @author solo1
 */
public class Recursividad {

    private static Scanner leer;
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num;
        int invertido;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero: ");
        num = leer.nextInt();
        
        
        Revez operacion = new Revez(num,invertido);
        int DadoVueta = operacion.Invertidos(num, invertido);


        
        System.out.println("El numero al revez es "+ DadoVueta);
    }
     

    
}

 
