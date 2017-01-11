package com.example.johnny.a15_android_alert_dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    	/* Para poder mandar el view a la funciones que lo requieres */
    // View view = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void mostrarAlert(View view) {
        ImageView image = new ImageView(this);/* Se crea una image view */
        image.setImageResource(R.mipmap.ic_launcher);/*
														 * Se le asigna la
														 * imagen del helado
														 */
		/* Se crea la ventaja emergente y se parametriza */
        AlertDialog.Builder vtnEmergente = new AlertDialog.Builder(this);
        vtnEmergente.setTitle("Este es el titulo!");
        vtnEmergente.setMessage("Este es el contenido del mensaje");
        vtnEmergente.setCancelable(false);
        vtnEmergente.setNegativeButton("Confirmar",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface vtnEmergente, int id) {
                        // codigo de la accion en el click
                    }
                });

        vtnEmergente.setView(image);/* Se mete la imagen en la ventaja emergente */
        vtnEmergente.show();/* Se muestra */
    }

    public void mostrarAlert2(View view) {
        AlertDialog.Builder vtnEmergente = new AlertDialog.Builder(this);
        vtnEmergente.setTitle("Importante");
        vtnEmergente
                .setMessage("¿ Acepta la ejecución de este programa en modo prueba ?");
        vtnEmergente.setCancelable(false);
        vtnEmergente.setPositiveButton("Confirmar",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        aceptar();
                    }
                });
        vtnEmergente.setNegativeButton("Cancelar",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        cancelar();
                    }
                });
        vtnEmergente.show();
    }

    public void aceptar() {
        Toast t = Toast.makeText(this, "Bienvenido a probar el programa.",
                Toast.LENGTH_SHORT);
        t.show();
    }

    public void cancelar() {
        finish();
    }
}
