package tiil.edu.vd1_explicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy tham chiếu đến nút "Sang màn hình khác"
        Button btnChuyen = findViewById(R.id.btnQuayLai);

        // Thiết lập sự kiện click cho nút
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gọi phương thức ChuyenManHinh
                ChuyenManHinh();
            }
        });
    }

    // Phương thức ChuyenManHinh để chuyển sang SubMainActivity
    public void ChuyenManHinh() {
        // Tạo một Intent để chuyển sang SubMainActivity
        Intent intent = new Intent(this, SubMainActivity.class);
        // Bắt đầu activity mới
        startActivity(intent);
    }
}