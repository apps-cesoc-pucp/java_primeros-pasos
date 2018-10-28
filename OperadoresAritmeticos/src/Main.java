
public class Main {

    public static void main(String[] args) {
        /*
        * En este ejercicio, se deberá implementar cómo manejar
        * la salud de un pokemon cuando es atacado
        * */
        int intermedio;
        // datos del primer pokemon
        String pikachu_nombre = "pikachu";
        int pikachu_ataque  = 15;
        int pikachu_vida    = 100;

        // datos del segundo pokemon
        String charmander_nombre = "charmander";
        int charmander_ataque  = 30;
        int charmander_vida    = 80;

        // TODO: SIMULAR BATALLA POKEMON
        // TODO(1) pikachu ataca 3 veces a charmander (usar '*' y '-=')

            charmander_vida-=pikachu_ataque*3;

        // TODO(2) charmander se enoja y realiza ataque definitivo, deja a pikachu con poca vida (usar '%=')

            pikachu_vida%=charmander_ataque;

        // TODO(3) reportar la salud de pikachu y charmander con voz de réferi

            System.out.println("Réferi: Pikachu tiene "+ pikachu_vida +" PS\n" +
                               "Réferi: Charmander tiene "+ charmander_vida +" PS" );
        // TODO(4) pikachu se ha iluminado y ahora sabe realizar ataques psíquicos. Ahora realiza un cambio de vida
        // (pikachu tiene la cantidad de vida de charmander, y charmander, la cantidad de vida de pikachu)
            intermedio=pikachu_vida;
            pikachu_vida=charmander_vida;
            charmander_vida=intermedio;

        // TODO(5) imprimir sorpresa de réferi por habilidad psíquica de pikachu

        System.out.println("Réferi: :O");

        // TODO(6) pikachu ataca a charmander

        charmander_vida-=pikachu_ataque;
        // TODO(7) declarar a ganador con voz de réferi
        if(charmander_vida<=0){
            System.out.println("Réferi: El ganador es " + pikachu_nombre);
        }
        if(pikachu_vida<=0){
            System.out.println("Réferi: El ganador es " + charmander_nombre);
        }
    }
}
