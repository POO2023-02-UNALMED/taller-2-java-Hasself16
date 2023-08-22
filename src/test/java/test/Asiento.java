package test;

public class Asiento {
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




 
