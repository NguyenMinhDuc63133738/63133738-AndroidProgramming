package tiil.edu.usingrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter LandScapeAdapter;
    ArrayList<LandScape> recylerViewDatas;
    RecyclerView recyclerViewLandscape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3
        recylerViewDatas = getDataForRecyclerView();
        //4
        recyclerViewLandscape = findViewById(R.id.recyclerLand);
        //5
        //RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        //recyclerViewLandscape.setLayoutManager(layoutLinear);

        //RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        //recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);

        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this,2);
        recyclerViewLandscape.setLayoutManager(layoutGrid);
        //6
        LandScapeAdapter = new LandScapeAdapter(this, recylerViewDatas);
        //7
        recyclerViewLandscape.setAdapter(LandScapeAdapter);
    }
    ArrayList<LandScape> getDataForRecyclerView() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape LandScape1 = new LandScape("eadae266c148cc8153321898e02efc88","Cot co Ha Noi");
        dsDuLieu.add(LandScape1);
        dsDuLieu.add(new LandScape ( "beee", "Tháp Effel"));
        dsDuLieu.add(new LandScape("faa", "Cung điện Buckiham"));
        dsDuLieu.add(new LandScape("sunfl", "Tượng nữ thần tự do"));
        return dsDuLieu;
    }
}