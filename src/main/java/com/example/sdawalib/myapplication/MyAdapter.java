package com.example.sdawalib.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by sdawalib on 01/12/14.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private DataSetClass[] mDataset;
    Context context;
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView name;
        public TextView pos;
        public ImageView image;
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(DataSetClass[] myDataset,Context context)
    {
        this.context=context;
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cplx_view, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        vh.image= (ImageView) v.findViewById(R.id.image);
        vh.pos=(TextView)v.findViewById(R.id.pos);
        vh.name=(TextView)v.findViewById(R.id.name);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        holder.name.setText(mDataset[position].name);
        holder.pos.setText(mDataset[position].pos);
        //holder.image.setImageResource(mDataset[position].imageResource);
        Picasso.with(context).load(mDataset[position].imageResource).transform(new RoundedTransformation(12, 0)).fit().into(holder.image);


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }

}