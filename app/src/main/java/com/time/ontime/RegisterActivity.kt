package com.time.ontime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Obtener una referencia al botón desde tu diseño XML
        val registerBtn = findViewById<Button>(R.id.button)

        // Configurar un OnClickListener para el botón
        registerBtn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, MyAlarmsActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })

        // Obtener una referencia al botón desde tu diseño XML
        val goBackBtn = findViewById<Button>(R.id.Regresar)

        // Configurar un OnClickListener para el botón
        goBackBtn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, HomeActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })
    }
}