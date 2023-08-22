package test;

public class Auto {
    static int cantidadCreados = 0;
    String modelo;
    double precio;
    Asiento [] asientos;
    String marca;
    Motor motor;
    int registro;

    int cantidadAsientos() {
        int count = 0;
        for (int i = 0;i < asientos.length; i++) {
    		if (asientos[i] != null) {
    			count++;
			}
        }
        return count;
    }

    String verificarIntegridad() {
        if (registro==motor.registro) {
        	for (int i = 0;i < asientos.length; i++) {
        		if (asientos[i] != null) {
        			if (asientos[i].registro != registro) {
        				return "Las piezas no son originales";
        			}
        		}
        	}
        	return "Auto original";	
        }
        else {
        	return "Las piezas no son originales";
        }
    }

}

