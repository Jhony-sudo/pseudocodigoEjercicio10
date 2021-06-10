import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int NumMult = 0;
        int NumDecena = 0;
        System.out.println("Ingrese numeros para sumarlos");
        do {
            int num = leer.nextInt();
            suma += num;
            if (num % 6 == 0) {
                NumMult++;
            }
            if (num >= 1 && num <= 10) {
                NumDecena += num;
            }
        } while (suma <= 1000);

        System.out.println("Hay un total de " + NumMult + " numeros multiplos de 6");
        System.out.println("La suma de los numeros en el rango de 1 a 10 es de " + NumDecena);

    }
}
