package com.example.bookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailsActivity extends AppCompatActivity {
    ViewHolder viewHolder;
    int bookImage, bannerImage;

    class ViewHolder {
        TextView titleNameTextView, synopsisTextView, authorNameTextView, publisherNameTextView;
        ImageView bannerImageView, bookImageView;
    }

    private void initalizeViews() {
        viewHolder.bannerImageView = findViewById(R.id.banner_anchor_point);
        viewHolder.bookImageView =  findViewById(R.id.category_image_anchor_point);
        viewHolder.titleNameTextView = findViewById(R.id.selected_item_anchor_point);
        viewHolder.synopsisTextView =  findViewById(R.id.text_view_synopsis);
        viewHolder.authorNameTextView =  findViewById(R.id.details_text_view_author_name);
        viewHolder.publisherNameTextView = findViewById(R.id.details_text_view_publisher_name);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        viewHolder = new ViewHolder();
        initalizeViews();

        Intent intent = getIntent();

        BookAdaptor.pickedAuthor author = intent.getParcelableExtra("Author");
        bookImage = getResources().getIdentifier(
                author.getBookImage(), "drawable",
                getPackageName());

        bannerImage = getResources().getIdentifier(
                author.getBookBanner(), "drawable",
                getPackageName());

        viewHolder.bookImageView.setImageResource(bookImage);
        viewHolder.bannerImageView.setImageResource(bannerImage);

        viewHolder.titleNameTextView.setText(author.getBookTitle());
        viewHolder.synopsisTextView.setText(author.getBookSynopsis());
        viewHolder.authorNameTextView.setText(author.getBookAuthor());
        viewHolder.publisherNameTextView.setText(author.getBookPublisher());
    }

    }




