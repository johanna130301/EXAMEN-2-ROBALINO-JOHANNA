package practica;

public abstract class Jubilado {
    private String cedula;
    private String nombre;
    private float salario;
    private int aniosAporte;
    
    public Jubilado() {
    }

    public Jubilado(String cedula, String nombre, float salario, int aniosAporte) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
        this.aniosAporte = aniosAporte;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getAniosAporte() {
        return aniosAporte;
    }

    public void setAniosAporte(int aniosAporte) {
        this.aniosAporte = aniosAporte;
    }
    public float getPensionInicial(){
        
        if(this.aniosAporte>0 && this.aniosAporte<11){
            return this.salario*50/100;
        }else if(this.aniosAporte>10 && this.aniosAporte<21){
            return this.salario*60/100;
        }else if(this.aniosAporte>20 && this.aniosAporte<31){
            return this.salario*70/100;
        }else if(this.aniosAporte>30 && this.aniosAporte<36){
            return this.salario*80/100;
        }else if(this.aniosAporte>35 && this.aniosAporte<40){
            return this.salario*90/100;
        }else if(this.aniosAporte>39){
            return this.salario*100/100;
        }
        return 0;
    }
    @Override
    public String toString() {
        return this.nombre+" "+getTipoJubilacion()+" Pension: $"+calcularPension();
    }
    public abstract String getTipoJubilacion();
    public abstract float calcularPension();
}
