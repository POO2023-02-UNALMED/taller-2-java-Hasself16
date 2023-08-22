package test;
import java.util.ArrayList;
import java.util.List;

class Asiento {
    String color;
    double precio;
    int registro;

    void cambiarColor(String color){
        String[] colores ={"rojo", "verde", "amarillo", "negro", "blanco"};
        for (String c : colores) {
            if (c.equals(color)) {
                this.color =color;
                break;
            }
        }
    }
}

class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int registro) {
        this.registro=registro;
    }
    void asignarTipo(String tipo) {
        String[] tipos = {"electrico", "gasolina"};
        for (String t : tipos) {
            if (t.equals(tipo)) {
                this.tipo=tipo;
                break;
            }
        }
    }
}

class Auto {
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