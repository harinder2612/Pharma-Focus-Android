package com.harinder.pharmadtu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class SellerMainAdapter extends RecyclerView.Adapter<SellerMainAdapter.MyAdapter> {


    private static Context context;

    private ArrayList<OrderObject> mList;


    public SellerMainAdapter(Context context , ArrayList<OrderObject> mList)
    {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public MyAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.seller_main_list ,parent, false);
        return new MyAdapter(v);
    }

    @Override
    public void onBindViewHolder(MyAdapter holder, int position) {

        OrderObject o = mList.get(position);
        holder.name.setText(o.getCustname());
        holder.order_no.setText(o.getOrderid()+"");
        holder.quanitiy.setText(o.getCell()+"");
        holder.product_name.setText(o.getProname());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MyAdapter extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView name , product_name , quanitiy , order_no;
        ImageView phone_button;

        public MyAdapter(final View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            name = (TextView) itemView.findViewById(R.id.name_of_customer_in_seller_main);
            product_name = (TextView) itemView.findViewById(R.id.product_name_in_seller_main);
            quanitiy = (TextView) itemView.findViewById(R.id.quantity_in_seller_main);
            order_no = (TextView) itemView.findViewById(R.id.order_no_in_seller_main);
            phone_button = (ImageView)itemView.findViewById(R.id.phone_button_in_seller_main);

            phone_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:9560524402"));
                    context.startActivity(intent);
                }
            });

        }

        @Override
        public void onClick(View view) {
            Toast.makeText(context, "Feature soon",Toast.LENGTH_SHORT).show();
        }
    }
}
