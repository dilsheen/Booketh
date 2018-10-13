package com.apps.bellatrix.booketh.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.apps.bellatrix.booketh.Book;
import com.apps.bellatrix.booketh.R;

import java.util.ArrayList;

public class BookPageAdapter extends RecyclerView.Adapter<BookPageAdapter.BookHolder> {

    ArrayList<Book> books;
    Context context;

    public BookPageAdapter(ArrayList<Book> books, Context context) {
        this.books = books;
        this.context = context;
    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new BookHolder(LayoutInflater.from(context).inflate(R.layout.single_row_book_fund, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookHolder bookHolder, int i) {
        bookHolder.ivBook.setImageDrawable(context.getDrawable(R.drawable.book_sample));
        bookHolder.tvBookName.setText(books.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }


    class BookHolder extends RecyclerView.ViewHolder{
        ImageView ivBook;
        TextView tvBookName;
        LinearLayout bookLayout;

        public BookHolder(@NonNull View itemView) {
            super(itemView);
            ivBook = itemView.findViewById(R.id.ivBook);
            tvBookName = itemView.findViewById(R.id.tvBookName);
            bookLayout = itemView.findViewById(R.id.bookLayout);
        }
    }
}