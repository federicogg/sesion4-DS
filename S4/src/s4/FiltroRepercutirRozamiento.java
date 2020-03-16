/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

public class FiltroRepercutirRozamiento implements Filtro {

    static final double ROZAMIENTO = -4;

    @Override
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor) {
        if (revoluciones > 0) {
            revoluciones += ROZAMIENTO;
        }

        if (revoluciones < 0) {
            revoluciones = 0;
        }

        return revoluciones;
    }
}
