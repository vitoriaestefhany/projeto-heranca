/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_heranca;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    @Override
    public String emitirSom() {
        return getNome() + " (Cachorro) esta latindo: Au Au!";
    }

    @Override
    public String toString() {
        return "Cachorro{nome='" + getNome() + "', idade=" + getIdade() + ", raca='" + raca + "'}";
    }
}

