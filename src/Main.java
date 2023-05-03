import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        String[] Animais = {"Tartaruga, Aguia, Leão"};
        for (String i : Animais) {
            System.out.println(i + " são animais fortes");
        }

        Arrays.sort(Animais);
        System.out.println("Agora invertendo a ordem");
        for (String i : Animais) {
            System.out.println(i + " São animais fracos");

        }
    }

}