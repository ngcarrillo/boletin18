/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_3;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin18_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        notas obxNotas = new notas();
        obxNotas.cargarArray();
        obxNotas.visualizar();
        obxNotas.visualizarArray();
        obxNotas.calcularmedia();
        obxNotas.buscarAlumno();
        obxNotas.ordenar();
    }
    
}
