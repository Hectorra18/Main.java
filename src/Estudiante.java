public class Estudiante implements Comparable <Estudiante>{

public String nombre;
public int edad;
public int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public int compareTo(Estudiante unEstudiante){

    if (this.altura != unEstudiante.altura){
        return unEstudiante.altura - this.altura;
    }else{
        return this.edad - unEstudiante.edad;
    }
}


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
