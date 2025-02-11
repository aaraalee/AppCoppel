/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

import java.util.Vector;

/**
 *
 * @author Olivia Hernandez
 */
public class Planes {
    private Vector cuotas= new Vector();
    private int nCuotas;
    private double pagoFinal;
    public double getPlan1(double precio){
        //PLAN 1: Contado, se hace el 10% de descuento sobre el precio de lista.
        nCuotas = 1;
        pagoFinal = precio - (precio * .10);
        cuotas.clear();
        cuotas.addElement(pagoFinal);
        return pagoFinal;
    }
    public Vector getCuotas() {
        return cuotas;
    }
    public int getnCuotas() {
        return nCuotas;
    }
    public double getPlan2(double precio){
        //PLAN 2: Tres cuotas, 50% al contado y el resto en dos cuotas iguales. 
        //El precio de lista se incrementa en un 10%.
        nCuotas=3;
        pagoFinal = precio - (precio *.10);
        cuotas.clear();
        cuotas.addElement(pagoFinal*.50);
        cuotas.addElement(pagoFinal *.25);
        cuotas.addElement(pagoFinal *.25);
        return pagoFinal;
    }
    public double getPlan3(double precio){
        //PLAN 3: Cuatro cuotas, 25% al contado y el resto en tres cuotas iguales. 
        //El precio de lista se incrementa en un 15%.
        nCuotas = 4;
        pagoFinal = precio + (precio *.15);
        cuotas.clear();
        cuotas.addElement(pagoFinal*.25);
        cuotas.addElement(pagoFinal *.25);
        cuotas.addElement(pagoFinal *.25);
        cuotas.addElement(pagoFinal *.25);
        return pagoFinal; 
    }
    public double getPlan4(double precio){
        //PLAN 4: Totalmente financiado en 8 cuotas. 
        //El 60% se reparte en partes iguales en las cuatro primeras cuotas, 
        //el resto de la misma forma en las últimas cuatro. 
        //El precio de lista se incrementa en un 25%.
        nCuotas = 8;
        pagoFinal = precio + (precio *.25);
        cuotas.clear();
        cuotas.addElement(pagoFinal*.60);
        cuotas.addElement(pagoFinal *.15);
        cuotas.addElement(pagoFinal *.15);
        cuotas.addElement(pagoFinal *.15);
        cuotas.addElement(pagoFinal *.15);
        cuotas.addElement(pagoFinal *.10);
        cuotas.addElement(pagoFinal *.10);
        cuotas.addElement(pagoFinal *.10);
        cuotas.addElement(pagoFinal *.10);
        return pagoFinal; 
    }
}
