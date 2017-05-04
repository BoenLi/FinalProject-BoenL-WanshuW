package com.example.android.finalproject_boenlwanshuw;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Addie on 2017/5/3.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<Info> mDataset;
    private Context context;

    public MyAdapter(ArrayList<Info> myDataset, Context context) {
        mDataset = myDataset;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        ImageView item_photo;
        TextView item_title;


        public ViewHolder(View itemView) {
            super(itemView);
            item_photo = (ImageView) itemView.findViewById(R.id.image);
            item_title = (TextView) itemView.findViewById(R.id.title);


        }

    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(context)
                .inflate(R.layout.list_item, viewGroup, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final int j = position;

        holder.item_photo.setImageResource(mDataset.get(position).getPhotoId());
        holder.item_title.setText(mDataset.get(position).getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Info", mDataset.get(j));
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }


}