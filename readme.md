<div align="center">

# Nivelamento: Lógica de Programação
FIAP

</div>

## 📚 Capítulo 1: Introdução

### 1. “Tecnologia":
- “tekhene”, que significa “Técnica, arteeofício” + “logia”, que significa “estudo”.
- não   devemos   entender   tecnologia   como   algo   informatizado   ou eletrônico,  mas  sim  um  processo  que  visa  melhorar  e  agilizar  tarefaspara  o  ser humano. 

> Os programas de computadores nada mais são que algoritmos que podem ser escritos numa linguagem específica e funcionarem um computador.

### 2. Como o computador entende um programa?

As linguagens  de  programação  são  linguagens  usadas  para  a  comunicação com  o  computador.  São  constituídas  de  comandos,  que  quando utilizados corretamente, executam ações. 

As instruções colocadas em um programa são compiladas (ou interpretados) por  uma  linguagem  de  programação, gerando  um  arquivo  objeto  (linguagem  de montagem).  O  linkeditor  pega  este  arquivo  objeto  e  transforma  em  um  arquivo  em linguagem de máquina (executável: 0 e 1), então o computador consegue interpretar e executar o programa.

A arquitetura  do  computador  é  lógica, representada  por  dois estados  opostos  como ‘sim’ ou ‘não’, ‘verdadeiro’ ou ‘falso’, ‘0’ ou  1.  O ‘0’ e ‘1’ são notações do computador que representam ‘não  passa  corrente’ e ‘passa  corrente’, respectivamente. Um  programa  deve  respeitar  este  conceito  para  que  as  suas instruções sejam convertidas para uma linguagem de programação até a linguagem de máquina, para que sejam compreendidas pelo computador.

### 3. O que é um Algoritmo?

Algoritmo é o processo pelo qual todo problema é submetido, objetivando (por meio de passos que respeitam uma ordem lógica) resolver um problema. É a especificação dos passos em ordem lógica, que visa resolver o problema proposto. Sem um problema não é possível desenvolver um algoritmo.

Ou seja, é uma sequência de passos em ordem lógica que objetiva mostrar como resolvemos um problema!

Os passos sugeridos são colocados numa ordem lógica. Para que o algoritmo funcione adequadamente, partimos do princípio de queo passo anterior obteve êxito, caso contrário há uma falha **(bug)** no algoritmo!

**Importante:** em um algoritmo nunca colocamos valores (quem os digita é o usuário), apenas elencamos os passos necessários!!

### 4. Pseudocódigo e Fluxograma:

O algoritmo tem formas diferentes de representação:
- descrição  narrativa  (ou  narrativa);
- fluxograma  (ou  diagrama  de blocos);
- escrito em uma linguagem de programação escolhida.

O  objetivo  destas  formas  diferentes  de  representação  é  para facilitar  o  aprendizado  na  construção  do  algoritmo,  depois,  uma  ou  outra  destas formas de representação poderão servir como documentação do sistema!

A) Pseudocódigo:

- normalmente em português para um melhor entendimento.
- regras, sintaxes ecritérios empregados são similares aos das linguagens de programação  reais.
- tem o objetivo de aprimorar a disciplina e a organização que uma linguagem de programação exige do aprendiz de programação. 
- o fato de a linguagem ser em português facilita o aprendizado do algoritmo, forçando o aprendiz a adquirir a disciplina necessária para aprenderuma linguagem de programação real.
- tem um corpo que é dividido em três partes:
  - Nome do programa: Local onde colocamos o nome que daremos ao algoritmo.
  - Ambiente de declaração de variáveis: Local onde declararemos as variáveis com os seus nomes e tipos.
  - Corpo do algoritmo: Local onde escreveremos as instruções do algoritmo.

B) Fluxograma:
-  consiste na imagem (visão macro) do algoritmo, enquanto o pseudocódigo (ou o código-fonte aplicado em uma linguagem de programação)é o detalhamento de como foi desenvolvido o algoritmo.
- seu objetivo é o de desenhar a ideia do algoritmo, mostrando assim o fluxo (sentido) dado entre os processos.
- é a forma de representação gráfica dos passos do algoritmo através de figuras que representam estas ações. Nesta forma de representação do algoritmo usamos regras para cada uma das figuras/instruções.

