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

public class SayfaAlfabe extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayfagecis_alfabe);

        Button gerigit,aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn,oo,pp,qq,rr,ss,tt,uu,vv,ww,xx,yy,zz;

        gerigit=(Button)findViewById(R.id.alfabegeri);
        aa=(Button)findViewById(R.id.aa);
        bb=(Button)findViewById(R.id.bb);
        cc=(Button)findViewById(R.id.cc);
        dd=(Button)findViewById(R.id.dd);
        ee=(Button)findViewById(R.id.ee);
        ff=(Button)findViewById(R.id.ff);
        gg=(Button)findViewById(R.id.gg);
        hh=(Button)findViewById(R.id.hh);
        ii=(Button)findViewById(R.id.ii);
        jj=(Button)findViewById(R.id.jj);
        kk=(Button)findViewById(R.id.kk);
        ll=(Button)findViewById(R.id.ll);
        mm=(Button)findViewById(R.id.mm);
        nn=(Button)findViewById(R.id.nn);
        oo=(Button)findViewById(R.id.oo);
        pp=(Button)findViewById(R.id.pp);
        qq=(Button)findViewById(R.id.qq);
        rr=(Button)findViewById(R.id.rr);
        ss=(Button)findViewById(R.id.ss);
        tt=(Button)findViewById(R.id.tt);
        uu=(Button)findViewById(R.id.uu);
        vv=(Button)findViewById(R.id.vv);
        ww=(Button)findViewById(R.id.ww);
        xx=(Button)findViewById(R.id.xx);
        yy=(Button)findViewById(R.id.yy);
        zz=(Button)findViewById(R.id.zz);

        final MediaPlayer aaa = MediaPlayer.create(this,R.raw.aa);
        final MediaPlayer bbb = MediaPlayer.create(this,R.raw.bb);
        final MediaPlayer ccc = MediaPlayer.create(this,R.raw.cc);
        final MediaPlayer ddd = MediaPlayer.create(this,R.raw.dd);
        final MediaPlayer eee = MediaPlayer.create(this,R.raw.ee);
        final MediaPlayer fff = MediaPlayer.create(this,R.raw.ff);
        final MediaPlayer ggg = MediaPlayer.create(this,R.raw.gg);
        final MediaPlayer hhh = MediaPlayer.create(this,R.raw.hh);
        final MediaPlayer iii = MediaPlayer.create(this,R.raw.ii);
        final MediaPlayer jjj = MediaPlayer.create(this,R.raw.jj);
        final MediaPlayer kkk = MediaPlayer.create(this,R.raw.kk);
        final MediaPlayer lll = MediaPlayer.create(this,R.raw.ll);
        final MediaPlayer mmm = MediaPlayer.create(this,R.raw.mm);
        final MediaPlayer nnn = MediaPlayer.create(this,R.raw.nn);
        final MediaPlayer ooo = MediaPlayer.create(this,R.raw.oo);
        final MediaPlayer ppp = MediaPlayer.create(this,R.raw.pp);
        final MediaPlayer qqq = MediaPlayer.create(this,R.raw.qq);
        final MediaPlayer rrr = MediaPlayer.create(this,R.raw.rr);
        final MediaPlayer sss = MediaPlayer.create(this,R.raw.ss);
        final MediaPlayer ttt = MediaPlayer.create(this,R.raw.tt);
        final MediaPlayer uuu = MediaPlayer.create(this,R.raw.uu);
        final MediaPlayer vvv = MediaPlayer.create(this,R.raw.vv);
        final MediaPlayer www = MediaPlayer.create(this,R.raw.ww);
        final MediaPlayer xxx = MediaPlayer.create(this,R.raw.xx);
        final MediaPlayer yyy = MediaPlayer.create(this,R.raw.yy);
        final MediaPlayer zzz = MediaPlayer.create(this,R.raw.zz);

        gerigit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri=new Intent(SayfaAlfabe.this,MainActivity.class);
                startActivity(geri);
            }
        });


        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aaa.start();

            }
        });

        ///////////////////////////////

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bbb.start();

            }
        });



        ///////////////////////////////

        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ccc.start();

            }
        });


        ///////////////////////////////

        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ddd.start();

            }
        });


        ///////////////////////////////

        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eee.start();

            }
        });


        ///////////////////////////////

        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fff.start();

            }
        });


        ///////////////////////////////

        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ggg.start();

            }
        });


        ///////////////////////////////

        hh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hhh.start();

            }
        });


        ///////////////////////////////

        ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iii.start();

            }
        });


        ///////////////////////////////

        jj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                jjj.start();

            }
        });


        ///////////////////////////////

        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                kkk.start();

            }
        });


        ///////////////////////////////

        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lll.start();

            }
        });


        ///////////////////////////////

        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mmm.start();

            }
        });


        ///////////////////////////////

        nn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nnn.start();

            }
        });


        ///////////////////////////////

        oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ooo.start();

            }
        });


        ///////////////////////////////

        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ppp.start();

            }
        });


        ///////////////////////////////

        qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                qqq.start();

            }
        });


        ///////////////////////////////

        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rrr.start();

            }
        });


        ///////////////////////////////

        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sss.start();

            }
        });


        ///////////////////////////////

        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ttt.start();

            }
        });


        ///////////////////////////////

        uu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                uuu.start();

            }
        });


        ///////////////////////////////

        vv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vvv.start();

            }
        });


        ///////////////////////////////

        ww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                www.start();

            }
        });


        ///////////////////////////////

        xx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                xxx.start();

            }
        });


        ///////////////////////////////

        yy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yyy.start();

            }
        });


        ///////////////////////////////

        zz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                zzz.start();

            }
        });

    }
}
