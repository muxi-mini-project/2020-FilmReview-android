package com.example.film_review.personal;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.film_review.R;
import com.facebook.drawee.view.SimpleDraweeView;

public class fragment_personal extends Fragment {
    private SimpleDraweeView msimpledraweeView;
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_personal, container,false);
    }
    public void initView()
    {
        msimpledraweeView= msimpledraweeView.findViewById(R.id.avatar);
        //   mTabs=findViewById(R.id.tabs);
        //   mMyadapter=new Myadapter(getSupportFragmentManager());
        Uri imageUri= Uri.parse("http://placekitten.com/300/200");
        msimpledraweeView.setImageURI(imageUri);
    }
}
