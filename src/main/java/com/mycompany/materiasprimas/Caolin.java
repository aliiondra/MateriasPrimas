/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.materiasprimas;

/**
 *
 * @author alu11563090
 */
public class Caolin extends MateriasPrimas {
    
    public Caolin(double SiO2, double AI2O3, double Fe2O3, double CaO, double MgO, double Na2O, double K2O, double TiO2, double PPC) {
        super(SiO2, AI2O3, Fe2O3, CaO, MgO, Na2O, K2O, TiO2, PPC);
    }
    
    @Override
    public boolean esValido() {
        if ((SiO2 > 45 && SiO2 < 60) &&
                (AI2O3 > 25 && AI2O3 < 38) &&
                (Fe2O3 > 0.2 && Fe2O3 < 2) &&
                (CaO > 0.2 && CaO < 0.22) &&
                (MgO < 0.4) &&
                (Na2O > 0.04 && Na2O < 0.8) &&
                (K2O > 0.5 && K2O < 2.5) &&
                (TiO2 < 0.5) &&
                (PPC > 8 && PPC < 13.6)) {
            return true;
        }
        return false;
    }
}
