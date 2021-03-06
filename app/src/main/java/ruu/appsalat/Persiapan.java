package ruu.appsalat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Persiapan extends AppCompatActivity {

    //global variabel
    ArrayList<String> mArrayList;
    ArrayAdapter<String> mAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persiapan);

//        set judul
        getSupportActionBar().setTitle("Persiapan Shalat");

//        inisial listview
        mListView = (ListView)findViewById(R.id.list_persiapan);

//        inisial array list sebagai wadah list
        mArrayList = new ArrayList<String>();

//        inisial adapter
        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mArrayList);

//        set adapter
        mListView.setAdapter(mAdapter);

//        isi data
        mArrayList.add("1. Menghadap Ka'bah");
        mArrayList.add("2. Berdiri (Jika Mampu)");
        mArrayList.add("3. Niat");

    }
}
