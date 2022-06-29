package com.example.bookstore;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BookAdaptor extends ArrayAdapter {
    int mLayoutID;
    List<BookList> dataset;
    Context mContext;

    public BookAdaptor(Context context, int resource, List<BookList> objects) {
        super(context, resource, objects);
        mContext = context;
        dataset = objects;
        mLayoutID = resource;
    }

    public static class pickedAuthor implements Parcelable {
        private String genre;
        private String bookTitle;
        private String synopsis;
        private String bookAuthor;
        private String bookPublisher;
        private String bookImage;

        public pickedAuthor(String genre, String bookTitle, String synopsis, String bookAuthor, String bookPublisher, String bookImage) {
            this.genre = genre;
            this.bookTitle = bookTitle;
            this.synopsis = synopsis;
            this.bookAuthor = bookAuthor;
            this.bookPublisher = bookPublisher;
            this.bookImage = bookImage;
        }

        protected pickedAuthor(Parcel in) {
            genre = in.readString();
            bookTitle = in.readString();
            synopsis = in.readString();
            bookAuthor = in.readString();
            bookPublisher = in.readString();
            bookImage = in.readString();
        }

        public static final Creator<pickedAuthor> CREATOR = new Creator<pickedAuthor>() {
            @Override
            public pickedAuthor createFromParcel(Parcel in) {
                return new pickedAuthor(in);
            }

            @Override
            public pickedAuthor[] newArray(int size) {
                return new pickedAuthor[size];
            }
        };

        public String getBookBanner() {
            return genre;
        }
        public String getBookImage() {
            return bookImage;
        }
        public String getBookTitle() {
            return bookTitle;
        }
        public String getBookSynopsis() {
            return synopsis;
        }
        public String getBookAuthor() {
            return bookAuthor;
        }
        public String getBookPublisher() {
            return bookPublisher;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(genre);
            dest.writeString(bookTitle);
            dest.writeString(synopsis);
            dest.writeString(bookAuthor);
            dest.writeString(bookPublisher);
            dest.writeString(bookImage);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int currentDigit;
        View currentListViewItem = convertView;

        // Check if the existing view is being reused, otherwise inflate the view
        if (currentListViewItem == null) {
            currentListViewItem = LayoutInflater.from(getContext()).inflate(mLayoutID, parent, false);
        }
        //Get the Number object for the current position
        final BookList currentNumber = dataset.get(position);

        //Set the attributed of list_view_number_item views
        ImageView iconImageView = (ImageView) currentListViewItem.findViewById(R.id.image_view_book_icon);
        int i = mContext.getResources().getIdentifier(
                currentNumber.getBookImage(), "drawable",
                mContext.getPackageName());

        //Setting the icon
        iconImageView.setImageResource(i);

        TextView titleNameTextView = (TextView) currentListViewItem.findViewById(R.id.text_view_book_title);
        titleNameTextView.setText(currentNumber.getBookTitle());

        TextView authorNameTextView = (TextView) currentListViewItem.findViewById(R.id.text_view_author_name);
        authorNameTextView.setText(currentNumber.getBookAuthor());

        TextView publisherNameTextView = (TextView) currentListViewItem.findViewById(R.id.text_view_publisher_name);
        publisherNameTextView.setText(currentNumber.getBookPublisher());

        final String currentGenre,currentTitle, currentBookImage, currentCategoryImage, currentSynopsis, currentAuthor, currentPublisher;
        currentGenre = currentNumber.getCategoryImage();
        currentTitle = currentNumber.getBookTitle().toString();
        currentBookImage = currentNumber.getBookImage();
        currentSynopsis = currentNumber.getBookSynopsis();
        currentAuthor = currentNumber.getBookAuthor();
        currentPublisher = currentNumber.getBookPublisher();

        CardView button = (CardView) currentListViewItem.findViewById(R.id.card_view_list_item);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;

                intent = new Intent(v.getContext(), DetailsActivity.class);

                pickedAuthor author;
                author = new pickedAuthor(currentGenre, currentTitle, currentSynopsis, currentAuthor, currentPublisher, currentBookImage);
                intent.putExtra("Author", author);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(intent);
            }
        });

        return currentListViewItem;
    }
}
