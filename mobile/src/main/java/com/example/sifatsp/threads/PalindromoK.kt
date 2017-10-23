package com.example.sifatsp.threads

/**
 * Created by Sifatsp on 12/10/2017.
 */
class PalindromoK constructor(conteudo: String) {

    val conteudo: String=conteudo
        get(){
            return field.toLowerCase();
        }

    fun ehPalindromo():Boolean{
        return conteudo == conteudo.reversed();
    }
}