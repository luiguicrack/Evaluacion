package com.mycompany.evaluacion;

import java.util.Scanner;

public class Evaluacion {

    public static void main(String[] args) {
        //Crear un paseador de perros, a partir de horas de perros
        //Horas paseo, #perros, calcular costo a pagar
        //Paseo perro grande = 10.000 x horas
        //Perro mediano = 5.000 x hora, perro pequeño = 3.000 x hora
        //>1 le hacen descuento del 10% del total
        Scanner sc = new Scanner ( System.in);
        int total = 0, perro, cant, tot = 0, hor;
        System.out.println("Paseador de perro");
        System.out.println("");
        System.out.print("Cantidad de perros: ");
        cant = sc.nextInt();
        System.out.print("Digite la cantidad de horas: ");
        hor = sc.nextInt();
        
        for (int i = 1; i<= cant; i++){
            System.out.println("");
            System.out.println("1. perro grande = 10.000");
            System.out.println("2. perro mediano = 5.000");
            System.out.println("3. perro pequeño = 3.000");
            System.out.println("");
            System.out.print("Digite la opcion: ");
            perro = sc.nextInt();
            if (perro == 1){
                total += 10000*hor;
            } else if (perro == 2){
                total += 5000*hor;
            } else if (perro == 3){
                total += 3000*hor;
            } else {
                System.out.println("Opcion incorrecta");
            }
            tot = total;
        }
        if (cant>1){
            total *= 0.10;
            tot  = tot - total;
        } else{
            tot = total;
        }
        
        System.out.println("La cantidad total a pagar es: "+tot);
    }
}
