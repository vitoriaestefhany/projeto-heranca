/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto_heranca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Luke", 5, "Shih Tzu");
        Animal gato = new Gato("Mel", 3, "Cinza");

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        for (Animal a : animais) {
            System.out.println(a);
            System.out.println(a.emitirSom());
            System.out.println("----");
        }
    }
}


