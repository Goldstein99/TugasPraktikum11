package com.example.tugaspraktikum11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCars;
    private ArrayList<Car> list = new ArrayList<>();
    private String title = "Mode List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvCars = findViewById(R.id.rv_cars);
        rvCars.setHasFixedSize(true);

        list.addAll(CarsData.getListData());
        showRecyclerGrid();
    }

    private void showRecyclerGrid(){
        rvCars.setLayoutManager(new GridLayoutManager(this, 2));
        GridCarAdapter gridHeroAdapter = new GridCarAdapter(list);
        rvCars.setAdapter(gridHeroAdapter);

        gridHeroAdapter.setOnItemClickCallback(new GridCarAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Car data) {
                showSelectedHero(data);
            }
        });
    }

    private void showRecyclerCardView(){
        rvCars.setLayoutManager(new LinearLayoutManager(this));
        CardViewCarAdapter cardViewCarAdapter = new CardViewCarAdapter(list);
        rvCars.setAdapter(cardViewCarAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu (menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        if (selectedMode == R.id.action_grid) {
            title = "Mode Grid Super Cars";
            showRecyclerGrid();
        } else if (selectedMode == R.id.action_cardview) {
            title = "Mode CardView Super Cars";
            showRecyclerCardView();
        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedHero(Car car) {
        Toast.makeText(this, "Kamu memilih " + car.getName(),
                Toast.LENGTH_SHORT).show();
    }
}