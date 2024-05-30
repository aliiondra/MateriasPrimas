/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.materiasprimas;

/**
 *
 * @author alu11563090
 */
public class Carbonato extends MateriaPrima {
    
    public Carbonato(double SiO2, double AI2O3, double Fe2O3, double CaO, double MgO, double Na2O, double K2O, double TiO2, double PPC) {
        super(SiO2, AI2O3, Fe2O3, CaO, MgO, Na2O, K2O, TiO2, PPC);
    }
    
    @Override
    public String toString() {
        if ((SiO2 > 0.1 && SiO2 < 3) &&
                (AI2O3 < 1) &&
                (Fe2O3 < 3.5) &&
                (CaO > 50 && CaO < 56) &&
                (MgO < 2.5) &&
                (Na2O < 0.01) &&
                (K2O < 0.01) &&
                (TiO2 < 0.01) &&
                (PPC > 40 && PPC < 45)) {
            return "Es carbonato cálcico";
        } else if ((SiO2 < 0.5) &&
                (AI2O3 < 1) &&
                (Fe2O3 < 3.5) &&
                (CaO > 30) &&
                (MgO > 20) &&
                (Na2O < 0.01) &&
                (K2O < 0.01) &&
                (TiO2 < 0.01) &&
                (PPC > 45)) {
            return "Es dolomita";
        } else if ((SiO2 < 3) &&
                (AI2O3 < 1) &&
                (Fe2O3 < 3.5) &&
                (CaO > 0.1 && CaO < 3) &&
                (MgO > 90) &&
                (Na2O < 0.01) &&
                (K2O < 0.01) &&
                (TiO2 < 0.01) &&
                (PPC < 1)) {
            return "Es magnesita";
        }
        return "No es carbonato";
    }
}
