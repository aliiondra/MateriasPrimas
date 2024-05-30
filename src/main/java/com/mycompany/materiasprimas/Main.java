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
        ArenaFeldespatica arenaFeldespatica = new ArenaFeldespatica(96.1, 2.1, 0.05, 0.09, 0.06, 0.27, 1.1, 0.01, 0.16);
        System.out.println(arenaFeldespatica);
        
        Caolin caolin = new Caolin(46, 30, 1, 0.2, 0.2, 0.7, 0.9, 0.4, 10);
        System.out.println(caolin);
        
        Carbonato carbonato = new Carbonato(2, 0.5, 0.2, 55, 0.2, 0, 0, 0, 41);
        System.out.println(carbonato);
        
        MateriaPrima materiasPrima = new MateriaPrima(46, 30, 1, 0.2, 0.2, 0.7, 0.9, 0.4, 10);
        System.out.println(materiasPrima);
        
    }
    
}
