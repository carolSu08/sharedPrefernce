package com.brunosouzas.etimcarolsena2preferenciasdecores

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    companion object{
        const val NOME_ARQUIVO = "arquivo_prefs.xml"
    }

    private var cor = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar!!.hide()
        window.statusBarColor = color.WHITE
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.cor1.SetOnClickListener{
            cor = "#E91E63"
            salvarCor(cor)

        }
        binding.cor2.SetOnClickListener{
            cor = "#FFEB3B"
            salvarCor(cor)

        }
        binding.cor3.SetOnClickListener{
            cor = "#9C27B0"
            salvarCor(cor)

        }
        binding.cor4.SetOnClickListener{
            cor = "#4CAF50"
            salvarCor(cor)

        }
        binding.cor5.SetOnClickListener{
            cor = "#F44336"
            salvarCor(cor)

        }
            val preferencias = getSharedPreferences(NOME_ARQUIVO, MODE_PRIVATE)
            val editor = preferencias.edit()
            editor.putString("cor",cor)
            editor.putString("nome", "Carol")
            editor.putString("Sobrenome","Suzart")
            editor.putInt("idade",16)
            editor.apply()

            snackBar(view)
    }

    private fun snackBar(view:View){
        val snackBar = snackBar.make(view,"core de fundo alterada com sucasso!", snackBar.LEGHT_INDEFINITE)
        snackBar.setAction("OK"){
        }
        snackbar.setActionTextColor(Color.BLUE)
        snackbar.setActionTextColor(Color.LTGRAY)
        snackbar.setActionTextColor(Color.GREEN)
        snackbar.show()

    }
}
