package com.tutorials.hp.recyclerrealmimages.m_UI;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.recyclerrealmimages.R;

/**
 * Created by Oclemy on 6/16/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyHolder extends RecyclerView.ViewHolder {

    TextView nameTxt,propTxt,descTxt;
    ImageView img;

    public MyHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
        propTxt= (TextView) itemView.findViewById(R.id.propellantTxt);
        descTxt= (TextView) itemView.findViewById(R.id.descTxt);
        img= (ImageView) itemView.findViewById(R.id.spacecraftImage);
    }
}
