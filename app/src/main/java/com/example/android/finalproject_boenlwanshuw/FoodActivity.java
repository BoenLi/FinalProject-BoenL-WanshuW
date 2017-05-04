package com.example.android.finalproject_boenlwanshuw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Info> itemList;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        initItemData();
        adapter = new MyAdapter(itemList, FoodActivity.this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initItemData() {
        itemList = new ArrayList<>();
        itemList.add(new Info("Salmon", "The fat-burning equation is simple: Protein builds muscle. More muscle = more fat burning. And fish is one of the healthiest sources of lean protein—especially wild salmon, says dietitian Lauren Minchen. It's also a rich source of anti-inflammatory omega-3 fatty acids, which fuel fat burning, block fat storage and aid weight loss, she explains. But that's not all: Getting enough protein and healthy fat also helps to reduce cravings and has been shown to help keep weight off for longer, adds Spokesperson for the Academy of Nutrition and Dietetics Alissa Rumsey.",
                R.drawable.salmon));
        itemList.add(new Info("Potato", "The phrase \"slow carb\" is anything but sluggish when it comes to blasting fat. Slow carbs are digested slowly, which keeps you feeling fuller and energized longer—and sweet potatoes are one of them. Among the magic ingredients here are carotenoids, antioxidants which stabilize blood-sugar levels and lower insulin resistance, which prevents calories from being converted into fat. And their high vitamin profile (including A, C, and B6) give you more energy to burn at the gym.\n", R.drawable.sweetpotato));
        itemList.add(new Info("Grapefruit", "Each slice of grapefruit you add to your salad acts like a match to spark your body's fat-burning ability. A study published in the journal Metabolism found that those who ate grapefruit for six weeks lost a full inch off their waistlines. What's behind the belt-tightening effect? The fruit is rich in phytochemicals, bioactive compounds that recent research shows stimulate the production of a hormone called adiponectin, which is involved in the breakdown of body fat. Other research suggests the juicy fruit can \"turn on\" calorie-burning brown fat cells, promoting the breakdown of body fat while reducing appetite.\n", R.drawable.grapefruit));
        itemList.add(new Info("Oyster", "Resolve to do more prying. Oysters are one of the best food sources of zinc, a mineral that works with the hormone leptin to regulate appetite. Research shows that overweight people tend to have higher levels of leptin and lower levels of zinc than slimmer folk. A study published in the journal Life Sciences found that taking zinc supplements could increase leptin production in obese men by 142 percent! A half-dozen oysters only have 43 calories but provides 21 percent of your RDA of iron—deficiencies of which have been linked to a significant increase in fat gene expression.\n"
                , R.drawable.oysters));
        itemList.add(new Info("Oatmeal", "Carbs are not the enemy. Not whole-grain carbs, that is. People who ate three or more daily servings of whole grains (such as oats) had 10 percent less belly fat than people who ate the same amount of calories from processed white carbs (bread, rice, pasta), according to a Tufts University study. It's theorized that this is due to whole grains' high fiber and slow-burn properties, which keep you satiated longer.", R.drawable.oatmeal));
        itemList.add(new Info("Spinach", "The leafy green is jam-packed with energy-boosting nutrients such as vitamin A, iron, and folate. It can also reduce your appetite—helping to curb your calorie intake and encourage your body to start burning fat—thanks to natural compounds called thylakoids. Swedish researchers found that over three months, women who consumed a five-gram thylakoid supplement from spinach reported a 25 percent reduction in hunger and cravings and significantly more weight loss (11 pounds) than the control group!\n", R.drawable.spinach));
    }



}



