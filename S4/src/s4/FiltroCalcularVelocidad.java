/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

public class FiltroCalcularVelocidad implements Filtro {

    //RPM
    static final double INCREMENTO = 70.0;
    static final double DECREMENTO = -200.0;

    @Override
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor) {

        if (estadoMotor.equals(EstadoMotor.ACELERANDO) && revoluciones < 3000) {
            revoluciones += INCREMENTO;

        } else if (estadoMotor.equals(EstadoMotor.FRENANDO) && revoluciones > 0) {
            revoluciones += DECREMENTO;
        }

        if (revoluciones < 0) {
            revoluciones = 0;
        } else if (revoluciones > 3000) {
            revoluciones = 3000;
        }

        return revoluciones;
    }

}
