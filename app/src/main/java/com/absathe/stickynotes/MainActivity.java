package com.absathe.stickynotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.absathe.stickynotes.com.absathe.stickynotes.Adapters.ThumbnailAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<StickyNoteThumbNail> thumbsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ThumbnailAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.main_view);

        adapter = new ThumbnailAdapter(thumbsList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        sampleDate();
    }
    private void sampleDate() {
        StickyNoteThumbNail sntn = new StickyNoteThumbNail("My First Note", "01/01/1970");
        thumbsList.add(sntn);

        sntn = new StickyNoteThumbNail("My Second Note", "02/01/1970");
        thumbsList.add(sntn);
        sntn = new StickyNoteThumbNail("My Third Note", "02/01/1970");
        thumbsList.add(sntn);
        sntn = new StickyNoteThumbNail("My Fourth Note", "02/01/1970");
        thumbsList.add(sntn);
        sntn = new StickyNoteThumbNail("My Fifth Note", "02/01/1970");
        thumbsList.add(sntn);
        sntn = new StickyNoteThumbNail("My sixth Note", "02/01/1970");
        thumbsList.add(sntn);
        sntn = new StickyNoteThumbNail("My seventh Note", "02/01/1970");
        thumbsList.add(sntn);
        sntn = new StickyNoteThumbNail("My eightth Note", "02/01/1970");
        thumbsList.add(sntn);
        sntn = new StickyNoteThumbNail("My nineth Note", "02/01/1970");
        thumbsList.add(sntn);
        sntn = new StickyNoteThumbNail("My tenth Note", "02/01/1970");
        thumbsList.add(sntn);
        sntn = new StickyNoteThumbNail("My random Note", "02/01/1970");
        thumbsList.add(sntn);
        sntn = new StickyNoteThumbNail("My olollolol Note", "02/01/1970");
        thumbsList.add(sntn);
        sntn = new StickyNoteThumbNail("No title", "02/01/1970");
        thumbsList.add(sntn);
    }
}
