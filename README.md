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
│   └── stream/            # Desafios práticos com Stream API
│       ├── Desafio01.java até Desafio20.java
└── README.md
```

## Interfaces Funcionais - Exemplos Básicos

### 1. BinaryOperator<T>

**Arquivo:** `BinaryOperatorExample.java`

Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.

**Exemplo:** Soma de números inteiros usando `Integer::sum` e `reduce()` com uma lista de números [1, 2, 3, 4, 5].

### 2. Consumer<T>

**Arquivo:** `ConsumerExample.java`

Representa uma operação que aceita um único argumento de entrada e não retorna nenhum resultado.

**Exemplo:** Impressão de números pares usando `forEach()` com uma lista de números de 1 a 10.

### 3. Function<T, R>

**Arquivo:** `FunctionExample.java`

Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.

**Exemplo:** Dobrar todos os números de uma lista usando `map()` e `toList()` com uma lista de números [1, 2, 3, 4, 5].

### 4. Predicate<T>

**Arquivo:** `PredicateExample.java`

Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.

**Exemplo:** Filtrar palavras com mais de 5 caracteres usando `filter()` com uma lista de linguagens de programação.

### 5. Supplier<T>

**Arquivo:** `SupplierExample.java`

Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.

**Exemplo:** Gerar lista de saudações usando `Stream.generate()` e `limit()` para criar 5 saudações personalizadas.

## Desafios de Stream API

A pasta `stream/` contém 20 desafios práticos que demonstram diferentes operações da Stream API:

### Desafios Básicos (1-5)

- **Desafio01:** Ordenação de números usando `sorted()` e `forEach()`
- **Desafio02:** Soma de números pares usando `filter()` e `reduce()` com `Integer::sum`
- **Desafio03:** Verificação de números positivos usando `map()`
- **Desafio04:** Filtro de números pares usando `filter()`
- **Desafio05:** Cálculo de média de números maiores que 5 usando `mapToDouble()` e `average()` com `orElseThrow()`

### Desafios Intermediários (6-15)

- **Desafio06:** Operações com números ímpares
- **Desafio07:** Operações com números pares
- **Desafio08:** Operações com números múltiplos de 3
- **Desafio09:** Operações com números múltiplos de 5
- **Desafio10:** Filtro de números múltiplos de 3 ou 5 usando `filter()` e `toList()`
- **Desafio11:** Soma de quadrados usando `map()` com `Math.pow()` e `reduce()`
- **Desafio12:** Operações com números quadrados perfeitos
- **Desafio13:** Operações com números cúbicos
- **Desafio14:** Operações com números triangulares
- **Desafio15:** Contagem de números negativos usando `filter()` e `count()`

### Desafios Avançados (16-20)

- **Desafio16:** Separação de números pares e ímpares usando `filter()` e `toList()`
- **Desafio17:** Operações com números palíndromos
- **Desafio18:** Operações com números perfeitos
- **Desafio19:** Soma de números múltiplos de 3 ou 5 usando `mapToInt()` e `sum()`
- **Desafio20:** Cálculo de fatoriais usando `map()` com método recursivo e `toList()`

## Conceitos Demonstrados

### Interfaces Funcionais

- **Expressões Lambda:** Sintaxe concisa para implementar interfaces funcionais
- **Method References:** Referências a métodos existentes (ex: `Integer::sum`, `System.out::println`)
- **Programação Funcional:** Paradigma de programação baseado em funções puras

### Stream API

- **Operações Intermediárias:** `filter()`, `map()`, `sorted()`, `distinct()`, `mapToDouble()`, `mapToInt()`
- **Operações Terminais:** `forEach()`, `reduce()`, `collect()`, `count()`, `sum()`, `average()`, `toList()`
- **Operações de Redução:** `reduce()`, `sum()`, `average()`, `count()`
- **Operações de Coleta:** `toList()`, `collect()`
- **Tratamento de Exceções:** `orElseThrow()` para Optional
- **Method References:** `Integer::sum`, `System.out::println`, `Integer::doubleValue`, `Integer::intValue`

## Como Executar

### Exemplos de Interfaces Funcionais

```bash
# Exemplo: Executar o exemplo de BinaryOperator
javac functional_interface/examples/BinaryOperatorExample.java
java functional_interface.examples.BinaryOperatorExample
```

### Desafios do Stream API

```bash
# Exemplo: Executar o Desafio01
javac functional_interface/stream/Desafio01.java
java functional_interface.stream.Desafio01

# Exemplo: Executar o Desafio20 (mais recente)
javac functional_interface/stream/Desafio20.java
java functional_interface.stream.Desafio20
```

## Tecnologias Utilizadas

- **Java 8+**
- **Stream API**
- **Interfaces Funcionais** do pacote `java.util.function`
- **Optional** para tratamento de valores nulos
- **Collections** para manipulação de listas
- **Math** para operações matemáticas (`Math.pow()`)

## Objetivos de Aprendizado

Este projeto visa demonstrar:

1. **Uso prático das interfaces funcionais** do Java 8+
2. **Aplicação da Stream API** em diferentes cenários
3. **Programação funcional** em Java
4. **Operações de transformação e filtragem** de dados
5. **Tratamento de exceções** com Optional
6. **Boas práticas** de código funcional
7. **Recursão** em métodos auxiliares (ex: cálculo de fatorial)
8. **Conversões de tipos** com `mapToDouble()` e `mapToInt()`

## Estrutura de Dados

Todos os desafios utilizam a mesma lista base de números:

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
```

Isso permite comparar diferentes abordagens e resultados entre os desafios.
