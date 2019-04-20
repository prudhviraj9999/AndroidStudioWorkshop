package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.PipedOutputStream;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewInformation> {

    Context c;
    int images[];
    String movieNames[],actorNames[];

    public DataAdapter(Context c, int[] images, String[] movieNames, String[] actorNames) {
        this.c = c;
        this.images = images;
        this.movieNames = movieNames;
        this.actorNames = actorNames;
    }

    @NonNull
    @Override
    public DataAdapter.ViewInformation onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(c).inflate(R.layout.design,viewGroup,false);
        ViewInformation vi  = new ViewInformation(v);
        return vi;
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewInformation viewInformation, int i) {
            viewInformation.poster.setImageResource(images[i]);
            viewInformation.movn.setText(movieNames[i]);
            viewInformation.actn.setText(actorNames[i]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewInformation extends RecyclerView.ViewHolder {
        ImageView poster;
        TextView movn,actn;
        public ViewInformation(@NonNull View itemView) {
            super(itemView);
            poster= itemView.findViewById(R.id.poster);
            movn=itemView.findViewById(R.id.moviename);
            actn=itemView.findViewById(R.id.actorname);
        }
    }
}
