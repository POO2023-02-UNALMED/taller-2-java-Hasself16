package test;

public class Motor {
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

