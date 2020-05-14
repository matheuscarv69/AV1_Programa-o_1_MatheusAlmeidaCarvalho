# AV1_Programa-o_1_MatheusAlmeidaCarvalho
Aluno: Matheus de Almeida Carvalho

Avaliação de Programação I:

Nota:
A questão 1, já está incluída no projeto, é o diagrama de classes na raiz.
As questões de 2 a 10, foram respondidas no github por meio dos commits.

Ex: 
Questão 2

- Abra o link do projeto
- Vá na opção de commits
- Lá apareça todos os commits do projeto
- Os commits foram feitos de maneira que correspondam as respostas 
das questões

Respostas das questões discursivas:

5- Crie outras duas classes, ContaCorrente e ContaPoupanca. Adicione os atributos taxaAdministracao (double) e limite (double) na ContaCorrente. Adicione os atributos porcentagemRendimento(double) e diaRendimento(int) na
ContaPoupanca. Faça as duas novas classes herdarem de Conta, transforme a
classe Conta em uma classe abstrata. Reimplemente o método toString nas duas
novas classes de conta.

R = Ao transformar a classe conta para Abstrata, os atributos que era privados ficaram
meio que ocultos para as classes filhas, para isso foi preciso muda-los para protect , e
os seus metodos pararam de funcionar, assim foi precisar apenas declarar-los na Classe
e nas classes que herdam de Conta (Conta poupança e conta corrente) foi preciso
implementar a lógica desses metodos de saque dentro delas, esse tipo de coisa me
lembrou bastante o funcionamento de uma interface.

6- O que aconteceu com as duas contas criadas na questão 4? Explique e modifique
o código para o bom funcionamento.

R = Elas pararam de funcionar normalmente, apresentando alguns erros
indicados pelo compilador, mas estes foram solucionados alterando os metodos
de cada classe filha da classe Conta, por ser abstrata o funcionamento da criação
dos metodos e visibilidade dos atributos precisou ser alterado, conforme o
descrito na resposta anterior;

7- Transforme os métodos da Classe Conta em métodos abstratos, e faça a
implementação correta nas Classes ContaCorrente e ContaPoupanca. Comente
justificando a lógica utilizada.

R = Os metodos precisaram serem reescritos nas duas classes Corrente e
Poupança pois quando se trasnforma uma classe Pai em abstrata, temos que o
seu funcionamento um pouco parecido com uma interface (é errado dizer isso,
mas foi o que pareceu), de toda forma, na classe abstrata só declaramos os
atributos e metodos, sem implementar nenhuma lógica por assim dizer, por isso
que nas duas classes filhas foi preciso implementar os metodos declarados na
classe Pai Conta e assim codando sua lógica de acordo com cada metodo/função.
