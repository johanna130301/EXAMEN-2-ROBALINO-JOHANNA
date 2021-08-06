package practica;


public class JubiladoPatronal extends Jubilado {
    private Empresa empresa;
    private float inflacion;

    public JubiladoPatronal(String cedula, String nombre, float salario, int aniosAporte,Empresa empresa, float inflacion) {
        super(cedula, nombre, salario, aniosAporte);
        this.empresa = empresa;
        this.inflacion = inflacion;
    }
    

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public float getInflacion() {
        return inflacion;
    }

    public void setInflacion(float inflacion) {
        this.inflacion = inflacion;
    }
    
    @Override
    public float calcularPension() {
        float pi = this.getPensionInicial();
        float bono= this.getSalario() * inflacion / 100;
        float pension=pi + bono;
        if(empresa==Empresa.Publica){
            pension=pension+(pension*5/100);
        }else if (empresa==Empresa.Privada){
           pension=pension+(pension*10/100); 
        }
        return pension;
    }

    @Override
    public String getTipoJubilacion() {
        return "Jubilación patronal: Empresa "+empresa+".";
    }
    
}
