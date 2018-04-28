package com.ingilizceogreniyorum.temelingilizce;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by emre on 24.03.2017.
 */

public class SayfaGunler extends ActionBarActivity {





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayfagecis_gunler);

        final boolean durum;
        Button gonder=(Button)findViewById(R.id.gonder);
        final CheckBox sec=(CheckBox)findViewById(R.id.onaylatik);
        RadioButton onay1,onay2,onay3,onay4;
        onay1=(RadioButton)findViewById(R.id.rd1);
        onay2=(RadioButton)findViewById(R.id.rd2);
        onay3=(RadioButton)findViewById(R.id.rd3);
        onay4=(RadioButton)findViewById(R.id.rd4);

        final EditText adi,soyadi;

        adi=(EditText)findViewById(R.id.adgir);
        soyadi=(EditText)findViewById(R.id.soyadgir);

        if (onay1.isSelected())
        {
            durum=true;

       }
        else if (onay2.isSelected()==true)
        {
            durum=true;

        }
        else if (onay3.isSelected()==true)
        {
            durum=true;

        }
        else if (onay4.isSelected()==true)
        {
            durum=true;

        }
        else{
            durum=false;
            Toast.makeText(getApplicationContext(),"Lütfen Seçim Yapınız",Toast.LENGTH_LONG).show();

       }


        gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean drm=sec.isChecked();
                if (drm==true)
                {
                    Toast.makeText(getApplicationContext(),adi.getText() + " " +soyadi.getText()+ " değerlendirmeniz kaydedildi.",Toast.LENGTH_LONG).show();

                }
                else
                {
                    Toast.makeText(getApplicationContext()," Yazdıklarınızı Onaylayınız!",Toast.LENGTH_LONG).show();

                }

            }
        });




    }
}
