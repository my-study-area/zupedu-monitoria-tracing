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
**Adicionando métricas na aplicação Java/Spring**

Resposta do Especialista

Configuração das informações da aplicação:
```properties
management.endpoints.web.exposure.include= info
management.info.env.enabled= true
info.application.name = Banco Digital
info.application.description = Descrição da aplicação
```

Informações das propriedades:
```properties
management.endpoints.web.exposure.include= info,configprops
```

Informações detalhadas de healt:
```properties
management.endpoint.health.show-details=always
management.endpoints.web.exposure.include= info, configprops, health
```

Informaçoes do prometheus:
```properties
management.endpoints.web.exposure.include= info,configprops,prometheus
```
e adicionar a dependência no pom.xml:
```xml
<dependency>
  <groupId>io.micrometer</groupId>
  <artifactId>micrometer-registry-prometheus</artifactId>
  <scope>runtime</scope>
</dependency>
```

**Implementando Spring Actuator em seu projeto**

Você esta desenvolvendo uma feature na aplicação de pedidos e uma das tasks envolve a configuração do Spring Actuator para métricas da aplicação.
Na task está informando que é necessário adicionar informação sobre o status da aplicação, sobre o status do banco de dados e dos jobs que serão construídos na feature.

Você irá implementar de acordo com o que foi solicitado.

