package student.inti.com;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText edUsername, edPassword;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edUsername = findViewById(R.id.username);
        edPassword = findViewById(R.id.password);
        btn = findViewById(R.id.login);

        btn.setOnClickListener( new View.OnClickListener (){
            @Override
                public void onClick(View view) {
                    String username = edUsername.getText().toString();
                    String password = edPassword.getText().toString();
                    if (username.length() == 0 || password.length() == 0){
                        Toast.makeText(getApplicationContext(), "Please fill all details", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                    }
                }
        });
    }
}
