# JPA HIBERNATE

## JPA (Java Persistence API) é a especificação para mapeamento objeto-relacional e persistência de dados.

Já o Hibernate é a implementação dessa especificação JPA.
Antes do JPA, era comum fazer persistência de dados no mundo Java com JDBC. Porém, JDBC tinham algumas desvantagens que 
impactavam consideravelmente o ciclo de vida do desenvolvimento do software. Umas das desvantagens é o alto acoplamento 
de código e difícil manutenção por ser muito verboso.

## Aplicação CRUD utilizando JPA HIBERNATE

Essa aplicação CRUD foi criada pensando em um e-commerce, onde tem produtos e cada produto tem uma categoria. Em uma 
aplicação real, a persistência desses dados seria armazenada em um Banco de dados. Optei por utilizar MySQL em conjunto 
com XAMPP, para ser obter uma resposta visual de como as operações estão sendo feitas no banco de dados.

CRUD é (CREATE, READ, UPDATE, DELETE) e foram desenvolvidos cada um dos métodos pensando essas operações de persistência de dados.
- [CREATE] Operação de cadastrar produto.
- [READ] Operações de leitura no banco de dados, como buscar por todos os produtos cadastrados, buscar por nome etc.
- [UPDATE] Operações de atualizar determinada categoria e produto.
- [DELETE] Operações de remover determinada categoria e produto.

## Outras utilidades do JPA Hibernate

JPA Hibernate tem muitas outras aplicações interessantes para trabalhar conforme a modelagem do banco de dados.
Por exemplo, mapear relacionamento bidirecional e fazer consulta utilzando função de agregação, ex: min, max, sum etc.

Por meio de anotações é possível otimizar a aplicação. Por padrão quando relação é ManyToOne, quando for iniciar a
aplicação, a estratégia por baixo dos panos será a EAGER. Isso acarreta em carregas todas as tabelas que está no relacionamento.
Utilizando anotações, é possível usufruir da estratégia LAZY, com isso, será carregada apenas a tabela que está sendo chamada,
assim otimizando consideravelmente a aplicação.

Também é possível realizar herança entre entidades por meio de anotações e mapear chave composta.




