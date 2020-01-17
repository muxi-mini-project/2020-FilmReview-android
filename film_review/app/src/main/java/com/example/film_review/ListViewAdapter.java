package com.example.film_review;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.InnerHolder> {

    //设置数据

    private List<AttentionItem> mData;

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


    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //传进去的view就是条目界面
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.attention_item,parent,false);
        return new InnerHolder(view);
    }

    @Override

    //用于绑定holder，一般用来设置数据
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {

    }

    @Override
    //返回条目个数
    public int getItemCount() {
        if(mData!=null){
            return mData.size();
        }
        return 0;
    }


    //这个方法用于创建条目的view
    public class InnerHolder extends RecyclerView.ViewHolder {
        private TextView mName;
        private ImageView mIcon;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);

            //mIcon=(ImageView)itemView.findViewById(R.id.attention_icons);
            //mName=(TextView)itemView.findViewById(R.id.attention_username);
        }

        public void setData(AttentionItem AttentionItem) {
            mIcon.setImageResource(AttentionItem.icon);
            mName.setText(AttentionItem.name);

        }
    }
}
