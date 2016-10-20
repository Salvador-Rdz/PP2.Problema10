/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema10;

import java.util.Scanner;

/**
 *
 * @author Enano
 */
public class PP2Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int numFib;
        //Resolución
        numFib=getTimes();
        solve(numFib);
        
    }
    public static int getTimes ()//Se recibe la información
    {
        Scanner getinf = new Scanner (System.in);
        int Number;
        System.out.println("**** Bienvenid@ ****");
        System.out.println("Ingrese cuantos números de la serie de fibonacci requiere: ");
        Number=getinf.nextInt();
        return Number;
    }
    public static void solve (int n)
    {
        System.out.print("0,");
        int a=1,b=1;            //Se inicia la serie con 1 y 1. Ya que así inicia la serie de fibonacci
        for (int i=1;i<n-1;i=i+2)   //Se repite el proceso el número de veces que pidio el usuario.
        {
            System.out.print(a+","+b+",");//Se imprime a y b.
            a=a+b;                //a se cambia a la suma de a+b
            b=a+b;                //b se cambia a la suma de (a+b)+b
        }
        System.out.println("");
    }
}
