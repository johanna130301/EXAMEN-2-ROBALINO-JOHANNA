package practica;

public class JubiladoDiscapacidad extends Jubilado {
    private int discapacidad;

    public JubiladoDiscapacidad(String cedula, String nombre, float salario, int aniosAporte,int discapacidad) {
        super(cedula, nombre, salario, aniosAporte);
        this.discapacidad = discapacidad;
    }

    public int getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(int discapacidad) {
        this.discapacidad = discapacidad;
    }
    
    @Override
    public float calcularPension() {
        float pi = this.getPensionInicial();
        float bono = this.getSalario() * this.discapacidad / 100;
        return pi + bono;
    }

    @Override
    public String getTipoJubilacion() {
        return "Jubilación por discapacidad.";
    }

}
