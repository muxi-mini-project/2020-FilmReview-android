package com.example.film_review.firstpage.attention;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.film_review.R;
import com.example.film_review.firstpage.attention.AttentionItem;
import com.example.film_review.firstpage.attention.ListViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class fragment_attention extends Fragment {
    public RecyclerView list;
    public List<AttentionItem> mData;
    private LinearLayoutManager mLinearLayoutManager;
    private ListViewAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_attention,null);

        RecyclerView list=v.findViewById(R.id.recyclerview);

        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        list.setLayoutManager(mLinearLayoutManager);
        //创建适配器

        ListViewAdapter mAdapter=new ListViewAdapter();
        mAdapter.initData();
        list.setAdapter(mAdapter);


        initData();
        return v;
    }

    public void initData() {


        mData=new ArrayList<>();

        for(int i=0;i<10;i++) {
            //创建数据对象
            AttentionItem data=new AttentionItem();
            //data.icon=attention_users.icons[i];
           // data.name=attention_users.username[i];

            mData.add(data);

        }

    }
}
