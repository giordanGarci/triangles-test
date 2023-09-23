

# Tipos de Triângulo

Este é um projeto simples que permite aos usuários determinar o tipo de triângulo (equilátero, isósceles ou escaleno) com base nos comprimentos dos lados fornecidos. O projeto utiliza o padrão de design Strategy para implementar diferentes estratégias para cada tipo de triângulo.

## Funcionalidades

- Permite ao usuário inserir os comprimentos dos lados de um triângulo.
- Determina se o triângulo é equilátero, isósceles ou escaleno.
- Verifica se os comprimentos dos lados são válidos para formar um triângulo.
- Identifica triângulos degenerados, aqueles que tem área zero e parece uma única linha.

## Pré-requisitos

- Java 8 ou superior instalado no sistema.
- Um ambiente de desenvolvimento Java, como o Eclipse ou o IntelliJ IDEA.

## Como rodar o projeto

1. Clone o repositório para o seu sistema local usando o seguinte comando:

   ```shell
   git clone https://github.com/seu-usuario/strategy-pattern-demo.git
   ```

2. Navegue até o diretório do projeto:

   ```shell
   cd strategy-pattern-demo
   ```

3. Abra o projeto em seu ambiente de desenvolvimento Java preferido.

4. Execute o arquivo `Main.java` para iniciar o aplicativo.

5. Siga as instruções no terminal para inserir os comprimentos dos lados do triângulo. O aplicativo determinará automaticamente o tipo de triângulo e fornecerá o resultado.

6. O aplicativo também verificará se os comprimentos dos lados fornecidos são válidos para formar um triângulo e se o triângulo é degenerado.

## Estrutura do Projeto

O projeto segue uma estrutura simples:

- `Main.java`: A classe principal que lida com a entrada do usuário e chama as estratégias apropriadas para determinar o tipo de triângulo.

- `strategies/`: Este pacote contém as diferentes estratégias para cada tipo de triângulo, como `IsoscelesTriangleStrategy`, `EquilateralTriangleStrategy`, e `ScaleneTriangleStrategy`. Cada estratégia implementa a interface `TriangleStrategy`.

- `TriangleStrategy.java`: A interface que define os métodos necessários para uma estratégia de triângulo.


---