<hr>

## 📚 Capítulo 2: Entrada e Saída de Dados

### 1. Introdução:

Para desenvolver um algoritmo, há oito comandos bases na Programação. São eles: 
- Entrada de dados: Leia
- Saída de dados: Escreva
- Processamento de dados
- Decisão:
	- Se então
- Se então senão
- Se encadeado
- Escolha
- Estruturas de repetição:
- Pré-condicional: Enquanto-faça
- Pós-condicional:  Faça-enquanto
- Contador: Para

Cada linguagem de programação trata estes comandos de uma forma diferente, com regras diferentes (em alguns casos até iguais) e sintaxes e verbos diferentes. **E há linguagens de programação que não tem um ou mais destes oito comandos!**

### 2. Exibindo dados para o usuário (SAÍDA DE DADOS)

**Saída de dados:** representa todo momento em que o Algoritmo precisa interagir com o usuário. Ou seja, o programador usa esta instrução toda vez que desejar que o Algoritmo mostre algo para o usuário!
**Importante:** 
-  “Sintaxe” = regras de utilização de uma instrução
- “Termos” :  combinação  de  variáveis,  constantes  ou expressões
- Código-fonte: o arquivo texto onde escrevemos os programas
- Comentário: texto inserido dentro do  código-fonte  que seja  um  auxílio para o entendimento das instruções. O compilador o ignora!!

A) Pseudocódigo:

Sintaxe:
Escreva &lt;expressão&gt;
O termo “expressão” usado no código-fonte se  refere  a  uma  mensagem, variável, cálculo ou qualquer uma destas combinações.

~~~
Exemplos:
Programa
saida_de_dados
Início
// exibe “Meu primeiro programa”
Escreva  “Meu primeiro programa”
// exibe o número 12
Escreva 12
Fim 
~~~

B) Python:

Sintaxe:
print(&lt;expressão&gt;)

Exemplo:
~~~python
# Exibe "Meu primeiro programa"
print("Meu primeiro Programa")
# Exibe o número 12
print(12)
~~~

O Python tem três formas de exibir dados com um print:
- Separando os termos com vírgula (,)
- Utilizando a função format()
- Utilizando o print(f””)

Exemplos:

~~~python
nome = "Monica"
idade = 30
altura = 159 
# Forma 1
print("1. O meu nome é", nome, "tenho", idade, "anos e ", altura, "centímetros de altura")
# Forma 2
print("2. O meu nome é {} tenho {} anos e {} centímetros de altura".format(nome, idade, altura))
print("2. O meu nome é {0} tenho {1} anos e {2} centímetros de altura".format(nome, idade, altura))
print("2. O meu nome é {n} tenho {i} anos e {a} centímetros de altura".format(n=nome, i=idade, a=altura))
# Forma 3
print(f"3. O meu nome é {nome} tenho {idade} anos e {altura} centímetros de altura")
~~~

C) Java:

Sintaxe:
System.out.println(&lt;expressão&gt;);

Exemplos:

~~~java
// Exibe "Meu primeiro programa"
System.out.println("Meu primeiro programa");
// Exibe o número 12
System.out.println(12);
~~~

Em  Java, utiliza-se  a  classe  System  e  o  método  out  para  exibir  informações, objetos de cadeias de caracteres que contenham a implementação de formatação são instâncias de PrintWriter, uma classe de cadeias de caracteres, e PrintStream, uma classe de controle de bytes. Dois níveis de formatação estão disponíveis: 

- print e println formatam valores individuais em um modo padrão
- format formata qualquer valor numérico baseado numa String, quando são necessárias várias opções para uma formatação.

Os métodos print ou println enviam para a saída um simples valor após convertê-lo  usando  um  método  toString  apropriado!

~~~java
public class Equacao {
   public static void main(String[] args) {
      int i = 2;
      double r = Math.sqrt(i);
      System.out.print("A raiz de ");
      System.out.print(i);
      System.out.print(" é ");
      System.out.print(r);
      System.out.println(".");

      i = 5;
      r = Math.sqrt(i);
      System.out.println("A raiz de " + i + " é " + r + "."); 
      }
}
~~~

