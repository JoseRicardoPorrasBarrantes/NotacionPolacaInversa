package Clases;

//GestorIO: Contiene los metodos para la entrada y salida de datos por
//medio de ventanas JOptionPane
//@author Jose Ricardo Porras Barrantes

import static java.lang.Character.isDigit;
import javax.swing.JOptionPane;

public class GestorIO {

    //M�todo para solicitar un String
    public String solicitarString(String mensaje, String titulo) {
        String hilera = JOptionPane.showInputDialog(null, mensaje,titulo, JOptionPane.INFORMATION_MESSAGE);
        return hilera;
    }

    //M�todo para solicitar un n�mero con decimales
    public double solicitarDouble(String mensaje, String titulo) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE));
        return numero;
    }

    //M�todo para solicitar un n�mero entero
    public int solicitarInt(String mensaje, String titulo) {
        int numero = -691;
        boolean rehacer;
        do{
            rehacer = false;
        try{
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE));
        }catch(Exception ex){
            rehacer = true;
        }
        }while(rehacer == true);
        return numero;
    }

    //M�todo para solicitar un caracter
    public char solicitarChar(String mensaje, String titulo) {
        String hilera = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
        char caracter = hilera.charAt(0);
        return caracter;
    }

    //M�todo para mostrar una hilera de texto
    public void desplegarString(String mensaje, String titulo) {
      JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

}//Fin de la clase