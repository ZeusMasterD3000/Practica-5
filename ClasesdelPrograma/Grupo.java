package ClasesdelPrograma;
import java.util.ArrayList;

public class Grupo {
    
    // Atributos o miembros de clase
    private Asignatura materia;
    private Profesor profe;
    private ArrayList<Alumno> alumnos = new ArrayList<>();
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
    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }
    public void setAlumno(Alumno alu){
        if (alumnos.size() < 6){
            alumnos.add(alu);
        }else{
            System.out.println("\n... .... ... Cupo Lleno ... .... ...\n");
        }
    }
    public int getNo_Grupo(){
        return no_grupo;
    }

    public void Imprimir(){
        System.out.println("\n-------------- Datos del Grupo "+ getNo_Grupo() +" --------------");
        materia.ImprimirDatos();
        profe.ImprimirDatos();
        int i = 1;
        for(Alumno alu : alumnos){
            System.out.println("\n---------- Alumno "+ i +" ----------");
            alu.Imprimir();
            i ++;
        }
    }
}