### 3. Recebendo dados em variáveis (ENTRADA DE DADOS)

Entrada de dados é a instrução que faz a interação do usuário com o Algoritmo (ao contrário da Saída de dados). É complementar à instrução de Saída de dados.

Na saída de dados, usamos a tela do monitor como referência; na entrada de dados, o teclado. Toda vez que o usuário tiver que inserir uma informação no algoritmo, o programador usará um comando de entrada de dados.

  3.1 Variáveis de memória

“Variável” é algo que pode ter o seu conteúdo modificado no decorrer do algoritmo. É uma posição na memória do computador, com um nome e tipo, que  armazena  uma  informação.  Caso  uma  segunda  informação  seja  colocada  na mesma  variável,  o  primeiro  valor  será  sobreposto,  armazenando  assim  o  segundo valor.

  3.2 Nomeando variáveis

Toda  variável  deve  ter  um  nome  próprioe  único no  algoritmo  onde  ela  será utilizada. 
Para definir um nome de variável, há algumas regras gerais:
- não pode ser uma palavra reservada pela linguagem de programação, como print;
- deve começar com letra;
- não podeconter caracteres especiais, exceto underline (_).

Há linguagens de programação com exceções, como poder iniciar o seu nome com o caractere especial underline(_), no caso da linguagem C e suas derivadas, e outras que aceitam cifrão($) e deve iniciar com ele (PHP), etc.

Apesar de não ser uma regra, é uma boa prática colocar nomes de variáveis com rótulos que lembrem a informação que ela armazenará.

  3.3 Atribuindo um tipo às variáveis

Tipo é o formato em que o conteúdo será armazenado. Os tipos clássicos são:

- Caractere: utilizamos este tipo de dado quando precisamos armazenar apenas um caractere (letra, dígito ou caractere especial) em uma  variável. O conteúdo de um dado caractere pode estar entre apóstrofo (‘) ou aspas (“).

- Texto: utilizamos este tipo de dado quando precisamos armazenar uma cadeia de caracteres como conteúdo  de uma variável. Como o tipo caractere, seu conteúdo pode estar entre aspas ou apóstrofo.

- Inteiro: está na classificação dos numéricos. Os dados numéricos são aqueles que permitem que seja efetuado calculo com o seu conteúdo. Utilizamos este tipo de dado quando precisamos armazenar informações numéricas que não tenham casas decimais. O conteúdo de uma variável numérica, seja inteiro ou real, colocamos apenas o número, sem a necessidade de caractere complementar!!

- Real: também está na classificação dos numéricos. Utilizamos este tipo de dado toda vez que precisamos  armazenar valores que podem conter casas decimais(valores fracionários). Pela linguagem de programação  ser de língua inglesa, o separador de casas decimais é o ponto (e não a vírgula)!

- Lógico: quando precisamos armazenar informações lógicas - informações cujo conteúdo pode ser representado por Verdade (True) ou Falso (False).

  A) Pseudocódigo:

Sintaxe: Leia &lt;variável&gt;

~~~
Programa entrada_de_dados_e_variaveis
Var
 Salario: rea
Inicio  
 // Solicita o salário ao usuário
 Escreva “Digite o seu salário:”
 Leia salario
 // exibe o salário digitado
 Escreva “Salário = R$”, salario
Fim
~~~

  B) Python:

Sintaxe: &lt;variável&gt; = input([&lt;Mensagem&gt;])
A mensagem dentro do input é opcional!

~~~python
# Pede a digitação do salário ao usuário
salario = input("Digite o seu salário:")
salario = float(salario)
# Exibe o salário digitado
print("Salário = R$", salario)
~~~

> Em Python não declaramos variáveis com um tipo! Sua Tipagem é dinâmica, ou seja, no decorrer do programa ela pode assumir conteúdos de tipos diferentes. 

Uso do casting:

