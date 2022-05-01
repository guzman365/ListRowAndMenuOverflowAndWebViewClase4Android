package com.example.clase4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;//primero importar clase
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {
    Context context;
    String[] titulos;
    int[] imagenes;
    LayoutInflater inflater;

    public ListViewAdapter(Context context,String[] titulo,int[] imagenes){
        this.context=context;
        this.titulos=titulo;
        this.imagenes=imagenes;
    }


    @Override
    public int getCount() {
        return titulos.length;//Modifique
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView txtTitle; //Representa titutlos
        ImageView imgImg; //Representa las imagenes

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //asociar xml de donde traigo la estructura y como se quiere que vayan los items
        View itenView = inflater.inflate(R.layout.list_row, parent, false);  // se crea un cml llamado list_row para simular el listado de imagenes y texto

        txtTitle = itenView.findViewById(R.id.textView); //asocia el titulo segun orden
        imgImg = itenView.findViewById(R.id.imageView);  //asocia la imagen segun orden

        txtTitle.setText(titulos[position]);
        imgImg.setImageResource(imagenes[position]);

        return itenView;
    }//implemetar metodos

}
