package com.example.infs3605;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class LeaderBoard extends AppCompatActivity {

    ListView ranking;
    int [] images = {R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10
    };

    String [] Names = {"John Kim",
            "Seline Fernadez",
            "Tomothy Young",
            "Sophia Lee",
            "Haider Mushtaq",
            "Chirs Chen",
            "Zoe Kim",
            "Edmond Lai",
            "Jin Chen",
            "Tom Sah"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ranking = (ListView)findViewById(R.id.myListView);
        CustomAdapter customAdapter = new CustomAdapter();
        ranking.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.itemrow,null);

            ImageView rankView = view.findViewById(R.id.imageView);
            TextView textView = (TextView) view.findViewById(R.id.textview);

            rankView.setImageResource(images[position]);
            textView.setText(Names[position]);
            return view;
        }
    }
}
