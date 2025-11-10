Este é um projeto simples em Java criado para demonstrar conceitos fundamentais da **Programação Orientada a Objetos (POO)**.

O projeto simula o cadastro de diferentes tipos de veículos (`Carro` e `Moto`), que herdam de uma classe abstrata comum (`Veiculo`). A classe `Main` é usada para criar instâncias desses veículos e demonstrar o polimorfismo.

---

### 🏛️ Estrutura dos Arquivos

| Arquivo | Propósito | Conceitos Demonstrados |
| :--- | :--- | :--- |
| **`Veiculo.java`** | **Classe Mãe (Abstrata)**. Define o "molde" de um veículo. | <ul><li>**Abstração** (classe `abstract`)</li><li>**Herança** (Superclasse)</li><li>**Encapsulamento** (atributos `private` com `get/set`)</li></ul> |
| **`Carro.java`** | **Classe Filha (Concreta)**. Herda de `Veiculo` e adiciona um atributo específico (`numeroPortas`). | <ul><li>**Herança** (Subclasse)</li><li>**Polimorfismo** (Sobrescreve `@Override` o método `informacoesVeiculo()`)</li></ul> |
| **`Moto.java`** | **Classe Filha (Concreta)**. Herda de `Veiculo` e adiciona um atributo específico (`cilindrada`). | <ul><li>**Herança** (Subclasse)</li><li>**Polimorfismo** (Sobrescreve `@Override` o método `informacoesVeiculo()`)</li></ul> |
| **`Main.java`** | **Ponto de Entrada**. Classe que executa o programa. | <ul><li>**Instanciação de Objetos** (cria `new Carro()` e `new Moto()`)</li><li>**Polimorfismo** (Chama o mesmo método `informacoesVeiculo()` em objetos diferentes)</li></ul> |

---

### 🚀 Conceitos-Chave

1.  **Herança:** As classes `Carro` e `Moto` "herdam" os atributos e métodos públicos da classe `Veiculo`. Isso evita a repetição de código.
2.  **Abstração:** A classe `Veiculo` não pode ser instanciada diretamente (você não pode criar um "veículo genérico"). Ela apenas serve como um modelo para suas classes filhas.
3.  **Polimorfismo:** Os objetos `meuCarro` e `minhaMoto` chamam o *mesmo* método (`informacoesVeiculo()`), mas o Java executa a versão correta para cada classe, resultando em saídas diferentes e personalizadas.

---

### ⚙️ Como Executar

1.  Compile todos os arquivos `.java`:
    ```bash
    javac Veiculo.java Carro.java Moto.java Main.java
    ```
2.  Execute a classe `Main`:
    ```bash
    java Main
    ```

---

### 📋 Saída Esperada

Informações do Carro: Marca: Toyota, Modelo: Corolla, Ano: 2022, Número de Portas: 4 Informações da Moto: Marca: Honda, Modelo: CBR 600, Ano: 2023, Cilindrada: 600
