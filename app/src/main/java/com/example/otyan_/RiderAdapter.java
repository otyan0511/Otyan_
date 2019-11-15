package com.example.otyan_;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RiderAdapter extends RecyclerView.Adapter<RiderAdapter.RiderViewHolder> {


    private ArrayList<Rider> dataList;

    public RiderAdapter(ArrayList<Rider> dataList) {
        this.dataList = dataList;
    }

    @Override
    public RiderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_cardview, parent, false);
        return new RiderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RiderViewHolder holder, int position) {
        holder.txtRider.setText(dataList.get(position).getRider());
        holder.txtNomor.setText(dataList.get(position).getNomor());
        holder.txtTeam.setText(dataList.get(position).getTeam());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class RiderViewHolder extends RecyclerView.ViewHolder{
        private TextView txtRider, txtNomor, txtTeam;

        public RiderViewHolder(View itemView) {
            super(itemView);
            txtRider = (TextView) itemView.findViewById(R.id.txt_nama_rider);
            txtNomor = (TextView) itemView.findViewById(R.id.txt_no_rider);
            txtTeam = (TextView) itemView.findViewById(R.id.txt_team_rider);
        }
    }
}

