![Workflow Status](https://github.com/GustavoRT-debug/C214-TEORIA.git/actions/workflows/main.yml/badge.svg)

**README.md**

# Observador

Este projeto Java implementa o padrão de design Observer, usando as classes Observador e Observável para contar estatísticas simples em uma sequência de palavras.

## Estrutura do Projeto

- **src/main/java/br/inatel/cdg/serie/impl/**: Contém as implementações das classes Observador e Observável.
- **src/main/java/br/inatel/cdg/serie/interfaces/**: Contém as interfaces iObservador e iObservável.
- **src/test/java/**: Contém os testes unitários para verificar o comportamento do código.

## Funcionalidades

### Observador

O Observador conta o número total de palavras, o número de palavras com comprimento par e o número de palavras começadas com maiúsculas em uma sequência de palavras.

## Como Usar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Navegue até o diretório do projeto:

```bash
cd seu-repositorio
```

3. Compile e execute o programa principal:

```bash
javac -cp . src/main/java/br/inatel/cdg/serie/impl/Main.java
java -cp . src/main/java/br/inatel/cdg/serie/impl/Main.java
```

4. Execute os testes unitários:

```bash
javac -cp . src/test/java/TesteObserver.java
java -cp . org.junit.runner.JUnitCore TesteObserver
```

## Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        Observavel netflix = new Observavel();

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        netflix.registraObservador(obs1);
        netflix.registraObservador(obs2);
        netflix.registraObservador(obs3);

        String inputSentence = "Voce é a Vergonha da Profissao";

        System.out.println("Frase de entrada: " + inputSentence);

        String[] words = inputSentence.split("\\s+");
        netflix.notificaObservadores(words);
    }
}
```

Este é um exemplo básico de como usar o codigo.

**Testes Unitários**

O projeto inclui testes unitários escritos com o framework JUnit para verificar o comportamento esperado das classes `Observador` e `Observavel`. Aqui está uma explicação dos testes:

1. **`testeContarTodasPalavras`**

   Este teste verifica se o Observador conta corretamente o número total de palavras em uma sequência.

2. **`testeContarPalavrasComCaracteresPares`**

   Neste teste, é validado se o Observador conta corretamente o número de palavras com comprimento par em uma sequência.

3. **`testeContarPalavrasMaiusculas`**

   Este teste garante que o Observador conte corretamente o número de palavras começadas com maiúsculas em uma sequência.

4. **Outras considerações**

   - A cada teste, é criada uma instância de `Observavel` e um `Observador` associado a ela.
   - Uma sequência de palavras específica é notificada aos observadores.
   - As asserções JUnit são utilizadas para verificar se os resultados obtidos pelos observadores correspondem aos resultados esperados.

**Execução dos Testes**

Os testes podem ser executados utilizando o seguinte comando:

```bash
javac -cp . src/test/java/TesteObserver.java
java -cp . org.junit.runner.JUnitCore TesteObserver
```

**Resultados Esperados**

Os resultados esperados são definidos com base na sequência de palavras fornecida durante os testes. Certifique-se de ajustar esses resultados conforme as expectativas do seu projeto.
