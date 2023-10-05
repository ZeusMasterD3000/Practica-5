package ClasesdelPrograma;
public class Profesor {
    
    private String nombreProf;
    private String carreraProf;
    private String horario;
    static int contProf = 0;

    public Profesor(String nombreProf, String carreraProf, String horario){
        this.nombreProf = nombreProf;
        this.carreraProf = carreraProf;
        this.horario = horario;
        contProf ++;
    }
    
    public String getNameP(){
        return nombreProf;
    }
    public String getCarreraP(){
        return carreraProf;
    }
    public String getHorario(){
        return horario;
    }
    public void setNameP(String nombreProf){
        this.nombreProf = nombreProf;
    }
    public void setCarreraP(String carreraProf){
        this.carreraProf = carreraProf;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }

    public void ImprimirDatos(){
        System.out.println("\n---------- Datos Profesor ---------");
        System.out.println("Nombre: "+ getNameP());
        System.out.println("Carrera: "+ getCarreraP());
        System.out.println("Horario: "+ getHorario());
    }
}
