/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;
/**
 *
 * @author USUARIO
 */
import ec.edu.ister.modelo.Lista;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Aplicacion {
    public static void main(String[] args) {
    Lista lista= new Lista();
    JOptionPane.showMessageDialog(null,"Esta vacia: "+lista.estaVacio());
    }
}
