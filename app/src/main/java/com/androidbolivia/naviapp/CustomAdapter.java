package com.androidbolivia.naviapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by and on 23-12-16.
 */

public class CustomAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<Regalo> items;

    public CustomAdapter(Activity activity,ArrayList data){
        this.context=activity;
        this.items=data;
    }
    @Override
    public int getCount() {return items.size();}

    @Override
    public Object getItem(int i) {return items.get(i);}

    @Override
    public long getItemId(int i) {return i;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.regalo_lista, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Regalo currentItem = (Regalo) getItem(position);
        viewHolder.itemNombre.setText(currentItem.getNombre());
        viewHolder.itemImagen.setImageResource(currentItem.getImagen());

        return convertView;
    }
    private class ViewHolder {
        TextView itemNombre;
        ImageView itemImagen;

        public ViewHolder(View view) {
            itemNombre = (TextView)view.findViewById(R.id.tvNombre);
            itemImagen = (ImageView) view.findViewById(R.id.ivImagen);
        }
    }
}
