package lolik.smart.wexelux;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;



    public class MainActivity extends AppCompatActivity {
        Button buttonNext;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            final EditText login = (EditText) findViewById(R.id.editTextTextPersonName);
            final String Login = login.getText().toString();

            final EditText password = (EditText) findViewById(R.id.editTextTextPassword3);
            final String Password = password.getText().toString();


            buttonNext = (Button) findViewById(R.id.buttonNext);
            buttonNext.setOnClickListener(new View.OnClickListener() {

                
                @Override
                public void onClick(View v) {
                String LoginText = login.getText().toString();
                String PasswordText = password.getText().toString();
                    if (LoginText.equals("test") && PasswordText.equals("qwerty")) {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                };
            });
        };
    };



