# Estrutura de dados Java

Aprendendo estruturas de dados em Java e seus casos de usos.

## Node
Os Nós ou Nodes são blocos de contruções fundamentais de muitos sistemas da ciência da computação. Em estrutura de dados elas formam a base para Queues, Stacks, Linked List, Trees etc...

Um Nó contém dados e dois links, geralmente chamados de ponteiros, eles fazem ligações com outros Nós, se um Nó não tiver ponteiros ou seja se o ponteiro tiver o valor de null, significa que você chegou ao fim do caminho, além disso um Nó pode ficar orfã se não houver nenhum ponteiro apontando para ele.

## Linear Data Structures - Estruturas Lineares
As estruturas lineares têm elementos organizados em uma sequência específica, em que cada elemento está ligado a outro, como um trem com diversos vagões (nodes) conectados entre si.

### Linked Lists - Listas ligadas
Listas ligadas ou listas encadeadas são estrutura de dados mais simples, nada mais são que uma sequência de células ligadas ou encadeadas umas as outros, as células de uma lista ligada são compostas de dois elementos cada.

### Double Linked List - Listas duplamente ligadas
Listas duplamente ligas são semelhantes a listas ligadas, mas possuí uma ligação para o nó anterior, essas ligações permitem que você intere de trás para frente na lista com a mesma facilidade com que intera com uma lista ligada.

### Queue - Filas
Filas são estrutura de dados FIFO (first-in first-out), onde o primeiro elemento a ser inserido, será o primeiro elemento a ser retirado, ou seja o primeiro que entra e o primeiro que sai.

### Stacks - Pilhas
A estrutura de dados pilhas e usado para armazenar elementos de forma ordenada, seguindo o princípio LIFO - (“Last In, First Out”) o último elemento que entra é o primeiro a sair, esse comportamento é útil em várias situações, para gerenciar ordem sequêncial.



## Lições aprendidas
LIsta Ligadas: 
Ao implementar uma lista duplamente ligada do zero, consegui compreender melhor padrões importantes como invariantes e validações essenciais, além de ampliar minha percepção sobre os casos de uso dessa estrutura de dados. Passei a me atentar à importância de verificar se um nó não é o próprio head ou tail antes de realizar determinadas operações, e entendi que, ao remover um nó do meio, é fundamental ajustar corretamente os ponteiros tanto dos nós vizinhos quanto do próprio nó removido. Durante operações de troca de nós, especialmente no meio da lista, ficou mais claro como identificar o fim da lista e, assim, atualizar corretamente o tail ou o head, além de perceber a diferença entre trocar nós que estão distantes entre si e lidar com nós adjacentes, algo que foi particularmente complexo para mim e exigiu mais cuidado na manipulação dos ponteiros. Também desenvolvi uma visão mais cuidadosa sobre a manipulação de ponteiros, garantindo que nenhuma referência seja perdida durante os ajustes. Além disso, passei a considerar cenários específicos, como quando um nó vem após o outro (node2 depois de node1), e a importância de percorrer corretamente a lista para manter sua integridade. No geral, esse processo fortaleceu meu entendimento prático sobre estruturas encadeadas e manipulação segura de ponteiros.


## Autor
- [@eyenessus](https://www.github.com/eyenessus)

