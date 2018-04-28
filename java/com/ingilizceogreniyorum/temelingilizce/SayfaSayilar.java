package com.ingilizceogreniyorum.temelingilizce;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by emre on 24.03.2017.
 */

public class SayfaSayilar extends ActionBarActivity
{

    Button sayigeri,sifirr,birr,ikii,ucc,dortt,bess,altii,yedii,sekizz,dokuzz,on,onbir,oniki,onuc,ondort;
    Button onbes,onalti,onyedi,onsekiz,ondokuz;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayfagecis_sayilar);

        sayigeri=(Button)findViewById(R.id.sayigeri);
        sifirr=(Button)findViewById(R.id.sifir);
        birr=(Button)findViewById(R.id.bir);
        ikii=(Button)findViewById(R.id.iki);
        ucc=(Button)findViewById(R.id.uc);
        dortt=(Button)findViewById(R.id.dort);
        bess=(Button)findViewById(R.id.bes);
        altii=(Button)findViewById(R.id.alti);
        yedii=(Button)findViewById(R.id.yedi);
        sekizz=(Button)findViewById(R.id.sekiz);
        dokuzz=(Button)findViewById(R.id.dokuz);
        on=(Button)findViewById(R.id.on);
        onbir=(Button)findViewById(R.id.onbir);
        oniki=(Button)findViewById(R.id.oniki);
        onuc=(Button)findViewById(R.id.onuc);
        ondort=(Button)findViewById(R.id.ondort);
        onbes=(Button)findViewById(R.id.onbes);
        onalti=(Button)findViewById(R.id.onalti);
        onyedi=(Button)findViewById(R.id.onyedi);
        onsekiz=(Button)findViewById(R.id.onsekiz);
        ondokuz=(Button)findViewById(R.id.ondokuz);


        final MediaPlayer ses0 = MediaPlayer.create(this,R.raw.sifir);
        final MediaPlayer ses1 = MediaPlayer.create(this,R.raw.bir);
        final MediaPlayer ses2 = MediaPlayer.create(this,R.raw.iki);
        final MediaPlayer ses3 = MediaPlayer.create(this,R.raw.uc);
        final MediaPlayer ses4 = MediaPlayer.create(this,R.raw.dort);
        final MediaPlayer ses5 = MediaPlayer.create(this,R.raw.bes);
        final MediaPlayer ses6 = MediaPlayer.create(this,R.raw.alti);
        final MediaPlayer ses7 = MediaPlayer.create(this,R.raw.yedi);
        final MediaPlayer ses8 = MediaPlayer.create(this,R.raw.sekiz);
        final MediaPlayer ses9 = MediaPlayer.create(this,R.raw.dokuz);
        final MediaPlayer ses10 = MediaPlayer.create(this,R.raw.on);
        final MediaPlayer ses11 = MediaPlayer.create(this,R.raw.onbir);
        final MediaPlayer ses12 = MediaPlayer.create(this,R.raw.oniki);
        final MediaPlayer ses13 = MediaPlayer.create(this,R.raw.onuc);
        final MediaPlayer ses14 = MediaPlayer.create(this,R.raw.ondort);
        final MediaPlayer ses15 = MediaPlayer.create(this,R.raw.onbes);
        final MediaPlayer ses16 = MediaPlayer.create(this,R.raw.onalti);
        final MediaPlayer ses17 = MediaPlayer.create(this,R.raw.onyedi);
        final MediaPlayer ses18 = MediaPlayer.create(this,R.raw.onsekiz);
        final MediaPlayer ses19 = MediaPlayer.create(this,R.raw.ondokuz);

        sayigeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent gerisayi=new Intent(SayfaSayilar.this,MainActivity.class);
                startActivity(gerisayi);

            }
        });


        sifirr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses0.start();


            }
        });

        //////b/////////////////////////
        birr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses1.start();


            }
        });

        //////b/////////////////////////
        ikii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses2.start();


            }
        });

        //////b/////////////////////////
        ucc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses3.start();


            }
        });

        //////b/////////////////////////
        dortt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses4.start();


            }
        });

        //////b/////////////////////////
        bess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses5.start();


            }
        });

        //////b/////////////////////////
        altii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses6.start();


            }
        });

        //////b/////////////////////////
        yedii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses7.start();


            }
        });

        //////b/////////////////////////
        sekizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses8.start();


            }
        });

        //////b/////////////////////////
        dokuzz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses9.start();


            }
        });

        //////b/////////////////////////
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses10.start();


            }
        });

        //////b/////////////////////////
        onbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses11.start();


            }
        });

        //////b/////////////////////////
        oniki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses12.start();


            }
        });

        //////b/////////////////////////
        onuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses13.start();


            }
        });

        //////b/////////////////////////
        ondort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses14.start();


            }
        });

        //////b/////////////////////////
        onbes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses15.start();


            }
        });

        //////b/////////////////////////
        onalti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses16.start();


            }
        });

        //////b/////////////////////////
        onyedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses17.start();


            }
        });

        //////b/////////////////////////
        onsekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses18.start();


            }
        });

        //////b/////////////////////////
        ondokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ses19.start();


            }
        });




    }
}
