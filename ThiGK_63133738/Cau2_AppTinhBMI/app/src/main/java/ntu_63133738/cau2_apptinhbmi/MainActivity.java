package ntu_63133738.cau2_apptinhbmi;

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
        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double chieuCao = Double.parseDouble(etChieuCao.getText().toString());
                double canNang = Double.parseDouble(etCanNang.getText().toString());
                chiso = canNang/Math.pow(chieuCao, 2);
                if (rbNam.isChecked()) {
                    if(chiso < 18.5){
                        String chisoFormatted = String.format("%.2f", chiso);
                        txtChiSo.setText(chisoFormatted);
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    if(chiso >= 18.5 && chiso <= 24.9){
                        String chisoFormatted = String.format("%.2f", chiso);
                        txtChiSo.setText(chisoFormatted);
                        txtNhanXet.setText("Bạn có chỉ số BMI bình thường");
                    }
                    if(chiso >= 25 && chiso <= 29.9){
                        String chisoFormatted = String.format("%.2f", chiso);
                        txtChiSo.setText(chisoFormatted);
                        txtNhanXet.setText("Bạn có chỉ số BMI mức độ thừa cân");
                    }
                    if(chiso >= 30 && chiso <= 34.9){
                        String chisoFormatted = String.format("%.2f", chiso);
                        txtChiSo.setText(chisoFormatted);
                        txtNhanXet.setText("Bạn có chỉ số BMI mức độ béo phì, cần điều chỉnh chế độ dinh dưỡng");
                    }
                    if(chiso >= 35 ){
                        String chisoFormatted = String.format("%.2f", chiso);
                        txtChiSo.setText(chisoFormatted);
                        txtNhanXet.setText("Bạn có chỉ số BMI mức độ béo phì nguy hiểm, đây là mức độ nguy hiểm, cần điều chỉnh chế độ dinh dưỡng phối hơp luyện tập");
                    }
                }
                else if (rbNU.isChecked())
                {
                    if(chiso < 18.5){
                        String chisoFormatted = String.format("%.2f", chiso);
                        txtChiSo.setText(chisoFormatted);
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    if(chiso >= 18.5 && chiso <= 24.9){
                        String chisoFormatted = String.format("%.2f", chiso);
                        txtChiSo.setText(chisoFormatted);
                        txtNhanXet.setText("Bạn có chỉ số BMI bình thường");
                    }
                    if(chiso >= 25 && chiso <= 29.9){
                        String chisoFormatted = String.format("%.2f", chiso);
                        txtChiSo.setText(chisoFormatted);
                        txtNhanXet.setText("Bạn có chỉ số BMI mức độ thừa cân");
                    }
                    if(chiso >= 30 && chiso <= 34.9){
                        String chisoFormatted = String.format("%.2f", chiso);
                        txtChiSo.setText(chisoFormatted);
                        txtNhanXet.setText("Bạn có chỉ số BMI mức độ béo phì, cần điều chỉnh chế độ dinh dưỡng");
                    }
                    if(chiso >= 35 ){
                        String chisoFormatted = String.format("%.2f", chiso);
                        txtChiSo.setText(chisoFormatted);
                        txtNhanXet.setText("Bạn có chỉ số BMI mức độ béo phì nguy hiểm, đây là mức độ nguy hiểm, cần điều chỉnh chế độ dinh dưỡng phối hơp luyện tập");
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Vui lòng chọn giới tính!", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}