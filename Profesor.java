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
    public int Contador(){
        return contProf;
    }
}
