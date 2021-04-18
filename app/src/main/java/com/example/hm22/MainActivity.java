package com.example.hm22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textone);
        textView = findViewById(R.id.text_welcomу);
        button = findViewById(R.id.buttonone);
        editText = findViewById(R.id.editone);
        editText = findViewById(R.id.editlish);
        editText = findViewById(R.id.edittwo);
        editText = findViewById(R.id.editthree);
        editText = findViewById(R.id.editfour);
        button = findViewById(R.id.buttonone);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Text was cliked",Toast.LENGTH_LONG).show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = editText.getText().toString();
                if (!name.equals("")){
                    textView.setText("Ошибка");
                }else {
                    Toast.makeText(MainActivity.this, "Заполните до конца!", Toast.LENGTH_SHORT);



                }
            }
    });
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }}