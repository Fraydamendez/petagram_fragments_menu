package com.mendez.mascotas.Adaptador;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mendez.mascotas.Fragment.PerfilFragment;
import com.mendez.mascotas.MainActivity;
import com.mendez.mascotas.Pojo.Mascota;
import com.mendez.mascotas.Pojo.Perfil;
import com.mendez.mascotas.R;

import java.util.ArrayList;

public class Adaptador_Perfil extends RecyclerView.Adapter<Adaptador_Perfil.PerfilViewHolde> {

    ArrayList<Perfil> mascotaPerfil;
    Activity activityd;

    public Adaptador_Perfil(ArrayList<Perfil> perfil, MainActivity mainActivity) {
        this.activityd = activityd;
        this.mascotaPerfil = perfil;


    }


    @NonNull
    @Override
    public PerfilViewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil_mascota, parent, false);
        return new PerfilViewHolde(v);


    }

    public void onBindViewHolder(@NonNull PerfilViewHolde perfilViewHolde, int position) {
        final Perfil perfil = mascotaPerfil.get(position);
        perfilViewHolde.imgFotoPerfil.setImageResource(perfil.getImagenperf());
        perfilViewHolde.tvPuntuacionCVPerfil.setText(perfil.getPuntuacionperf());


    }

    @Override
    public int getItemCount() {
        return mascotaPerfil.size();
    }



    public static class PerfilViewHolde extends RecyclerView.ViewHolder {
        private ImageView imgFotoPerfil;
        private TextView tvPuntuacionCVPerfil;





        public PerfilViewHolde(View itemView) {
            super(itemView);
            imgFotoPerfil         = (ImageView) itemView.findViewById(R.id.imgFotoPerfilGaleria);
            tvPuntuacionCVPerfil  = (TextView) itemView.findViewById(R.id.tvpuntuacionPerfil);


        }
    }
}

