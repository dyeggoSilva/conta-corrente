package org.example

class ContaCorrente constructor(val numero: Int = 0){

    private var saldo: Double = 0.0;

    var quantidadeDeInstancias: Int = 0;

    fun getSaldo(): Double {
        return saldo;
    }

    fun debitar(valor:Double){
        if(saldo < valor){
            println("Você não tem saldo suficiente para debitar o valor de: $valor")
        }else{
            saldo -= valor;
        }
    }

    fun creditar(valor: Double){
        saldo += valor;
    }
        fun getnumero(): Int {
            return numero;
        }
   fun imprimir(){

         println(" a conta $numero está com $saldo de saldo.");

   }
    fun imprimir1(){

        println("conta criada, a conta $numero está com $saldo de saldo.");

    }
    init {
        quantidadeDeInstancias++  // Incrementa a quantidade de instâncias quando um objeto é criado
    }

    companion object { // Método estático para obter a quantidade de instâncias
        var quantidadeDeInstancias = this.obterQuantidadeDeInstancias();
        public fun obterQuantidadeDeInstancias(): Int {
            return quantidadeDeInstancias;
        }
    }
}