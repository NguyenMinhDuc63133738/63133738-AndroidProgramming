package tiil.edu.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText editTextSoA;
    EditText editTextSoB;
    EditText editTextKetQua;
    Button nutCong,nutTru,nutNhan,nutChia;
     void TimDieuKien()
    {
        editTextSoA =  findViewById(R.id.edtso1);
        editTextSoB =  findViewById(R.id.edtso2);
        editTextKetQua =  findViewById(R.id.edtsoKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKien();
    }

   public void XLC(View v)
   {

       String str1 = editTextSoA.getText().toString();
       String str2 = editTextSoB.getText().toString();

       float soA = Float.parseFloat(str1);
       float soB = Float.parseFloat(str2);

       float tong = soA + soB;

       String strTong = String.valueOf(tong);
       editTextKetQua.setText(strTong);
   }
    public void XLT(View v)
    {


        String str1 = editTextSoA.getText().toString();
        String str2 = editTextSoB.getText().toString();

        float soA = Float.parseFloat(str1);
        float soB = Float.parseFloat(str2);

        float hieu = soA - soB;

        String strTong = String.valueOf(hieu);
        editTextKetQua.setText(strTong);
    }
    public  void XLN(View v)
    {


        String str1 = editTextSoA.getText().toString();
        String str2 = editTextSoB.getText().toString();

        float soA = Float.parseFloat(str1);
        float soB = Float.parseFloat(str2);

        float tich = soA * soB;

        String strTong = String.valueOf(tich);
        editTextKetQua.setText(strTong);
    }
    public  void XLChia(View v)
    {


        String str1 = editTextSoA.getText().toString();
        String str2 = editTextSoB.getText().toString();

        float soA = Float.parseFloat(str1);
        float soB = Float.parseFloat(str2);

        float thuong = soA / soB;

        String strTong = String.valueOf(thuong);
        editTextKetQua.setText(strTong);
    }
}