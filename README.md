# 🏗️ Programação Orientada a Objetos (POO) em Java

Repositório dedicado ao aprendizado dos conceitos fundamentais da **Programação Orientada a Objetos** em Java, explorando classes, objetos, métodos e encapsulamento.

## 🎯 Objetivo

Este projeto demonstra a aplicação prática dos conceitos de POO através de exemplos do mundo real, incluindo sistemas bancários, educacionais, comerciais e financeiros.

## 📂 Estrutura do Projeto

```
src/
├── Main.java               # Classe principal com exemplos
├── Model/
│   └── Aluno.java         # Classe Aluno em pacote separado
├── ContaBancaria.java     # Sistema bancário
├── Estudantes.java        # Sistema educacional
├── Produto.java           # Sistema de estoque
└── Tesouro.java           # Sistema de investimentos
```

## 🧱 Classes Desenvolvidas

### 1. **Produto** - Sistema de Estoque
```java
public class Produto {
    public String name;
    public double price;
    public int quantity;
}
```
**Funcionalidades**:
- Adicionar produtos ao estoque (`addStock()`)
- Vender produtos com validação (`sellProduct()`)
- Controle de estoque insuficiente

### 2. **Estudantes** - Sistema Educacional
```java
public class Estudantes {
    public String name;
    public double grade1;
    public double grade2;
}
```
**Funcionalidades**:
- Cálculo automático de média (`calculateAverage()`)
- Gestão de notas de estudantes

### 3. **Tesouro** - Sistema de Investimentos
```java
public class Tesouro {
    public String name;
    public double balance;
    public double rate;
    public int term;
}
```
**Funcionalidades**:
- Compra de títulos com diferentes prazos (`buyBond()`)
- Simulação de juros compostos (`simulateInterest()`)
- Taxas progressivas baseadas no prazo

### 4. **ContaBancaria** - Sistema Bancário
```java
public class ContaBancaria {
    public String nome;
    public double balance;
    public double interestRate;
}
```
**Funcionalidades**:
- Depósitos (`deposit()`)
- Saques com validação (`withdraw()`)
- Controle de saldo insuficiente

### 5. **Aluno** - Sistema Acadêmico (Pacote Model)
```java
package Model;
public class Aluno {
    public String nome;
    public double altura;
    public int anoMatricula;
}
```
**Funcionalidades**:
- Método de estudo (`estudar()`)
- Organização em pacotes

## 🎓 Conceitos de POO Aplicados

### **Classes e Objetos**
- **Classe**: Modelo/template que define propriedades e comportamentos
- **Objeto**: Instância específica de uma classe
- **Exemplo**: `Produto produtos = new Produto();`

### **Atributos (Propriedades)**
- Variáveis que armazenam o estado do objeto
- **Exemplos**: `name`, `balance`, `quantity`, `grade1`

### **Métodos (Comportamentos)**
- Funções que definem o que o objeto pode fazer
- **Exemplos**: `deposit()`, `calculateAverage()`, `sellProduct()`

### **Encapsulamento (Básico)**
- Agrupamento de dados e métodos relacionados
- Controle de acesso através de validações

### **Organização em Pacotes**
- Separação lógica de classes (`package Model;`)
- Importação entre pacotes (`import Model.Aluno;`)

## 🚀 Exemplos de Uso

### Sistema de Produtos
```java
Produto produtos = new Produto();
produtos.name = "Placa mãe";
produtos.quantity = 37;
produtos.price = 780.99;

produtos.addStock(10);        // Adiciona 10 unidades
produtos.sellProduct(37);     // Vende 37 unidades
produtos.sellProduct(57);     // Tentativa com estoque insuficiente
```

### Sistema de Estudantes
```java
Estudantes estudante = new Estudantes();
estudante.name = "Vinicius";
estudante.grade1 = 8.0;
estudante.grade2 = 10.0;

double media = estudante.calculateAverage(); // Retorna 9.0
```

### Sistema de Investimentos
```java
Tesouro bond = new Tesouro();
bond.name = "Tesouro Selic";
bond.balance = 1000.00;

bond.buyBond(24);           // Título de 24 meses (taxa 1.0%)
bond.simulateInterest();    // Simula juros mês a mês
```

## 📊 Funcionalidades Implementadas

### **Validações de Negócio**
- ✅ Controle de estoque insuficiente
- ✅ Validação de saldo bancário
- ✅ Verificação de prazos de investimento

### **Cálculos Automáticos**
- ✅ Média aritmética de notas
- ✅ Juros compostos mensais
- ✅ Atualização automática de saldos

### **Simulações Realistas**
- ✅ Sistema bancário completo
- ✅ Gestão de estoque comercial
- ✅ Simulador de investimentos
- ✅ Sistema educacional

## 🛠️ Como Executar

1. **Compile as classes**:
   ```bash
   javac *.java Model/*.java
   ```

2. **Execute a aplicação**:
   ```bash
   java Main
   ```

3. **Saída esperada**:
   ```
   10 unidades vendidas. Estoque restante: 47
   Estoque insuficiente! Estoque atual: 10
   
   Vinicius tem média: 9.0
   Victor tem média: 9.25
   
   Saldo: $1001.0 | Meses Restantes: 23
   [... simulação de 24 meses ...]
   Título vencido!
   
   Pedro tem 1.75m de altura.
   Carla está revisando conteúdos desde 2022.
   ```

## 💡 Aprendizados Principais

### **Modelagem de Dados**
- Como representar entidades do mundo real em classes
- Definição de atributos relevantes para cada contexto
- Organização lógica de informações

### **Implementação de Comportamentos**
- Métodos que simulam ações reais
- Validações de regras de negócio
- Cálculos matemáticos e financeiros

### **Reutilização de Código**
- Criação de múltiplos objetos da mesma classe
- Aplicação dos mesmos métodos em contextos diferentes
- Organização modular do código

### **Boas Práticas Iniciais**
- Nomenclatura clara e descritiva
- Separação de responsabilidades
- Validação de entrada de dados


## 🎯 Conceitos Consolidados

Este projeto solidifica o entendimento de:
- **Paradigma Orientado a Objetos** vs Programação Procedural
- **Abstração** de problemas reais em código
- **Modularização** e organização de software
- **Reutilização** e manutenibilidade do código
