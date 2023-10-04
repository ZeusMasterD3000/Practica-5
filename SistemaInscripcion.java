import java.util.*;

public class SistemaInscripcion {
    
    public static void main(String[] args) {
        int opcion = 0;
        int contP = 0;
        int contA = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Grupo> grupos = new ArrayList<Grupo>();
        Grupo group;

        System.out.println("\n---------- Sistema de Inscripcion ----------\n");
        do {
            System.out.println("Elige una opcion: ");
            System.out.println("1. Crear Grupo");
            System.out.println("2. Crear Profesor");
            System.out.println("3. Crear Alumno");
            System.out.println("4. Crear Asignatura");
            System.out.print("Opcion: ");
            int op = sc.nextInt();
            
            switch(op){
                case 1: //Crear grupo
                    
                    break;
                case 2://Crear Profesor

                    break;
                case 3://Crear Alumno

                    break;
                case 4://Crear Asignatura

                    break;


            }
            Profesor prof;
            Asignatura asig;
            
            System.out.println("\n--------------- Crear Grupo --------------");
            System.out.print("\n1. Agregar Profesor\n2. Agregar Asignatura");
            System.out.print("\nOpcion: ");
            int op = sc.nextInt();
            sc.next();

            switch (op) {
                case 1:
                    System.out.println("\n--------------- Profesor ---------------");
                    System.out.print("\nNombre: ");
                    String nameP = sc.nextLine();
                    System.out.print("\nCarrera: ");
                    String ing = sc.nextLine();
                    System.out.print("\nHorario: ");
                    String hora = sc.nextLine();

                    prof = new Profesor(nameP, ing, hora);

                    break;
                case 2:
                    System.out.println("\n--------------- Asignatura ---------------");
                    System.out.print("\nNombre: ");
                    String nameA = sc.nextLine();
                    System.out.print("\nCarrera: ");
                    String carAsi = sc.nextLine();
                    System.out.print("\nClave: ");
                    String clave = sc.nextLine();

                    asig = new Asignatura(nameA, carAsi, clave);

                    break;
                default:
                    System.out.println("\n!!! ERROR !!! Opcion Inválida ..........");
                    break;
            }
            if(contP == 1 && contA == 1){
                Random num = new Random(20);
                num = num.RandomInt()
                group = new Grupo(prof,asig,num);
                System.out.println("\n--------------- Alumnos ---------------");
            }
        } while (opcion != 1);
        
        /*do {
            System.out.println("\n---------- Opciones del Sistema ----------");
            System.out.print("\n1. Crear Grupo\n2. Añadir Profesor");
            System.out.print("\n3. Añadir Asignatura\n4. Añadir Alumno");
            System.out.print("\n5. Cerrar Programa");
            System.out.print("\nOpcion: ");
            opcion = sc.nextInt();
            sc.nextLine()

            switch (opcion){
                case 1:
                    if(contGrupo == 0)
                        System.out.println("\n--------------- Grupo ---------------");
                        contGrupo ++;
                    break;
                case 2:
                    System.out.println("\n--------------- Profesores ---------------");
                    System.out.print("\nNombre: ");
                    String nameP = sc.nextLine();
                    System.out.print("\nCarrera: ");
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    return;
            
                default:
                    System.out.println("\n!!! ERROR !!! Opcion Inválida ..........");
                    break;
            }
        } while (opcion != 5);*/
    }
}
