package com.example.bookstore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import maes.tech.intentanim.CustomIntent;

public class ListActivity extends AppCompatActivity {
    public BookDetailsClass firstBook, secondBook, thirdBook, fourthBook, fifthBook, sixthBook, seventhBook, eightBook, ninthBook, tenthBook;
    String genre = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        Intent intent = getIntent();
        genre = (String)intent.getSerializableExtra("Genre");
        firstBook = (BookDetailsClass)intent.getSerializableExtra("1st Book");
        secondBook = (BookDetailsClass)intent.getSerializableExtra("2nd Book");
        thirdBook = (BookDetailsClass)intent.getSerializableExtra("3rd Book");
        fourthBook = (BookDetailsClass)intent.getSerializableExtra("4th Book");
        fifthBook = (BookDetailsClass)intent.getSerializableExtra("5th Book");
        sixthBook = (BookDetailsClass)intent.getSerializableExtra("6th Book");
        seventhBook = (BookDetailsClass)intent.getSerializableExtra("7th Book");
        eightBook = (BookDetailsClass)intent.getSerializableExtra("8th Book");
        ninthBook = (BookDetailsClass)intent.getSerializableExtra("9th Book");
        tenthBook = (BookDetailsClass)intent.getSerializableExtra("10th Book");


        Map<Integer, BookDetailsClass> words = getBookDetails();
        BookAdaptor arrayAdapter = new BookAdaptor(this, R.layout.list_view_item, getBooks());

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(arrayAdapter);
    }

    private Map<Integer, BookDetailsClass> getBookDetails() {
        Map<Integer, BookDetailsClass> words = new LinkedHashMap<Integer, BookDetailsClass>();
        words.put(1, firstBook);
        words.put(2, secondBook);
        words.put(3, thirdBook);
        words.put(4, fourthBook);
        words.put(5, fifthBook);
        words.put(6, sixthBook);
        words.put(7, seventhBook);
        words.put(8, eightBook);
        words.put(9, ninthBook);
        words.put(10, tenthBook);

        return words;
    }


    private List<BookList> getBooks() {
        List<BookList> bookList = new ArrayList<>();
        for (Integer key : getBookDetails().keySet()) {
            int digit = key;
            BookDetailsClass currentBook = getBookDetails().get(key);
            String bookName = currentBook.getBookTitle();
            String bookAuthor = currentBook.getBookAuthor();
            String bookSynopsis = currentBook.getBookSynopsis();
            String bookPublisher = currentBook.getBookPublisher();
            //could also do "String bookBanner = genre + "_bookbanner_" + String.valueOf(key);" if you want specific banner image for specific books.
            String bookBanner = genre + "_bookbanner";
            String bookImage = genre + "_bookimage_" + String.valueOf(key);

            BookList aBook= new BookList(digit, bookBanner, bookImage, bookName, bookSynopsis, bookAuthor, bookPublisher);
            bookList.add(aBook);
        }
        return bookList;
    }

    @Override
    public void finish() {
        super.finish();
        CustomIntent.customType(this, "fadein-to-fadeout");
    }
}
