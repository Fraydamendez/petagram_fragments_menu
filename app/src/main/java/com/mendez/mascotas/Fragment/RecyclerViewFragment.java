package com.mendez.mascotas.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mendez.mascotas.Adaptador.Mascota_Adaptador;
import com.mendez.mascotas.MainActivity;
import com.mendez.mascotas.Pojo.Mascota;
import com.mendez.mascotas.R;
import com.mendez.mascotas.mascota_favorita;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> mascota;
    private RecyclerView listaMascotas;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        //super.onCreate(savedInstanceState);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascota);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);


        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        iniciarlizarAdaptador();

        return v;
    }


  public Mascota_Adaptador adaptador;

    public void iniciarlizarAdaptador() {

        adaptador = new Mascota_Adaptador(mascota,getActivity());
        listaMascotas.setAdapter(adaptador);

    }


    public void inicializarListaMascotas() {
        mascota = new ArrayList<>();

        mascota.add(new Mascota(R.drawable.pug, "Patas", "5"));
        mascota.add(new Mascota(R.drawable.rayas, "Rayas", "3"));
        mascota.add(new Mascota(R.drawable.victor, "Victor", "3"));
        mascota.add(new Mascota(R.drawable.shein, "Shein", "2"));
        mascota.add(new Mascota(R.drawable.coco, "Coquito", "5"));
    }
}