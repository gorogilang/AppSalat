package ruu.appsalat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //deklarasi tombol
    private Button btn_persiapan,btn_rukun,btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportActionBar().setTitle("Aplikasi Tuntunan Shalat");

        //inisial tombol
        btn_persiapan = (Button)findViewById(R.id.btn_persiapan);
        btn_rukun = (Button)findViewById(R.id.btn_rukun);
        btn_exit = (Button)findViewById(R.id.btn_exit);

        // function tombol persiapan
        btn_persiapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Persiapan.class);
                startActivity(intent);
            }
        });

        // function tombol rukun
        btn_rukun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Rukun_Shalat.class);
                startActivity(intent);
            }
        });

    }

}
