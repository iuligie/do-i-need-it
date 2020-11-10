package com.emanuelg.ppw1.doineedit;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ProductViewHolder> {
    List<Product> list;

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView price;
        ImageView img_product;
        CheckBox isOwned;
        ConstraintLayout container;

        public ProductViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txtTitle);
            price=itemView.findViewById(R.id.txtPrice);
            isOwned=itemView.findViewById(R.id.checkBox);
            img_product = itemView.findViewById(R.id.img_item);
            container = itemView.findViewById(R.id.container);
        }
    }
    public RecyclerAdapter(List<Product> productList) {
        this.list = productList;
    }

    @NotNull
    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NotNull ProductViewHolder holder, final int position) {

        if(list!=null){
            Product current=list.get(position);
            holder.name.setText(current.name);
            holder.price.setText("£" + current.getPrice());
            holder.img_product.setImageResource(R.drawable.img_item);
            holder.isOwned.setOnCheckedChangeListener((compoundButton, b) -> current.setOwned(b));

        }else{ Snackbar.make(null, "No Items To Show", Snackbar.LENGTH_LONG).show();}
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}