package Ejer.p;

/**
 * Clase que realiza un análisis estadístico básico sobre un array de números.
 * Obtiene el valor máximo, cuenta sus repeticiones y calcula la media.
 * * @author Tu Nombre
 * @version 1.0
 */
public class p {

    /**
     * Método principal que ejecuta la lógica de análisis de números.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        // Se utilizan nombres descriptivos para cumplir con las reglas de refactorización
        int[] numeros = {5, 7, 3, 7, 2, 9, 7};
        int contadorMaximo = 0;
        int hayRepeticion = 0;
        int valorMaximo = numeros[0];

        // Primer bucle: Identificar el número mayor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > valorMaximo) {
                valorMaximo = numeros[i];
            }
        }

        // Segundo bucle: Contar cuántas veces aparece ese máximo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorMaximo) {
                contadorMaximo++;
            }
        }

        // Determinar si el máximo aparece más de una vez
        if (contadorMaximo > 1) {
            hayRepeticion = 1;
        }

        // Salida por consola de la repetición
        if (hayRepeticion == 1) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        // Cálculo de la suma total
        int sumaTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumaTotal += numeros[i];
        }

        // Cálculo y muestra de la media aritmética
        double media = (double) sumaTotal / numeros.length;
        System.out.println(media);

        // Evaluación de la media
        if (media >= 5) {
            System.out.println("BIEN");
        } else {
            System.out.println("MAL");
        }
    }
}