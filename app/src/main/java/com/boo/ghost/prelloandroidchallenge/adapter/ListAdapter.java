package com.boo.ghost.prelloandroidchallenge.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.boo.ghost.prelloandroidchallenge.R;
import com.boo.ghost.prelloandroidchallenge.model.product.Datum;
import com.boo.ghost.prelloandroidchallenge.model.product.Product;
import com.boo.ghost.prelloandroidchallenge.model.user.Data;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by ghost on 13/12/17.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{

    private List<Datum> data;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img_prod;
        TextView tv_prod_name;
        TextView tv_prod_price;


        public ViewHolder(View itemView) {
            super(itemView);

            img_prod = (ImageView) itemView.findViewById(R.id.img_prod);
            tv_prod_name = (TextView) itemView.findViewById(R.id.tv_prod_name);
            tv_prod_price = (TextView) itemView.findViewById(R.id.tv_prod_price);
        }
    }

    public ListAdapter(List<Datum> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ListAdapter.ViewHolder holder, int i) {
        Glide.with(context).load(data.get(i).getDisplayPicts().get(0)).into(holder.img_prod);
        holder.tv_prod_name.setText(data.get(i).getName()+"");
        holder.tv_prod_price.setText(data.get(i).getPrice()+"");
    }

    @Override
    public int getItemCount(){
        return data.size();
    }
}
