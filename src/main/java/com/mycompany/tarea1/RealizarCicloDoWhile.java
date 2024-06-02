/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author JoseManuelVicenteCheco
 */

// Realizar un programa que imprima la sumatoria de los números del 1 al 20 utilizando ciclos "do while".

public class RealizarCicloDoWhile {
    
    public static void main(String[] args) {
        
        int numero = 1;
        int sumatoria = 0;
        
        do{
            sumatoria = sumatoria + numero;
            
            System.out.println("Numero: ["+numero+"] --> Sumatoria: ["+sumatoria+"] = " + (sumatoria + numero));
            
            numero ++;
            
            
            
        }while (numero <= 20);
    } 
    
}
