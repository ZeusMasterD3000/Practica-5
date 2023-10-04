public class Asignatura {
    private String nombreAsig;
    private String carreraAsig;
    private String clave;
    static int contAsig = 0;

    public Asignatura(String nombreAsig, String carreraAsig, String clave){
        this.nombreAsig = nombreAsig;
        this.carreraAsig = carreraAsig;
        this.clave = clave;
        contAsig ++;
    }
    public int Contador(){
        return contAsig;
    }
}
