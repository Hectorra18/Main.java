import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Estudiante[] estudiantes = new Estudiante[5];

        estudiantes[0] = new Estudiante("Álvaro",20,178);
        estudiantes[1]= new Estudiante("María",19,167);
        estudiantes[2]= new Estudiante("Mireia",23,167);
        estudiantes[3]=new Estudiante("Manuel",21,183);
        estudiantes[4]=new Estudiante("Cristina",16,163);

        System.out.println("Estudiantes sin ordenar:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println((i + 1) + ". " + estudiantes[i]);
        }
        Arrays.sort(estudiantes);

        System.out.println("");
        System.out.println("Estudiantes ordenados:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println((i + 1) + ". " + estudiantes[i]);
        }
        }
    }

