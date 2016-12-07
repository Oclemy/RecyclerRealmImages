package com.tutorials.hp.recyclerrealmimages.m_UI;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.recyclerrealmimages.R;
import com.tutorials.hp.recyclerrealmimages.m_Realm.Spacecraft;

import java.util.ArrayList;

/**
 * Created by Oclemy on 6/16/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Spacecraft> spacecrafts;

    public MyAdapter(Context c, ArrayList<Spacecraft> spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

        Spacecraft s=spacecrafts.get(position);

        holder.nameTxt.setText(s.getName());
        holder.propTxt.setText(s.getPropellant());
        holder.descTxt.setText(s.getDescription());

        String imageUrl=s.getImageUrl().replace("localhost","10.0.2.2");

        ImageLoader.downloadImage(c,imageUrl,holder.img);
    }

    @Override
    public int getItemCount() {
        return spacecrafts.size();
    }
}











