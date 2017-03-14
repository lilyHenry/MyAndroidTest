package com.example.zyz.listviewtest;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String [] data = {"apple","banana","orange","watermelon","pear","grape","pineapple","strawberry",
                                "cherry","mango","apple","banana","orange","watermelon","pear","grape",
                                "pineapple","strawberry", "cherry","mango"};

    private List<Fruit> fruits = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        FruitAdapter fruitAdapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruits);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(fruitAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruits.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_LONG).show();
            }
        });

    }

    private void initFruits(){
        for(int i = 0; i < 2; i++){
            Fruit apple = new Fruit("apple",R.drawable.apple_pic);
            fruits.add(apple);
            Fruit banana = new Fruit("banana",R.drawable.banana_pic);
            fruits.add(banana);
            Fruit orange = new Fruit("orange",R.drawable.orange_pic);
            fruits.add(orange);
            Fruit watermelon = new Fruit("watermelon",R.drawable.watermelon_pic);
            fruits.add(watermelon);
            Fruit pear = new Fruit("pear",R.drawable.pear_pic);
            fruits.add(pear);
            Fruit grape = new Fruit("grape",R.drawable.grape_pic);
            fruits.add(grape);
            Fruit pineapple = new Fruit("pineapple",R.drawable.pineapple_pic);
            fruits.add(pineapple);
            Fruit strawberry = new Fruit("strawberry",R.drawable.strawberry_pic);
            fruits.add(strawberry);
            Fruit cherry = new Fruit("cherry",R.drawable.cherry_pic);
            fruits.add(cherry);
            Fruit mango = new Fruit("mango",R.drawable.mango_pic);
            fruits.add(mango);
        }
    }
}
