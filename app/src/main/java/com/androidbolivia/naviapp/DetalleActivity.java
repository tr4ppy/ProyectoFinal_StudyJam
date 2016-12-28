package com.androidbolivia.naviapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    private ImageView ivImagen;
    private TextView tvNombre;
    private TextView tvDescripcion;
    private TextView tvPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        ivImagen = (ImageView) findViewById(R.id.ivDetalleRegalo);
        tvNombre = (TextView) findViewById(R.id.tvDetalleNombre);
        tvDescripcion=(TextView)findViewById(R.id.tvDetalleDescripcion);
        tvPrecio=(TextView)findViewById(R.id.tvDetallePrecio);

        Regalo regalo = (Regalo) getIntent().getSerializableExtra("rega");

        ivImagen.setImageResource(regalo.getImagen());
        tvNombre.setText(regalo.getNombre());
        tvDescripcion.setText(regalo.getDescripcion());
        tvPrecio.setText(regalo.getPrecio());
    }
}
