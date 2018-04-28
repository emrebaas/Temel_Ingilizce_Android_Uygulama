package com.ingilizceogreniyorum.temelingilizce;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import static com.ingilizceogreniyorum.temelingilizce.R.drawable.aslan;
import static com.ingilizceogreniyorum.temelingilizce.R.drawable.kurbaga;
import static com.ingilizceogreniyorum.temelingilizce.R.drawable.kus;

/**
 * Created by emre on 24.03.2017.
 */

public class SayfaHayvan extends ActionBarActivity{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayfagecis_hayvan);


        Spinner hayvansec=(Spinner)findViewById(R.id.spinner);
        final TextView turkce,ingilizce;
        final Button sesdinle,gerigit;

        gerigit=(Button)findViewById(R.id.hayvan_geri);
        turkce=(TextView)findViewById( R.id.hayvan_ismi);
        ingilizce=(TextView)findViewById(R.id.hayvan_ingilizce);
        sesdinle=(Button) findViewById(R.id.ses_dinle);

        final ImageView resimgoster =(ImageView)findViewById(R.id.imageView2);

        final MediaPlayer aslann = MediaPlayer.create(this,R.raw.aslan);
        final MediaPlayer att = MediaPlayer.create(this,R.raw.at);
        final MediaPlayer ayii = MediaPlayer.create(this,R.raw.ayi);
        final MediaPlayer balikk = MediaPlayer.create(this,R.raw.balik);
        final MediaPlayer devee = MediaPlayer.create(this,R.raw.deve);
        final MediaPlayer domuzz = MediaPlayer.create(this,R.raw.domuz);
        final MediaPlayer essekk = MediaPlayer.create(this,R.raw.essek);
        final MediaPlayer faree = MediaPlayer.create(this,R.raw.fare);
        final MediaPlayer fill = MediaPlayer.create(this,R.raw.fil);
        final MediaPlayer inekk = MediaPlayer.create(this,R.raw.inek);
        final MediaPlayer kaplumm = MediaPlayer.create(this,R.raw.kaplumba);
        final MediaPlayer kecii = MediaPlayer.create(this,R.raw.keci);
        final MediaPlayer kedii = MediaPlayer.create(this,R.raw.kedi);
        final MediaPlayer kelebekk = MediaPlayer.create(this,R.raw.kelebek);
        final MediaPlayer koyunn = MediaPlayer.create(this,R.raw.koyun);
        final MediaPlayer kopekk = MediaPlayer.create(this,R.raw.kopek);
        final MediaPlayer kurbaa = MediaPlayer.create(this,R.raw.kurbaga);
        final MediaPlayer kuss = MediaPlayer.create(this,R.raw.kus);
        final MediaPlayer maymunn = MediaPlayer.create(this,R.raw.maymun);
        final MediaPlayer ordekk = MediaPlayer.create(this,R.raw.ordek);
        final MediaPlayer orumcek = MediaPlayer.create(this,R.raw.orumcek);
        final MediaPlayer tavsann = MediaPlayer.create(this,R.raw.tavsan);
        final MediaPlayer tavukk = MediaPlayer.create(this,R.raw.tavuk);
        final MediaPlayer tilkii = MediaPlayer.create(this,R.raw.tilki);
        final MediaPlayer yilan = MediaPlayer.create(this,R.raw.yilan);



        gerigit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent geritusu=new Intent(SayfaHayvan.this,MainActivity.class);
                startActivity(geritusu);
            }
        });


        hayvansec.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                switch (position)
                {
                    case 0:
                    {
                        ingilizce.setText("Lion");
                        turkce.setText("Aslan");
                        resimgoster.setImageResource(R.drawable.aslan);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                aslann.start();

                            }
                        });

                        break;
                    }


                    case 1:
                    {
                        ingilizce.setText("Horse");
                        turkce.setText("At");
                        resimgoster.setImageResource(R.drawable.at);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                att.start();

                            }
                        });

                        break;
                    }



                    case 2:
                    {
                        ingilizce.setText("Bear");
                        turkce.setText("Ayı");
                        resimgoster.setImageResource(R.drawable.ayi);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                ayii.start();

                            }
                        });

                        break;
                    }


                    case 3:
                    {
                        ingilizce.setText("Fish");
                        turkce.setText("Balık");
                        resimgoster.setImageResource(R.drawable.balik);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                balikk.start();

                            }
                        });

                        break;
                    }




                    ///////////////
                    case 4:
                    {
                        ingilizce.setText("Camel");
                        turkce.setText("Deve");
                        resimgoster.setImageResource(R.drawable.deve);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                devee.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 5:
                    {
                        ingilizce.setText("Pig");
                        turkce.setText("Domuz");
                        resimgoster.setImageResource(R.drawable.domuz);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                domuzz.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 6:
                    {
                        ingilizce.setText("Donkey");
                        turkce.setText("Eşşek");
                        resimgoster.setImageResource(R.drawable.essek);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                essekk.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 7:
                    {
                        ingilizce.setText("Mouse");
                        turkce.setText("Fare");
                        resimgoster.setImageResource(R.drawable.fare);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                faree.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 8:
                    {
                        ingilizce.setText("Elephant");
                        turkce.setText("Fil");
                        resimgoster.setImageResource(R.drawable.fil);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                fill.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 9:
                    {
                        ingilizce.setText("Cow");
                        turkce.setText("İnek");
                        resimgoster.setImageResource(R.drawable.inek);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                inekk.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 10:
                    {
                        ingilizce.setText("Turtle");
                        turkce.setText("Kaplumbağa");
                        resimgoster.setImageResource(R.drawable.kaplumbaga);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                kaplumm.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 11:
                    {
                        ingilizce.setText("Goat");
                        turkce.setText("Keçi");
                        resimgoster.setImageResource(R.drawable.keci);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                kecii.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 12:
                    {
                        ingilizce.setText("Cat");
                        turkce.setText("Kedi");
                        resimgoster.setImageResource(R.drawable.kedi);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                kedii.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 13:
                    {
                        ingilizce.setText("Butterfly");
                        turkce.setText("Kelebek");
                        resimgoster.setImageResource(R.drawable.kelebek);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                kelebekk.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 14:
                    {
                        ingilizce.setText("Dog");
                        turkce.setText("Köpek");
                        resimgoster.setImageResource(R.drawable.kopek);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                kopekk.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 15:
                    {
                        ingilizce.setText("Sheep");
                        turkce.setText("Koyun");
                        resimgoster.setImageResource(R.drawable.koyun);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                koyunn.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 16:
                    {
                        ingilizce.setText("Frog");
                        turkce.setText("Kurbağa");
                        resimgoster.setImageResource(R.drawable.kurbaga);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                kurbaa.start();

                            }
                        });

                        break;
                    }


                    ///////////////
                    case 17:
                    {
                        ingilizce.setText("Bird");
                        turkce.setText("Kuş");
                        resimgoster.setImageResource(R.drawable.kus);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                kuss.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 18:
                    {
                        ingilizce.setText("Monkey");
                        turkce.setText("Maymun");
                        resimgoster.setImageResource(R.drawable.maymun);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                maymunn.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 19:
                    {
                        ingilizce.setText("Duck");
                        turkce.setText("Ördek");
                        resimgoster.setImageResource(R.drawable.ordek);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                ordekk.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 20:
                    {
                        ingilizce.setText("Spider");
                        turkce.setText("Örümcek");
                        resimgoster.setImageResource(R.drawable.orumcek);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                orumcek.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 21:
                    {
                        ingilizce.setText("Rabbit");
                        turkce.setText("Tavşan");
                        resimgoster.setImageResource(R.drawable.tavsan);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                tavsann.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 22:
                    {
                        ingilizce.setText("Chicken");
                        turkce.setText("Tavuk");
                        resimgoster.setImageResource(R.drawable.tavuk);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                tavukk.start();

                            }
                        });

                        break;
                    }

                    ///////////////
                    case 23:
                    {
                        ingilizce.setText("Fox");
                        turkce.setText("Tilki");
                        resimgoster.setImageResource(R.drawable.tilki);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                tilkii.start();

                            }
                        });

                        break;
                    }


                    ///////////////
                    case 24:
                    {
                        ingilizce.setText("Snake");
                        turkce.setText("Yılan");
                        resimgoster.setImageResource(R.drawable.yilan);
                        sesdinle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                yilan.start();

                            }
                        });

                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }
}
