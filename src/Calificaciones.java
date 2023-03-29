import java.util.Scanner;

public class Calificaciones {
    public static void main(String args){
        System.out.println("Ingrese un valor entre 0 y 10");
        Scanner consola= new Scanner(System.in);

        var calificacion=Integer.parseInt(consola.nextLine());
        var valor="Valor desconocido";

        if(calificacion==9 || calificacion== 10){
            valor="A";
        }
        else if (calificacion==8 || calificacion <9){
        valor="B";
    }
        else if (calificacion==7 || calificacion <8){
        valor="C";
        }
        else if (calificacion==6 || calificacion <7){
            valor="D";
        }
        else if (calificacion==0 || calificacion <6){
            valor="F";
        }
    }
}
