import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Aumentemos el level de los arreglos
        * Trabaja con arreglos para almacenar mas datos de los 5 pokemons
        * */
        // TODO crea arreglos para 3 pokemons:
        // buffer es el lector de palabras que ingresas por la terminal
        Scanner buffer = new Scanner(System.in);

//        System.out.println(name);

        // TODO(1) un arreglo de nombres para los 3 pokemons (arreglo de STRINGs)
            String nombres[]=new String[3];
        // TODO(2) un arreglo de tipos para los 3 pokemons (arreglo de STRINGs)
            String tipos[]=new String[3];
        // TODO(3) una matriz 3x2 para la salud y para el daño de ataque (arreglo de INTs)
            Integer stats[][]=new Integer[3][2];
        // TODO(4) recoge datos de 3 pokemons y almacenalos en los arreglos correspondientes
        for (int i=0; i<3; i++){
            System.out.println("Inscriba un pokemon: ");
            nombres[i] = buffer.nextLine();
            if (i>0) nombres[i] = buffer.nextLine(); //Por algun motivo tengo que poner esto sino no hace el scan la segunda y tercera vez
            System.out.println("Especifique su tipo: ");
            tipos[i]= buffer.nextLine();
            for (int j=0; j<2; j++) {
                if (j==0) System.out.println("Salud: ");
                else if(j==1) System.out.println("Daño: ");
                stats[i][j] = buffer.nextInt();
            }
        }

        // TODO(5) muestra a cada pokemon con sus datos

            System.out.println("Estos son tus pókemones: ");
            for (int i=0; i<3; i++){
                System.out.print((i+1)+") "+nombres[i]+"   Tipo: "+tipos[i]);

                for (int j=0; j<2; j++) {
                    if (j==0) System.out.print("  Salud: "+stats[i][j]);
                    else if(j==1) System.out.println("  Daño: "+stats[i][j]);
                }
            }

    }
}
