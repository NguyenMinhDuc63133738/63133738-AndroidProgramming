package tiil.edu.vd2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    private Button btnQuiz1, btnQuiz2;
    private TextView tvWelcomeMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvWelcomeMessage = findViewById(R.id.tvUserName);

        btnQuiz1 = findViewById(R.id.btnQuiz1);
        btnQuiz2 = findViewById(R.id.btnQuiz2);

        Intent intent = getIntent();
        if (intent != null) {
            String userName = intent.getStringExtra("USERNAME");
            if (userName != null) {
                // Hiển thị chào mừng cùng với tên người dùng
                tvWelcomeMessage.setText("Chào mừng " + userName);
            }
        }

        // Lấy tên người dùng từ EditText và hiển thị lên TextView
        btnQuiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang Activity Quiz1
                Intent intent = new Intent(Home.this, Quiz1.class);
                startActivity(intent);
            }
        });

        btnQuiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang Activity Quiz2
                Intent intent = new Intent(Home.this, Quiz2.class);
                startActivity(intent);
            }
        });
    }
}