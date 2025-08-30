# banco-digital#  Banco Digital com Java e Orientação a Objetos

Este projeto foi desenvolvido como parte do desafio de POO da Trilha Java da DIO.  
O objetivo é aplicar os pilares da Programação Orientada a Objetos (POO) no contexto de um sistema bancário simples.

 Conceitos aplicados

-Abstração→ `IConta` define os comportamentos essenciais de uma conta (sacar, depositar, transferir, imprimirExtrato).
-Encapsulamento→ atributos sensíveis (`saldo`, `numero`, `agencia`) são protegidos e manipulados apenas via métodos.
-Herança→ `ContaCorrente` e `ContaPoupanca` herdam a estrutura de `Conta`.
-Polimorfismo→ variáveis do tipo `IConta` podem referenciar tanto uma `ContaCorrente` quanto uma `ContaPoupanca`.