[Projeto base](https://github.com/zup-academy/pedidos/tree/migrations-tc2-tl3)

Resposta do especialista

- [https://gist.github.com/paulasantanazup/f6037a9b74c38b3782abd2d8946e36e9](https://gist.github.com/paulasantanazup/f6037a9b74c38b3782abd2d8946e36e9)

## Pesquisando e analisando logs

### Teorias Necessárias
1 - O que é o Cloudwatch
  - [Video: O que é o Cloudwatch](https://www.youtube.com/watch?v=HcDPzBh2SEE&ab_channel=4Zuppers)
  - [Conteúdo escrito: O que é o Cloudwatch](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/o-que-e-cloudwatch.md)

2 - Como enviar logs no Cloudwatch
  - [Video: Como enviar logs no Cloudwatch](https://www.youtube.com/watch?v=6mcWnAEsmOg&ab_channel=4Zuppers)
  - [Conteúdo escrito: Como enviar logs no Cloudwatch](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/como-enviar-logs-no-cloudwatch.md)

3 - Como pesquisar logs no Cloudwatch
  - [Video: Como pesquisar logs no Cloudwatch](https://www.youtube.com/watch?v=IZrVkDNdxWk&ab_channel=4Zuppers) 

### Atividades Preparatórias
- [Video: Buscanco logs da aplicação de Livraria no Cloudwatch](https://www.youtube.com/watch?v=qS8dTir6RO0&ab_channel=4Zuppers)
- [Código base](https://github.com/zup-academy/livraria/tree/monitoria-tracing-tc3-tl1)

Crie uma instância EC2 com a imagem Amazon Linux 2023 e a Role com a policy CloudWatchAgentServerPolicy
```bash
# caminho do repositório com a aplicação
https://github.com/my-study-area/zupedu-monitoria-tracing/tree/main/livraria-implementando-log-aplicacao-spring

# gera o package da aplicação localmente
mvn package

# copia o jar local para o EC2
scp -i ~/Downloads/YOUR-FILE.pem  target/livraria-0.0.1-SNAPSHOT.jar <SERVER>:~

# passos realizados dentro do ec2

# instala o java 11
sudo yum install java-11-amazon-corretto-headless

# instala docker
sudo yum install docker 

#inicia o serviço do docker
sudo service docker start

# adiciona permissão ao usuário
sudo usermod -a -G docker ec2-user

# instala o git
sudo yum install -y git

#instalar docker-compose: 
# https://gist.github.com/npearce/6f3c7826c7499587f00957fee62f8ee9

# cria arquivo docker-compose.yml
cat <<EOT >> docker-compose.yml
version: '3.0'
services:
  db:
    image: postgres
    restart: always
    hostname: dblivraria
    ports:
      - "5432:5432"
    environment:
      - POSTGRES_USER=admin
      - POSTGRES_PASSWORD=admin
      - POSTGRES_DB=livraria
EOT

# inicia o postgres
docker-compose up -d db

# instala agent do cloudwatch
sudo yum install amazon-cloudwatch-agent -y

# wizard para criação do arquivo de configuração do agent do cloudwatch
sudo /opt/aws/amazon-cloudwatch-agent/bin/amazon-cloudwatch-agent-config-wizard

# caminho do arquivo de logs no ec2
/home/ec2-user/logs/spring-boot-logger.log

# local do arquivo gerado
cat /opt/aws/amazon-cloudwatch-agent/bin/config.json

# para evitar erros
# fonte: https://github.com/awsdocs/amazon-cloudwatch-user-guide/issues/54
sudo mkdir -p /usr/share/collectd/
sudo touch /usr/share/collectd/types.db

# inicia o agente
sudo /opt/aws/amazon-cloudwatch-agent/bin/amazon-cloudwatch-agent-ctl -a fetch-config -m ec2 -s -c file:/opt/aws/amazon-cloudwatch-agent/bin/config.json

# inicia aplicação
java -jar livraria-0.0.1-SNAPSHOT.jar

# cadastrar categoria localmente no EC2
curl --location 'localhost:8080/categorias' \
--header 'Content-Type: application/json' \
--data '{
    "nome": "categoria 2"
}'

# cadastrar autor
curl --location 'localhost:8080/autores' \
--header 'Content-Type: application/json' \
--data '{
  "nome": "José Martins",
  "biografia": "Nasceu em .. e morreu em ...",
  "nascimento": "01-01-1974",
  "nacionalidade": "brasileiro"
}'

# cadastrar livro
curl --location 'localhost:8080/livros' \
--header 'Content-Type: application/json' \
--data '{
  "titulo": "titulo 1",
  "dataDeLancamento": "19-03-2023",
  "resumo": "resumo",
  "idioma": "português",
  "idCategoria": "1",
  "idAutor": "1",
  "formato": "IMPRESSO_CAPA_DURA",
  "paginas": "245"
}'
```

Fontes:
- [https://www.youtube.com/watch?v=U7X3ehGZYwQ&ab_channel=SkillCurb](https://www.youtube.com/watch?v=U7X3ehGZYwQ&ab_channel=SkillCurb)
- [https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/install-CloudWatch-Agent-commandline-fleet.html](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/install-CloudWatch-Agent-commandline-fleet.html)

### Atividades Obrigatórias
**Fazendo debug de logs no Cloudwatch**
Você recebeu um chamado para analisar um problema que esta ocorrendo na api do banco digital, você deverá entender através dos logs no Cloudwatch o que esta ocorrendo quando é feito o cadastro de uma nova conta.
Importante:

Para sua autonomia nesta parte do treinamento você deverá seguir os passos descritos no vídeo abaixo após clonar o projeto base

[Video: instruções sobre o ambiente](https://www.youtube.com/watch?v=BuDS74K6oMU)

O código que deverá utilizar como base:

[Projeto: Projeto Base](https://github.com/zup-academy/bancodigital/tree/monitoria-e-tracing-tc3-tl1)

**Seleção de dados no Cloudwatch**
Você esta acompanhando os logs de produção do serviço de conta digital e precisa através do Cloudwatch entender a quantidade de erros que foram gerado nas últimas 24 horas.

[Projeto: Projeto Base](https://github.com/zup-academy/bancodigital/tree/monitoria-e-tracing-tc1-tl3)

## Criando Dashboards

### Teorias Necessárias
1 - O que é o Prometheus?
- [Video: O que é o Prometheus?](https://www.youtube.com/watch?v=_GJOS4c3x-Q&ab_channel=4Zuppers)
- [Conteúdo escrito: O que é o Prometheus?](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/o-que-e-prometheus.md)

2 - O que é o Micrometer e Grafana?
- [Video: O que é o Micrometer e Grafana?](https://www.youtube.com/watch?v=GtBTwkL7ri0&ab_channel=4Zuppers) 
- [Conteúdo escrito: O que é o Micrometer](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/o-que-e-o-micrometer.md)
- [Conteúdo escrito: O que é o Grafana](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/o-que-e-o-grafana.md)

3 - Trabalhando com Prometheus, Grafana e micrometer
- [Video: Trabalhando com Prometheus, Grafana e micrometer](https://www.youtube.com/watch?v=xDgpakaZSZE&ab_channel=4Zuppers) 

4 - Utilizando PromQl
- [Video: Utilizando PromQl](https://www.youtube.com/watch?v=9wa7ZF5uUII&ab_channel=4Zuppers)

5 - Criando painéis no Grafana
- [Video: Criando painéis no Grafana](https://www.youtube.com/watch?v=UQmGFK9cg48&ab_channel=4Zuppers) 

### Atividades Preparatórias
**Construindo dashboards no Grafana e Prometheus**
- (Video: Criando Dashboards no Grafana)[https://www.youtube.com/watch?v=7uLNBh1TpWo]
- O código utilizado no vídeo está disponível em [https://github.com/zup-academy/livraria/tree/monitoria-tracing-tc4-tl1](https://github.com/zup-academy/livraria/tree/monitoria-tracing-tc4-tl1)

### Atividades Obrigatórias
**Adicionando métricas na aplicação Java/Spring**

Produto deseja alguns dashs para ANALISE DE BUSINESS, nesse caso você irá construir um dashboard utilizando o banco de dados como a fonte de dados do Grafana.
Você deverá criar um painel que indique a quantidade de livros vendidos por tipo de pagamento.
Subir a aplicação que esta no diretório e seguir as orientações como esta no README do projeto.

Projeto: [Projeto Base](https://github.com/zup-academy/livraria/tree/monitoria-tracing-tc4-tl2)

**Criando painéis para monitoria no Grafana**

Cinco vezes na mesma semana e a aplicação do banco digital ficou fora, então o time decidiu que precisa começar a monitorar a aplicação.
A sua empresa já utiliza o Prometheus e o Grafana, o pessoal da área que cuida da infraestrutura dessas duas aplicações pediu o endpoint que precisam configurar no Prometheus e os usuários que serão adicionados no Grafana.

[Projeto: Projeto Base](https://github.com/zup-academy/bancodigital/tree/monitoria-e-tracing-tc1-tl3)

Dada a situação informada inicialmente descreva quais passos macros serão necessários para sua equipe expor métricas da jvm, das requisições http no Grafana para sua equipe monitorar?

[Resposta do Especialista]

1-Configurar o Spring Actutor, o Micrometer para Prometheus e habilitar endpoint na aplicação. já que através deles são geradas métricas do tipo que desejamos coletar.
2-informar a url que deverá ser consultada pelo Prometheus para o time que gerencia estas aplicações na empresa.
3-Passar os usuários para o time, ou realizar o processo de solicitação de acesso ao Grafana das pessoas do time.
4- Criar o dashboard para análise desses aspectos da aplicação
5- E finalizando com a criação dos painéis


Agora vamos criar os painéis necessários. Considerando que o dashboard esta criado e que você já esta na tela de configuração do painel e precisa exibir o tempo máximo por endpoints existentes na aplicação, descreva como você faria isso.This question is required.

[Resposta do Especialista]

1- Selecionaria na Aba de Query a fonte de dados que seria o Prometheus.
2- Selecionaria a métrica http_server_requests_seconds_max no campo "Metrics browser"
3- Manteria o tipo de painel de time series porque é mais simples de entender os picos e baixas relacionados a esta métrica.
4- Salvaria o painel clicando em "Apply" ao lado direito superior.

Você deverá criar outro painel dentro do dashboard que foi criado. O painel deverá informar a quantidade de requests de transferencias/pix que executaram com erro. Considere para os passos que você já clicou para criar um painel

1- Escolher na Aba metric a opção de fonte de dados do Prometheus.
2- Selecionar no campo "Metrics browser" a métrica http_server_requests_seconds_count
3- Clicaria na opção Builder localizado à direita da aba Query
4- no campo Label selecionaria a opção "uri" = "/transferencias/pix"
5- Clicaria no botão + ao lado direito para adicionar mais uma label
6- Selecionaria status=500
7- Abaixo selecionaria no botão operations > Aggregation > Count
8 - Clicaria novamente no botão "Run Query"
9- Alteraria o tipo de gráfico para Stats para ter uma melhor visualização.
10- Clicaria em "Apply"

## Alertas e notificação
### Teorias Necessárias
1 - Entendendo mais sobre Alertas
- [Video: Sobre Alertas](https://www.youtube.com/watch?v=gUx_rIsVJpk&ab_channel=4Zuppers)

2 - Conteúdo Teórico escrito - Alertas
- [Conteúdo escrito: Sobre Alertas](https://github.com/zup-academy/materiais-publicos-treinamentos/blob/main/monitoria-e-tracing/sobre-alertas.md)
## Links
- [Video: Implementando Spring Actuator em uma Aplicação de Livraria](https://www.youtube.com/watch?v=fZcEII-NNdQ&ab_channel=4Zuppers)
- [Código fonte](https://github.com/zup-academy/livraria/tree/monitoria-tracing-tc-2-tl-1)
- [Spring Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
- [Querying Prometheus](https://prometheus.io/docs/prometheus/latest/querying/basics/)
- [Dashboads Grafana para importar](https://grafana.com/grafana/dashboards/)