~~~python
nome = "Edson"      # Tipo Texto (string)
salario = 1234.56   # tipo real (float)
qtd_filhos = 2      # tipo inteiro (int)
opcao = 's'         # tipo caractere
maioridade = True   # tipo lógico

# Utilizando casting para modificar o tipo da variável
x = "55"            # x é do tipo string e vale '55'
x = float(x)        # x passou a ser float e vale 55.0
x = str(x)          # x voltou a ser string
x = int(x)          # x passou a ser int e vale 55
~~~

A variável pode assumir diversos tipos no decorrer do programa. Para  saber  o  tipo  atual  dela,  utilizamos  a **função type()**. 

~~~python
# UTILIZANDO VARIÁVEIS DIFERENTES E DESCOBRINDO OS TIPOS
nome = "Edson"      # Tipo Texto (string)
print(f"A variável nome = {nome}é do tipo {type(nome)}")
salario = 1234.56   # tipo real (float)
print(f"A variável salario = {salario}é do tipo {type(salario)}")
qtd_filhos = 2      # tipo inteiro (int)
print(f"A variável qtd_filhos = {qtd_filhos}é do tipo {type(qtd_filhos)}")
opcao = 's'
print(f"A variável opcao = {opcao}é do tipo {type(opcao)}")
maioridade = True   # tipo lógico
print(f"A variável maioridade = {maioridade}é do tipo {type(maioridade)}\n")

# UTILIZANDO A MESMA VARIÁVEL E DESCOBRINDO O SEU TIPO DEPOIS DE UM CASTING
x = "55"            # x é do tipo string e vale '55'
print(f"x = {x}e é do tipo {type(x)}")
x = int(x)          # x passou a ser int e vale 55
print(f"x = {x}e é do tipo {type(x)}")
x = str(x)          # x voltou a ser string
print(f"x = {x}e é do tipo {type(x)}")
x = float(x)        # x passou a ser float e vale 55.0
print(f"x = {x}e é do tipo {type(x)}")
~~~

  C) Java:

Sintaxe: 

Scanner entrada = new Scanner (System.in);
...
&lt;varInt&gt; = &lt;objeto&gt;.nextInt(); // Lê variável inteira
&lt;varFloat&gt; = &lt;objeto&gt;.nextFloat(); // Lê variável inteira
&lt;varString&gt; = &lt;objeto&gt;.nextLine(); // Lê variável inteira

Exemplo:

~~~java
Scanner entrada = new Scanner(System.in);
// Pede a digitação do salário ao usuário
salario = input("Digite o seu salário:")
System.out.println("Digite o seu salário:");
salario = entrada.nextFloat();
// Exibe o salário digitado
System.out.println("Salário = R$" + salario);
~~~

Em Java utilizamos a classe Scanner para fazer a entrada de dados, a qual permite a leitura do buffer de teclado e guardar o conteúdo lido em uma variável do mesmo tipo definido. Por meio do método next, receberá a digitação de uma String até o pressionar do ENTER.

Outras formas de utilizar o método next para outros tipos de dados:
- float numF = sc.nextFloat(); 
- int num1 = sc.nextInt(); 
- byte byte1 = sc.nextByte(); 
- long lg1 = sc.nextLong(); 
- boolean b1 = sc.nextBoolean(); 
- double num2 = sc.nextDouble(); 
- String nome = sc.nextLine().

### 4. Operações com variáveis numéricas:

![Operadores aritméticos:](./imagens/operadores-aritmeticos.png)

5. De-para: pseudocódigo para Java e Python

**Exemplo 1:**

Dados quatro (4) números pelo usuário, fazer um algoritmo que calcule a média simples destes números.

  Pseudocódigo:

~~~
Programa exemplo1
  Var n1, n2, n3, n4, media: real
Início
  // Solicita quatro números ao usuário
    Escreva “Digite 4 números:”
    Leia n1
    Leia n2
    Leia n3
    Leia n4
  // Calcula a média dos 4 números
  Media = (n1 + n2 + n3 + n4) / 4
  // Calcula a média dos 4 números
  Escreva “Média = “, media
Fim
~~~

