package com.example.proteintracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proteintracker.Model.Mahasiswa;
import com.example.proteintracker.R;

import java.util.ArrayList;

public class MahasiswaAdapter extends
        RecyclerView.Adapter<MahasiswaAdapter.ViewHolder>{

    private ArrayList<Mahasiswa> dataList;
    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                         int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs2,
                parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int
            position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getNpm());
        holder.txtNoHp.setText(dataList.get(position).getNohp());

    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp;
        public ViewHolder(View view){
            super(view);
            txtNama = view.findViewById(R.id.txt_nama_mahasiswa);
            txtNoHp = view.findViewById(R.id.txt_nohp_mahasiswa);
            txtNpm = view.findViewById(R.id.txt_npm_mahasiswa);
        }
    }
}

