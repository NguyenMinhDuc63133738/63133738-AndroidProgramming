package tiil.edu.viewpager2recylerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter LandScapeAdapter;
    ArrayList<LandScape> ViewPagerDatas;
    ViewPager2 viewPager2Land;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPagerDatas = getDataForViewPager();
        viewPager2Land = findViewById(R.id.vp2land);
        LandScapeAdapter = new LandScapeAdapter( this, ViewPagerDatas);
        viewPager2Land.setAdapter(LandScapeAdapter);
        viewPager2Land.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }
    ArrayList<LandScape> getDataForViewPager() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape LandScape1 = new LandScape("eadae266c148cc8153321898e02efc88","Cot co Ha Noi");
        dsDuLieu.add(LandScape1);
        dsDuLieu.add(new LandScape ( "beee", "Tháp Effel"));
        dsDuLieu.add(new LandScape("faa", "Cung điện Buckiham"));
        dsDuLieu.add(new LandScape("sunfl", "Tượng nữ thần tự do"));
        return dsDuLieu;
    }
}