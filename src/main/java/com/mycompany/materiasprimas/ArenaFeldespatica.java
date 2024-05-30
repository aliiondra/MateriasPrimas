/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.materiasprimas;

/**
 *
 * @author alu11563090
 */
public class ArenaFeldespatica extends MateriaPrima {
    
    public ArenaFeldespatica(double SiO2, double AI2O3, double Fe2O3, double CaO, double MgO, double Na2O, double K2O, double TiO2, double PPC) {
        super(SiO2, AI2O3, Fe2O3, CaO, MgO, Na2O, K2O, TiO2, PPC);
    }

    @Override
    public String toString() {
        if (SiO2 == 96.1 && AI2O3 == 2.1 && Fe2O3 == 0.05 &&
                CaO == 0.09 && MgO == 0.06 && Na2O == 0.27 &&
                K2O == 1.1 && TiO2 == 0.01 && PPC == 0.16) {
            return "Arena feldespática A";
        } else if (SiO2 == 83.3 && AI2O3 == 10.3 && Fe2O3 == 0.08 &&
                CaO == 0.2 && MgO == 0.19 && Na2O == 0.14 &&
                K2O == 3.85 && TiO2 == 0.01 && PPC == 1.81) {
            return "Arena feldespática B";
        } else if (SiO2 == 91.5 && AI2O3 == 4.5 && Fe2O3 == 0.12 &&
                CaO == 0.3 && MgO == 0.06 && Na2O == 0.6 &&
                K2O == 2.8 && TiO2 == 0.02 && PPC == 0.4) {
            return "Arena feldespática C";
        }
        return null;
    }
}
