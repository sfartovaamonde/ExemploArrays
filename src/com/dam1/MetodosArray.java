package com.dam1;

import javax.swing.*;

public class MetodosArray {
public float [] crearArray(float [] lista){
    for ( int i =0; i< lista.length;i++){
       lista [i]= Float.parseFloat(JOptionPane.showInputDialog(" teclea nota "));
    }
    return lista;
}
public void amosarArray (float [] lista ) {
    for (int i=0; i<lista.length;i++){
        JOptionPane.showMessageDialog(null," posición " + i+ "-->>" +lista[i]);
    }

}
public void sair (){

    System.exit(0);
}
}
