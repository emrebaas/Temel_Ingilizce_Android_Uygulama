package com.ingilizceogreniyorum.temelingilizce;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_renkler_git,button_sayilarr_git,button_hayvanlar_git,button_gunler_git,button_alfabe_git,face,insta,twit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_renkler_git=(Button)findViewById(R.id.button_renk_git);
        button_sayilarr_git=(Button)findViewById(R.id.button_sayi_git);

        button_hayvanlar_git=(Button)findViewById(R.id.button_hayvanlar_git);
        button_gunler_git=(Button)findViewById(R.id.button_gun_git);
        button_alfabe_git=(Button)findViewById(R.id.button_alfabe_git);
        face=(Button)findViewById(R.id.facebook);
        twit=(Button)findViewById(R.id.twitter);
        insta=(Button)findViewById(R.id.instagram);


//////////////////////////////////////////////////

        btn_renkler_git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intorenk=new Intent(MainActivity.this,SayfaRenk.class);
                startActivity(intorenk);
            }
        });

////////////////////////////////////////////
        button_alfabe_git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intoalfabe=new Intent(MainActivity.this,SayfaAlfabe.class);
                startActivity(intoalfabe);
            }
        });



        /////////////////////////////

        button_hayvanlar_git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intoalfabe=new Intent(MainActivity.this,SayfaHayvan.class);
                startActivity(intoalfabe);
            }
        });


        /////////////////////////////

        button_sayilarr_git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intoalfabe=new Intent(MainActivity.this,SayfaSayilar.class);
                startActivity(intoalfabe);
            }
        });

        ////////////////////////////////



        ////////////////////////////////

        button_gunler_git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intoalfabe=new Intent(MainActivity.this,SayfaGunler.class);
                startActivity(intoalfabe);
            }
        });




        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri wwwface=Uri.parse("http//www.facebook.com");
                Intent facee=new Intent(Intent.ACTION_DEFAULT,wwwface);
                startActivity(facee);
            }
        });



        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri wwwinsta=Uri.parse("http//www.instagram.com");
                Intent instaa=new Intent(Intent.ACTION_DEFAULT,wwwinsta);
                startActivity(instaa);
            }
        });



        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri wwwtwit=Uri.parse("http//www.instagram.com");
                Intent twitt=new Intent(Intent.ACTION_DEFAULT,wwwtwit);
                startActivity(twitt);
            }
        });
    }
}
