package Atributos;

/**
 *
 * @author <Xaul Castilla SML>
 */
public class Persona {
    private int dia;
    private String Mes;
    private String anio;
    private String BarrioT;
    private String DomicilioT;
    private String BarrioD;
    private String Domicilio;

    public Persona(int dia, String Mes, String anio, String BarrioT, String DomicilioT, String BarrioD, String Domicilio) {
        this.dia = dia;
        this.Mes = Mes;
        this.anio = anio;
        this.BarrioT = BarrioT;
        this.DomicilioT = DomicilioT;
        this.BarrioD = BarrioD;
        this.Domicilio = Domicilio;
    }

   
    

    public int getDia() {
        return dia;
    }

    public String getMes() {
        return Mes;
    }

    public String getAnio() {
        return anio;
    }

    public String getBarrioT() {
        return BarrioT;
    }

    public String getDomicilioT() {
        return DomicilioT;
    }

    public String getBarrioD() {
        return BarrioD;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setBarrioT(String BarrioT) {
        this.BarrioT = BarrioT;
    }

    public void setDomicilioT(String DomicilioT) {
        this.DomicilioT = DomicilioT;
    }

    public void setBarrioD(String BarrioD) {
        this.BarrioD = BarrioD;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    @Override
    public String toString() {
        return "Persona{" + "dia=" + dia + "\n"+
                ", Mes=" + Mes + "\n"+
                ", anio=" + anio + "\n"+
                ", BarrioT=" + BarrioT + "\n"+ 
                ", DomicilioT=" + DomicilioT + "\n"+
                ", BarrioD=" + BarrioD + "\n"+
                ", Domicilio=" + Domicilio + '}';
    }

  
    
    }
    
    
             
             
    
    
    
    
    
    
    

            


