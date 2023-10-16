package com.example.simplecostilcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer a = 0;
    Integer b = 0;
    String ch = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void makeAction(View view){
        TextView output = findViewById(R.id.output);

        switch (view.getId()){
            case R.id.button_1 :
                output.setText(output.getText() + "1");
                break;
            case R.id.button_2 :
                output.setText(output.getText() + "2");
                break;
            case R.id.button_3 :
                output.setText(output.getText() + "3");
                break;
            case R.id.button_4 :
                output.setText(output.getText() + "4");
                break;
            case R.id.button_5 :
                output.setText(output.getText() + "5");
                break;
            case R.id.button_6 :
                output.setText(output.getText() + "6");
                break;
            case R.id.button_7 :
                output.setText(output.getText() + "7");
                break;
            case R.id.button_8 :
                output.setText(output.getText() + "8");
                break;
            case R.id.button_9 :
                output.setText(output.getText() + "9");
                break;
            case R.id.button_0 :
                output.setText(output.getText() + "0");
                break;
            case R.id.button_plus:
                a = Integer.valueOf(String.valueOf(output.getText()));
                output.setText("");
                ch = "+";
                break;
            case R.id.button_minus:
                a = Integer.valueOf(String.valueOf(output.getText()));
                output.setText("");
                ch = "-";
                break;
            case R.id.button_mult:
                a = Integer.valueOf(String.valueOf(output.getText()));
                output.setText("");
                ch = "*";
                break;
            case R.id.button_sep:
                a = Integer.valueOf(String.valueOf(output.getText()));
                output.setText("");
                ch = "/";
                break;
            case R.id.button_root:
                a = Integer.valueOf(String.valueOf(output.getText()));
                Double d = Math.sqrt(a);
                output.setText(d.toString().substring(0,4));
                break;
            case R.id.button_C:
                output.setText("");
                a = 0;
                b = 0;
                ch = "";
                break;
            case R.id.button_uq:
                try {
                    b = Integer.valueOf(String.valueOf(output.getText()));
                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(this, "Enter NUM", Toast.LENGTH_SHORT).show();
                }

                switch (ch){
                    case "+":
                        output.setText(String.valueOf(a+b));
                        break;
                    case "-":
                        output.setText(String.valueOf(a-b));
                        break;
                    case "*":
                        output.setText(String.valueOf(a*b));
                        break;
                    case "/":
                        output.setText(String.valueOf(a/b));
                        break;

                    default:
                        output.setText("Enter character!");
                        break;
                }
                break;
        }
    }
}