Observação: no arquivo .py, na  leitura  do  n1, ele  está  recebendo  o  input(),  na  linha  de  baixo  o  n1  é convertido  para  float e  jogado  nele  mesmo.  Nas  próximas  variáveis  estes  dois processos são feitos na mesma linha. O input() pega o dado fornecido pelo usuário e sempre o retorna no tipo string. Caso queira o dado em outro tipo, faça o Casting!

**Exemplo 2:**

Dado o preço do maçode cigarros, a quantidade de maços consumidos por dia e o tempo em anos que a pessoa fuma, calcular quanto esta pessoa já gastou fumando. 

~~~
Programaexemplo2
Var
  preco_maco, qtd_maco, anos, dias_fumante, custo: real
Início  
  // Solicitar os dados ao usuário
  Escreva “Digite o preço do maço:”
  Leia preco_maco
  Escreva “Digite a quantidade de maços:”
  Leia qtd_maco
  Escreva “Digite a qtd. de anos que fuma:”
  Leia anos
  // calcula a qtd. de dias como fumante
  dias_fumante = anos * 365
  // calcula a qtd. de dias como fumante 
  dias_fumante = anos * 365
  // calcula o gasto do tempo que fuma
  custo = dias_fumante * preco_maco
  // Exibe o custo
  Escreva “Você já gastou R$ “, custo, ”Fumando”
Fim
~~~

**Exemplo 3:**

Dada uma quantia (considere que já seja múltiplo de 10), fazer um algoritmo que calcule quantas cédulas de 10, 20 e 50 são necessárias para compor esta quantia.

~~~
Programaexemplo3
Var
  ced10, ced20, ced50: inteiro
Início  
  /*Solicita a quantia*/
  Escreva “Digite a quantia:”
  Leia quantia
  /*Efetua os cálculos das quantias de cédulas */
  ced50 = quantia // 50
  quantia = quantia % 50
  ced20 = quantia // 20
  quantia = quantia % 20
  ced10 = quantia // 10
  quantia = quantia % 10
  /*Exibe as quantidades de cédulas */
  Escreva “Quantidade das cédulas: “
  Escreva “Cédulas de 50 = “, ced50
  Escreva “Cédulas de 50 = “, ced20
  Escreva “Cédulas de 50 = “, ced10
Fim
~~~

<hr>

## 📚 Capítulo 3: Desvios Condicionais

### 1. Introdução:

Tipos de comandos:

- comandos simples (Primitivos): são sequenciais e ocupam apenas uma linha, ou seja, executam o algoritmo na sequência em que os comandos aparecem.

- comandos estruturados: desviam o fluxo do algoritmo, fazendo com que as instruções não sejam executadas necessariamente na sequência. Todos os comandos estruturados têm um início e fim próprio (como SE e FIM_SE). O  fluxo das instruções a serem seguidas são escolhidas de acordo com o resultado da avaliação das condições!

Há duas classificações da estrutura de desvio condicional: 

- Decisão:
  - Desvio simples: SE ENTÃO
  - Desvio composto: SE ENTÃO SENÃO
  - Desvio encadeado
- Escolha

### 2. Desvio simples:

**Comando  de  decisão  SE ENTÃO:** utilizado para analisar uma condição e executar um determinado &lt;bloco de comandos&gt; caso a condição seja verdadeira, senão nada será executado.

Representação no fluxograma:

![Representação da estrutura condicional If no Fluxograma](./imagens/if.png)

> Condição é uma expressão que retorne um valor lógico. Ela funciona como uma pergunta, onde uma resposta lógica  (V ou F) determinará o andamento do fluxo. A condição é uma expressão composta por três partes: variável operador_relacional variável_ou_valor.

Representação:
Observação sobre o &lt;bloco verdade&gt;: é executado caso a condição resulte verdade.

A) Pseudocódigo:

~~~
Sintaxe: 
Se <condição> então
  <bloco verdade>
Fim_se
~~~

B) Python:

~~~python
Sintaxe:
if <condição>:
  <bloco verdade>
~~~

C) Java:

~~~java
Sintaxe:
if (condição)
{
  <bloco verdade>;
}
~~~

**Operadores relacionais:**

