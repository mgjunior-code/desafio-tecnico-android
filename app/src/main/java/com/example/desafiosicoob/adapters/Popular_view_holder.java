package com.example.desafiosicoob.adapters;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.desafiosicoob.R;

public class Popular_view_holder  extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView imageView_pop;
    OnMovieListener listener;

    public Popular_view_holder(@NonNull View itemView, OnMovieListener listener) {
        super(itemView);

        this.listener = listener;
        imageView_pop = itemView.findViewById(R.id.movie_img_popualar);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    }
}
