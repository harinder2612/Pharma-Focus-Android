package com.harinder.pharmadtu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class SellerMainFragment extends android.app.Fragment {

    DatabaseReference myref = FirebaseDatabase.getInstance().getReferenceFromUrl("https://pharmadtu.firebaseio.com/");
    RecyclerView recyclerView;
    ArrayList<OrderObject> mList;
    ProgressBar progressBar;

    public SellerMainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mList = new ArrayList<>();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seller_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        progressBar = (ProgressBar) getActivity().findViewById(R.id.progress_bar);
        recyclerView = (RecyclerView) getActivity().findViewById(R.id.recycler_view_seller_main);

        progressBar.setVisibility(View.VISIBLE);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        final SellerMainAdapter adapter = new SellerMainAdapter(getActivity() , mList);
        recyclerView.setAdapter(adapter);

        myref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                OrderObject value=dataSnapshot.getValue(OrderObject.class);

                String name = value.getCustname();
                String product_name = value.getProname();
                String order_id = value.getProductid();
                int quantity = value.getItemno();

                mList.add(new OrderObject(name , product_name ,order_id ,quantity));
                adapter.notifyDataSetChanged();
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }



}
