package com.example.clase4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

//import com.android.car.ui.toolbar.MenuItem;

public class MainActivity extends AppCompatActivity {

    ListViewAdapter adapter; // sirve para cargar listview
    ListView lista;


    String[] titulo = new String[]{"Tazumal","Joya de Ceren","San Andres"};
    int[] imagenes = {
            R.drawable.tazumal,
            R.drawable.joyaceren,
            R.drawable.sanandres
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.listview1);

        adapter = new ListViewAdapter(this,titulo,imagenes); //cargo elementos a adaptador

        lista.setAdapter(adapter); // agrega elementos de adapter a listview
    }

    public boolean onCreateOptionsMenu(Menu menu){ //define el menu overflow
        getMenuInflater().inflate(R.menu.menuoverflow, menu);
            return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        //Obtener que item es el seleccionado por medio de una variable int
        int id = item.getItemId();

        //Preguntar si se ha presionado el item 0 con id item1
        if(id == R.id.item1){
            //Llamada a la nueva activity con la información de Acerca de...
            Intent acerca = new Intent(MainActivity.this,activity_acerca_de.class);
            startActivity(acerca);
        }//Fin IF

        return super.onOptionsItemSelected(item);

    }


}