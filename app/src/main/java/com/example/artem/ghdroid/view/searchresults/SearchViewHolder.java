package com.example.artem.ghdroid.view.searchresults;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.artem.ghdroid.R;
import com.example.artem.ghdroid.domain.Repository;

/**
 * Created by Artem on 15.08.2015.
 */
public class SearchViewHolder extends RecyclerView.ViewHolder {

    public TextView txtTitle;

    public SearchViewHolder(View itemView) {
        super(itemView);
        txtTitle = (TextView) itemView.findViewById(R.id.item_title);
    }

    public void show(Repository repository) {
        txtTitle.setText(repository.getTitle());
    }
}
