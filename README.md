# Projeto ContaBanco

Este projeto em Java cria uma aplicação de terminal para simular a criação de uma conta bancária. O usuário é solicitado a fornecer informações como número da conta, agência, nome do cliente e saldo da conta. Após a coleta desses dados, uma mensagem de confirmação é exibida.

## Funcionalidades

- Solicitar e coletar informações do usuário via terminal:
  - Número da conta
  - Número da agência
  - Nome do cliente
  - Saldo da conta
- Exibir uma mensagem de confirmação com os dados fornecidos.

## Requisitos

- Java Development Kit (JDK) instalado
- Um ambiente de desenvolvimento, como Visual Studio Code, IntelliJ IDEA ou Eclipse

## Como Executar o Projeto

1. **Clone o repositório ou baixe os arquivos:**
    ```sh
    git clone https://github.com/leolsm12/contabanco.git
    ```
    Ou baixe o arquivo zip e extraia em um diretório de sua escolha.

2. **Navegue até o diretório do projeto:**
    ```sh
    cd contabanco
    ```

3. **Compile o código:**
    ```sh
    javac src/ContaTerminal.java
    ```

4. **Execute o código:**
    ```sh
    java -cp src ContaTerminal
    ```

5. **Siga as instruções no terminal para inserir os dados da conta:**
    - Por favor, digite o número da Conta:
    - Por favor, digite o número da Agência:
    - Por favor, digite o seu Nome:
    - Por favor, digite o saldo da Conta:

6. **Veja a mensagem de confirmação exibida no terminal com os dados fornecidos.**

## Exemplo de Uso

```sh
Por favor, digite o número da Conta:
1021
Por favor, digite o número da Agência:
067-8
Por favor, digite o seu Nome:
MARIO ANDRADE
Por favor, digite o saldo da Conta:
237.48
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
