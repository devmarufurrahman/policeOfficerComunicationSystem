package com.example.policecommunication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.viewHolder>{

    Context context;
    List<contactModal> arrContacts;


    RecyclerContactAdapter(Context context, List<contactModal> arrContacts){
        this.context = context;
        this.arrContacts = arrContacts;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_list_activity, parent, false);
        RecyclerView.ViewHolder viewHolder = new viewHolder(view);
        return (RecyclerContactAdapter.viewHolder) viewHolder;
    }

    public void filterList(List<contactModal> filterList){
        arrContacts = filterList;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.imgUser.setImageResource(arrContacts.get(position).img);
        holder.txtTitle.setText(arrContacts.get(position).title);
        holder.txtDesc.setText(arrContacts.get(position).desc);
        holder.txtLocation.setText(arrContacts.get(position).location);
        holder.txtLog.setText(arrContacts.get(position).log);




    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtDesc, txtLocation, txtLog;
        ImageView imgUser;
        LinearLayout llRow;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.activityListTitle);
            txtDesc = itemView.findViewById(R.id.activityListDetails);
            imgUser = itemView.findViewById(R.id.activityUserImg);
            txtLocation = itemView.findViewById(R.id.locationActivity);
            txtLog = itemView.findViewById(R.id.activityList);
            llRow = itemView.findViewById(R.id.llRow);
        }
    }


}
