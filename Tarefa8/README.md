# Classes de Veículo em Java

Este é um exemplo de implementação de classes de veículo em Java, incluindo uma classe base `Veiculo`, uma classe `Carro` que herda de `Veiculo`, e uma classe `Aviao` que também herda de `Veiculo`. Além disso, há uma classe `TestarVeiculo` com um método `main` para testar as classes criadas.

## Classe Veiculo

A classe `Veiculo` possui os seguintes atributos:

- `marca` (String)
- `modelo` (String)
- `ano` (int)
- `preco` (double)
- `combustivel` (String)
- `velocidadeMaxima` (int)

Ela possui um construtor que recebe os valores iniciais de cada atributo e métodos `get` e `set` para cada um dos atributos. Além disso, possui um método `dados` que imprime um relatório com todos os dados do veículo.

## Classe Carro

A classe `Carro` herda da classe `Veiculo` e possui um atributo adicional:

- `portas` (int)

Ela possui um construtor que recebe os valores iniciais de cada atributo, métodos `get` e `set` para o atributo `portas`, e um método `dados` que imprime um relatório com os dados do carro, incluindo os dados do veículo base mais o número de portas.

## Classe Aviao

A classe `Aviao` também herda da classe `Veiculo` e possui um atributo adicional:

- `tipoDeAsa` (String)

Ela possui um construtor que recebe os valores iniciais de cada atributo, métodos `get` e `set` para o atributo `tipoDeAsa`, e um método `dados` que imprime um relatório com os dados do avião, incluindo os dados do veículo base e o tipo de asa.

## Classe TestarVeiculo

A classe `TestarVeiculo` possui um método `main` para testar as classes criadas. Neste método:

1. Crie um objeto `jipe` do tipo `Veiculo` e atribua valores iniciais aos seus atributos.
2. Crie um objeto `bolide` do tipo `Carro` e atribua valores iniciais aos seus atributos, incluindo o número de portas.
3. Crie um objeto `voar` do tipo `Aviao` e atribua valores iniciais aos seus atributos, incluindo o tipo de asa.
4. Crie um objeto representando o seu veículo favorito e atribua informações semelhantes aos exemplos anteriores.
5. Chame os métodos `dados` para imprimir os dados de cada um dos objetos criados.




