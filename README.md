# Stream API - Exemplos de Interfaces Funcionais

Este projeto contém exemplos práticos de interfaces funcionais do Java 8+, demonstrando como utilizar as principais interfaces funcionais em conjunto com a Stream API.

## Estrutura do Projeto

```bash
src/
├── functional_interface/
│   ├── examples/           # Exemplos de interfaces funcionais
│   ├── optional/          # (vazio - para futuras implementações)
│   └── stream/            # (vazio - para futuras implementações)
└── README.md
```

## Interfaces Funcionais Implementadas

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

## Como Executar

Para executar qualquer exemplo, compile e execute o arquivo Java correspondente:

```bash
# Exemplo: Executar o exemplo de BinaryOperator
javac functional_interface/examples/BinaryOperatorExample.java
java functional_interface.examples.BinaryOperatorExample
```

## Conceitos Demonstrados

- **Expressões Lambda:** Sintaxe concisa para implementar interfaces funcionais
- **Method References:** Referências a métodos existentes (ex: `Integer::sum`, `System.out::println`)
- **Stream API:** Operações funcionais em coleções (map, filter, reduce, forEach)
- **Programação Funcional:** Paradigma de programação baseado em funções puras

## Tecnologias Utilizadas

- Java 8+
- Stream API
- Interfaces Funcionais do pacote `java.util.function`

O README foi atualizado com uma documentação completa do projeto, incluindo:

1. **Descrição geral** do projeto e seu propósito
2. **Estrutura de diretórios** com explicação de cada pasta
3. **Documentação detalhada** de cada interface funcional implementada
4. **Instruções de execução** para os exemplos
5. **Conceitos demonstrados** no projeto
6. **Tecnologias utilizadas**

O projeto demonstra o uso prático das principais interfaces funcionais do Java 8+ em conjunto com a Stream API, servindo como um guia de referência para programação funcional em Java.
