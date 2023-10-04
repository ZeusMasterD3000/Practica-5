public class Grupo {
    private int no_grupo;
    Profesor profe;
    Asignatura materia;
    private Alumno alum;
    Alumno[] alumnos = new Alumno[40];

    public Grupo(Profesor profe, Asignatura materia, int no_grupo){
        this.profe = profe;
        this.materia = materia;
        this.no_grupo = no_grupo; 
    }
}
