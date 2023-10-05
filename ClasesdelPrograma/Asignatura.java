package ClasesdelPrograma;
public class Asignatura {

    // Atributos o miembros
    private String nombreAsig;
    private String carreraAsig;
    private String clave;
    static int contAsig = 0;

    // Constructor
    public Asignatura(String nombreAsig, String carreraAsig, String clave){
        this.nombreAsig = nombreAsig;
        this.carreraAsig = carreraAsig;
        this.clave = clave;
        contAsig ++;
    }
    //Métodos del Objeto
    public String getNameAsig(){
        return nombreAsig;
    }
    public String getCarreraAsig(){
        return carreraAsig;
    }
    public String getClave(){
        return clave;
    }
    public void setCarreraAsig(String carreraAsig){
        this.carreraAsig = carreraAsig;
    }
    public void setClave(String clave){
        this.clave = clave;
    }

    public void ImprimirDatos(){
        System.out.println("---------- Datos Asignatura ---------\n");
        System.out.println("Nombre: "+ getNameAsig());
        System.out.println("Carrera: "+ getCarreraAsig());
        System.out.println("Clave: "+ getClave());      
    }


}
