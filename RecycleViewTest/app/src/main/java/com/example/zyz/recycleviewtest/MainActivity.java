package com.example.zyz.recycleviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruits = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        FruitAdapter fruitAdapter = new FruitAdapter(fruits);
        recyclerView.setAdapter(fruitAdapter);
    }

    private void initFruits(){
        for(int i = 0; i < 2; i++){
            Fruit apple = new Fruit(getRandomLengthName("apple"),R.drawable.apple_pic);
            fruits.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("banana"),R.drawable.banana_pic);
            fruits.add(banana);
            Fruit orange = new Fruit(getRandomLengthName("orange"),R.drawable.orange_pic);
            fruits.add(orange);
            Fruit watermelon = new Fruit(getRandomLengthName("watermelon"),R.drawable.watermelon_pic);
            fruits.add(watermelon);
            Fruit pear = new Fruit(getRandomLengthName("pear"),R.drawable.pear_pic);
            fruits.add(pear);
            Fruit grape = new Fruit(getRandomLengthName("grape"),R.drawable.grape_pic);
            fruits.add(grape);
            Fruit pineapple = new Fruit(getRandomLengthName("pineapple"),R.drawable.pineapple_pic);
            fruits.add(pineapple);
            Fruit strawberry = new Fruit(getRandomLengthName("strawberry"),R.drawable.strawberry_pic);
            fruits.add(strawberry);
            Fruit cherry = new Fruit(getRandomLengthName("cherry"),R.drawable.cherry_pic);
            fruits.add(cherry);
            Fruit mango = new Fruit(getRandomLengthName("mango"),R.drawable.mango_pic);
            fruits.add(mango);
        }
    }
    private String getRandomLengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<= length; i++){
            stringBuilder.append(name);
        }
        return stringBuilder.toString();
    }
}
