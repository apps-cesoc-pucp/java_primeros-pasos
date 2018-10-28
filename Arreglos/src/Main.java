import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Crea una lista de tus pokemons e imprimelos
        // buffer es el lector de palabras que ingresas por la terminal
        Scanner buffer = new Scanner(System.in);
        System.out.println("Inscriba a sus pókemones: ");

        // TODO(1) crea un arreglo de Strings para almacenar 5 pokemons
        String equipo[]=new String[5];
        // TODO(2) coloca el codigo necesario dentro del bucle para ALMACENAR 5 nombres de pokemons
        for (int i=0; i<5; i++){
            String name = buffer.nextLine();
            equipo[i]=name;
        }
        
        // TODO(3) coloca el codigo necesario dentro del bucle para IMPRIMIR los 5 nombres de los pokemons
        System.out.println("Tus pókemones son: ");
        for (int i=0; i<5; i++){
            System.out.println((i+1)+") "+equipo[i]);
        }
    }
}
