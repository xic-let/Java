# Classes de Viaturas em Java

Neste exemplo, vamos criar três classes em Java: `Viaturas`, `Dados`, e `TestarViaturas`, seguindo as descrições abaixo:

## Classe Viaturas

A classe `Viaturas` possui os seguintes atributos:

- `Marca` (String)
- `Modelo` (String)
- `Matricula` (String)
- `Combustivel` (String)
- `KilometrosAtuais` (int)
- `Preco` (float)

Ela também possui métodos `get` e `set` para cada um dos atributos.

## Classe Dados

A classe `Dados` é responsável por armazenar informações sobre as viaturas e possui os seguintes métodos:

- `adicionarViatura(viatura: Viaturas)`: Adiciona uma viatura ao array, garantindo que não há matrículas repetidas.
- `removerViatura(matricula: String)`: Remove uma viatura com base na matrícula.
- `mostrarTodasViaturas()`: Mostra todas as viaturas.
- `mostrarViaturasPorMarca(marca: String)`: Mostra as viaturas por marca.
- `calcularTotalPreco()`: Calcula e mostra o total do campo `Preco` de todas as viaturas.

## Classe TestarViaturas

A classe `TestarViaturas` possui um método `main` para testar os métodos criados anteriormente. Você pode usar caixas de diálogo para interagir com o usuário, conforme demonstrado em aula.

Exemplo de interação:

1. Adicione uma nova viatura fornecendo informações como marca, modelo, matrícula, combustível, quilômetros atuais e preço.
2. Remova uma viatura fornecendo sua matrícula.
3. Mostre todas as viaturas armazenadas.
4. Mostre viaturas por marca, fornecendo a marca desejada.
5. Calcule e mostre o total do campo `Preco` de todas as viaturas.

Certifique-se de implementar as classes e o método `main` de acordo com a descrição acima e adaptá-lo conforme necessário ao seu código Java.

Lembre-se de que você pode usar caixas de diálogo para interagir com o usuário, como sugerido na descrição.
