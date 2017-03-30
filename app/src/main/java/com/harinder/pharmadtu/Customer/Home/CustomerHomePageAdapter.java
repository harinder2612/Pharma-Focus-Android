package com.harinder.pharmadtu.Customer.Home;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.harinder.pharmadtu.R;

import java.util.ArrayList;


public class CustomerHomePageAdapter extends RecyclerView.Adapter<CustomerHomePageAdapter.Myholder> {

    private Context context;
    private ArrayList<CustomerHome> mList;

    public CustomerHomePageAdapter(Context context, ArrayList<CustomerHome> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public CustomerHomePageAdapter.Myholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_list_item, parent , false);

        return new Myholder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomerHomePageAdapter.Myholder holder, int position) {

        CustomerHome item = mList.get(position);
        holder.title.setText(item.getMtitle());
        holder.image.setImageResource(item.getmImageResourceId());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class Myholder extends RecyclerView.ViewHolder {

        public TextView title ;
        public ImageView image;

        public Myholder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title_customer_main);
            image = (ImageView) itemView.findViewById(R.id.image_customer_main);
        }
    }
}