![Operadores relacionais](./imagens/operadores-relacionais.png)

**Conceito de bloco:**

loco é um conjunto de instruções (comandos) que é isolado pelo programador dos demais comandos por atender um objetivo em comum.

Cada linguagem de programação tem uma forma diferente de separar e gerenciar os blocos:

- Pseudocódigo: Não há um caractere ou palavra específica para delimitar o bloco. O Pseudocódigo geralmente utiliza o Fim_(nome do comando).

- Python:entende o bloco por meio da identação (neologismo derivado da palavra inglesa identation, que significa  recuo), em outros termos, as instruções sequenciais na mesma coluna estão no mesmo bloco.
  - Identação é uma técnica de edição de código-fonte importante em todas as linguagens de programaçã, por  organizar o código-fonte e tornar mais fácil a identificação de um erro de compilação.

- Java: entende como bloco todas as instruções que estão entre chaves ({bloco}).

**Exemplo:** conceito de decisão simples (SE ENTÃO)

Fazer um algoritmo que solicite um número ao usuário e exiba o seu módulo matemático (obs.: módulo matemático é tornar um número positivo. Se ele for, continua, senão passa a ser).

~~~
Programa exibir_numero_positivo
Var
  n: inteiro
Início  
  // exibe “Solicita um número para o usuário”
  Escreva “Digite um número:”
  Leia n
  // Comando de decisão: Verifica se o número é negativo
  Se n < 0 então
    n = n * -1
  Fim_se
  //Exibeo número positivo
  Escreva “Módulo:”, n
Fim
~~~

### 3. Desvio composto:

O desvio composto tem tanto o &lt;bloco verdadeiro&gt; quanto o &lt;bloco falso&gt;! 

O comando SE ENTÃO SENÃO é utilizado quando o desvio for composto por dois blocos, o verdadeiroe o falso - é uma bifurcação: um de dois caminhos é seguido a partir da resposta de uma condição pré-estabelecida (depois da palavra SE); caso a condição resulte verdade, será executado o &lt;bloco verdade&gt; (que é representado pelo ENTÃO),  caso contrário será executado o &lt;bloco falso&gt; (representado pelo SENÃO).

No fluxograma:

![Estrutura if-else](./imagens/if-else.png)

Sintaxes:

A) Pseudocódigo:

~~~
Se <condição> então
  <blocoverdadeiro>
Senão
  <blocofalso>
Fim_se
~~~

B) Python

~~~python
if <condição>:
  <bloco Verdadeiro>
else:
  <bloco Falso>
~~~

C) Java

~~~java
if (condição)
{
  <blocoverdadeiro>;
}
else
{
  <blocofalso>;
}
~~~


**Exemplo:** exemplo de desvio composto (SE ENTÃO SENÃO)

Solicitar ao usuário a sua idade e exibir mensagem “Maior de idade” caso a idade seja maior ou igual a 18 anos ou “Menor de idade” caso contrário.

Pseudocódigo:
~~~
Programa desvio_composto
Var
  idade: inteiro
Início
  // Solicita a idade do usuário
  Escreva “Digite sua idade:”
  Leia idade
  // Desvio composto exibe mensagem “Maior de idade” quando a idade for maior ou igual a 18 anos e “Menor de idade” caso contrário
  Se idade >= 18 então
    Escreva “Maior de idade”
  Senão 
    Escreva “Menor de idade”
  Fim_se
Fim
~~~


### 4. Desvio encadeado:

> Importante: Operadores lógicos
![Operadores lógicos](./imagens/operadores-logicos.png)


**Desvio encadeado:** É uma sequência de testes de seleção, os quais serão executados ou não de acordo com o resultado das condições e com o encadeamento dos testes.

Um teste de seleção pode ter dois conjuntos de instruções, um para o resultado verdadeiro e outro para o falso, porém esses conjuntos podem conter outros testes de seleção, que por sua vez, também podem conter outros e assim por diante.

Representação:

![Estrutura Se Encadeado](./imagens/se-encadeado.png)

Ou seja, denominamos SE ENCADEADO em situações em que há um comando de decisão – não importa se é o SE ENTÃO ou SE ENTÃO SENÃO – dentro do outro!!!

