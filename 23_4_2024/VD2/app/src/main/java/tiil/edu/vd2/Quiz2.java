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

public class Quiz2 extends AppCompatActivity {

    private EditText edtNT;
    private Button btnCheck,btnNext;

    private static final int DO_DAI_DUONG_BO_BIEN_NHA_TRANG = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        // Ánh xạ các thành phần giao diện
        edtNT = findViewById(R.id.edtQuiz2);
        btnCheck = findViewById(R.id.btnOK);
        btnNext = findViewById(R.id.btnNext);

        // Xử lý sự kiện khi nhấn nút Xác nhận
        btnCheck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String yearOfBirthStr = edtNT.getText().toString();

                // Kiểm tra xem EditText có rỗng không
                if (yearOfBirthStr.isEmpty()) {
                    Toast.makeText(Quiz2.this, "Vui lòng nhập độ dài đường bờ biển Nha Trang", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Chuyển đổi từ chuỗi sang số nguyên
                int yearOfBirth = Integer.parseInt(yearOfBirthStr);
                
                if (yearOfBirth == DO_DAI_DUONG_BO_BIEN_NHA_TRANG) {
                    Toast.makeText(Quiz2.this, "Chính xác! Độ dài đường bờ biển Nha Trang (km) là " + DO_DAI_DUONG_BO_BIEN_NHA_TRANG, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Quiz2.this, "Không chính xác! Độ dài đường bờ biển Nha Trang (km) là " + DO_DAI_DUONG_BO_BIEN_NHA_TRANG, Toast.LENGTH_SHORT).show();
                }
                btnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Gọi phương thức ChuyenManHinh
                        ChuyenManHinh();
                    }
                });
            }
        });
    }
    public void ChuyenManHinh() {
        // Tạo một Intent để chuyển sang SubMainActivity
        Intent intent = new Intent(this, Quiz1.class);
        // Bắt đầu activity mới
        startActivity(intent);
    }
}