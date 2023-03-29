    import java.util.Scanner;

    public class HolaMundo {
        public static void main(String args[]) {
            System.out.println("Proporciona el nombre");
            Scanner consola = new Scanner(System.in);
            var nombre= consola.nextLine();

            System.out.println("Proporciona el id");
            var id= Integer.parseInt(consola.nextLine());
            System.out.println(nombre + id);


            System.out.println("Proporciona el precio");
            var precio= Integer.parseInt(consola.nextLine());
            System.out.println("$" + " "+ precio);

            System.out.println("Proporciona el envio gratuito:");
            boolean envioGratuito= precio >= 3000;
            if (envioGratuito){
                System.out.println("el envio es gratuito");
            }
            else {
                System.out.println("no es gratuito");
            }
        }
    }

