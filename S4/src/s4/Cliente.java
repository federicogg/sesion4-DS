/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

/**
 *
 * @author fedeg
 */
public class Cliente {

    GestorFiltros gestorFiltros;

    public void setGestorFiltros(GestorFiltros gestorFiltros) {
        this.gestorFiltros = gestorFiltros;
    }

    public void solicitar(EstadoMotor estadoMotor) {
        if (gestorFiltros != null) {
            gestorFiltros.enviarPeticion(estadoMotor);
        }
    }
}
