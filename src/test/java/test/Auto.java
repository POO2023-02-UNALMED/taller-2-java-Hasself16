package test;
import java.util.ArrayList;
import java.util.List;

public class Auto {
    static int cantidadCreados = 0;
    String modelo;
    double precio;
    List<Asiento> asientos;
    String marca;
    Motor motor;
    int registro;

    int cantidadAsientos() {
        int count = 0;
        for (Asiento asiento : asientos) {
            if (asiento instanceof Asiento) {
                count++;
            }
        }
        return count;
    }

    String verificarIntegridad() {
        List<Integer> registros = new ArrayList<>();
        registros.add(this.registro);
        for (Asiento asiento : asientos) {
            if (asiento instanceof Asiento) {
                registros.add(asiento.registro);
            }
        }
        registros.add(this.motor.registro);

        if (registros.stream().allMatch(registro -> registro.equals(registros.get(0)))) {
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }

}

