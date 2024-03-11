package tiil.edu.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // GẮN LAYOUT TƯƠNG ỨNG VỚI FILE NÀY
        setContentView(R.layout.activity_main);
    }
    //đây là bộ lắng nghe và xử lí sự kiện click lên nút Tính Tổng
    public void XLC(View view)
    {
      EditText editTextSoA =  findViewById(R.id.edtA);
      EditText editTextSoB =  findViewById(R.id.edtB);
      EditText editTextKetQua =  findViewById(R.id.edtKQ);

      String strA = editTextSoA.getText().toString();
      String strB = editTextSoB.getText().toString();

      int soA = Integer.parseInt(strA);
      int soB = Integer.parseInt(strB);

      int tong = soA + soB;

      String strTong = String.valueOf(tong);
      editTextKetQua.setText(strTong);
    }
}