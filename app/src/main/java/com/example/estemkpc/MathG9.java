package com.example.estemkpc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MathG9 extends AppCompatActivity {
    ListView pdflistview;
    String[] pdfFile = {"គណិតវិទ្យាថ្នាក់ទី៩ មេរៀនទី១","គណិតវិទ្យាថ្នាក់ទី៩ មេរៀនទី២","គណិតវិទ្យាថ្នាក់ទី៩ មេរៀនទី៣","គណិតវិទ្យាថ្នាក់ទី៩ មេរៀនទី៤","គណិតវិទ្យាថ្នាក់ទី៩ មេរៀនទី៥","គណិតវិទ្យាថ្នាក់ទី៩ មេរៀនទី៦","គណិតវិទ្យាថ្នាក់ទី៩ មេរៀនទី៧","គណិតវិទ្យាថ្នាក់ទី៩ មេរៀនទី៨","គណិតវិទ្យាថ្នាក់ទី៩ មេរៀនទី៩","គណិតវិទ្យាថ្នាក់ទី៩ មេរៀនទី១០" };
    int[]images = {R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_g9);
        pdflistview = findViewById(R.id.PDFlist);


        MyAdapter adapter = new MyAdapter(this,pdfFile,images);
        pdflistview.setAdapter(adapter);

        pdflistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = pdflistview.getItemAtPosition(position).toString();
                Intent start = new Intent(getApplicationContext(),PDFOpener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);

            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        int rImages[];
        MyAdapter (Context c, String title [],int imgs[]){
            super(c , R.layout.row, R.id.textview2,title);
            this.context = c;
            this.rImages= imgs;
            this.rTitle=title;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent,false);
            TextView Mytext = row.findViewById(R.id.textview2);
            ImageView images = row.findViewById(R.id.image);
            Mytext.setText(rTitle[position]);
            images.setImageResource(rImages[position]);
            return row;
        }
    }
}
