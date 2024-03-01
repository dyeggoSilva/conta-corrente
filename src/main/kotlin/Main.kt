package org.example

import java.util.Scanner

fun main() {

    //declaração do scanner

val sc = Scanner(System.`in`);

    println("Qual o número da conta?: ")

    //entrada de dados

    val numeroDaConta = sc.nextInt();
    val contaCorrente = ContaCorrente(numeroDaConta);

    println(contaCorrente.imprimir1())

    println("Qual o Valor do depósito? EX. 1000: ");

    //entrada de dados

    val valorDeposito = sc.nextDouble();
    contaCorrente.creditar(valorDeposito);

    println(contaCorrente.imprimir())

    println("Qual o Valor do saque? EX. 100: ")

    //entrada de dados

    val valorSaque = sc.nextDouble()
    contaCorrente.debitar(valorSaque);

    println(contaCorrente.imprimir())

    println("quantidade de instâncias: ${contaCorrente.quantidadeDeInstancias}")










}


