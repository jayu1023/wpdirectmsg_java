package com.example.myallonesolution;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.viewholder> {
    View v;
    private  ArrayList<String> list=new ArrayList<>();
    private  Context c1;


    public adapter(Context context, ArrayList<String> temp) {
        this.c1=context;
        this.list=temp;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v= LayoutInflater.from(c1).inflate(R.layout.list_tile,parent,false);
        return new viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.t1.setText(list.get(position));
        holder.t1.setTag(list.get(position));
        holder.t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity ac=(MainActivity)c1;
                ac.show(view.getTag().toString());
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewholder extends RecyclerView.ViewHolder
    {
        TextView t1;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.text);


        }
    }
}
