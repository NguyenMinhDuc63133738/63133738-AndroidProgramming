package tiil.edu.vd2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy tham chiếu đến nút "Sang màn hình khác"
        Button btnChuyen = findViewById(R.id.btn_Chuyentrang);

        // Thiết lập sự kiện click cho nút
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gọi phương thức ChuyenManHinh
                ChuyenManHinh();
            }
        });
    }
    public void ChuyenManHinh() {
        // Tạo một Intent để chuyển sang SubMainActivity
        Intent intent = new Intent(this, Login.class);
        // Bắt đầu activity mới
        startActivity(intent);
    }
}