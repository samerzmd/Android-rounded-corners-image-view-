package com.example.sdawalib.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        DataSetClass samer=new DataSetClass();
        DataSetClass mahdi=new DataSetClass();
        DataSetClass nofal=new DataSetClass();
        DataSetClass abd=new DataSetClass();
        samer.name="Samer Zuhair";
        samer.pos="junior android dev";
        samer.imageResource=R.drawable.sam;
        mahdi.name="mahdi";
        mahdi.pos="TTL";
        mahdi.imageResource=R.drawable.mah;
        abd.name="abd";
        abd.pos="junior android dev";
        abd.imageResource=R.drawable.abd;
        nofal.name="sheik nofal";
        nofal.pos="iphone senior dev";
        nofal.imageResource=R.drawable.nofal;
        DataSetClass[] myDAtaset={samer,abd,mahdi,nofal,samer,abd,mahdi,nofal,samer,abd,mahdi,nofal,samer,abd,mahdi,nofal,samer,abd,mahdi,nofal,samer,abd,mahdi,nofal,samer,abd,mahdi,nofal,samer,abd,mahdi,nofal,samer,abd,mahdi,nofal,samer,abd,mahdi,nofal,samer,abd,mahdi,nofal,samer,abd,mahdi,nofal};
        // specify an adapter (see also next example)
       // MyAdapter.DatasetClass[] myDataset={(new MyAdapter.DatasetClass()),}
        mAdapter = new MyAdapter(myDAtaset,this);
        mRecyclerView.setAdapter(mAdapter);
    }

}
