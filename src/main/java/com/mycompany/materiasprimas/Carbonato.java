/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.materiasprimas;

/**
 *
 * @author alu11563090
 */
public class Carbonato extends MateriasPrimas {
    
    public Carbonato(double SiO2, double AI2O3, double Fe2O3, double CaO, double MgO, double Na2O, double K2O, double TiO2, double PPC) {
        super(SiO2, AI2O3, Fe2O3, CaO, MgO, Na2O, K2O, TiO2, PPC);
    }
    
    @Override
    public boolean esValido() {
        if ((SiO2 > 45 && SiO2 < 62) &&
                (AI2O3 > 0.5 && AI2O3 < 10) &&
                (Fe2O3 > 0.6 && Fe2O3 < 2) &&
                (CaO > 0.5 && CaO < 2) &&
                (MgO > 25 && MgO < 35) &&
                //(Na2O > 0.1 && Na2O < 5) &&
                //(K2O > 0.1 && K2O < 10) &&
                //(TiO2 < 0.35) &&
                (PPC > 7 && PPC < 9)) {
            return true;
        }
        return false;
    }
    
    public void esCarbonatoCalcico() {
        if ((SiO2 > 0.1 && SiO2 < 3) &&
                (AI2O3 < 1) &&
                (Fe2O3 < 3.5) &&
                (CaO > 50 && CaO < 56) &&
                (MgO < 2.5) &&
                //(Na2O > 0.1 && Na2O < 5) &&
                //(K2O > 0.1 && K2O < 10) &&
                //(TiO2 < 0.35) &&
                (PPC > 40 && PPC < 45)) {
            System.out.println("carbonato cálcico");
        }
    }
    
    public void esDolomita() {
        if ((SiO2 < 0.5) &&
                (AI2O3 < 1) &&
                (Fe2O3 < 3.5) &&
                (CaO > 30) &&
                (MgO > 20) &&
                //(Na2O > 0.1 && Na2O < 5) &&
                //(K2O > 0.1 && K2O < 10) &&
                //(TiO2 < 0.35) &&
                (PPC > 45)) {
            System.out.println("dolomita");
        }
    }
    
    public void esMagnesita() {
        if ((SiO2 < 3) &&
                (AI2O3 < 1) &&
                (Fe2O3 < 3.5) &&
                (CaO > 0.1 && CaO < 3) &&
                (MgO > 90) &&
                //(Na2O > 0.1 && Na2O < 5) &&
                //(K2O > 0.1 && K2O < 10) &&
                //(TiO2 < 0.35) &&
                (PPC < 1)) {
            System.out.println("carbonato cálcico");
        }
    }
}
