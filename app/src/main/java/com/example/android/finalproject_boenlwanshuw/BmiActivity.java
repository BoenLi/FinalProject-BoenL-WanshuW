package com.example.android.finalproject_boenlwanshuw;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BmiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

    final EditText e1 = (EditText) findViewById(R.id.et1);
    final EditText e2 = (EditText) findViewById(R.id.et2);
    final TextView tv4 = (TextView) findViewById(R.id.tv4);

    findViewById(R.id.ib1).setOnClickListener(new View.OnClickListener() {

// Logic for validation, input can't be empty
        @Override
        public void onClick(View v) {

            String str1 = e1.getText().toString();
            String str2 = e2.getText().toString();

            if(TextUtils.isEmpty(str1)){
                e1.setError("Please enter your weight");
                e1.requestFocus();
                return;
            }

            if(TextUtils.isEmpty(str2)){
                e2.setError("Please enter your height");
                e2.requestFocus();
                return;
            }

//Get the user values from the widget reference
            float weight = Float.parseFloat(str1);
            float height = Float.parseFloat(str2)/100;

//Calculate BMI value
            float bmiValue = calculateBMI(weight, height);

//Define the meaning of the bmi value
            String bmiInterpretation = interpretBMI(bmiValue);

            tv4.setText(String.valueOf(bmiValue + "-" + bmiInterpretation));

        }
    });

}

    //Calculate BMI
    private float calculateBMI (float weight, float height) {
        return (float) (weight / (height * height));
    }

    // Interpret what BMI means
    private String interpretBMI(float bmiValue) {

        if (bmiValue < 18.5) {

            return "Underweight";
        } else if (bmiValue < 25) {

            return "Normal";

        } else {
            return "Overweight";
        }
    }

    public void food(View view) {
        startActivity(new Intent(this, FoodActivity.class));
    }
    public void map(View view) {
        String searchFood;
        searchFood="salad";
//        String label = "Salad";
//        String uriBegin = "geo:12,34";
//        String query = "12,34(" + label + ")";
//        String encodedQuery = Uri.encode( query  );
//        String uriString = uriBegin + "?q=" + encodedQuery;
//        Uri uri = Uri.parse( uriString );
//        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri );
//        startActivity( intent );
        Uri gmmIntentUri = Uri.parse("geo:40.8102,-73.9606?q="+searchFood);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}


