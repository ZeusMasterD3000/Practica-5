import java.util.*;
import ClasesdelPrograma.Alumno;
import ClasesdelPrograma.Profesor;
import ClasesdelPrograma.Asignatura;
import ClasesdelPrograma.Grupo;

public class SistemaInscripcion {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Listas para almacenar datos
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        ArrayList<Profesor> profes = new ArrayList<>();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Grupo> grupos = new ArrayList<>();

        // Variables temporales pra grupo
        Grupo group;
        int numGrupo;

        // Variables temporales para profesor
        Profesor prof;
        String nameP;
        String ing;
        String hora;

        // Variables temporales para alumno
        Alumno alumno;
        String nameAl;
        String noCuenta;
        float promedio;

        // Variables temporales para asignatura
        Asignatura asig;
        String nameA;
        String carAsi;
        String clave;

        // Otras variables
        int opcion = 0;
        int opcionMenu;
        int contProf = 0;
        int contAsig = 0;
        int contGrup = 0;

        System.out.println("\n---------- Sistema de Inscripcion ----------");

        do {

            System.out.println("\n---------- Menu ----------\n");
            System.out.println("1. Crear Grupo");
            System.out.println("2. Crear Profesor");
            System.out.println("3. Crear Alumno");
            System.out.println("4. Crear Asignatura");
            System.out.println("5. Consultar Grupos");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            int op = sc.nextInt();

            switch(op){

                case 1: // Crear grupo

                    if (contProf > 0){

                        if (contAsig > 0){

                            System.out.println("\n--------------- Crear Grupo --------------\n");

                            System.out.println("--------------- Profesores ---------------");
                            for(int j = 0; j < profes.size(); j++){
                                System.out.print("Profesor "+ (j+1) +" : "+ profes.get(j).getNameP());
                            }
                            System.out.print("\nElige un profesor: ");
                            opcionMenu = sc.nextInt();
                            prof = profes.get(opcionMenu - 1);

                            System.out.println("\n--------------- Asignaturas ---------------");
                            for(int j = 0; j < asignaturas.size(); j++){
                                System.out.println("Asignatura "+ (j+1) +" : "+ asignaturas.get(j).getNameAsig());
                            }
                            System.out.print("\nElige una asignatura: ");
                            opcionMenu = sc.nextInt();
                            asig = asignaturas.get(opcionMenu - 1);

                            System.out.println("\n--------------- Creando Grupo ---------------\n");
                            System.out.print("Agregar Numero de Grupo: ");
                            numGrupo = sc.nextInt();
                            group = new Grupo(prof, asig, numGrupo);
                            grupos.add(group);
                            System.out.println("\n... .... ... Grupo Creado Correctamente ... .... ...\n");
                            contGrup ++;

                        }else{
                            System.out.println("... .... ... Falta Agregar la Asignatura ... .... ...");
                        }

                    }else{
                        System.out.println("... .... ... Falta Agregar el Profesor ... .... ...");
                    }
                    break;

                case 2:// Crear Profesor

                    sc.nextLine();
                    System.out.println("\n--------------- Agregar Profesor ---------------");
                    System.out.print("\nNombre: ");
                    nameP = sc.nextLine();
                    System.out.print("\nCarrera: ");
                    ing = sc.nextLine();
                    System.out.print("\nHorario: ");
                    hora = sc.nextLine();
                    prof = new Profesor(nameP, ing, hora);
                    profes.add(prof);
                    contProf ++;

                    break;

                case 3://Crear Alumno

                    if (contGrup > 0){

                        sc.nextLine();
                        System.out.println("\n--------------- Alumno ---------------");
                        System.out.print("\nNombre: ");
                        nameAl = sc.nextLine();
                        System.out.print("\nNumero de Cuenta: ");
                        noCuenta = sc.nextLine();
                        System.out.println("Quiere Agregar el Promedio del alumno?");
                        System.out.println("1. Si\t\t2.No");
                        int temp = sc.nextInt();
                        if (temp == 1){
                            System.out.print("\nPromedio: ");
                            promedio = sc.nextFloat();
                            alumno = new Alumno(nameAl, noCuenta, promedio);
                            alumnos.add(alumno);
                        }else{
                            alumno = new Alumno(nameAl, noCuenta);
                            alumnos.add(alumno);
                        }
                        
                        System.out.println("\n--------------- Grupos ---------------\n");
                        for(int j = 0; j < asignaturas.size(); j++){
                            System.out.println("---------- Opcion "+ (j+1) +" ----------");
                            System.out.println("Grupo: "+ grupos.get(j).getNo_Grupo());
                            System.out.println("Materia: "+ grupos.get(j).getAsignatura().getNameAsig());
                            System.out.println("Profesor: "+ grupos.get(j).getProfesor().getNameP());
                        }
                        System.out.print("Opcion: ");
                        opcionMenu = sc.nextInt();
                        group = grupos.get(opcionMenu - 1);
                        group.setAlumno(alumno);

                    }else{
                        System.out.println("\n... .... ... Falta crear un Grupo ... .... ...\n");
                    }
                    break;

                case 4://Crear Asignatura

                    sc.nextLine();
                    System.out.println("\n--------------- Asignatura ---------------");
                    System.out.print("\nNombre: ");
                    nameA = sc.nextLine();
                    System.out.print("\nCarrera: ");
                    carAsi = sc.nextLine();
                    System.out.print("\nClave: ");
                    clave = sc.nextLine();
                    asig = new Asignatura(nameA, carAsi, clave);
                    asignaturas.add(asig);
                    contAsig ++;

                    break;

                case 5: // Ver Grupos

                    System.out.println("\n--------------- Grupos ---------------");
                    for(int j = 0; j < grupos.size(); j++){
                        System.out.println("Grupo: "+ (j+1));
                        grupos.get(j).Imprimir();
                    }
                    break;

                case 6:

                    sc.close();
                    return;
            }

        } while (opcion != 6);
    }
}
