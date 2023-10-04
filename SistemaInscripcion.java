import java.util.*;

public class SistemaInscripcion {
    
    public static void main(String[] args) {
        int opcion = 0;
        int contP = 0;
        int contA = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        ArrayList<Profesor> profes = new ArrayList<>();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Grupo> grupos = new ArrayList<>();
        Grupo group;

        //Variables temporales para profesor
        Profesor prof;
        Profesor profeSeleccionado;
        String nameP;
        String ing;
        String hora;

        //Variables temporales para alumno
        Alumno alumno;
        String nameAl;
        String noCuenta;
        float promedio;

        //Variables temporales para asignatura
        Asignatura asig;
        Asignatura asigSeleccionada;
        String nameA;
        String carAsi;
        String clave;

        //Otras variables
        int opcionMenu;




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
                    System.out.println("\n--------------- Crear Grupo --------------");
                    System.out.print("\nPara crear un grupo es necesario un profesor y una asignatura");
                    System.out.print("\nDesea agregar un nuevo profesor(1) o asignar uno ya existente (2)");
                    op = sc.nextInt();
                    sc.next();
                    switch (op) {
                        case 1:
                            System.out.println("\n--------------- Profesor ---------------");
                            System.out.print("\nNombre: ");
                            nameP = sc.nextLine();
                            System.out.print("\nCarrera: ");
                            ing = sc.nextLine();
                            System.out.print("\nHorario: ");
                            hora = sc.nextLine();
                            prof = new Profesor(nameP, ing, hora);
                            profes.add(prof);
                            break;
                        case 2:
                            System.out.println("\n--------------- Profesores ---------------");
                            for(int j= 0; j<profes.size(); j++){
                                System.out.println("Profesor numero " + j);
                                profes.get(j).ImprimirDatos();
                            }
                            System.out.print("\nElige un profesor: ");
                            opcionMenu = sc.nextInt() -1;
                            profeSeleccionado = profes.get(opcionMenu);
                            break;
                        default:
                            System.out.println("\n!!! ERROR !!! Opcion Inválida ..........");
                            break;
                    }
                    System.out.println("Profesor asignado con exito");
                    // System.out.print("\nAgrega al profesor:");
                    // System.out.println("\n--------------- Profesor ---------------");
                    // System.out.print("\nNombre: ");
                    // nameP = sc.nextLine();
                    // System.out.print("\nCarrera: ");
                    // ing = sc.nextLine();
                    // System.out.print("\nHorario: ");
                    // hora = sc.nextLine();
                    // prof = new Profesor(nameP, ing, hora);
                    System.out.print("\nAgrega la asignatura:");
                    System.out.println("\n--------------- Asignatura ---------------");
                    System.out.print("\nDesea agregar una nueva asignatura (1) o asignar una ya existente (2)");
                    op = sc.nextInt();
                    sc.next();
                    switch (op) {
                        case 1:
                            System.out.println("\n--------------- Asignatura ---------------");
                            System.out.print("\nNombre: ");
                            nameA = sc.nextLine();
                            System.out.print("\nCarrera: ");
                            carAsi = sc.nextLine();
                            System.out.print("\nClave: ");
                            clave = sc.nextLine();
                            asig = new Asignatura(nameA, carAsi, clave);
                            asignaturas.add(asig);
                            break;
                        case 2:
                            System.out.println("\n--------------- Asignaturas ---------------");
                            for(int j= 0; j<asignaturas.size(); j++){
                                System.out.println("Asignatura numero " + j);
                                asignaturas.get(j).ImprimirDatos();
                            }
                            System.out.print("\nElige una asignatura: ");
                            opcionMenu = sc.nextInt() -1;
                            asigSeleccionada = asignaturas.get(opcionMenu);
                            break;
                        default:
                            System.out.println("\n!!! ERROR !!! Opcion Inválida ..........");
                            break;
                    }
                    System.out.println("Asignatura asignada con exito");
                    // System.out.print("\nNombre: ");
                    // nameA = sc.nextLine();
                    // System.out.print("\nCarrera: ");
                    // carAsi = sc.nextLine();
                    // System.out.print("\nClave: ");
                    // clave = sc.nextLine();
                    // asig = new Asignatura(nameA, carAsi, clave);
                    System.out.print("\nAgrega el numero del grupo:");
                    System.out.println("\n--------------- No. Grupo ---------------");
                    int noGrupo = sc.nextInt();
                    grupos.add(new Grupo(profeSeleccionado, asigSeleccionada, noGrupo));
                    // System.out.print("\n1. Agregar Profesor\n2. Agregar Asignatura");
                    // System.out.print("\nOpcion: ");
                    // op = sc.nextInt();
                    // sc.next();
                    // switch (op) {
                    //     case 1:
                    //         System.out.println("\n--------------- Profesor ---------------");
                    //         System.out.print("\nNombre: ");
                    //         String nameP = sc.nextLine();
                    //         System.out.print("\nCarrera: ");
                    //         String ing = sc.nextLine();
                    //         System.out.print("\nHorario: ");
                    //         String hora = sc.nextLine();
                    //         prof = new Profesor(nameP, ing, hora);
                    //         break;
                    //     case 2:
                    //         System.out.println("\n--------------- Asignatura ---------------");
                    //         System.out.print("\nNombre: ");
                    //         String nameA = sc.nextLine();
                    //         System.out.print("\nCarrera: ");
                    //         String carAsi = sc.nextLine();
                    //         System.out.print("\nClave: ");
                    //         String clave = sc.nextLine();

                    //         asig = new Asignatura(nameA, carAsi, clave);

                    //         break;
                    //     default:
                    //         System.out.println("\n!!! ERROR !!! Opcion Inválida ..........");
                    //         break;
                    // }
                    break;
                case 2://Crear Profesor
                    System.out.println("\n--------------- Profesor ---------------");
                    System.out.print("\nNombre: ");
                    nameP = sc.nextLine();
                    System.out.print("\nCarrera: ");
                    ing = sc.nextLine();
                    System.out.print("\nHorario: ");
                    hora = sc.nextLine();
                    prof = new Profesor(nameP, ing, hora);
                    profes.add(prof);
                    break;
                case 3://Crear Alumno
                    System.out.println("\n--------------- Alumno ---------------");
                    System.out.print("\nNombre: ");
                    nameAl = sc.nextLine();
                    System.out.print("\nNumero de Cuenta: ");
                    noCuenta = sc.nextLine();
                    System.out.print("\nPromedio: ");
                    promedio = sc.nextFloat();
                    alumno = new Alumno(nameAl, noCuenta, promedio);
                    alumnos.add(alumno);
                    break;
                case 4://Crear Asignatura
                    System.out.println("\n--------------- Asignatura ---------------");
                    System.out.print("\nNombre: ");
                    nameA = sc.nextLine();
                    System.out.print("\nCarrera: ");
                    carAsi = sc.nextLine();
                    System.out.print("\nClave: ");
                    clave = sc.nextLine();
                    asig = new Asignatura(nameA, carAsi, clave);
                    asignaturas.add(asig);
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
