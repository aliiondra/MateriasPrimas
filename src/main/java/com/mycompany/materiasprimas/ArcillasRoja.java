/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.materiasprimas;

/**
 *
 * @author alu11563090
 */
public class ArcillasRoja extends MateriasPrimas {
    
    public ArcillasRoja(double SiO2, double AI2O3, double Fe2O3, double CaO, double MgO, double Na2O, double K2O, double TiO2, double PPC) {
        super(SiO2, AI2O3, Fe2O3, CaO, MgO, Na2O, K2O, TiO2, PPC);
    }
    
    @Override
    public boolean esValido() {
        if ((SiO2 > 30 && SiO2 < 80) &&
                (AI2O3 > 12 && AI2O3 < 25) &&
                (Fe2O3 > 3.5 && Fe2O3 < 8) &&
                (CaO > 0.5 && CaO < 25) &&
                (MgO > 0.8 && MgO < 3) &&
                (Na2O > 0.1 && Na2O < 0.9) &&
                (K2O > 3 && K2O < 5) &&
                (TiO2 < 1.2) &&
                (PPC > 6 && PPC < 23)) {
            return true;
        }
        return false;
    }
}