Sintaxe:

A) Pseudocódigo:

~~~
Se <condição 1> então 
  <blocode instruções 1>
Senão 
  Se <condição 2>então
    <bloco de instruções 2>
  Senão 
    Se <condicao3> então 
      <bloco de instruções 3>
    Senão
      <bloco de instruções N>
    Fim_se
  Fim_se
Fim_se
~~~

Também podemos escrever da seguinte forma:

~~~
Se <condição 1> então
  <bloco de instruções 1>
Senão Se <condição 2> então 
  <bloco de instruções 2>
Senão Se <condicao3> então 
  <bloco de instruções 3>
Senão
  <bloco de instruções N>
Fim_se
~~~

B) Python:

~~~python
if <condição 1>:
  <bloco de instruções 1>
else:
  if <condição 2>:
    <bloco de instruções 2>
  else: 
    if <condicao3>:
      <bloco de instruções 3>
    else<bloco de instruções N>
~~~

Ou podemos escrever:

~~~python
if <condição 1>:
  <bloco de instruções 1>
elif <condição 2>:
  <bloco de instruções 2>
elif <condicao3>:
  <bloco de instruções 3>
else<bloco de instruções N>
~~~

Em Python, o “elif” abrevia o encadeamento dos else if’s, tornando a sua estrutura mais legível.


C) Java:

~~~java
if (condição1) 
{
  <expressão>;
}
else
{
  if(condicao2)
  {
    <expressão2>;
  }
  else 
  {
    if(condicao3)
    {
      <expressão3>;
    }
    else
    {
      <expressão_n>;
    }
    }
  }
~~~

Ou podemos escrever:

~~~java
if (condição1)
  <expressão>;
else if (condicao2)
  <expressão2>;
else if (condicao3)
  <expressão3>;
else<expressãoN>;
~~~

**Exemplo:** SE ENCADEADO

Solicitar um número ao usuário. A partir do número, exibir o dia da semana correspondente.

Pseudocódigo:
~~~
Programa exemplo1
Var
  n: inteiro
Início  
  // Solicita um número ao usuário
  Escreva “Digite um número:”
  Leia n
  // Compara o n aos valores possíveis
  Se(n==1)então
    Escreva “Domingo “
  Senão se(n==2) então
    Escreva “Segunda-feira“
  Senão se(n==3) então
    Escreva “Terça-feira “
  Senão se(n==4) então
    Escreva “Quarta-feira “
  Senão se(n==5) então
    Escreva “Quinta-feira “
  Senão se(n==6) então
    Escreva “Sexta-feira “
  Senão se(n==7) então
    Escreva “Sábado “
  Senão 
    Escreva “Dia inválido “
  Fim_Se
Fim
~~~

### 5. Escolha:

Similar ao SE ENCADEADO por verificar diversas possibilidades  de  execução. 

- A *desvantagem* é da Escolha só  comparar equivalência (igual a), enquanto o SE ENCADEADO pode utilizar qualquer operador lógico  ou  relacional(>,  <, and...). 
- A *vantagem* é a de fechar apenas uma vez, independente da quantidade de caminhos (no SE, para cada SE há um FIM_SE).

A estrutura de decisão ESCOLHA testa o valor contido em um identificador (que pode ser uma variável ou um cálculo inteiro) colocada entre parênteses, e o compara com valores fornecidos em cada caso.

Fluxograma:

![Escolha](./imagens/escolha.png)

Sintaxe:

A) Pseudocódigo:

~~~
Escolha(<identificador>)
  Caso <valor1>:
    <comandos 1>
  Caso <valor2>:
    <comandos2>
  Caso <valor3>:
    <comandos3>
  Caso <valor4>:
    <comandos4>
  Outrocaso:
    <outros comandos>
Fim_Escolha
~~~

B) Python:

**EM PYTHON NÃO EXISTE A ESTRUTURA “ESCOLHA” , MAS PODE SER SIMULADA COM O SE ENCADEADO (IF ELIF) QUE UTILIZE  APENAS EQUIVALENCIA (==) COMO OPERADOR.**

