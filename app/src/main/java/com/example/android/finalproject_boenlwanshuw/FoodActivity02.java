package com.example.android.finalproject_boenlwanshuw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Addie on 2017/5/3.
 */

public class FoodActivity02 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Info> itemList;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food02);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        initItemData();
        adapter = new MyAdapter(itemList, FoodActivity02.this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initItemData() {
        itemList = new ArrayList<>();
        itemList.add(new Info("Shrimp", "Shrimp is a type of animal found in the sea. It tends to be low in fat and calories, but high in protein. It is also loaded with various other nutrients, including selenium and vitamin B12.\n", R.drawable.shrimp));
        itemList.add(new Info("Tuna", "Tuna is very popular in Western countries, and tends to be low in fat and calories, but high in protein. It is perfect people who need to add more protein to their diets, while keeping calories low\n", R.drawable.tuna));
        itemList.add(new Info("Eggs", "Eggs are among the healthiest and most nutritious foods on the planet.They are loaded with all sorts of nutrients, including important brain nutrients and compounds that can improve eye health\n", R.drawable.eggs));
        itemList.add(new Info("Chicken", "Chicken is among the world’s most popular meats. It is high in many beneficial nutrients, and an excellent source of protein.If you’re on a low-carb diet, then it may be a better choice to go for the fattier cuts, like the wings and thighs.\n", R.drawable.chicken));
        itemList.add(new Info("Broccoli", "Broccoli is a tasty cruciferous vegetable that can be eaten both raw and cooked. It is high in vitamin C, vitamin K and fiber, and also contains potent cancer-fighting plant compounds.\n", R.drawable.broccoli));
        itemList.add(new Info("Almonds", "Almonds are incredibly tasty and crunchy. They are loaded with fiber, vitamin E and are among the world’s best sources of magnesium, a mineral that most people don’t get enough of.\n", R.drawable.almonds));

    }


}
