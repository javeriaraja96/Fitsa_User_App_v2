package com.wasisoft.fitsa_user_app.Adaptors;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.wasisoft.fitsa_user_app.Model.Exercise_items;
import com.wasisoft.fitsa_user_app.Model.Nutritionist_items;
import com.wasisoft.fitsa_user_app.R;

import java.util.List;

public class Nutritionist_adaptor  extends RecyclerView.Adapter<Nutritionist_adaptor.MyViewHolder> {

    private Context mContext;
    private List<Nutritionist_items> mNutritionist_items;

    public Nutritionist_adaptor(Context mContext, List<Nutritionist_items> mNutritionist_items) {
        this.mContext = mContext;
        this.mNutritionist_items = mNutritionist_items;
    }
    /*i=position*/
    @NonNull
    @Override
    public Nutritionist_adaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.exercise_items,viewGroup, false);



        Nutritionist_adaptor.MyViewHolder viewHolder = new Nutritionist_adaptor.MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Nutritionist_adaptor.MyViewHolder myViewHolder, int i) {
        int imageID = mNutritionist_items.get(i).getmItemImages();
        String title = mNutritionist_items.get(i).getmItemName();

        Glide
                .with(mContext)
                .load(mContext.getDrawable(imageID)).into(myViewHolder.mImage);
        myViewHolder.mTitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return mNutritionist_items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImage;
        private TextView mTitle;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.nut_title);

            mImage = itemView.findViewById(R.id.nut_imgv);


        }
    }
}
