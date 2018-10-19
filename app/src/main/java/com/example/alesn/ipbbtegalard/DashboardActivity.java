package com.example.alesn.ipbbtegalard;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView btn_kecamatan,btn_kelurahan,btn_rank,btn_pajak,btn_realisasi;
    private CardView btn_ceksppt2,btn_target,btn_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // CARDVIEW
        btn_ceksppt2 = (CardView) findViewById(R.id.btn_ceksppt2);
        btn_kecamatan = (CardView) findViewById(R.id.btn_kecamatan);
        btn_kelurahan = (CardView) findViewById(R.id.btn_kelurahan);
        btn_rank = (CardView) findViewById(R.id.btn_rank);
        btn_pajak = (CardView) findViewById(R.id.btn_pajak);
        btn_realisasi = (CardView) findViewById(R.id.btn_realisasi);
        btn_target = (CardView) findViewById(R.id.btn_targetpbb);
        btn_logout= (CardView) findViewById(R.id.btn_logout);
        //ADD CLICKLISTENER
        btn_ceksppt2.setOnClickListener(this);
        btn_kecamatan.setOnClickListener(this);
        btn_kelurahan.setOnClickListener(this);
        btn_rank.setOnClickListener(this);
        btn_pajak.setOnClickListener(this);
        btn_realisasi.setOnClickListener(this);
        btn_target.setOnClickListener(this);
        btn_logout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.btn_ceksppt2 : i =new Intent(this,CekspptActivity.class);startActivity(i); break;
            case R.id.btn_kecamatan : i = new Intent(this,KecamatanActivity.class); startActivity(i);break;
            case R.id.btn_kelurahan : i = new Intent(this,KelurahanActivity.class); startActivity(i);break;
            case R.id.btn_rank: i = new Intent(this,RankingActivity.class); startActivity(i);break;
            case R.id.btn_pajak : i = new Intent(this,PajakActivity.class);startActivity(i); break;
            case R.id.btn_realisasi : i = new Intent(this,RealisasiActivity.class); startActivity(i);break;
            case R.id.btn_targetpbb : i = new Intent(this,TargetActivity.class); startActivity(i);break;
            case R.id.btn_logout :  logout(); break;
            default:break;
        }
    }
    public void logout() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Anda Yakin akan Logout ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(DashboardActivity.this, MainActivity.class));
                        DashboardActivity.this.finish();
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
