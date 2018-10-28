import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Estructuras para controles de flujo:
        * If-else
        * Switch
        * For
        * Foreach
        * While
        * */
        // datos de charmander
        int vida_charmander = 100;
        // datos de pikachu
        String[] ataques = {"cola de hierro","ataque rapido","impactrueno","agilidad"};
        int fuerza_pikachu = 30;
        // lectura de palabras ingresadas
        Scanner buffer = new Scanner(System.in);


        // TODO(1) implementar un if-else para saber si has mandado a pikachu a atacar
        System.out.println("Pikachu está acorralado por charmander...!!!\n"+
                           "¿Quieres atacarlo? : ");
        String decision = buffer.nextLine();
        // si colocaste "si" como entrada, entonces ataca. Si colocaste "no" como entrada, no ataca.
        // comparar con decision.equals("si"), decision.equals("no")

            if (decision.equals("si")) {
                System.out.println("Estos son tus movimientos: ");
        }
            else if (decision.equals("no")) {
                System.out.println("No???, De acuerdo xd");
                return;
            }
            else return;

        // TODO(2.1) implementar FOR para mostrar ataques que posee del arreglo de ataques

            for (int i=0;i<ataques.length;i++)
                System.out.println((i+1)+") "+ataques[i]+"  ");
        // TODO(2.2) o puedes lucirte e implementar un FOREACH
        // mostrarlo con numero de orden para luego elegir un ataque



        // TODO(3) implementar SWITCH para saber qué ataque debe realizar, claro, si es que ha decidido atacar
        System.out.println("qué ataque eligirás?");
        int ataque = Integer.parseInt(buffer.nextLine());
        switch (ataque){
            case 1: System.out.println("Pikachu a usado "+ataques[0]+"!");
                    break;
            case 2: System.out.println("Pikachu a usado "+ataques[1]+"!");
                break;
            case 3: System.out.println("Pikachu a usado "+ataques[2]+"!");
                break;
            case 4: System.out.println("Pikachu a usado "+ataques[3]+"!");
                break;
        }

        // TODO(4) implementar WHILE para ataques repetitivos de pikachu hasta que no le quede vida a charmander
        while(true){
            vida_charmander-=fuerza_pikachu;
            if (vida_charmander<=0) break;
            System.out.println("Pikachu a usado "+ataques[ataque-1]+"!");

        }

        //Lo imprimo en negativo o lo transformo a 0? xd
        // fin
        System.out.println("\nvida de charmander: " + vida_charmander);
    }
}
