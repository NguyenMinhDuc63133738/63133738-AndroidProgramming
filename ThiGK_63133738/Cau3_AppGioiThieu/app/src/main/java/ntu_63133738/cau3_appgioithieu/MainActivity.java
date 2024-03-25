package ntu_63133738.cau3_appgioithieu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText HovaTen, MSSV,Lop,Chuyennganh,Email;
    Button btnHovaTen, btnMSSV, btnLop, btnChuyennganh, btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        HovaTen = findViewById(R.id.et_Hovaten);
        MSSV = findViewById(R.id.et_Hovaten);
        Lop = findViewById(R.id.et_Hovaten);
        Chuyennganh = findViewById(R.id.et_Hovaten);
        Email = findViewById(R.id.et_Hovaten);
        btnHovaTen = findViewById(R.id.et_Hovaten);
        btnMSSV = findViewById(R.id.et_Hovaten);
        btnLop = findViewById(R.id.et_Hovaten);




    }
}