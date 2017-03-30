package com.harinder.pharmadtu.Customer.Hospital;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.harinder.pharmadtu.R;

import java.util.ArrayList;


public class HospitalAdapter extends RecyclerView.Adapter<HospitalAdapter.MyViewHolder>
{

    ArrayList<HospitalObject> marray;

    public HospitalAdapter(ArrayList<HospitalObject> marray) {
        this.marray = marray;
    }

    @Override
    public HospitalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hospital_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HospitalAdapter.MyViewHolder holder, int position) {

        HospitalObject object = marray.get(position);
        holder.t1.setText(object.getMname());
        holder.t2.setText(object.getMspecialist());
        holder.t3.setText(object.getMcontno());
        holder.t4.setText(object.getMpincode()+"");
    }

    @Override
    public int getItemCount() {
        return marray.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView t1,t2,t3,t4;
        public MyViewHolder(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.Hosp_name);
            t2 = (TextView) itemView.findViewById(R.id.Hosp_Spec);
            t3 = (TextView) itemView.findViewById(R.id.Hosp_contnno);
            t4 = (TextView) itemView.findViewById(R.id.Hosp_pincode);
        }
    }
}
