package com.smasite.mimascota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class Favoritas extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        miActionBar.setNavigationIcon(R.drawable.back_26);
        setSupportActionBar(miActionBar);


        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();

        initializerAdaptor();
    }

    public void initializerAdaptor(){
        MascotaAdaptor adaptor = new MascotaAdaptor(mascotas, this);
        listaMascotas.setAdapter(adaptor);

    }

    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.dog4,"Terry", "4"));
        mascotas.add(new Mascota(R.drawable.dog5,"Canela", "5"));
        mascotas.add(new Mascota(R.drawable.dog1,"Catty", "4"));
        mascotas.add(new Mascota(R.drawable.dog2,"Hercules", "5"));
        mascotas.add(new Mascota(R.drawable.dog3,"Hachiko", "5"));
    }
}
