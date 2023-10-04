import java.util.Scanner;

public class Grupo {
    
    // Atributos o miembros de clase
    private Asignatura materia;
    private Profesor profe;
    private Alumno[] alumnos = new Alumno[5];
    private int no_grupo;
    private int cont;

    // Constructor
    public Grupo(Profesor profe, Asignatura materia, int no_grupo){
        this.profe = profe;
        this.materia = materia;
        this.no_grupo = no_grupo; 
        cont = 0;
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
    public int getNo_Grupo(){
        return no_grupo;
    }

    public void asignarAlumnos(){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("---------- Agregar Alumno ----------\n");
        System.out.print("Nombre: ");
        String name = sc.nextLine();
        System.out.println("No.Cuenta: ");
        String no_c = sc.nextLine();
        System.out.println("Promedio: ");
        float promedio = sc.nextFloat();
        Alumno alu = new Alumno(name, no_c, promedio);
        alumnos[cont] = alu;
        cont ++;
        sc.close();
    }

    public void Imprimir(){
        System.out.println("---------- Datos del Grupo "+ getNo_Grupo() +" ----------\n");
        System.out.println("Materia: "+ getAsignatura().getNameAsig());
        System.out.println("Carrera: "+ getAsignatura().getCarreraAsig());
        System.out.println("Profesor: "+ getProfesor().getNameP());
        System.out.println("Horario: "+ getProfesor().getHorario());
    }
}
