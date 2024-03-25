package ntu_63133738.cau3_appgioithieu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView HovaTen, MSSV,Lop,Chuyennganh,Email;
    Button btnHovaTen, btnMSSV, btnLop, btnChuyennganh, btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
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
    }
}