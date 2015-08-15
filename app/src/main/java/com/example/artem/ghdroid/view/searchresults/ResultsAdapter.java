package com.example.artem.ghdroid.view.searchresults;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.artem.ghdroid.R;
import com.example.artem.ghdroid.domain.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem on 15.08.2015.
 */
public class ResultsAdapter extends RecyclerView.Adapter<SearchViewHolder> {
    List<Repository> content = new ArrayList<>();

    @Override
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.searchitem, null);
        return new SearchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SearchViewHolder holder, int position) {
        holder.show(content.get(position));
    }

    @Override
    public int getItemCount() {
        return content.size();
    }

    public void fillWithData() {
        for (int i = 0; i < 1000; ++i) {
            Repository rep = new Repository();
            rep.setTitle(String.format("Repository %d", i));
            content.add(rep);
        }
    }
}
