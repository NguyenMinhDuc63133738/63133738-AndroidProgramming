package ntu_63133738.cau2_apptinhbmi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etChieuCao, etCanNang;
    RadioButton rbNam, rbNU;
    Button btnTinhBMI;
    TextView txtChiSo, txtNhanXet;
    double chiso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etChieuCao = findViewById(R.id.et_chieucao);
        etCanNang = findViewById(R.id.et_cannang);
        rbNam = findViewById(R.id.rb_nam);
        rbNU = findViewById(R.id.rb_nu);
        btnTinhBMI = findViewById(R.id.btn_tinh);
        txtChiSo = findViewById(R.id.txt_ketqua);
        txtNhanXet = findViewById(R.id.txt_nhanxet);
    }
}