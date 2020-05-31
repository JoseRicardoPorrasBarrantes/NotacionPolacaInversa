/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vulkmir
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PolacaInversa nuevo = new PolacaInversa();
        GestorIO gestor = new GestorIO();

        int opcion;

        do {
            opcion = gestor.solicitarInt("Menu\n1.Agregar Fórmula\n2.Salir", "Menú");

            switch (opcion) {

                case 1:
                    
                    String formula = gestor.solicitarString("Digite acá su operacion", "");
                {
                    try {
                        nuevo.agregarNotacion(formula);
                        nuevo.dirigirElemento();
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                }

                    
                case 2:
                    System.exit(0);
                    break;
                    
                
            }

        } while (opcion > 1 || opcion < 9);

    }

}
