package com.mendez.mascotas.Fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mendez.mascotas.Adaptador.Adaptador_Perfil;
import com.mendez.mascotas.Adaptador.Mascota_Adaptador;
import com.mendez.mascotas.MainActivity;
import com.mendez.mascotas.Pojo.Mascota;
import com.mendez.mascotas.Pojo.Perfil;
import com.mendez.mascotas.R;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {

    ArrayList<Perfil> mascotaPerfil;
    private RecyclerView listaMascotasPerfil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaMascotasPerfil = (RecyclerView) v.findViewById(R.id.rvMascotaPerfil);

        GridLayoutManager glm = new GridLayoutManager(getContext(),3);
        listaMascotasPerfil.setLayoutManager(glm);
        inicializarListaMascotasPerfil();
       iniciarlizarAdaptadorPerfil();

        return v;
}

    public Adaptador_Perfil adaptador;

    public void iniciarlizarAdaptadorPerfil() {

        adaptador = new Adaptador_Perfil(mascotaPerfil, (MainActivity) getActivity());
        listaMascotasPerfil.setAdapter(adaptador);

    }


    public void inicializarListaMascotasPerfil() {
        mascotaPerfil = new ArrayList<>();

        mascotaPerfil.add(new Perfil(R.drawable.pug3, "4"));
        mascotaPerfil.add(new Perfil(R.drawable.pug4, "5"));
        mascotaPerfil.add(new Perfil(R.drawable.pug5, "0"));
        mascotaPerfil.add(new Perfil(R.drawable.pug6, "2"));
        mascotaPerfil.add(new Perfil(R.drawable.pug7, "5"));
        mascotaPerfil.add(new Perfil(R.drawable.pug8, "3"));
        mascotaPerfil.add(new Perfil(R.drawable.pug9, "5"));
        mascotaPerfil.add(new Perfil(R.drawable.pug10, "2"));
        mascotaPerfil.add(new Perfil(R.drawable.pug11, "5"));

    }
}
