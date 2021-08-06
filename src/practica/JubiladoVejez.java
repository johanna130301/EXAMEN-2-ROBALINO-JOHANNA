package practica;


public class JubiladoVejez extends Jubilado {

    public JubiladoVejez(String cedula, String nombre, float salario, int aniosAporte) {
        super(cedula, nombre, salario, aniosAporte);
    }
    
    @Override
    public float calcularPension() {
        float pi=this.getPensionInicial();
        float bono=this.getSalario()*15/100;
        return pi+bono;
    }

    @Override
    public String getTipoJubilacion() {
        return "Jubilación por vejez.";
    }
    
}
