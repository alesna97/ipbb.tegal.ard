package com.example.alesn.ipbbtegalard;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView btn_sppt,btn_permohonan,btn_login,btn_pembayaran;
    private CardView btn_keluar,btn_info_kontak,btn_carabayar,btn_infolayanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // CARDVIEW
        btn_sppt = (CardView) findViewById(R.id.btn_sppt);
        btn_permohonan = (CardView) findViewById(R.id.btn_permohonan);
        btn_login = (CardView) findViewById(R.id.btn_login);
        btn_pembayaran = (CardView) findViewById(R.id.btn_pembayaran);
        btn_keluar = (CardView) findViewById(R.id.btn_keluar);
        btn_info_kontak = (CardView) findViewById(R.id.btn_infokontak);
        btn_carabayar = (CardView) findViewById(R.id.btn_carabayar);
        btn_infolayanan = (CardView) findViewById(R.id.btn_infolayanan);
        //ADD CLICKLISTENER
        btn_sppt.setOnClickListener(this);
        btn_permohonan.setOnClickListener(this);
        btn_login.setOnClickListener(this);
        btn_pembayaran.setOnClickListener(this);
        btn_keluar.setOnClickListener(this);
        btn_info_kontak.setOnClickListener(this);
        btn_infolayanan.setOnClickListener(this);
        btn_carabayar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.btn_sppt : i = new Intent(this,SpptActivity.class);startActivity(i); break;
            case R.id.btn_permohonan : i = new Intent(this,PermohonanActivity.class); startActivity(i);break;
            case R.id.btn_login : i = new Intent(this,LoginActivity.class);startActivity(i);break;
            case R.id.btn_pembayaran : i = new Intent(this,TempatbayarActivity.class);startActivity(i); break;
            case R.id.btn_keluar : onBackPressed();break;
            case R.id.btn_infokontak : i = new Intent(this,InfokontakActivity.class); startActivity(i);break;
            case R.id.btn_carabayar : i = new Intent(this,CarabayarActivity.class); startActivity(i);break;
            case R.id.btn_infolayanan : i = new Intent(this,InfolayananActivity.class); startActivity(i);break;
            default:break;
        }
    }

    //back button
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Anda Yakin akan Keluar Aplikasi ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();
                    }
                }).setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}
