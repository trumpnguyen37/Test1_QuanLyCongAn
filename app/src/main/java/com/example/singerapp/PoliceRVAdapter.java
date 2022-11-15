package com.example.singerapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PoliceRVAdapter extends RecyclerView.Adapter<PoliceRVAdapter.MusicRvHolder>{
    public ArrayList<PoliceRVModel> musicRVModels;
    private  OnItemClickListner mListner;


    public interface  OnItemClickListner{
        void  onItemClick(int position);
    }

    public void setOnItemClickListner(OnItemClickListner mListner){
        this.mListner = mListner;
    }

    public PoliceRVAdapter(ArrayList<PoliceRVModel> musicRVModels){
        this.musicRVModels = musicRVModels;
    }

    public class MusicRvHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;
        public TextView textView3;
        //ConstraintLayout constraintLayout;

        public MusicRvHolder(@NonNull View itemView, final OnItemClickListner mListner) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView1 = itemView.findViewById(R.id.name);
            textView2 = itemView.findViewById(R.id.capbac);
            textView3 = itemView.findViewById(R.id.noicongtac);
            //constraintLayout = itemView.findViewById(R.id.constraintlayout);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListner!=null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            mListner.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    @NonNull
    @Override
    public PoliceRVAdapter.MusicRvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.police_rv_item_layout,parent,false);
        MusicRvHolder dynamicRvHolder = new MusicRvHolder(view, mListner);
        return dynamicRvHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PoliceRVAdapter.MusicRvHolder holder, int position) {
        PoliceRVModel currentItem = musicRVModels.get(position);
        holder.imageView.setImageResource(currentItem.getImage());
        holder.textView1.setText(currentItem.getName());
        holder.textView2.setText(currentItem.getCapbac());
        holder.textView3.setText(currentItem.getNoicongtac());
    }

    @Override
    public int getItemCount() {
        return musicRVModels.size();
    }
}
