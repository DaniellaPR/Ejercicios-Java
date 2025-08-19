package com.kaputt.app

import android.annotation.SuppressLint
import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val dbHelper = DBHelper(this)
        val db = dbHelper.writableDatabase


        // Usuario
        val valoresUsuario = ContentValues()
        valoresUsuario.put("USU_ID", "U1")
        valoresUsuario.put("USU_nombre", "Israel")
        db.insert("USUARIO", null, valoresUsuario)
        valoresUsuario.clear()
        Toast.makeText(this, "Usuario insertado con ID: U1", Toast.LENGTH_SHORT).show()

        valoresUsuario.put("USU_ID", "U2")
        valoresUsuario.put("USU_nombre", "Daniela")
        db.insert("USUARIO", null, valoresUsuario)
        valoresUsuario.clear()
        Toast.makeText(this, "Usuario insertado con ID: U2", Toast.LENGTH_SHORT).show()


        valoresUsuario.put("USU_ID", "U3")
        valoresUsuario.put("USU_nombre", "Gabriel")
        db.insert("USUARIO", null, valoresUsuario)
        valoresUsuario.clear()
        Toast.makeText(this, "Usuario insertado con ID: U3", Toast.LENGTH_SHORT).show()


        valoresUsuario.put("USU_ID", "U4")
        valoresUsuario.put("USU_nombre", "Mike")
        db.insert("USUARIO", null, valoresUsuario)
        valoresUsuario.clear()
        Toast.makeText(this, "Usuario insertado con ID: U4", Toast.LENGTH_SHORT).show()

        val a = DBHelper(this)
        mostrarDatos(a)


    }

    @SuppressLint("Range")
    private fun mostrarDatos(dbHelper: DBHelper) {
        val db = dbHelper.readableDatabase
        val datos = StringBuilder()


        // Mostrar USUARIOS
        val cursorUsuario = db.rawQuery("SELECT * FROM USUARIO", null)
        datos.append("USUARIOS:\n")

        if (cursorUsuario.moveToFirst()) {
            do {
                val id = cursorUsuario.getString(cursorUsuario.getColumnIndex("USU_ID"))
                val nombre = cursorUsuario.getString(cursorUsuario.getColumnIndex("USU_nombre"))

                datos.append("ID: ").append(id).append("\n")
                datos.append("Nombre: ").append(nombre).append("\n")
            } while (cursorUsuario.moveToNext())
        } else {
            datos.append("Sin datos.\n\n")
            Log.d("USUARIO", "No se encontraron registros en la tabla USUARIO.")
        }

        cursorUsuario.close()
        db.close()

        AlertDialog.Builder(this)
            .setTitle("Usuarios registrados")
            .setMessage(datos.toString())
            .setPositiveButton("OK", null)
            .show()
    }

}