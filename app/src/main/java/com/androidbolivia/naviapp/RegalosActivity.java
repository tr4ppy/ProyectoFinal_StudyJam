package com.androidbolivia.naviapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RegalosActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private ListView lvDatos;
    private Activity activity;
    private CustomAdapter adaptador;
    private ArrayList<Regalo> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regalos);

        lvDatos=(ListView) findViewById(R.id.lvRegalos);
        activity=this;
        datos=new ArrayList<Regalo>();

        llenarArrayList();
        adaptador=new CustomAdapter(activity,datos);
        lvDatos.setAdapter(adaptador);
        lvDatos.setOnItemClickListener(this);
    }
    public void llenarArrayList() {
        Resources resources = getResources();
        String[] arrayNombres = resources.getStringArray(R.array.nombre);
        String[] arrayDescripcion = resources.getStringArray(R.array.descripcion);
        String[] arrayPrecio = resources.getStringArray(R.array.precio);
        TypedArray imgs = getResources().obtainTypedArray(R.array.image);
        for (int i = 0; i < arrayNombres.length; i++) {
            datos.add(new Regalo(arrayNombres[i], arrayDescripcion[i],arrayPrecio[i], imgs.getResourceId(i, -1)));
        }
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Regalo regalo = datos.get(position);
        Intent intent = new Intent(
                getApplicationContext(),
                DetalleActivity.class
        );
        intent.putExtra("rega", regalo);
        startActivity(intent);
    }
}
