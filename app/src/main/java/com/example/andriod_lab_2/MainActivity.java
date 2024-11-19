package com.example.andriod_lab_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Book> books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell", R.drawable.book_1984));
        books.add(new Book("To kill a Mockingbird", "Harper Lee", R.drawable.to_kill_a_mockingbird));
        books.add(new Book("The great Gatsby", "F. Scott Fitzgerald", R.drawable.the_great_gatsby));
        books.add(new Book("Three comrades", "Erich Maria Remarque", R.drawable.comrads));
        books.add(new Book("Arch of triumph", "Erich Maria Remarque", R.drawable.arch));
        books.add(new Book("Crime and punishment", "Fedor Dostoevsky", R.drawable.crime));
        books.add(new Book("Fahrenheit 451", "Ray Bradbury", R.drawable.fahrengeit));
        books.add(new Book("A farewell to arms", "Ernest Hemingway", R.drawable.farewell));
        books.add(new Book("Norwegian forest", "Haruki Murakami", R.drawable.forest));
        books.add(new Book("Kafka on the stone", "Haruki Murakami", R.drawable.kafka));
        books.add(new Book("Eugene Onegin", "Alexander Pushkin", R.drawable.onegin));
        books.add(new Book("Painted Veil", "Somerset Maugham", R.drawable.veil));
        books.add(new Book("The razor's edge", "Somerset Maugham", R.drawable.razor));
        books.add(new Book("The illustrated man", "Ray Bradbury", R.drawable.man));

        BookAdapter adapter = new BookAdapter(books);
        recyclerView.setAdapter(adapter);
    }
}
