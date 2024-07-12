package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.btn12);
        Button btn2=findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img=findViewById(R.id.imageView);
                Toast.makeText(MainActivity.this, "Image Change", Toast.LENGTH_SHORT).show();
                img.setImageResource(R.drawable.download);
            }
        });
   btn.setOnClickListener(new View.OnClickListener() {
       @Override

       public void onClick(View v) {
           EditText txn=findViewById(R.id.edt);
           EditText pass=findViewById(R.id.psd);
           Toast.makeText(MainActivity.this, txn.getText().toString(), Toast.LENGTH_SHORT).show();
           Toast.makeText(MainActivity.this, pass.getText().toString(), Toast.LENGTH_SHORT).show();

       }
   });
    }
}