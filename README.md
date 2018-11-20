# LIB-CMD
[![Build Status](https://travis-ci.org/Silva01/lib-cmd.svg?branch=master)](https://travis-ci.org/Silva01/lib-cmd)

Esta Lib realiza a execução de comandos diversos por cmd em diferentes Sistemas Operacionais

Para utilizar basta baixar o arquivo [.jar](https://github.com/Silva01/lib-cmd/releases/tag/v1.0.0) e o adicionar ao Build Path do projeto, desta forma o projeto poderá carregar as classes responsáveis por executar as funcionalidades de transação de banco de dados.

## Exemplos de cmd: 

```java
String result = Cmd.exec("echo Teste");

System.out.println(result);
// Teste
```

A Classe **Cmd** possui metódos prontos para Ping e Tracert.

```java
String result = Cmd.ping("127.0.0.1");

System.out.println(result);
/**
PING 127.0.0.1 (127.0.0.1): 56 data bytes
64 bytes from 127.0.0.1: icmp_seq=0 ttl=64 time=0.094 ms
64 bytes from 127.0.0.1: icmp_seq=1 ttl=64 time=0.120 ms
64 bytes from 127.0.0.1: icmp_seq=2 ttl=64 time=0.121 ms

--- 127.0.0.1 ping statistics ---
3 packets transmitted, 3 packets received, 0.0% packet loss
round-trip min/avg/max/stddev = 0.094/0.112/0.121/0.012 ms
*/
```

Para identificação do Host por IP, a classe Cmd tem o metódo **tracert** que obtem o host com base em um Ip

```java
String result = Cmd.tracert("127.0.0.1");

System.out.println(result);
/**
1.0.0.127.in-addr.arpa	name = localhost.
*/
```