package com.example.user.hanzip.Main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.user.hanzip.R;
import com.example.user.hanzip.vo.MainListVO;

import java.util.ArrayList;
import java.util.List;

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.MainListHolder> {

    private Context context;
    private List<MainListVO> mainList = new ArrayList<MainListVO>();

    public MainListAdapter(Context context) {
        this.context = context;

    }
    public void setImgData(ArrayList<MainListVO> mainList){
        this.mainList = mainList;
    }

    @Override
    public MainListAdapter.MainListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_mainlist, parent, false);
        return new MainListAdapter.MainListHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MainListAdapter.MainListHolder holder, int position) {

        if(mainList.size() == 0){
            return;
        }
        if(position>mainList.size()){}
        MainListVO item = mainList.get(position);
        ((MainListHolder)holder).address.setText(item.getAddress().toString());
        ((MainListHolder)holder).price.setText(item.getPrice());
        Glide.with(context).load(item.getImagePath()).into(holder.home_img);
    }

    @Override
    public int getItemCount() {
        return mainList.size();
    }

    public class MainListHolder extends RecyclerView.ViewHolder {
        ImageView home_img;
        TextView address,price;

        public MainListHolder(View itemView) {
            super(itemView);
            home_img = (ImageView)itemView.findViewById(R.id.home_img);
            address = (TextView)itemView.findViewById(R.id.address);
            price = (TextView)itemView.findViewById(R.id.price);

        }
    }


}

