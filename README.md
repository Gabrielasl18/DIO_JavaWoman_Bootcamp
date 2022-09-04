# Estruturas de Dados

[Implementações feitas na faculdade](https://github.com/Gabrielasl18/CEFET_RJ-ESTRUTURAS-DE-DADOS_2022)


## Listas
> A diferença entre listas e arrays é a de que as listas possuem tamanho AJUSTÁVEL,enquanto array possuem tamanho FIXO.
			
**TIPOS:**

* LISTA LIGADA: Existem os nós, onde cada um dos nós conhece o valor que está sendo armazenado em seu interior além de conhecer o elemento
posterior a ele: por sso ela é chamada de "lista ligada", pois os nós são amarrados com essa indicação de qual é o próximo nó.


* LISTA VINCULADA: A grande diferença das listas duplamente ligadas para as listas ligadas é que elas são bidirecionais.Vimos que, natural
mente não conseguimos "andar para trás" em listas ligadas, pois os nós de uma lista ligada sabem somente quem é o próximo elemento.Nas
listas duplamente ligadas, os nós sabem quem é o próximo elemento e também quem é o elemento anterior, o que permite a navegação REVERSA.

___

## Pilhas					
> É uma estrutura de dados que serve como uma coleção de elementos, e permite o acesso a somente UM item de dados armazenados, o
 acesso aos itens de uma pilha é restrito - somento um item pode ser lido ou removido por vez.
 
**TIPOS:**
 						
*LIFO/UEPS: (LAST IN FIRST OUT) ou UEPS (ÚLTIMO QUE ENTRA PRIMEIRO QUE SAI),apresenta o seguinte critério: o primeiro elemento a ser 
retirado é o ÚLTIMO que tiver sido inserido
(Se tentarmos extrair algo de uma pilha VAZIA, dizemos que a pilha tem ESTOURO NEGATIVO)
(Se exceder n, a pilha tem um ESTOURO))

* FIFO/PEPS: (FIRST IN FIRST OUT) ou PEPS(PRIMEIRO QUE ENTRA PRIMEIRO QUE SAI), que apresenta o seguinte critério: o primeiro elemento a 
ser retirado é o PRIMEIRO que tiver sido inserido.

___

# Filas
> Admite remoção de elementos e inserção de novos sujeita à seguinte regra de operação: O elemento removido é o que está na estrutura há mais tempo, ou seja, o primeiro objeto inserido na fila é também o primeiro 
a ser removido seguindo o conceito FIFO.

___

# Árvore
> uma estrutura de dados que organiza seus elementos de forma hierarquica, onde existe um elemento que fica no topo da árvore, chamado de raiz e existem os elementos subordinados a ele,e que são chamados de nós ou folhas.

___

# Collections
> Um  objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade. Serve para armazenar e processar conjuntos de dados de forma eficiente.

```java
import java.util.List;

public class gabi{
    public static void main(String[] args){

    List<Double> notas = new ArrayList<>(); // não é recomendável 
    List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));// outra forma de inicializar

    List<Double> notas = Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6);
    notas.add(10d);// não posso adicionar e nem remover, então vai dar ERRO
    System.out.println(notas);
      
    List<Double> notas = List.of(7d,8.5,9.3,5d,7d,0d,3.6);
    notas.add(1d);
    notas.remove(5d);
    //também nao posso remover e nem adicionar, parecida com a de cima.
    Sistem.out.println("criando uma lista e adicionando as sete notas");
    }
}
```

**Composição Collections**

<dl>
    <dt>Interfaces<dt>
    <dd>É um contrato que quando assumido por uma classe deve ser implementado.</dd>
</dl>
<dl>
    <dt>Implementações ou Classes<dt>
    <dd> São as materializações, a codificação das interfaces.</dd>
</dl>
<dl>
    <dt>Algoritmos<dt>
    <dd>Sequência lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.</dd>
</dl>

*Analisar a Hierarquia de Collections Java.*

___

# Grafos	
> São estruturas que permitem programar a relação entre objetos. Os objetos são vértices ou "nós" dos grafos.Os relacionamentos são as arestas.

___

# Hashing
> Uma tabela hash é uma generalização da idéia de array,porém utiliza uma função denominada Hashing para espalhar os elementos, fazendo com que os mesmos fiquem de forma não ordenada dentro do "array" que define a tabela.A tabela hash permite a associação de "valores" a "chaves".

<dl>
    <dt>Valores<dt>
    <dd>É a posição ou índice onde o elemento se encontra.</dd>
</dl>
<dl>
    <dt>Chave<dt>
    <dd>Parte da informação que compõe o elemento a ser manipulado.</dd>
</dl>

* Espalhar facilita a busca na estrutura de dados, pois a partir de uma chave podemos acessar de forma rápida uma posição do "array".

___

# Tratamento de Exceções em Java

<dt>Exceção</dt> 
> É um evento que interrompe o fluxo normal de um processamento de uma classe. uma exceção é uma indicação de um problema que ocorre durante a execução de um programga."exceção" significa que o programa não ocorre frequentemente. O uso correto de exceções tonar o programa mais robusto e confiável. Com o tratamento de exceções, um programa pode continuar executando depois de lidar com um problema

*Importante: Incorpore sua estratégia de tratamento de exceções no sistema desde o princípio de processo do projeto.*

**Pode ser difícil incluir um tratamento de exceções eficiente depois que um sistema foi implementado.**

**Classificação de exceções**

* ERROR: usado pela JVM que serve para indicar se existe algum problema de reurso do programa, tornando a execução impossível de continuar.
* UNCHECKED (Runtime): execptions que PODM ser evitados se forem tratados e analisados pelo desenvolvedor.(não é obrigado).
* CHECKED EXCEPTION: exceptions que DEVEM ser evitadas e tratados pelo desenvolvedor para o programa funcionar.


* TRY, CATCH, FINALLY: cada uma dessas palavras, juntas, definem blocos para o tratamento de exceções.
* THROWS: declara que uum método pode lançar uma ou várias exceções.
* THROW: lanã explicitamente uma exception.

```java
try {
    ...
}catch(FileNotFoundException e){ //arquivo que deseja imprimir está errado
    ...
}catch (IOException e){ //erro inesperado
    ...
}finally {  //opcional
  ...
}
```
**se põe onde provavelmente ocorre a Exception,se ocorrer esse try, vai continuar o q se pede no catch e no finally.**
