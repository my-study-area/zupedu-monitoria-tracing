# zupedu-monitoria-tracing

## Implementação e boas práticas de logs

### Teorias Necessárias
- O que é Log e porque é importante?
  - Video: [O que é Log e porque é importante?](https://www.youtube.com/watch?v=L44PuE00agM)
  - Conteúdo escrito: [O que é Log e porque é importante?](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/o-que-e-log-e-porque-e-importante.md)

- Boas práticas para registrar logs em aplicações
  - Video: [Boas práticas para registrar logs em aplicações](https://www.youtube.com/watch?v=VdZBRKqIsl4)
  - Conteúdo escrito: [Boas práticas para registrar logs em aplicações](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/boas-praticas-para-registrar-logs-em-aplicacoes.md)

- Centralização de logs, o que são e porque?
  - Video: [Centralização de logs, o que são e porque?](https://www.youtube.com/watch?v=hyKs_dEBer8)
  - Conteúdo escrito: [Centralização de logs, o que são e porque?](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/centralicacao-de-logs-o-que-sao-e-porque.md)

- Conhecendo um pouco sobre Log4j, Logback e slf4j
  - Video: [Conhecendo um pouco sobre Log4j, Logback e slf4j](https://www.youtube.com/watch?v=4dZGhHeFd_o)
  - Conteúdo escrito: [Conhecendo um pouco sobre Log4j, Logback e slf4j](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/diferencas-entre-log4j-logback-e-slf4j.md)
  - Outra playlist: [https://www.youtube.com/playlist?list=PLH_lE515NYR21S0L_33yPU1-usoC-hknA](https://www.youtube.com/playlist?list=PLH_lE515NYR21S0L_33yPU1-usoC-hknA)

- Criando logs em Aplicações Java.
  - Video: [Criando logs em Aplicações Java.](https://www.youtube.com/watch?v=-9q0eDvbpDk)
  - Conteúdo escrito: [Criando logs em Aplicações Java.](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/criando-logs-em-aplicacoes-java.md)

### Atividades Preparatórias
Video: [Implementando Logs em uma Api](https://www.youtube.com/watch?v=kG7g3XXb7Uw)

Caso tenha interesse o código está disponível em [https://github.com/paulasantanazup/livraria/tree/monitoria-tracing-tc-1-tl-1](https://github.com/paulasantanazup/livraria/tree/monitoria-tracing-tc-1-tl-1)

### Atividades Obrigatórias
**Adicionando Logs na aplicação**
Seu time esta prestes a entregar uma funcionalidade de cadastro e deleção de pessoas de um dos serviços que vocês possuem.

Você estava analisando a Pr que foi aberta para o serviço de gerenciamento de funcionários.

Como você identificou ausência dos logs, resolveu implementar nos pontos que considerava mais importantes.

Projeto: [Projeto Base ](https://github.com/zup-academy/gerenciador-de-pessoas/tree/monitoria-e-tracing-tc1-tl2)

Resposta do especialista: 
- [https://gist.github.com/paulasantanazup/1946a5cd725665374676c5e8ac7662eb](https://gist.github.com/paulasantanazup/1946a5cd725665374676c5e8ac7662eb)
- [https://gist.github.com/paulasantanazup/1694c30d9da5d860d835b61c94a19481](https://gist.github.com/paulasantanazup/1694c30d9da5d860d835b61c94a19481)

- [https://gist.github.com/paulasantanazup/7398e478cb1cce7faa5da4d9bff3907a](https://gist.github.com/paulasantanazup/7398e478cb1cce7faa5da4d9bff3907a)

> Caso você queira continuar aprendendo mais sobre o assunto recomendamos a leitura do livro Software Telemetry: Reliable Logging and Monitoring e da documentação oficial do Slf4j, Spring Boot Loggin e do Logback.

**Melhorando logs de uma aplicação**

Você vai iniciar uma feature em um serviço de banco digital.
Mas decidiu realizar alguns ajustes nos logs seguindo as boas práticas, já que você pode necessitar dos logs percebeu que eles não estão implementados de forma que auxilie a realização de debug em produção.

[Projeto: Projeto Base](https://github.com/zup-academy/bancodigital/tree/monitoria-e-tracing-tc1-tl3)

Resposta do especialista:
- [https://gist.github.com/paulasantanazup/78e16a468cf45a63daf2aec6c88aa494](https://gist.github.com/paulasantanazup/78e16a468cf45a63daf2aec6c88aa494)
- [https://gist.github.com/paulasantanazup/f61d50be124b13fc7c454772c9b0bedb](https://gist.github.com/paulasantanazup/f61d50be124b13fc7c454772c9b0bedb)

## Monitorando e gerenciando sua aplicação

### Teorias Necessárias
- O que é monitoramento de Software ?
  - [Video: O que é monitoramento de Software?](https://www.youtube.com/watch?v=LWY47uBK3rE&ab_channel=4Zuppers)
  - [Conteúdo escrito: O que é monitoramento de Software?](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/metricas-e-monitoramento-de-software.md)
  - [Conteúdo escrito: Conhecendo o Spring Actuator](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/conhecendo-o-spring-actuator.md)

- O que é APM
  - [Video: O que é APM](https://www.youtube.com/watch?v=0maXfL6ALdw&ab_channel=4Zuppers)
  - [Conteúdo escrito: O que é APM](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/o-que-e-apm.md)

- Diferença entre monitoramento e observabilidade
  - [Video: Diferença entre monitoramento e observabilidade](https://www.youtube.com/watch?v=JTQdEgkYJqM&ab_channel=4Zuppers)
  - [Conteúdo escrito: Diferença entre monitoramento e observabilidade](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/o-que-e-apm.md)

### Atividades Preparatórias
Implementando métricas em uma aplicação Java com Spring

- [Video: Implementando Spring Actuator em uma Aplicação de Livraria](https://www.youtube.com/watch?v=fZcEII-NNdQ&ab_channel=4Zuppers)
- [Código utilizado na aplicação](https://github.com/zup-academy/livraria/tree/monitoria-tracing-tc-2-tl-1)

### Atividades Obrigatórias


## Links
- [Video: Implementando Spring Actuator em uma Aplicação de Livraria](https://www.youtube.com/watch?v=fZcEII-NNdQ&ab_channel=4Zuppers)
- [Código fonte](https://github.com/zup-academy/livraria/tree/monitoria-tracing-tc-2-tl-1)
- [Spring Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
- []()
