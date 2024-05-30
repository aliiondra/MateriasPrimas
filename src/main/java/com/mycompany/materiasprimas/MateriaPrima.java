/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.materiasprimas;

/**
 *
 * @author alu11563090
 */
public class MateriaPrima {

    protected double SiO2;
    protected double AI2O3;
    protected double Fe2O3;
    protected double CaO;
    protected double MgO;
    protected double Na2O;
    protected double K2O;
    protected double TiO2;
    protected double PPC;

    public MateriaPrima(double SiO2, double AI2O3, double Fe2O3, double CaO, double MgO, double Na2O, double K2O, double TiO2, double PPC) {
        this.SiO2 = SiO2;
        this.AI2O3 = AI2O3;
        this.Fe2O3 = Fe2O3;
        this.CaO = CaO;
        this.MgO = MgO;
        this.Na2O = Na2O;
        this.K2O = K2O;
        this.TiO2 = TiO2;
        this.PPC = PPC;
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
        } else if ((SiO2 > 48 && SiO2 < 79) &&
                (AI2O3 > 15 && AI2O3 < 35) &&
                (Fe2O3 > 0.8 && Fe2O3 < 5) &&
                (CaO < 0.5) &&
                (MgO < 0.8) &&
                (Na2O > 0.1 && Na2O < 1) &&
                (K2O > 0.7 && K2O < 3.5) &&
                (TiO2 > 0.9 && TiO2 < 2) &&
                (PPC > 3.5 && PPC < 12)) {
            return "Es arcilla blanca";
        } else if ((SiO2 > 30 && SiO2 < 80) &&
                (AI2O3 > 12 && AI2O3 < 25) &&
                (Fe2O3 > 3.5 && Fe2O3 < 8) &&
                (CaO > 0.5 && CaO < 25) &&
                (MgO > 0.8 && MgO < 3) &&
                (Na2O > 0.1 && Na2O < 0.9) &&
                (K2O > 3 && K2O < 5) &&
                (TiO2 < 1.2) &&
                (PPC > 6 && PPC < 23)) {
            return "Es arcilla roja";
        } else if ((SiO2 > 80 && SiO2 < 97) &&
                (AI2O3 > 2 && AI2O3 < 11) &&
                (Fe2O3 > 0.05 && Fe2O3 < 0.15) &&
                (CaO < 0.08) &&
                (MgO < 0.2) &&
                (Na2O > 0.1 && Na2O < 0.6) &&
                (K2O > 1 && K2O < 4) &&
                (TiO2 < 0.03) &&
                (PPC < 2)) {
            return "Arena feldespática genérica";
        } else if (SiO2 == 96.1 && AI2O3 == 2.1 && Fe2O3 == 0.05 &&
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
        } else if ((SiO2 > 45 && SiO2 < 60) &&
                (AI2O3 > 25 && AI2O3 < 38) &&
                (Fe2O3 > 0.2 && Fe2O3 < 2) &&
                (CaO > 0.02 && CaO < 0.22) &&
                (MgO < 0.4) &&
                (Na2O > 0.04 && Na2O < 0.8) &&
                (K2O > 0.5 && K2O < 2.5) &&
                (TiO2 < 0.5) &&
                (PPC > 8 && PPC < 13.6)) {
            return "Es caolín";
        } else if ((SiO2 > 63 && SiO2 < 77) &&
                (AI2O3 > 13 && AI2O3 < 22) &&
                (Fe2O3 > 0.05 && Fe2O3 < 0.4) &&
                (CaO < 2) &&
                (MgO < 0.7) &&
                (Na2O > 0.1 && Na2O < 5) &&
                (K2O > 0.1 && K2O < 10) &&
                (TiO2 < 0.35) &&
                (PPC > 0.5 && PPC < 2)) {
            return "Es Feldespato genérico";
        } else if (SiO2 == 68 && AI2O3 == 16 && Fe2O3 == 0.15 &&
                CaO == 1.7 && MgO == 0.5 && Na2O == 1.9 &&
                K2O == 10.5 && TiO2 == 0.1 && PPC == 1.15) {
            return "Feldespato potásico A";
        } else if (SiO2 == 66.9 && AI2O3 == 17.3 && Fe2O3 == 0.03 &&
                CaO == 0.03 && MgO == 0.01 && Na2O == 0.79 &&
                K2O == 14.29 && TiO2 == 0.02 && PPC == 0.63) {
            return "Feldespato potásico B";
        } else if (SiO2 == 70 && AI2O3 == 18 && Fe2O3 == 0.12 &&
                CaO == 0.03 && MgO == 0.02 && Na2O == 10.3 &&
                K2O == 0.8 && TiO2 == 0.25 && PPC == 0.48) {
            return "Feldespato sódico";
        } else if ((SiO2 > 45 && SiO2 < 62) &&
                (AI2O3 > 0.5 && AI2O3 < 10) &&
                (Fe2O3 > 0.6 && Fe2O3 < 2) &&
                (CaO > 0.5 && CaO < 2) &&
                (MgO > 25 && MgO < 35) &&
                (Na2O < 0.01) &&
                (K2O < 0.01) &&
                (TiO2 < 0.01) &&
                (PPC > 7 && PPC < 9)) {
            return "Es Talco";
        }
        return "Materia prima inexistente";
    }
}