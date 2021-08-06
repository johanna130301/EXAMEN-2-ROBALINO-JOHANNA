package practica;

import java.util.ArrayList;
import java.util.List;
public class Practica {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        float inflacion =(float) 11.2;
        List<Jubilado> jubilados= new ArrayList<>();
        JubiladoVejez j1= new JubiladoVejez("0987654321", "Pedro Fernandez", 500, 35);
        JubiladoDiscapacidad j2 = new JubiladoDiscapacidad("0987651234", "María Lopez", 625, 15, 50);
        JubiladoPatronal j3= new JubiladoPatronal("098761235", "Luis Castillo", 1250, 9, Empresa.Publica, inflacion);
        JubiladoPatronal j4= new JubiladoPatronal("123534351", "Patricia Ordoñez", 750, 29, Empresa.Privada, inflacion);
        jubilados.add(j1);
        jubilados.add(j2);
        jubilados.add(j3);
        jubilados.add(j4);
        System.out.println("Pensión de todos los jubilados:");
        jubilados.forEach((jubi) -> {
            System.out.println("-"+jubi.toString());
        });
    }
    
}
