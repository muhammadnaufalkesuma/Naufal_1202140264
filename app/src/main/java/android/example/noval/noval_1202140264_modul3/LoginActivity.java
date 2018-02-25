package android.example.noval.noval_1202140264_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText usernameET;
    EditText passwordET;
    Button LogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameET = (EditText) findViewById(R.id.username);
        passwordET = (EditText) findViewById(R.id.password);
        LogIn = (Button) findViewById(R.id.login);
    }

    public void onClick(View view) {
        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();

        if(username.equals("EAD") && password.equals("MOBILE")){
//            Intent intent = new Intent(this, MainActivity.class);
//            startActivity(intent);
            Toast.makeText(this, "You Signed In",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show();
        }

    }
}