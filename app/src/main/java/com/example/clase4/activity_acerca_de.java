package com.example.clase4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class activity_acerca_de extends AppCompatActivity {
    WebView html;
    String texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        html = findViewById(R.id.wvContenido);
        texto = "<html><body>";
        texto+="<div style='border-radius: 25px; border-style:solid;background-color: gold; ";
        texto+="padding: 10px;border-width: 2px'>";
        texto+="<p align='justify'>";
        texto+="Esta aplicación es producto de las diferentes jornadas de clases que se han ";
        texto+="tenido durante todo el periodo del Ciclo en la Escuela Especializada en ";
        texto+="Ingenieria ITCA-FEPADE";
        texto+="de El Salvador.";
        texto+="<br><br><strong>Programador:</strong><br> Su nombre completo </p>";
        texto+="<p><strong>Versión 1.0</strong>";
        texto +="</p></div></body></html>";

        html.loadData(texto,"text/html","utf-8");
    }

}
