package com.absathe.stickynotes.com.absathe.stickynotes.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.absathe.stickynotes.R;
import com.absathe.stickynotes.StickyNoteThumbNail;
import java.util.List;

/**
 * Created by ABSathe on 08-12-2017.
 */

public class ThumbnailAdapter extends RecyclerView.Adapter<ThumbnailAdapter.ThumbnailHolder> {

    private List<StickyNoteThumbNail> thumbsList;
    public class ThumbnailHolder extends RecyclerView.ViewHolder {
        public TextView title, date;
        public ThumbnailHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            date = (TextView) view.findViewById(R.id.date);
        }
    }
    public ThumbnailAdapter(List<StickyNoteThumbNail> list) {
        this.thumbsList = list;
    }

    @Override
    public ThumbnailAdapter.ThumbnailHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.thumbail_card, parent, false);
        return new ThumbnailHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ThumbnailHolder holder, int position) {
        StickyNoteThumbNail thumbnail = thumbsList.get(position);
        holder.title.setText(thumbnail.getTitle());
        holder.date.setText(thumbnail.getDate());
    }

    @Override
    public int getItemCount() {
        return thumbsList.size();
    }
}
