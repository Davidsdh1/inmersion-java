import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión Java");
        //System.out.println("Película Matrix");

        int fechaLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacionesUsuario = 0;

        System.out.println("Película: " + nombre);
        System.out.println(fechaLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de evaluaciones de Matrix: " + mediaEvaluacion);

        if (fechaLanzamiento >= 2023) {
            System.out.println("Película Popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        for (int i = 0; i <3 ; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionesUsuario = mediaEvaluacionesUsuario + notaMatrix;
        }
        System.out.println("La media de la película " +
                "Matrix calculada por el usuário es: " + mediaEvaluacion / 3);
    }
}