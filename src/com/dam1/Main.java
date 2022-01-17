package com.dam1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int opcion;
        float []notas = new float[5];
        MetodosArray obx = new MetodosArray();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" *** MENÚ *** " + "\n" + "1 --> CREAR " + "\n" + " 2--> AMOSAR" + "\n" + " 3--> SAIR "));

            switch (opcion) {
                case 1:
                    notas = obx.crearArray(notas);
                    break;

                case 2:
                    obx.amosarArray(notas);
                    break;

                case 3:
                    obx.sair();
                    break;
            }
        }while (opcion <3);

    }
}
