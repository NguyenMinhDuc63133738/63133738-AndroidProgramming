package tiil.edu.vd2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {
    private EditText edtUserName, edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Ánh xạ các thành phần giao diện
        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPass);
        btnLogin = findViewById(R.id.btnOK);

        // Xử lý sự kiện khi nhấn nút đăng nhập
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy thông tin từ EditText
                String userName = edtUserName.getText().toString();
                String password = edtPassword.getText().toString();

                // Kiểm tra thông tin đăng nhập
                if (userName.equals("NMD") && password.equals("123")) {
                    // Đăng nhập thành công, chuyển sang màn hình (Home)
                    Intent intent = new Intent(Login.this, Home.class);
                    intent.putExtra("USERNAME", userName);
                    startActivity(intent);

                } else {
                    // Đăng nhập thất bại
                    Toast.makeText(Login.this, "Mật khẩu hoặc tên đăng nhập chưa đúng", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}