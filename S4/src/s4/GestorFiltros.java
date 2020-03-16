/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

public class GestorFiltros {

    CadenaFiltros cadenaFiltros;

    public GestorFiltros() {
        cadenaFiltros = new CadenaFiltros();

        Filtro calcularVelocidad = new FiltroCalcularVelocidad();
        Filtro repercutirRozamiento = new FiltroRepercutirRozamiento();

        this.addFiltro(calcularVelocidad);
        this.addFiltro(repercutirRozamiento);
    }

    private void addFiltro(Filtro filtro) {
        cadenaFiltros.addFiltro(filtro);
    }

    public void enviarPeticion(EstadoMotor estadoMotor) {
        cadenaFiltros.ejecutar(estadoMotor);
    }
}
