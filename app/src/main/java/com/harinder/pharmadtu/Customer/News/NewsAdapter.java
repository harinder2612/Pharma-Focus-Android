package com.harinder.pharmadtu.Customer.News;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.harinder.pharmadtu.R;

import java.util.ArrayList;


public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    ArrayList<NewsObject> pArray;
    public NewsAdapter(ArrayList<NewsObject> mArray) {
        pArray=mArray;
    }

    @Override
    public NewsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NewsAdapter.MyViewHolder holder, int position) {
    NewsObject nst=pArray.get(position);
        holder.t1.setImageResource(nst.getImgID());
        holder.t2.setText(nst.getTitle());
        holder.t3.setText(nst.getText());
    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView t1;
        private TextView t2,t3;
        public MyViewHolder(View itemView) {
            super(itemView);

            t1= (ImageView)itemView.findViewById(R.id.serial);
            t2= (TextView) itemView.findViewById(R.id.title);
            t3= (TextView) itemView.findViewById(R.id.text);

        }
    }
}
