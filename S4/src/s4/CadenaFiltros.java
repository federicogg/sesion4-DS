/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

import java.util.ArrayList;

/**
 *
 * @author fedeg
 */
public class CadenaFiltros {

    private ArrayList<Filtro> filtros;
    private Objetivo objetivo;
    private double revoluciones;

    public CadenaFiltros() {
        filtros = new ArrayList<>();
        objetivo = new Objetivo();
        revoluciones = 0;

        objetivo.setVisibleMandos(true);
        objetivo.setVisibleSalpicadero(true);
    }

    public void addFiltro(Filtro filtro) {
        filtros.add(filtro);
    }

    void ejecutar(EstadoMotor estadoMotor) {
        for (Filtro filtro : filtros) {
            revoluciones = filtro.ejecutar(revoluciones, estadoMotor);
        }

        //System.err.println(respuesta);
        objetivo.ejecutar(revoluciones);
    }

}
