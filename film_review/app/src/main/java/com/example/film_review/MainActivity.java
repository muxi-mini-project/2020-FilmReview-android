package com.example.film_review;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.film_review.firstpage.main_firstpage.FragmentFirstpage;
import com.example.film_review.personal.fragment_personal;
import com.facebook.drawee.backends.pipeline.Fresco;

public class MainActivity extends AppCompatActivity {
    private ImageView btn_personal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fresco.initialize(this);
        FragmentManager fragmentManager=getSupportFragmentManager();
        Fragment fragment= fragmentManager.findFragmentById(R.id.fragment_container);

        if(fragment==null){
            fragment=new FragmentFirstpage();
            fragmentManager.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }
        btn_personal=(ImageView)findViewById(R.id.personal);
        btn_personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                Fragment fragment= fragmentManager.findFragmentById(R.id.fragment_container);
                    fragment = new fragment_personal();
                    fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
            }
        });
    }
}
