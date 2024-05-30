/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.materiasprimas;

/**
 *
 * @author alu11563090
 */
public class Main {
    public static void main(String[] args) {
        MateriaPrima materiaPrima = new MateriaPrima(2, 0.5, 0.2, 55, 0.2, 0, 0, 0, 41);
        System.out.println(materiaPrima);

        MateriaPrima materiaPrima1 = new MateriaPrima(96.1, 2.1, 0.05, 0.09, 0.06, 0.27, 1.1, 0.01, 0.16);
        System.out.println(materiaPrima1);
        
        MateriaPrima materiaPrima2 = new MateriaPrima(46, 30, 1, 0.2, 0.2, 0.7, 0.9, 0.4, 10);
        System.out.println(materiaPrima2);
        
        MateriaPrima materiasPrima3 = new MateriaPrima(50, 5, 1, 1, 30, 0, 0, 0, 8);
        System.out.println(materiasPrima3);

        MateriaPrima materiasPrima4 = new MateriaPrima(67, 20, 0.3, 1, 0.5, 2, 5, 0.2, 1);
        System.out.println(materiasPrima4);


        MateriaPrima materiaPrima8 = new MateriaPrima(2, 0, 0.2, 0, 0, 0, 0, 0, 41);
        System.out.println(materiaPrima8);
    }
}