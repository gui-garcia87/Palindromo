package com.example.sifatsp.threads

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_verificar.setOnClickListener(this)



    }

    override fun onClick(v: View?) {

        val palindromo = PalindromoK(et_palindromo.text.toString())
        var resposta: String

        resposta = if(palindromo.ehPalindromo())
            "E palindromo"
            else
            " nao e palindromo"

        resposta = palindromo.conteudo + resposta
        tv_resposta.text = resposta

    }
}
