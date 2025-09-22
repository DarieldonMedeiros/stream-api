# Stream API - Exemplos e Desafios de Interfaces Funcionais

Este projeto contém exemplos práticos de interfaces funcionais do Java 8+ e uma série de desafios para praticar o uso da Stream API, demonstrando como utilizar as principais interfaces funcionais em conjunto com operações de stream.

## Estrutura do Projeto

```bash
src/
├── functional_interface/
│   ├── examples/           # Exemplos básicos de interfaces funcionais
│   │   ├── BinaryOperatorExample.java
│   │   ├── ConsumerExample.java
│   │   ├── FunctionExample.java
│   │   ├── PredicateExample.java
│   │   └── SupplierExample.java
│   ├── optional/          # (vazio - para futuras implementações)
│   └── stream/            # Desafios práticos com Stream API
│       ├── Desafio01.java até Desafio19.java
└── README.md
```

## Interfaces Funcionais - Exemplos Básicos

### 1. BinaryOperator<T>

**Arquivo:** `BinaryOperatorExample.java`

Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.

**Exemplo:** Soma de números inteiros usando `Integer::sum` e `reduce()`.

### 2. Consumer<T>

**Arquivo:** `ConsumerExample.java`

Representa uma operação que aceita um único argumento de entrada e não retorna nenhum resultado.

**Exemplo:** Impressão de números pares usando `forEach()`.

### 3. Function<T, R>

**Arquivo:** `FunctionExample.java`

Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.

**Exemplo:** Dobrar todos os números de uma lista usando `map()`.

### 4. Predicate<T>

**Arquivo:** `PredicateExample.java`

Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.

**Exemplo:** Filtrar palavras com mais de 5 caracteres usando `filter()`.

### 5. Supplier<T>

**Arquivo:** `SupplierExample.java`

Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.

**Exemplo:** Gerar lista de saudações usando `Stream.generate()`.

## Desafios de Stream API

A pasta `stream/` contém 19 desafios práticos que demonstram diferentes operações da Stream API:

### Desafios Básicos (1-5)

- **Desafio01:** Ordenação de números usando `sorted()`
- **Desafio02:** Soma de números pares usando `filter()` e `reduce()`
- **Desafio03:** Verificação de números positivos usando `map()`
- **Desafio04:** Filtro de números pares usando `filter()`
- **Desafio05:** Cálculo de média de números maiores que 5 usando `average()`

### Desafios Intermediários (6-15)

- **Desafio06:** Operações com números ímpares
- **Desafio07:** Operações com números pares
- **Desafio08:** Operações com números múltiplos de 3
- **Desafio09:** Operações com números múltiplos de 5
- **Desafio10:** Filtro de números múltiplos de 3 ou 5
- **Desafio11:** Operações com números primos
- **Desafio12:** Operações com números quadrados perfeitos
- **Desafio13:** Operações com números cúbicos
- **Desafio14:** Operações com números triangulares
- **Desafio15:** Contagem de números negativos usando `count()`

### Desafios Avançados (16-19)

- **Desafio16:** Operações com números de Fibonacci
- **Desafio17:** Operações com números palíndromos
- **Desafio18:** Operações com números perfeitos
- **Desafio19:** Soma de números múltiplos de 3 ou 5 usando `sum()`

## Conceitos Demonstrados

### Interfaces Funcionais

- **Expressões Lambda:** Sintaxe concisa para implementar interfaces funcionais
- **Method References:** Referências a métodos existentes (ex: `Integer::sum`, `System.out::println`)
- **Programação Funcional:** Paradigma de programação baseado em funções puras

### Stream API

- **Operações Intermediárias:** `filter()`, `map()`, `sorted()`, `distinct()`
- **Operações Terminais:** `forEach()`, `reduce()`, `collect()`, `count()`, `sum()`, `average()`
- **Operações de Redução:** `reduce()`, `sum()`, `average()`, `count()`
- **Operações de Coleta:** `toList()`, `collect()`
- **Tratamento de Exceções:** `orElseThrow()` para Optional

## Como Executar

### Exemplos de Interfaces Funcionais

```bash
# Exemplo: Executar o exemplo de BinaryOperator
javac functional_interface/examples/BinaryOperatorExample.java
java functional_interface.examples.BinaryOperatorExample
```

### Desafios de Stream API

```bash
# Exemplo: Executar o Desafio01
javac functional_interface/stream/Desafio01.java
java functional_interface.stream.Desafio01
```

## Tecnologias Utilizadas

- **Java 8+**
- **Stream API**
- **Interfaces Funcionais** do pacote `java.util.function`
- **Optional** para tratamento de valores nulos
- **Collections** para manipulação de listas

## Objetivos de Aprendizado

Este projeto visa demonstrar:

1. **Uso prático das interfaces funcionais** do Java 8+
2. **Aplicação da Stream API** em diferentes cenários
3. **Programação funcional** em Java
4. **Operações de transformação e filtragem** de dados
5. **Tratamento de exceções** com Optional
6. **Boas práticas** de código funcional

## Estrutura de Dados

Todos os desafios utilizam a mesma lista base de números:

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
```

Isso permite comparar diferentes abordagens e resultados entre os desafios.
