package ruu.appsalat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Rukun_Shalat extends AppCompatActivity {

    //global variabel
    ArrayList<String> mArrayList;
    ArrayAdapter<String> mAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rukun__shalat);

//        set judul
        getSupportActionBar().setTitle("Rukun Shalat");

        //        inisial listview
        mListView = (ListView)findViewById(R.id.list_rukun);

//        inisial array list sebagai wadah list
        mArrayList = new ArrayList<String>();

//        inisial adapter
        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mArrayList);

//        set adapter
        mListView.setAdapter(mAdapter);

//        isi data
        mArrayList.add("1. Takbiratull Ihram");
        mArrayList.add("2. Membaca do'a istiftah");
        mArrayList.add("3. Membaca Al-fatihah");
        mArrayList.add("4. Ruku");
        mArrayList.add("5. I'tidal");
        mArrayList.add("6. Sujud");
        mArrayList.add("7. Duduk Diantara dua Sujud");
        mArrayList.add("8. Bangkit dari sujud");
        mArrayList.add("9. Tasyahhud Awal");
        mArrayList.add("10. Tasyahhud Akhir");
        mArrayList.add("11. Salam");

    }
}
