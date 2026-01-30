/**
 * Clase que realiza analisis estadisico básico de un conjunto de calificaciones.
 * Sus funciones principales incluyen la deteccion de notas maximas repetidas y la evaulacion promedio global.
 * @author Isaac
 *
 */
//Refactorización de nombre a un nombre mas entendible
public class AnalizadorNotas {

    public static void main(String[] args) {

        //Refactorizado por un nombre mas claro
        int[] notas = {5, 7, 3, 7, 2, 9, 7};
        //Refactorizado por un nombre mas claro
        int max = obtenerNotaMaxima(notas);
        //Refactorizado por un nombre mas claro
        int repeticiones = contarRepeticiones(notas, max);
        //Refactorizado por un nombre mas claro
        int notaMax = notas[0];


        if (repeticiones > 1) {
            System.out.println("SI"); // El máximo se repite
        } else {
            System.out.println("NO");
        }

        // 2. Lógica del promedio
        double promedio = calcularPromedio(notas);
        System.out.println(promedio);

        if (promedio >= 5) {
            System.out.println("BIEN");
        } else {
            System.out.println("MAL");
        }

        //Se han sustituido todas las clases por metodos para no saturar el main.
    }
    /**
     * Busca el valor más alto dentro de un array de notas.
     *
     * @param notas Array de enteros con las calificaciones.
     * @return El valor máximo encontrado.
     */
    public static int obtenerNotaMaxima(int[] notas) {
        int maximo = notas[0]; // Asumimos que el array no está vacío
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maximo) {
                maximo = notas[i];
            }
        }
        return maximo;
    }

    /**
     * Cuenta cuántas veces aparece un número específico en el array.
     *
     * @param notas Array de enteros con las calificaciones.
     * @param valorBuscado El número del cual queremos contar sus apariciones.
     * @return La cantidad de veces que aparece el valor.
     */
    public static int contarRepeticiones(int[] notas, int valorBuscado) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == valorBuscado) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Calcula la media aritmética de las notas.
     *
     * @param notas Array de enteros con las calificaciones.
     * @return El promedio calculado como un valor decimal.
     */
    public static double calcularPromedio(int[] notas) {
        int sumaTotal = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaTotal += notas[i];
        }
        // Hacemos cast a (double) para no perder los decimales en la división
        return (double) sumaTotal / notas.length;
    }

}