package com.example.ambubd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ambulance extends AppCompatActivity implements OnClickListener {

    private Button button41,button42,button43,button44,
            button45,button46,button47,button48,button49,button50, button51,
            button52,button53,button54,
            button55,button56,button57,button58,button59,button60,
     button61,button62,button63,button64,
            button65,button66,button67,button68,button69,button70,
    button71,button72,button73,button74,
            button75,button76,button77,button78,button79,button80;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);



        button41 = (Button) findViewById(R.id.button41);
        button42 = (Button) findViewById(R.id.button42);
        button43 = (Button) findViewById(R.id.button43);
        button44 = (Button) findViewById(R.id.button44);
        button45 = (Button) findViewById(R.id.button45);
        button46 = (Button) findViewById(R.id.button46);
        button47 = (Button) findViewById(R.id.button47);
        button48 = (Button) findViewById(R.id.button48);
        button49 = (Button) findViewById(R.id.button49);
        button50 = (Button) findViewById(R.id.button50);

        button51 = (Button) findViewById(R.id.button51);
        button52 = (Button) findViewById(R.id.button52);
        button53 = (Button) findViewById(R.id.button53);
        button54 = (Button) findViewById(R.id.button54);
        button55 = (Button) findViewById(R.id.button55);
        button56 = (Button) findViewById(R.id.button56);
        button57 = (Button) findViewById(R.id.button57);
        button58 = (Button) findViewById(R.id.button58);
        button59 = (Button) findViewById(R.id.button59);
        button60 = (Button) findViewById(R.id.button60);

        button61 = (Button) findViewById(R.id.button61);
        button62 = (Button) findViewById(R.id.button62);
        button63 = (Button) findViewById(R.id.button63);
        button64 = (Button) findViewById(R.id.button64);
        button65 = (Button) findViewById(R.id.button65);
        button66 = (Button) findViewById(R.id.button66);
        button67 = (Button) findViewById(R.id.button67);
        button68 = (Button) findViewById(R.id.button68);
        button69 = (Button) findViewById(R.id.button69);
        button70 = (Button) findViewById(R.id.button70);

        button71 = (Button) findViewById(R.id.button71);
        button72 = (Button) findViewById(R.id.button72);
        button73 = (Button) findViewById(R.id.button73);
        button74 = (Button) findViewById(R.id.button74);
        button75 = (Button) findViewById(R.id.button75);
        button76 = (Button) findViewById(R.id.button76);
        button77 = (Button) findViewById(R.id.button77);
        button78 = (Button) findViewById(R.id.button78);
        button79 = (Button) findViewById(R.id.button79);
        button80 = (Button) findViewById(R.id.button80);


        button41.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,ProfileAcivity.class);
                startActivity(intent);
            }
        });
        button42.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,button42.class);
                startActivity(intent);
            }
        });
        button43.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button43.class);
                startActivity(intent);
            }
        });
        button44.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button44.class);
                startActivity(intent);
            }
        });
        button45.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button45.class);
                startActivity(intent);
            }
        });
        button46.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button46.class);
                startActivity(intent);
            }
        });
        button47.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button47.class);
                startActivity(intent);
            }
        });
        button48.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button48.class);
                startActivity(intent);
            }
        });
        button49.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button49.class);
                startActivity(intent);
            }
        });
        button50.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button50.class);
                startActivity(intent);
            }
        });

        button51.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button51.class);
                startActivity(intent);
            }
        });
        button52.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button52.class);
                startActivity(intent);
            }
        });
        button53.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button53.class);
                startActivity(intent);
            }
        });
        button54.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button54.class);
                startActivity(intent);
            }
        });
        button55.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button55.class);
                startActivity(intent);
            }
        });
        button56.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button56.class);
                startActivity(intent);
            }
        });
        button57.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button57.class);
                startActivity(intent);
            }
        });
        button58.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button58.class);
                startActivity(intent);
            }
        });
        button59.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,BUtton59.class);
                startActivity(intent);
            }
        });
        button60.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button60.class);
                startActivity(intent);
            }
        });

        button61.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button61.class);
                startActivity(intent);
            }
        });
        button62.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button62.class);
                startActivity(intent);
            }
        });
        button63.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button63.class);
                startActivity(intent);
            }
        });
        button64.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button64.class);
                startActivity(intent);
            }
        });
        button65.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button65.class);
                startActivity(intent);
            }
        });
        button66.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button66.class);
                startActivity(intent);
            }
        });
        button67.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button67.class);
                startActivity(intent);
            }
        });
        button68.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button68.class);
                startActivity(intent);
            }
        });
        button69.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button69.class);
                startActivity(intent);
            }
        });
        button70.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button70.class);
                startActivity(intent);
            }
        });

        button71.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button71.class);
                startActivity(intent);
            }
        });
        button72.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button72.class);
                startActivity(intent);
            }
        });
        button73.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button73.class);
                startActivity(intent);
            }
        });
        button74.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button74.class);
                startActivity(intent);
            }
        });
        button75.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button75.class);
                startActivity(intent);
            }
        });
        button76.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button76.class);
                startActivity(intent);
            }
        });
        button77.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button77.class);
                startActivity(intent);
            }
        });
        button78.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button78.class);
                startActivity(intent);
            }
        });
        button79.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button79.class);
                startActivity(intent);
            }
        });
        button80.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ambulance.this,Button80.class);
                startActivity(intent);
            }
        });
























        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home)
        {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    }
}
