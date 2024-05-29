/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.materiasprimas;

/**
 *
 * @author alu11563090
 */
public class MateriasPrimas {
    
    protected double SiO2;
    protected double AI2O3;
    protected double Fe2O3;
    protected double CaO;
    protected double MgO;
    protected double Na2O;
    protected double K2O;
    protected double TiO2;
    protected double PPC;

    public MateriasPrimas(double SiO2, double AI2O3, double Fe2O3, double CaO, double MgO, double Na2O, double K2O, double TiO2, double PPC) {
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

    public boolean esValido() {
        return false;
    }
    
    
}
