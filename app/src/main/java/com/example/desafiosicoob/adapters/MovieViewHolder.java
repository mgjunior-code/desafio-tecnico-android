package com.example.desafiosicoob.adapters;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.desafiosicoob.R;


public class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView imageView;

    OnMovieListener onMovieListener;


    public MovieViewHolder(@NonNull View itemView, OnMovieListener onMovieListener) {
        super(itemView);


        this.onMovieListener = onMovieListener;


        imageView = itemView.findViewById(R.id.movie_img);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        onMovieListener.onMovieClick(getAdapterPosition());
    }
}
