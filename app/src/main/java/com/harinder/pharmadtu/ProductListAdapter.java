package com.harinder.pharmadtu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.MyViewHolder> {

    ArrayList<ProductListObject> marray;

    public ProductListAdapter(ArrayList<ProductListObject> marray) {
        this.marray = marray;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.productlist_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        ProductListObject object = marray.get(position);
        holder.t1.setText(object.getProduct());
        holder.t2.setText(object.getPrice());
        holder.t3.setText(object.getQuantity());

    }

    @Override
    public int getItemCount() {
        return marray.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView t1,t2,t3;
        public MyViewHolder(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.name_product);
            t2 = (TextView) itemView.findViewById(R.id.amount_product);
            t3 = (TextView) itemView.findViewById(R.id.quantity);

        }
    }
}
