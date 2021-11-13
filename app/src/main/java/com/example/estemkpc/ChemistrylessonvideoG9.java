package com.example.estemkpc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class
ChemistrylessonvideoG9 extends AppCompatActivity {
    ListView pdflistview;
    String[] pdfFile = {"ការពិសោធន៍លោហៈអាល់កាឡាំងជាមួយទឹក","ប្រតិកម្មទង់ដែងIIអុកស៊ីត និងកាបូន","ប្រតិកម្មកំបោររស់ជាមួយទឹក","ពិសោធន៍ការបំបែកនៃទង់ដែងកាបូណាត","ទង្វើរអុកស៊ីសែន","អាលុយមីញ៉ូមបាត់ កកើតនៅទង់ដែង","អង្គធាតុចង្អុលពណ៌","សូដ្យូមប៊ីកាបូណាត និងទឹកខ្មេះ"};
    int[]images = {R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf,R.drawable.filepdf};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistrylessonvideo_g9);
        pdflistview = findViewById(R.id.PDFlist);
        ChemistrylessonvideoG9.MyAdapter adapter = new ChemistrylessonvideoG9.MyAdapter(this,pdfFile,images);
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
