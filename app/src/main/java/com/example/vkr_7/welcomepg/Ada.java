package com.example.vkr_7.welcomepg;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import java.util.List;

/**
 * Created by Atharsh on 9/4/2017.
 */

public class Ada extends RecyclerView.Adapter<Ada.ViewHolder> {

    Context context;

    List<Pojo> images;


    public Ada(List<Pojo> getDataAdapter, Context context){

        super();

        this.images = getDataAdapter;

        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Pojo getDataAdapter1 =  images.get(position);

      //  Pojo pojo=new Pojo();

     holder.t1.setText(getDataAdapter1.getS1());
     holder.t2.setText((getDataAdapter1.getS2()));
        //Picasso.with(context).load(url).noFade().into(holder.image_show2);

    }

    @Override
    public int getItemCount() {

        return images.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView t1,t2;



        public ViewHolder(View itemView) {

            super(itemView);

            t1=(TextView)itemView.findViewById(R.id.text1);
            t2=(TextView)itemView.findViewById(R.id.text2);



        }

    }



}