C) Java:

~~~java
switch (<identificador>)
{
  case <valor1>:
    <comandos 1>;
    [break;]
  case <valor1>:
    <comandos 1>;
    [break;]
  case <valor1>:
    <comandos 1>;
    [break;]
  case <valor1>:
    <comandos 1>;
    [break;]
  default:
    <comandos default>
}
~~~

Em Java, o comando break força a saída da estrutura. Caso o break não seja colocado, assim que o fluxo entrar em um case, todos as linhas subsequentes serão executadas até o final da estrutura.

**Exemplo:** ESCOLHA

Solicitar um número ao usuário. A partir do número, exibir o dia da semana correspondente.

Pseudocódigo:
~~~
Programa exemplo_escolha
Var
  n: inteiro
Início
  // Solicita um número ao usuário
  Escreva “Digite umnúmero:”
  Leia n
  // Compara o n aos valores possíveis
  Escolha(n)
    Caso 1:
      Escreva “Domingo”
    Caso 2:
      Escreva “Segunda-feira”
    Caso 3:
      Escreva “Terça=feira”
    Caso 4:
      Escreva “Quarta-feira”
    Caso 5:
      Escreva “Quinta-feira”
    Caso 6:
      Escreva “Sexta-feira”
    Caso 7:
      Escreva “Sábado”
    Outrocaso:
    Escreva “Dia inválido”
  Fim_Escolha
Fim
~~~

### 6. Exercícios:

1) Calculadora:

Dados dois números inteiros e uma operação aritmética desejada, calcule a resposta adequada: Utilize os símbolos a seguir para ler qual a operação escolhida:+ soma, -subtração, * multiplicação, / divisão.

Pseudocódigo
~~~
Programa operacao_aritmetica
Var
  numero1, numero2, resultado: real
  operador: caractere
Início  
  // Solicitar os dados ao usuário
  Escreva “Digite o primeiro número:”
  Leia numero1
  Escreva “Digite o segundo número:”
  Leia numero2
  Escreva “Digite a operação desejada (+ -* /):”
  Leia operador
  // Verifica a operação desejada
  Escolha (operador)
    caso ‘+’:
      resultado = numero1 + numero2
      Escreva “Soma = “, resultado
    caso ‘-’:
      resultado = numero1 -numero2
      Escreva “Subtração = “, resultado
    caso ‘*’:
      resultado = numero1 * numero2
      Escreva “Multiplicação = “, resultado
    caso ‘/’:
      Se numero2 == 0 então
        Escreva “Não há divisão por zero”
      Senão
        resultado = numero1 / numero2
        Escreva “Divisão = “, resultado
      Fim_se
    caso contrário:
      Escreva “Operador inválido” 
  Fim_Escolha
Fim
~~~

2) Rodízio:

Dada a parte numérica da placa de um automóvel, fazer um algoritmo que exiba o dia do rodízio.
Considere a regra de São Paulo. Para veículos com final da placa:
- 1 e 2: rodízio é segunda-feira;
- 3 e 4: terça-feira;
- 5 e 6: quarta-feira;
- 7 e 8: quinta-feira;
- 9 e 0: sexta-feira.

Pseudocódigo:

~~~
Programa exemplo2
Var
  numeroPlaca, finalPlaca: inteiro
Início  
  /*Solicita a placa do veículo*/
  Escreva “Digite o número da placa do veículo:”
  Leia numeroPlaca
  /*Efetua o cálculo para saber o último número*/
  finalPlaca = numeroPlaca % 10
  /*Verifica o final da placa com o comando Escolha e exibe o dia da semana do rodízio*/
  Escolha (finalPlaca)
    caso 1:
    caso 2:
      Escreva “Segunda-feira“
    caso 3:
    caso 4:
      Escreva “Terça-feira“
    caso 5:
    caso 6:
      Escreva “Quarta-feira“
    caso 7:
    caso 8:
      Escreva “Quinta-feira“
    caso 9:
    caso 0:
      Escreva “Sexta-feira”
  Fim_Escolha
Fim
~~~

PÁG 34