package com.example.android.finalproject_boenlwanshuw;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView itemPhoto;
    private TextView itemTitle;
    private TextView itemDesc;
    private Button goMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        itemPhoto = (ImageView) findViewById(R.id.image);
        itemTitle = (TextView) findViewById(R.id.title);
        itemDesc = (TextView) findViewById(R.id.detail);
        goMap = (Button) findViewById(R.id.go_map);

        Intent intent = getIntent();
        String foodName = intent.getStringExtra("Info");


        final Info info = (Info) intent.getSerializableExtra("Info");
        itemPhoto.setImageResource(info.getPhotoId());
        itemTitle.setText(info.getTitle());
        itemDesc.setText(info.getDesc());

        goMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map(info.getTitle());
            }
        });


    }


    public void map(String food) {
        String searchFood;
        searchFood = food + " restaurant";
//        String label = "Salad";
//        String uriBegin = "geo:12,34";
//        String query = "12,34(" + label + ")";
//        String encodedQuery = Uri.encode( query  );
//        String uriString = uriBegin + "?q=" + encodedQuery;
//        Uri uri = Uri.parse( uriString );
//        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri );
//        startActivity( intent );
        Uri gmmIntentUri = Uri.parse("geo:40.8102,-73.9606?q=" + searchFood);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

}
