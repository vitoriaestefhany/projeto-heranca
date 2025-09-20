# Projeto Herança - Animais 🐾

## 👥 Integrantes
- Nome Vitória Estéfhany Amorim França  — RA 32325325 
- Nome João Pedro Sotero Santos — RA 323210063 
 
## 📌 Descrição
Este projeto foi desenvolvido como atividade prática de **Programação Orientada a Objetos em Java**.  

O objetivo é aplicar conceitos de:
- **Herança**
- **Sobrescrita de métodos (@Override)**
- **Polimorfismo**
- **Colaboração com GitHub Flow**

## 🏗️ Estrutura da Hierarquia

- **Superclasse**: `Animal`  
  - Atributos: `nome`, `idade`  
  - Métodos: `emitirSom()`, `toString()`  

- **Subclasses**:  
  - `Cachorro`  
    - Atributo adicional: `raça`  
    - Sobrescreve `emitirSom()`  
  - `Gato`  
    - Atributo adicional: `cor`  
    - Sobrescreve `emitirSom()`  

## 📂 Estrutura do Projeto

src/projetoheranca/
├─ Animal.java
├─ Cachorro.java
├─ Gato.java
└─ Main.java

## ▶️ Execução

A classe `Main.java` demonstra:
- Criação de objetos das subclasses (`Cachorro`, `Gato`);
- Armazenamento em uma `List<Animal>`;
- Chamada de métodos sobrescritos de forma polimórfica.

### Saída esperada:

Cachorro{nome='Luke', idade=5, raca='Shih Tzu'}
Luke (Cachorro) está latindo: Au Au!
Gato{nome='Mel', idade=3, cor='Cinza'}
Mel (Gato) está miando: Miau!
