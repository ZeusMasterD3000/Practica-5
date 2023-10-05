package ClasesdelPrograma;
// import java.util.ArrayList;
// import java.util.Random;
public class Alumno {

    private String nombre_alu;
    private String no_cuenta;
    private float prom;
    static int contAlu = 0;

    public Alumno(String nombre_alu, String no_cuenta, float prom){
        this.nombre_alu = nombre_alu;
        this.no_cuenta = no_cuenta;
        this.prom = prom;
        contAlu ++;
    }

    // public static ArrayList<Alumno> generarAlumnos(int numAlumnos){
    //     ArrayList<Alumno> alumnos = new ArrayList<>();
    //     Random random = new Random();
    //     int aleatorio;
    //     String nombres [] = {"Pedro", "Juan", "Edgar", "Paco", "Rodrigo", "Santana", "David", "Brent", "Silvana", "Berenice", "Lalo", "Eduardo", "Arzamendi", "Julio", "Sandra", "Valeria", "Mariana", "Samantha", "Osbaldo", "Aldo", "Issac", "Elizabeth", "Diego", "Antonio", "Luis", "Celeste", "Gustavo", "Leslie", "Yayo", "Mauricio", "Patricio", "Elian", "Serch", "Angel", "Carlo", "Adrian"};
    //     String numerosDeCuenta [] = {"123456789", "1223456789", "112345678", "123345678", "123445678", "123455567", "123456777", "293456238", "238472835", "285738467", "385834582", "847593459", "384856479", "389234729", "374583948", "928364759", "928372618", "082747189", "029482718", "738493234", "832943771", "777111222", "932746156", "823456819", "235343678", "991677233", "782047189"};
    //     float promedio [] = {10f, 9.5f, 9f, 8.5f, 8f, 7.5f, 7f, 6.5f, 6f, 5f};
    //     for(int i = 0; i < numAlumnos; i++){
    //         aleatorio = random.nextInt(promedio.length);
    //         alumnos.add(new Alumno(nombres[i], numerosDeCuenta[i], promedio[aleatorio]));
    //     }
    //     return alumnos;
    // }

    public String getNameAlu(){
        return nombre_alu;
    }
    public String getNoCuenta(){
        return no_cuenta;
    }
    public float getPromedio(){
        return prom;
    }

    public void Imprimir(){
        for(int i = 0; i < contAlu; i++){
            System.out.println("\n---------- Alumno "+ i +" ----------");
            System.out.println("Nombre: "+ getNameAlu());
            System.out.println("Cuenta: "+ getNoCuenta());
        }
    }
    
}
