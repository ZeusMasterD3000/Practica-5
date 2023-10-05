public class Grupo {
    
    // Atributos o miembros de clase
    private Asignatura materia;
    private Profesor profe;
    private Alumno[] alumnos = new Alumno[5];
    private int no_grupo;
    static int cont = 0;

    // Constructor
    public Grupo(Profesor profe, Asignatura materia, int no_grupo){
        this.profe = profe;
        this.materia = materia;
        this.no_grupo = no_grupo; 
        cont ++;
    }

    // Métodos del objeto
    public Asignatura getAsignatura(){
        return materia;
    }
    public Profesor getProfesor(){
        return profe;
    }
    public Alumno[] getAlumnos(){
        return alumnos;
    }
    // public void setAlumno(Alumno alu){
    //     alumnos.
    // }
    public int getNo_Grupo(){
        return no_grupo;
    }
    public int getCont(){
        return cont;
    }

    public void Imprimir(){
        System.out.println("---------- Datos del Grupo "+ getNo_Grupo() +" ----------\n");
        System.out.println("Materia: "+ getAsignatura().getNameAsig());
        System.out.println("Carrera: "+ getAsignatura().getCarreraAsig());
        System.out.println("Profesor: "+ getProfesor().getNameP());
        System.out.println("Horario: "+ getProfesor().getHorario());
    }
}
