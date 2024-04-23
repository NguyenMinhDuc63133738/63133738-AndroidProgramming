package tiil.edu.vd1_explicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main);

        // Lấy tham chiếu đến nút "Quay về trang chủ"
        Button btnQuayLai = findViewById(R.id.btnQuayLai);

        // Thiết lập sự kiện click cho nút
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gọi phương thức QuayVe
                QuayVe();
            }
        });
    }

    // Phương thức QuayVe để chuyển về MainActivity
    public void QuayVe() {
        // Tạo một Intent để chuyển về MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        // Bắt đầu activity mới
        startActivity(intent);
    }
}