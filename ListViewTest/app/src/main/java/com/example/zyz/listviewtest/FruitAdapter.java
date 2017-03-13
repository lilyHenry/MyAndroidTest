package com.example.zyz.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zyz on 2017/3/12.
 */
public class FruitAdapter extends ArrayAdapter{

    private int resourceId;

    public FruitAdapter(Context context,int textViewResourceId, List<Fruit> fruits) {
        super(context,textViewResourceId,fruits);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Fruit fruit = (Fruit) getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);

        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);

        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());

        return view;
    }
}
