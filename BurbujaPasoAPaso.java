public class BurbujaPasoAPaso {

    public static void burbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Paso " + (i + 1) + ":");
            for (int j = 0; j < n - 1 - i; j++) {
                // Mostrar comparación actual
                System.out.println("Comparando " + arreglo[j] + " y " + arreglo[j + 1]);
                
                // Si el elemento actual es mayor que el siguiente, se intercambian
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    System.out.println("Intercambio: " + arreglo[j] + " y " + arreglo[j + 1]);
                }
            }
            // Mostrar el arreglo después de cada paso
            imprimirArreglo(arreglo);
            System.out.println();
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arreglo = {21, 40, 4, 9, 10, 35};
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);
        System.out.println();

        burbuja(arreglo);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }
}
