package com.example.vkr_7.welcomepg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class loginpg extends AppCompatActivity {
String s1,s2;
EditText t1,t2;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpg);
        t1 = (EditText) findViewById(R.id.text1);
        t2 = (EditText) findViewById(R.id.text2);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    vanakam();

            }
        });
    }

        public void vanakam(){
        s1=t1.getText().toString();
        s2=t2.getText().toString();
        StringRequest sr=new StringRequest(Request.Method.POST, "https://vaibhavkiraan1998.000webhostapp.com/login.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("Success"))
                {
                    Intent obj=new Intent(loginpg.this,MainActivity.class);
                    obj.putExtra("key",s1);

                    startActivity(obj);
                }
                else
                {
                    Toast.makeText(loginpg.this, "invalid username&password", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(loginpg.this,response,Toast.LENGTH_LONG).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(loginpg.this,error.toString(),Toast.LENGTH_LONG).show();
            }
        }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map mp=new HashMap();
                mp.put("username",s1);
                mp.put("password",s2);
                return mp;
            }
        };

            RequestQueue m1= Volley.newRequestQueue(getApplicationContext());
            m1.add(sr);

        }

}
