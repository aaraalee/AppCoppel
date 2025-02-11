/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

/**
 *
 * @author Olivia Hernandez
 */
public class Articulos {
     /*
    C001 - Comedor 4 sillas - $5690
    ST02 - Smart TV LG 40' - $ 12340
    M004 - Mesa de madera $ 879
    L098 - Licuadora Mabe $ 430
    */
    private String[] codigo = {"C001","ST02","M004","L098"};
    private String[] descripcion={"Comedor 4 sillas","Smart TV LG 40'",
                                  "Mesa de madera","Licuadora Mabe"};
    private double[] precio={5690,12340,879,430};
    
    public String getDescripcion(int indice){
        return descripcion[indice];
    }
    public double getPrecio(int indice){
        return precio[indice];
    }

    public String[] getCodigos() {
        return codigo;
    }

}
