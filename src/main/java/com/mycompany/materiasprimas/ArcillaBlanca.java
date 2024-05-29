/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.materiasprimas;

/**
 *
 * @author alu11563090
 */
public class ArcillaBlanca extends MateriasPrimas {
    
    public ArcillaBlanca(double SiO2, double AI2O3, double Fe2O3, double CaO, double MgO, double Na2O, double K2O, double TiO2, double PPC) {
        super(SiO2, AI2O3, Fe2O3, CaO, MgO, Na2O, K2O, TiO2, PPC);
    }
    
    @Override
    public boolean esValido() {
        if ((SiO2 > 48 && SiO2 < 79) &&
                (AI2O3 > 15 && AI2O3 < 35) &&
                (Fe2O3 > 0.8 && Fe2O3 < 5) &&
                (CaO < 0.5) &&
                (MgO < 0.8) &&
                (Na2O > 0.1 && Na2O < 1) &&
                (K2O > 0.7 && K2O < 3.5) &&
                (TiO2 > 0.9 && TiO2 < 2) &&
                (PPC > 3.5 && PPC < 12)) {
            return true;
        }
        return false;
    }
}
