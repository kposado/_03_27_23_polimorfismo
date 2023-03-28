package com.adecco.presentacion;

import java.util.Arrays;

public class ProbarArrays {

    public static void main(String[] args) {
        //Definicion de array
        int[] numeros = new int[3];
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=5;
        System.out.println("Primera celda -> "+ numeros [0]);
        System.out.println("Segunda celda -> "+ numeros [1]);
        System.out.println("Tercera celda -> "+ numeros [2]);

        //Definicion de array en dos líneas
        String[] nombres;
        //Puedo pedir por scanner
        nombres = new String[3];

        nombres[0]= "Juan";
        nombres[1]= "Pedro";
        nombres[2]= "Ana";

        System.out.println("Primera celda ->" +nombres [0]);
        System.out.println("Primera celda ->" +nombres [1]);
        System.out.println("Primera celda ->" +nombres [2]);
        System.out.println(Arrays.toString(nombres));

    }
}
