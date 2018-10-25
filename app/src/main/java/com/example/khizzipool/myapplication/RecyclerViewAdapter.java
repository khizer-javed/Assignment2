package com.example.khizzipool.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    private Context mcontext;
    private List<Flags> mData;

    public RecyclerViewAdapter(Context mcontext, List<Flags> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mcontext);
        view = mInflater.inflate(R.layout.cardview_item_flag, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.flag_name.setText(mData.get(position).getFlagname());
        holder.img_flag_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(mcontext, Flag_Activity.class);
                i.putExtra("FlagName", mData.get(position).getFlagname());
                i.putExtra("Thumbnail", mData.get(position).getThumbnail());
                mcontext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView flag_name;
        ImageView img_flag_thumbnail;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);

            flag_name = itemView.findViewById(R.id.flagName);
            img_flag_thumbnail = itemView.findViewById(R.id.flagimg);
            cardView = itemView.findViewById(R.id.cardID);
        }
    }
}
