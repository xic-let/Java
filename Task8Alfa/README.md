# Hierarquia de Classes de Funcionários

A empresa Alfa possui três tipos de funcionários: vendedores, administrativos e financeiros. Para todos os funcionários, a empresa mantém o registro do nome, contato móvel e email do funcionário. A seguir estão os detalhes específicos para cada tipo de funcionário:

## Funcionários Gerais

- Nome (String)
- Contato Móvel (String)
- Email (String)

## Vendedores

Além dos atributos gerais, os vendedores têm:

- Salário Base (double)
- Comissão (double)

Os vendedores têm um método para calcular e imprimir seu salário total, considerando que a comissão é de 5% sobre o valor das vendas.

## Administrativos

Além dos atributos gerais, os administrativos têm:

- Salário Fixo (double)
- Horas Extras (int)

Os administrativos ganham horas extras pagas a 3 euros por hora.

## Financeiros

Além dos atributos gerais, os financeiros têm:

- Salário Fixo (double)
- Prémio de Produtividade (double)

O prémio mensal dos financeiros é variável.

Crie uma hierarquia de classes que tenha uma classe "mãe" (`Funcionarios.java`) e implemente o que for comum aos três tipos de funcionários. Crie uma subclasse para cada tipo. Defina o tipo de dado mais adequado para os atributos das classes. Implemente métodos `get` e `set` para os atributos e métodos construtores conforme julgar conveniente.

Nos três tipos de funcionários, implemente um método que imprima o salário em formato de euros (use a classe DecimalFormat).

## Classe TestarFuncionarios

Crie uma classe `TestarFuncionarios` que possua um método `main` para testar as classes criadas:

1. Crie um objeto para cada tipo de funcionário.
2. Solicite os dados gerais dos funcionários (nome, contato móvel, email) ao utilizador (pode usar a classe Scanner).
3. Solicite os valores específicos para cada tipo de funcionário (salário base, comissão, horas extras, prémio de produtividade) ao utilizador.
4. Apresente os dados gerais dos funcionários e o salário a receber, levando em conta as regras mencionadas acima.

Lembre-se de formatar os valores em euros usando a classe DecimalFormat.


