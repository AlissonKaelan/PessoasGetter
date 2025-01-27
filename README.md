# PessoasGetter
 Testando Getter com atributos: nome, idade e altura em Java



Claro! Aqui está o texto organizado em um formato que é aceito pelo GitHub, utilizando a sintaxe Markdown. Isso inclui seções, formatação de código e uma estrutura clara para facilitar a leitura.

```markdown
# Código da Classe Main

```java
public class Main {
    public static void main(String[] args) {
        // Criando objeto da classe Pessoas
        Pessoas p = new Pessoas("alisson", 20, (float) 1.70);
        
        // Usando métodos acessores para obter os valores dos atributos
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Altura: " + p.getAltura());
    }
}
```

## Explicação do Código 

### Classe Main
A classe `Main` contém o método `main`, que é o ponto de entrada do programa Java. É onde a execução do programa começa.

### Criação de um Objeto da Classe Pessoas
```java
Pessoas p = new Pessoas("alisson", 20, (float) 1.70);
```
Um novo objeto `p` da classe `Pessoas` é criado. O construtor da classe `Pessoas` é chamado com três argumentos:
- `"alisson"`: o nome da pessoa.
- `20`: a idade da pessoa.
- `(float) 1.70`: a altura da pessoa em metros, convertida para o tipo `float`.

### Uso de Métodos Acessores
```java
System.out.println("Nome: " + p.getNome());
System.out.println("Idade: " + p.getIdade());
System.out.println("Altura: " + p.getAltura());
```
Os métodos acessores (`getNome()`, `getIdade()`, `getAltura()`) são usados para obter os valores dos atributos do objeto `p`. Os valores são então impressos no console.
```

Aqui está uma explicação do código Java da classe `Pessoas` em formato Markdown, que pode ser usada para documentação em um repositório GitHub.

```markdown
# Classe Pessoas

A classe `Pessoas` é um modelo que representa uma pessoa com atributos como nome, idade e altura. Esta classe utiliza o conceito de encapsulamento, onde os atributos são privados e acessados através de métodos públicos.

## Código da Classe

```java
public class Pessoas {
    // Atributos Privados
    private String nome;
    private int idade;
    private float altura;
    
    // Construtor
    public Pessoas(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Método acessor para o atributo nome
    public String getNome() {
        return nome;
    }

    // Método acessor para o atributo idade
    public int getIdade() {
        return idade;
    } 

    // Método acessor para o atributo altura
    public float getAltura() {
        return altura;
    } 
}
```

## Explicação do Código

### Classe Pessoas

- **`private String nome;`**: Armazena o nome da pessoa.
- **`private int idade;`**: Armazena a idade da pessoa.
- **`private float altura;`**: Armazena a altura da pessoa em metros.

Os atributos são declarados como `private`, o que significa que não podem ser acessados diretamente de fora da classe. Isso é uma prática de encapsulamento que protege os dados.

### Construtor

```java
public Pessoas(String nome, int idade, float altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
}
```

O construtor é um método especial que é chamado quando um objeto da classe `Pessoas` é criado. Ele inicializa os atributos do objeto com os valores fornecidos:
- `nome`: o nome da pessoa.
- `idade`: a idade da pessoa.
- `altura`: a altura da pessoa.

### Métodos Acessores (Getters)

Os métodos a seguir permitem acessar os valores dos atributos privados:

- **`getNome()`**: Retorna o nome da pessoa.
  
  ```java
  public String getNome() {
      return nome;
  }
  ```

- **`getIdade()`**: Retorna a idade da pessoa.
  
  ```java
  public int getIdade() {
      return idade;
  }
  ```

- **`getAltura()`**: Retorna a altura da pessoa.
  
  ```java
  public float getAltura() {
      return altura;
  }
  ```



