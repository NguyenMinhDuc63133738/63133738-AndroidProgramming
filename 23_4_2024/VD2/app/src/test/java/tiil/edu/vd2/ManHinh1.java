package tiil.edu.vd2;

import org.junit.Test;

import static org.junit.Assert.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ManHinh1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy tham chiếu đến nút "Sang màn hình khác"
        Button btnChuyen = findViewById(R.id.btn_Chuyentrang);

        // Thiết lập sự kiện click cho nút

}}
