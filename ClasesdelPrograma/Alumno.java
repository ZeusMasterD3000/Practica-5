package ClasesdelPrograma;
// import java.util.ArrayList;
// import java.util.Random;
public class Alumno {

    private String nombre_alu;
    private String no_cuenta;
    private float prom;
    static int contAlu = 0;

    public Alumno(String nombre_alu, String no_cuenta, float prom){
        this.nombre_alu = nombre_alu;
        this.no_cuenta = no_cuenta;
        this.prom = prom;
        contAlu ++;
    }
    public Alumno(String nombre_alu, String no_cuenta){
        this.nombre_alu = nombre_alu;
        this.no_cuenta = no_cuenta;
        contAlu ++;
    }

    public String getNameAlu(){
        return nombre_alu;
    }
    public String getNoCuenta(){
        return no_cuenta;
    }
    public void setPromedio(float prom){
        this.prom = prom;
    }
    public float getPromedio(){
        return prom;
    }

    public void Imprimir(){
    
        System.out.println("Nombre: "+ getNameAlu());
        System.out.println("Cuenta: "+ getNoCuenta());
    
    }
    
}
