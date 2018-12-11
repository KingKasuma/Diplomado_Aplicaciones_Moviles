package com.example.mike.businessapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView txtSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtSelected = (TextView) findViewById(R.id.textView);
    }

    public void changeButton(View view){
        String id = view.getTag().toString();
        //Integer id = view.getId();

        Log.i("Id tag",id);

        TextView textView = findViewById(R.id.textView);

        switch (id){
            case "3":
                Button button3 = findViewById(R.id.button3);
                textView.setText(button3.getText());
                break;
            case "2":
                Button button2 = findViewById(R.id.button2);
                textView.setText(button2.getText());
                break;
            case "1":
                Button button = findViewById(R.id.button);
                textView.setText(button.getText());
                break;
            case "4":
                Button button4 = findViewById(R.id.button4);
                textView.setText(button4.getText());
                break;
            case "5":
                Button button5 = findViewById(R.id.button5);
                textView.setText(button5.getText());
                break;
        }
    }

    public void selectButton(View view){
        if(view.getId() == R.id.button3){
            Intent i = new Intent(this, ServiciosActivity.class);
            startActivity(i);
        }else if(view.getId()==R.id.button2){
            this.txtSelected.setText("Portafolio");
        }
    }
}
