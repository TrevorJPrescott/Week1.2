package com.trevorpc.blabla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.trevorpc.blabla.model.Animal;
import com.trevorpc.blabla.model.Bird;
import com.trevorpc.blabla.model.Eagle;

public class MainActivity extends AppCompatActivity {
    TextView tvHellomessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHellomessage =findViewById(R.id.hello_message);

//        Animal animal = new Animal();
//        Eagle eagle = new Eagle();
//        eagle.flyUp();
        Eagle eagle = new Eagle("Bob",10000);

        tvHellomessage.setText(eagle.getName());





    }
}
