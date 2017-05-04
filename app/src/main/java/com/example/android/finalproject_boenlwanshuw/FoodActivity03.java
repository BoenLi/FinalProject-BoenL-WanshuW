package com.example.android.finalproject_boenlwanshuw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Addie on 2017/5/3.
 */

public class FoodActivity03 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Info> itemList;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food03);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        initItemData();
        adapter = new MyAdapter(itemList, FoodActivity03.this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initItemData() {
        itemList = new ArrayList<>();
        itemList.add(new Info("Meats", "Red meat is an excellent source of protein that will help you gain muscle. It contains leucine, an amino acid that helps stimulate muscle protein synthesis. The fattier the meat, the more calories you will take in.\n" +
                "Steak, for example, contains around 3 grams of leucine per 6 ounces. Leucine is the key amino acid your body needs to stimulate muscle protein synthesis and add new muscle tissue", R.drawable.redmeat));
        itemList.add(new Info("Dried Fruits", "Dried fruit is packed with calories, healthy fiber and antioxidants. It’s an easy way to add nutrients and calories to your diet.\n" +
                "\n" +
                "Try combining some dried fruit with a protein source, such as cuts of meat or a whey protein shake. They also mix really well with nuts and natural yogurt, providing a blend of healthy fats, protein and other key nutrients.\n", R.drawable.driedfruit));
        itemList.add(new Info("Avocado", "Avocados are full of healthy fats and nutrients. They’re versatile and can be added to many different meals or eaten on their own. Unlike other whole fruits, avocados are fairly calorie-dense and therefore a great food to help you gain weight. Just one large avocado (200 grams) provides around 322 calories, 29 grams of fat and 17 grams of fiber. Try adding avocados to your main meals and other dishes such as omelets or sandwiches.\n", R.drawable.avocado));
        itemList.add(new Info("Cereal Bar", "Stick to cereal bars that have whole grains and other healthy ingredients such as dried fruit and nuts. They are also a good choice before or after a training session, since they tend to contain a mix of slow- and fast-digesting carbs. As with cereals, try to stick to bars made from healthy whole grains. You can also find bars that contain other healthy ingredients, such as dried fruits, nuts or seeds.\n" +
                "As a snack or meal on the go, try combining a cereal bar with other protein sources, such as natural yogurt, boiled eggs, cold cuts of meat or a protein shake.\n", R.drawable.cerealbar));
        itemList.add(new Info("Dark Chololate", "Dark chocolate is packed with antioxidants and other nutrients, along with plenty of calories to help you gain weight.\n" +
                "Like other high-fat foods, dark chocolate has a very high calorie density. This means it’s very easy to obtain many calories from it.\n" +
                "Each 100-gram (3.5-ounce) bar has around 600 calories. It is also packed full of micronutrients and health-promoting compounds, including fiber, magnesium and antioxidants\n", R.drawable.darkchololate));
        itemList.add(new Info("Yogurt", "Full-fat yogurt is another ingredient that can help you add healthy fats and protein to your diet. It’s great on its own, or as an ingredient that works in many dishes.\n" +
                "\n" +
                "Yogurt and fruit: Combine 1–2 cups of yogurt with fresh or dried fruit. You can also add nuts, seeds, honey, granola or coconut flakes.\n" +
                "Chocolate peanut butter pudding: Mix 1–2 cups of yogurt with 100% cocoa powder, peanut or any nut butter and a sweetener such as stevia. You can also add a scoop of whey if you are trying to add extra protein.\n" +
                "Smoothies: Yogurt is an excellent addition to virtually any smoothie to increase the protein content and give it a more creamy, milkshake-like thickness.\n", R.drawable.fullfatyogurt));

    }

}
