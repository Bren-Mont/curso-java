import java.util.Scanner;

public class Menu {
    public static void main(String args[]) {
        System.out.println("Indica el mes de la estacion en el que estamos:");
        Scanner consola= new Scanner(System.in);

        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        switch (mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion= "primavera";
                break;
            case 6: case 7: case 8:
                estacion= "Verano";
                break;
            case 9: case 11: case 10:
                estacion="otonio";
                break;

        }
        System.out.println("Es la estacion de"+ " " + estacion);
    }
}
