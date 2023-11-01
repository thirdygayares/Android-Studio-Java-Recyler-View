package com.ninebythree.fitnessfabadmin.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ninebythree.fitnessfabadmin.R;
import com.ninebythree.fitnessfabadmin.adapter.MyInterface;
import com.ninebythree.fitnessfabadmin.adapter.ScheduledAdapter;
import com.ninebythree.fitnessfabadmin.model.ScheduledModel;

import java.util.ArrayList;
import java.util.List;

public class Example extends AppCompatActivity implements MyInterface {

    private RecyclerView recyclerView;
    private ScheduledAdapter scheduledAdapter;
    private List<ScheduledModel> scheduledModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);


        //initiate UI
        recyclerView = findViewById(R.id.recyclerView);


        //create Data
        scheduledModels.add(new ScheduledModel("Alden Richard", "May 21 2023"));
        scheduledModels.add(new ScheduledModel("Maine Mendoze", "May 21 2023"));
        scheduledModels.add(new ScheduledModel("Dingdong Dantes", "May 21 2023"));
        scheduledModels.add(new ScheduledModel("Coco Martin", "May 21 2023"));

        scheduledAdapter = new ScheduledAdapter(Example.this, scheduledModels, this);

        recyclerView.setAdapter(scheduledAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Example.this));
    }

    @Override
    public void onItemClick(int pos, String categories) {

    }
}