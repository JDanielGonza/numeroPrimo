/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.numeroprimo;

/**
 *
 * @author jadag
 */
public class NumeroPrimo {

    public static void main(String[] args) {
        int numero = 15;
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        // Un número es primo si es mayor que 1 y no tiene divisores aparte de 1 y sí mismo
        /*if (numero <= 1) {
            return false; // 0 y 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // El número es divisible por otro número aparte de 1 y sí mismo
            }
        }
        return true; // El número es primo*/
        
        for(int i= 2; i < numero; i++){
            if(numero%i==0){
                //System.out.println("No es primo");
                return false;
            }
        }
        return true;
    }
}
