import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio1
        /*int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        System.out.println("El mayor es " + Math.max(n1, Math.max(n2, n3)));
        System.out.println("El menor es " + Math.min(n1, Math.min(n2, n3)));
        if(n1 > n2 && n1 > n3){
            System.out.println("es el mas mayor " + n1);
        }else if(n2 > n1 && n2 > n3) {
            System.out.println("es mas grande " + n2);
        } else {
            System.out.println("Es mas grande " + n3);
        }
        if(n1 < n2 && n1 < n3){
            System.out.println("mas pequeños " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("es mas pequeño " + n2);
        }else {
            System.out.println("es mas pequeños " + n3);
        }*/
        //Ejercicio2
        /*for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Ejercicio 6
        for(int j = 1;j <= 10; j++){
            System.out.println("tabla del " + j);
            System.out.println("**************");
            for(int k = 1;k <= 10; k++){
                System.out.println((j + "x" + k + "=" + j*k));
            }
            System.out.println("...................");

        }
        //Ejerccicio 11
        int sumador = 0;
        int numero = 0;
       while(sumador <= 50){
            if ((numero % 2) == 0) {
                sumador++;
                System.out.println(numero);
            }
            numero++;

        }
        //Ejercicio 12
        int numero = 0;
        while (numero <= 100) {
            if ((numero % 5) != 0) {
                System.out.println(numero);
            }
            numero++;

        }

        for (int i = 1; i <= 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }
                    for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
            }
                    System.out.println();
        }
    }




------------------------------------------------------------------------------------------------------------------
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char letra = (char) ('A' + random.nextInt(26)); // genera de 'A' a 'Z'
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println("La letra " + letra + " Es vocal");
            } else {
                System.out.println("La letra " + letra + " Es consonante");
            }
        }*/


        Scanner mp = new Scanner(System.in);
        System.out.println("pon un tiempo en segundos");
        int timepo = 23423;
        int minutos = 0;
        int horas = 0;
        for (int i = 0; i <= timepo; i++) {
            if(timepo > 60){
                minutos = minutos + 1;
            }

        }
        horas = horas + 1;
        System.out.println("Tiempo: " + minutos + " minutos");



    }
}