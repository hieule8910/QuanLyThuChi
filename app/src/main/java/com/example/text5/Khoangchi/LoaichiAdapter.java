package com.example.text5.Khoangchi;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.text5.Dao.ThuchiDao;
import com.example.text5.Model.Thuchi;
import com.example.text5.R;

import java.util.ArrayList;

public class LoaichiAdapter extends RecyclerView.Adapter<LoaichiAdapter.ViewHolder> {
    static Context context;
    ArrayList<Thuchi> ds;
    public LoaichiAdapter(Context context, ArrayList<Thuchi> ds)
    {
        this.context=context;
        this.ds=ds;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tv;
        public ImageView iv_create;
        public ImageView iv_delete;
        public  ViewHolder(View itemView) {
            super(itemView);
            tv=(TextView)itemView.findViewById(R.id.tvloaithu);
            iv_create=(ImageView)itemView.findViewById(R.id.imgcreate);
            iv_delete=(ImageView)itemView.findViewById(R.id.imgdelete);
        }
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Tao view va gan layout vao view

        View v = LayoutInflater.from(context)
                .inflate(R.layout.loaithu_adapter, parent, false);
        // gan cac thuoc tinh nhu size, margins, paddings.....
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final ThuchiDao thuchiDao = new ThuchiDao(context);

        holder.tv.setText(ds.get(position).getTenthuchi());

        holder.iv_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Ban vua nhan edit", Toast.LENGTH_SHORT).show();
                
            }
        });

        holder.iv_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Ban vua nhan delete", Toast.LENGTH_SHORT).show();

            }
        });

    }


    @Override
    public int getItemCount() {
        return ds.size();
    }
}
