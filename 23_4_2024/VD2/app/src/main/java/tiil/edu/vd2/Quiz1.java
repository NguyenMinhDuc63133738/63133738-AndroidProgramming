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

public class Quiz1 extends AppCompatActivity {
    private EditText edtYearOfBirth;
    private Button btnCheck,btnNext;

    // Năm sinh của Bác Hồ
    private static final int YEAR_OF_BIRTH_HO_CHI_MINH = 1890;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        // Ánh xạ các thành phần giao diện
        edtYearOfBirth = findViewById(R.id.edtQuiz1);
        btnCheck = findViewById(R.id.btnOK);
        btnNext = findViewById(R.id.btnNext);

        // Xử lý sự kiện khi nhấn nút Xác nhận
        btnCheck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Lấy năm sinh nhập từ EditText
                String yearOfBirthStr = edtYearOfBirth.getText().toString();

                // Kiểm tra xem EditText có rỗng không
                if (yearOfBirthStr.isEmpty()) {
                    Toast.makeText(Quiz1.this, "Vui lòng nhập năm sinh của Bác Hồ", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Chuyển đổi năm sinh từ chuỗi sang số nguyên
                int yearOfBirth = Integer.parseInt(yearOfBirthStr);

                // Kiểm tra năm sinh có đúng là năm sinh của Bác Hồ không
                if (yearOfBirth == YEAR_OF_BIRTH_HO_CHI_MINH) {
                    Toast.makeText(Quiz1.this, "Chính xác! Năm sinh của Bác Hồ là " + YEAR_OF_BIRTH_HO_CHI_MINH, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Quiz1.this, "Không chính xác! Năm sinh của Bác Hồ là " + YEAR_OF_BIRTH_HO_CHI_MINH, Toast.LENGTH_SHORT).show();
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
        Intent intent = new Intent(this, Quiz2.class);
        // Bắt đầu activity mới
        startActivity(intent);
    }
}