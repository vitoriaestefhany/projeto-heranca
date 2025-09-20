/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_heranca;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    @Override
    public String emitirSom() {
        return getNome() + " (Gato) esta miando: Miau!";
    }

    @Override
    public String toString() {
        return "Gato{nome='" + getNome() + "', idade=" + getIdade() + ", cor='" + cor + "'}";
    }
}

