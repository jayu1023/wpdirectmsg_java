package com.example.myallonesolution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myallonesolution.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.recyclerViewAll.setLayoutManager(new LinearLayoutManager(this));

        //setContentView(R.layout.activity_main);
//        r1=findViewById(R.id.recyclerView_all);
        list=new ArrayList<>();
        list.add("jhjkhn");
        list.add("jhjkhn1");
        list.add("jhjkhn11");
        list.add("jhjkhn111");
        list.add("jhjkhn22");
        list.add("jhjkhn1323");
        list.add("jhjkhn");
        list.add("jhjkhn");
        list.add("jhjkhn");
        list.add("jhjkhn");
        list.add("jhjkhn");
        list.add("jhjkhn");
        list.add("jhjkhn");
        list.add("jhjkhn");
        list.add("jhjkhn");

        binding.recyclerViewAll.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerViewAll.setHasFixedSize(true);

        binding.recyclerViewAll.setAdapter(new adapter(getApplicationContext(),list));
    }
void    show(String s)
    {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }
}