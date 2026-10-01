# Nome do projeto: 
POO_PROVA_1 :coffee:


# Gerenciamento de Funcionários

O realiza a gestão básica de funcionários, cargos e departamentos e permite alterar dados, aplicar reajustes salariais e gerenciar a demissão de funcionários.

---

## Tecnologias Utilizadas

- **Linguagem:** Java 21
- **IDE:** NetBeans
- **Compilador/Executor:** Java Development Kit (JDK 21)

---

## Como Executar o Projeto via Console

1. **Acessar o diretório do projeto:**
   Navegue até a pasta onde se encontram os arquivos fonte (`.java`):
   ```bash
   cd caminho/para/o/projeto
   ```

2. **Compilar o código fonte:**
   Execute o compilador Java para gerar os arquivos `.class`:
   ```bash
   javac Departamento.java Cargo.java Funcionario.java TesteSistema.java
   ```

3. **Executar o programa:**
   Rode a classe principal que contém o método `main`:
   ```bash
   java TesteSistema
   ```

---

## Descrição das Classes e Responsabilidades

### 1. `Departamento`
Representa o setor/departamento dentro da organização.
- **Atributos:** `nome` (String).
- **Responsabilidade:** Gerenciar o nome do departamento. Possui apenas construtor parametrizado (sem construtor default) e métodos getters/setters.

### 2. `Cargo`
Representa a função ocupada por um colaborador.
- **Atributos:** `nome` (String).
- **Responsabilidade:** Gerenciar a nomenclatura do cargo. Possui apenas construtor parametrizado (sem construtor default) e métodos getters/setters.

### 3. `Funcionario`
Representa o colaborador e guarda seus dados cadastrais e profissionais.
- **Atributos:** `nome`, `cpf`, `departamento` (Departamento), `cargo` (Cargo), `salario` (double), `ativo` (boolean).
- **Responsabilidades:**
  - Instanciação via construtor parametrizado (iniciando `ativo` como `true`) ou construtor default (com valores padrão).
  - `alterarDados(...)`: Permite a atualização simultânea de todos os dados do funcionário.
  - `aplicarReajuste(percentual)`: Calcula e aplica um aumento percentual ao salário atual.
  - `demitir()`: Altera o status do colaborador (`ativo`) para `false`.
  - `toString()`: Retorna os dados formatados para impressão, tratando status (ATIVO/INATIVO) e verificando a existência de departamento ou cargo ("Departamento não Definido" / "Cargo não Definido").

### 4. `TesteSistema`
Classe executável (contém o método `main`).
- **Responsabilidade:** Rodar a bateria de testes exigida, incluindo a criação de objetos, atualizações de dados, aplicação de reajuste salarial, demissão e exibição no console dos resultados de cada etapa.

---

## Informações do Aluno

- **Aluno(a):** Gabriel Martins
- **Turma:** 2º Período
- **Disciplina:** Programação Orientada a Objetos (POO)
- **Professor:** MSc Rodrigo de Lima Cunha