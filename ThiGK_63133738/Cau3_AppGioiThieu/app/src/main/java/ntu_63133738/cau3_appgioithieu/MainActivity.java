package ntu_63133738.cau3_appgioithieu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView HovaTen, MSSV,Lop,Chuyennganh,Email;
    Button btnHovaTen, btnMSSV, btnLop, btnChuyennganh, btnEmail;
    RadioButton rbXacnhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        HovaTen = findViewById(R.id.txt_hovaten);
        MSSV = findViewById(R.id.txt_mssv);
        Lop = findViewById(R.id.txt_lop);
        Chuyennganh = findViewById(R.id.txt_chuyennganh);
        Email = findViewById(R.id.txt_email);
        btnHovaTen = findViewById(R.id.btn_hovaten);
        btnMSSV = findViewById(R.id.btn_mssv);
        btnLop = findViewById(R.id.btn_lop);
        btnChuyennganh = findViewById(R.id.btn_cn);
        btnEmail = findViewById(R.id.btn_email);
        rbXacnhan = findViewById(R.id.rb_xacnhan);

        btnHovaTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbXacnhan.isChecked()) {
                    HovaTen.setText("Nguyễn Minh Đức");
                }
                else{
                    Toast.makeText(getApplicationContext(),"Vui lòng chọn xác nhận!", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnMSSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbXacnhan.isChecked()) {
                    MSSV.setText("63133738");
                }
                else{
                    Toast.makeText(getApplicationContext(),"Vui lòng chọn xác nhận!", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnLop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbXacnhan.isChecked()) {
                    Lop.setText("63CNTT_2");
                }
                else{
                    Toast.makeText(getApplicationContext(),"Vui lòng chọn xác nhận!", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnChuyennganh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbXacnhan.isChecked()) {
                    Chuyennganh.setText("Công nghệ thông tin");
                }
                else{
                    Toast.makeText(getApplicationContext(),"Vui lòng chọn xác nhận!", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbXacnhan.isChecked()) {
                    Email.setText("duc.nm.63cntt@ntu.edu.vn");
                }
                else{
                    Toast.makeText(getApplicationContext(),"Vui lòng chọn xác nhận!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}