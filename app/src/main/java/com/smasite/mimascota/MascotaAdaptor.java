package com.smasite.mimascota;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by macbookretina on 30/04/17.
 */

public class MascotaAdaptor extends RecyclerView.Adapter<MascotaAdaptor.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptor(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas=mascotas;
        this.activity=activity;

    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_listado_mascotas, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {

        final Mascota mascota = mascotas.get(position);

        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());
        mascotaViewHolder.tvRaik.setText(mascota.getRaick());

        mascotaViewHolder.btnRaik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, "Diste Ranking a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();
              /*  Intent intent = new Intent(activity, DetalleMascotas.class);
                intent.putExtra("nombre", mascota.getNombre());
                intent.putExtra("rankin", mascota.getRaick());

                activity.startActivity(intent);
                */
            }
        });

    }

    @Override
    public int getItemCount() { return mascotas.size(); }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNombre;
        private TextView tvRaik;
        private ImageView imgFoto;
        private ImageButton btnRaik;

    public MascotaViewHolder(View itemView) {
        super(itemView);
        tvNombre      = (TextView) itemView.findViewById(R.id.tvNombre);
        imgFoto        = (ImageView) itemView.findViewById(R.id.imgFoto);
        tvRaik      = (TextView) itemView.findViewById(R.id.tvRaik);
        btnRaik      = (ImageButton) itemView.findViewById(R.id.btnRaik);


    }
}


}
