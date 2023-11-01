package com.ninebythree.fitnessfabadmin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.ninebythree.fitnessfabadmin.R;
import com.ninebythree.fitnessfabadmin.model.ScheduledModel;

import java.util.List;

public class ScheduledAdapter extends RecyclerView.Adapter<ScheduledAdapter.ViewHolder> {

    //Create interface
    public final MyInterface myInterfaces;

    //Context  ex. MainActivity.class or Homepage.class
    Context context;
    //Array list or list
    List<ScheduledModel> scheduledModels;

    //TODO: Create constructor


    public ScheduledAdapter(Context context, List<ScheduledModel> scheduledModels, MyInterface myInterfaces) {
        this.myInterfaces = myInterfaces;
        this.context = context; //Homepage.class
        this.scheduledModels = scheduledModels;
    }

    @NonNull
    @Override
    public ScheduledAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //tatawagin yung mismong recyler_items_scheduled.xml
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyler_item_scheduled, parent, false);

        return new ViewHolder(view, myInterfaces);
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduledAdapter.ViewHolder holder, int position) {
        //TODO: Set data to views
        //Set Values to views
        //example text

        holder.txtName.setText(scheduledModels.get(position).getName());
        holder.txtDate.setText(scheduledModels.get(position).getDate());

    }

    @Override
    public int getItemCount() {
        //TODO: Return size of array list
        return scheduledModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //Dito mo tatawagin yung mga ginawa nating ID sa XML
        TextView txtName, txtDate;
        MaterialButton btnAccept, btnDecline;

        public ViewHolder(@NonNull View itemView, MyInterface myInterfaces) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtDate = itemView.findViewById(R.id.txtDate);
            btnAccept = itemView.findViewById(R.id.btnAccept);
            btnDecline = itemView.findViewById(R.id.btnDeclined);

            itemView.setOnClickListener(view -> {
              if(myInterfaces != null) {
                  int pos = getAdapterPosition();
                  if(pos != RecyclerView.NO_POSITION) {
                      myInterfaces.onItemClick(pos, "scheduled");
                  }
              }

            });

        }





    }









}
