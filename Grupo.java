public class Grupo {
    
    private Asignatura materia;
    private Profesor profe;
    private Alumno[] alumnos = new Alumno[40];
    private int no_grupo;

    public Grupo(Profesor profe, Asignatura materia, int no_grupo){
        this.profe = profe;
        this.materia = materia;
        this.no_grupo = no_grupo; 
    }
}
