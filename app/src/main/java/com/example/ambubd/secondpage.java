package com.example.ambubd;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.ambubd.R.id.loginButtonId;
import static com.example.ambubd.R.id.start;

public class secondpage extends AppCompatActivity {

    private EditText usernameEditText,passwordEditText;
    private Button loginButton;
    private TextView textView;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        //actionbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //usename and password
        usernameEditText = (EditText) findViewById(R.id.usernameId);
        passwordEditText = (EditText) findViewById(R.id.passwordId);
        loginButton = (Button) findViewById(loginButtonId);
        textView = findViewById(R.id.textViewId);
        textView.setText("Number of attemots remaining: 3");

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (username.equals("Admin") && password.equals("admin")) {

                    Intent intent = new Intent(secondpage.this, thirdpage.class);
                    startActivity(intent);


                } else {
                     counter--;
                     textView.setText("Number of attemots remaining : " +counter);
                     if (counter==0)
                     {
                         loginButton.setEnabled(false);
                     }
                }
            }

        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
