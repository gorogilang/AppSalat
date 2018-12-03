package ruu.appsalat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Persiapan extends AppCompatActivity {

    String[] listArray={"ASP","HTML"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persiapan);
//
//        getSupportActionBar().setTitle("Persiapan Shalat");

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_persiapan,listArray);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
