package com.ingilizceogreniyorum.temelingilizce;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by emre on 24.03.2017.
 */
public class SayfaRenk extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayfagecis_renkler);


        Button kirmizi,sari,mavi,yesil,beyaz,siyah,pembe,turuncu,gri,kahve,mor,geri;
        final LinearLayout renkarkaa=(LinearLayout)findViewById(R.id.renkarka);

        kirmizi=(Button)findViewById(R.id.kirmizi);
        sari=(Button)findViewById(R.id.sari);
        mavi=(Button)findViewById(R.id.mavi);
        yesil=(Button)findViewById(R.id.yesil);
        beyaz=(Button)findViewById(R.id.beyaz);
        siyah=(Button)findViewById(R.id.siyah);
        pembe=(Button)findViewById(R.id.penbee);
        turuncu=(Button)findViewById(R.id.truncii);
        gri=(Button)findViewById(R.id.gri);
        kahve=(Button)findViewById(R.id.kahverengi);
        mor=(Button)findViewById(R.id.mor);
        geri=(Button)findViewById(R.id.renlergeri);

        final MediaPlayer kir = MediaPlayer.create(this,R.raw.redd);
        final MediaPlayer sar = MediaPlayer.create(this,R.raw.yelloww);
        final MediaPlayer mav = MediaPlayer.create(this,R.raw.bluee);
        final MediaPlayer yes = MediaPlayer.create(this,R.raw.greenn);
        final MediaPlayer bey = MediaPlayer.create(this,R.raw.whitee);
        final MediaPlayer siy = MediaPlayer.create(this,R.raw.blackk);
        final MediaPlayer pem = MediaPlayer.create(this,R.raw.pinkk);
        final MediaPlayer tur = MediaPlayer.create(this,R.raw.orangee);
        final MediaPlayer kah = MediaPlayer.create(this,R.raw.brownn);
        final MediaPlayer grii = MediaPlayer.create(this,R.raw.greyy);
        final MediaPlayer mo = MediaPlayer.create(this,R.raw.purplee);

        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri=new Intent(SayfaRenk.this,MainActivity.class);
                startActivity(geri);
            }
        });


        kirmizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                renkarkaa.setBackgroundColor(Color.parseColor("#FF0000"));

                kir.start();

            }
        });

//////////////////////////////////////////////////////

        sari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                renkarkaa.setBackgroundColor(Color.parseColor("#FFFF00"));

                sar.start();

            }
        });



        /////////////////////////////////////////////////////

        mavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                renkarkaa.setBackgroundColor(Color.parseColor("#0000FF"));

                mav.start();

            }
        });



        /////////////////////////////////////////////////////

        yesil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                renkarkaa.setBackgroundColor(Color.parseColor("#00ff00"));

                yes.start();

            }
        });



        /////////////////////////////////////////////////////

        beyaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                renkarkaa.setBackgroundColor(Color.parseColor("#FFffff"));

                bey.start();

            }
        });



        /////////////////////////////////////////////////////

        siyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                renkarkaa.setBackgroundColor(Color.parseColor("#000000"));

                siy.start();

            }
        });



        /////////////////////////////////////////////////////

        pembe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                renkarkaa.setBackgroundColor(Color.parseColor("#FF00FF"));

                pem.start();

            }
        });



        /////////////////////////////////////////////////////

        turuncu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                renkarkaa.setBackgroundColor(Color.parseColor("#ffa500"));

                tur.start();

            }
        });



        /////////////////////////////////////////////////////

        gri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                renkarkaa.setBackgroundColor(Color.parseColor("#808080"));

                grii.start();

            }
        });



        /////////////////////////////////////////////////////

        mor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                renkarkaa.setBackgroundColor(Color.parseColor("#800080"));

                mo.start();

            }
        });


        /////////////////////////////////////////////////////

        kahve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                renkarkaa.setBackgroundColor(Color.parseColor("#8b4513"));

                kah.start();

            }
        });
    }
}
