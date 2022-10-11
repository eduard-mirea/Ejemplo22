import java.util.Scanner;
public class Ejemplo22 {
    public static void main(String[] args) {

        int numeros;
        int positivos = 0;
        int cuantos = 0;

        Scanner inputValue = new Scanner(System.in);


        do {
            System.out.println("Introduce numeros enteros(cuanto termines pulsa 0): ");
            numeros = inputValue.nextInt();
            if (numeros != 0){
                if (numeros >= 0){
                    positivos++;
                }
                cuantos++;}

        }while (numeros !=0);
        inputValue.close();

        System.out.println("Has sacado: " + (cuantos - positivos) + " negativos" );
        System.out.println("Has sacado: " + (positivos) + " positivos" );
    }
}