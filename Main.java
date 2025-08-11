import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Primer ejercicio : promedio de calificaciones

        Scanner ar = new Scanner(System.in);

        System.out.println("-------Cálculo de promedio de calificaciones del estudiante-------");

        System.out.println("Ingresa tu primera nota: ");
        int primNota = ar.nextInt();
        ar.nextLine();
        System.out.println("Ingresa tu segunda nota: ");
        int segNota = ar.nextInt();
        ar.nextLine();
        System.out.println("Ingresa tu tercera nota: ");
        int terNota = ar.nextInt();
        ar.nextLine();

        double sumNotas = primNota + segNota + terNota ;
        double promedioNotas = sumNotas/3;

        System.out.println("tu promedio de notas es : " + promedioNotas);





        // Segundo ejercicio:  perfil del usuario

        System.out.println("------Perfil del Usuario------");
        System.out.println("Ingresa tu nombre: ");
        String nombre = ar.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad = ar.nextInt();
        ar.nextLine();
        System.out.println("Ingresa tu nacionalidad: ");
        String nacionalidad = ar.nextLine();
        System.out.println("Ingresa tu ocupacion: ");
        String ocupacion = ar.nextLine();
        System.out.println("Ingresa tu salario mensual: ");
        double salarioMensual = ar.nextDouble();
        ar.nextLine();

        System.out.println("---Datos del usuario---");

        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad + "naciste en el año " + (edad-2025));
        System.out.println("nacionalidad: " + nacionalidad);
        System.out.println("ocupacion: " + nombre);
        System.out.println("salario mensual: " + salarioMensual);

        ar.close();

    }
}