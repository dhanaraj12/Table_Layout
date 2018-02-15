package com.example.ahanar.table_layout;

import android.app.FragmentTransaction;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TableLayout tl;
    TableRow tr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout) findViewById(R.id.linearLayout1);


    TableLayout table = new TableLayout(this);
        tr = new TableRow(this);
       for (int i = 0; i < 1; i++) {
        for (int j = 0; j <10; j++) {
         CardView cell = (CardView)getLayoutInflater().inflate(R.layout.fragment1,null);

            tr.addView(cell);

           }
           table.addView(tr);

        }
        layout.addView(table);


    }
    }

