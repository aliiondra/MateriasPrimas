/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.materiasprimas;

/**
 *
 * @author alu11563090
 */
public class Feldespato extends MateriasPrimas {
    
    public Feldespato(double SiO2, double AI2O3, double Fe2O3, double CaO, double MgO, double Na2O, double K2O, double TiO2, double PPC) {
        super(SiO2, AI2O3, Fe2O3, CaO, MgO, Na2O, K2O, TiO2, PPC);
    }
    
    @Override
    public boolean esValido() {
        if ((SiO2 > 63 && SiO2 < 77) &&
                (AI2O3 > 13 && AI2O3 < 22) &&
                (Fe2O3 > 0.05 && Fe2O3 < 0.4) &&
                (CaO < 2) &&
                (MgO < 0.7) &&
                (Na2O > 0.1 && Na2O < 5) &&
                (K2O > 0.1 && K2O < 10) &&
                (TiO2 < 0.35) &&
                (PPC > 0.5 && PPC < 2)) {
            return true;
        }
        return false;
    }
    
    public void mostrarTipoFeldespato() {
        if (SiO2 == 68 && AI2O3 == 16 && Fe2O3 == 0.15 &&
                CaO == 1.7 && MgO == 0.5 && Na2O == 1.9 &&
                K2O == 10.5 && TiO2 == 0.1 && PPC == 1.15) {
            System.out.println("Feldespato potásico A");
        } else if (SiO2 == 66.9 && AI2O3 == 17.3 && Fe2O3 == 0.03 &&
                CaO == 0.03 && MgO == 0.01 && Na2O == 0.79 &&
                K2O == 14.29 && TiO2 == 0.02 && PPC == 0.63) {
            System.out.println("Feldespato potásico B");
        } else if (SiO2 == 70 && AI2O3 == 18 && Fe2O3 == 0.12 &&
                CaO == 0.03 && MgO == 0.02 && Na2O == 10.3 &&
                K2O == 0.8 && TiO2 == 0.25 && PPC == 0.48) {
            System.out.println("Feldespato sódico");
        }
    }
}
