package com.harinder.pharmadtu.Customer.Blood;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.harinder.pharmadtu.R;

import java.util.ArrayList;


public class BloodAdapter extends RecyclerView.Adapter<BloodAdapter.MyViewHolder> {

    ArrayList<BloodObject> marray;

    public BloodAdapter(ArrayList<BloodObject> marray) {
        this.marray = marray;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.blood_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        BloodObject object = marray.get(position);
        holder.t1.setText(object.getMname());
        holder.t2.setText(object.getBtype());
        holder.t3.setText(object.getMphnno());
        holder.t4.setText(object.getMpincode());
    }

    @Override
    public int getItemCount() {

        return marray.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView t1, t2, t3, t4;

        public MyViewHolder(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.Dname);
            t2 = (TextView) itemView.findViewById(R.id.btype);
            t3 = (TextView) itemView.findViewById(R.id.contnno);
            t4 = (TextView) itemView.findViewById(R.id.pincode);
        }
    }
}
