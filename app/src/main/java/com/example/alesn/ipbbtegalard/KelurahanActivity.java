package com.example.alesn.ipbbtegalard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class KelurahanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelurahan);
        GraphView graph2 = (GraphView) findViewById(R.id.graph2);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {

                // YOUR GRAPH DATA
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3)

        });
        graph2.addSeries(series);
    }
}
