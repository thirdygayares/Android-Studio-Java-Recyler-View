package com.ninebythree.fitnessfabadmin.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.ninebythree.fitnessfabadmin.R;
import com.ninebythree.fitnessfabadmin.adapter.MyInterface;
import com.ninebythree.fitnessfabadmin.adapter.ScheduledAdapter;
import com.ninebythree.fitnessfabadmin.model.ScheduledModel;

import java.util.ArrayList;
import java.util.List;

public class Homepage extends AppCompatActivity implements MyInterface {

    //call Schedule Adapter
    ScheduledAdapter scheduledAdapter;

    private List<ScheduledModel> scheduledModels = new ArrayList<>();

    private RecyclerView recylerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_homepage);

        //connect UI
        recylerView = findViewById(R.id.recylerView);

        scheduledModels.add(new ScheduledModel("Thirdy gayares", "May 5 2023"));
        scheduledModels.add(new ScheduledModel("Marielle Zabala", "May 8 2023"));
        scheduledModels.add(new ScheduledModel("John Karl Santos", "May 11 2023"));

        // create new instance of ScheduledAdapter
        scheduledAdapter = new ScheduledAdapter(Homepage.this, scheduledModels, this);

        //set Adapter to recycler view
        recylerView.setAdapter(scheduledAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(Homepage.this));

    }


    @Override
    public void onItemClick(int pos, String categories) {
        Toast.makeText(this, "Clicked: " + scheduledModels.get(pos).getName(), Toast.LENGTH_SHORT).show();
    }

}