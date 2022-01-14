package com.example.garagefinaluri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.garagefinaluri.dataclasses.CarRecycleViewAdapter
import com.example.garagefinaluri.dataclasses.Cars

class ItemCars: AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var recyclerView: RecyclerView
    private lateinit var CarRecycleViewAdapter: CarRecycleViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)

        recyclerView = findViewById(R.id.recyclerView)
        CarRecycleViewAdapter = CarRecycleViewAdapter(getData())
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CarRecycleViewAdapter
        button = findViewById(R.id.button13)

        goToMenu()



    }

    private fun getData(): List<Cars> {
        val list = ArrayList<Cars>()

        list.add(
            Cars(
                1,
                "Nissan Skyline",
                "ფორსაჟი 2",
                "https://static.wikia.nocookie.net/fastandfurious/images/d/d2/Nissan_Skyline_-_2F2F.jpg/revision/latest/scale-to-width-down/1000?cb=20201128161453"
            )
        )
        list.add(
            Cars(
                2,
                "Toyota Supra",
                "ფორსაჟი 1",
                "https://www.sportscarmarket.com/wp-content/uploads/2015/08/1993-toyota-supra-the-fast-and-the-furious-drivers-front.jpg"
            )
        )
        list.add(
            Cars(
                3,
                "Ford Mustang",
                "სიჩქარის წყურვილი",
                "https://hips.hearstapps.com/autoweek/assets/s3fs-public/140419894.jpg"
            )
        )
        list.add(
            Cars(
                4,
                "BMW M3 GTR",
                "NFS: Most wanted",
                "https://img.gta5-mods.com/q75/images/bmw-m3-gtr-e46-nfs-mw-by-dtd-mrfive/5a8d9a-3.jpg"
            )
        )
        list.add(
            Cars(
                5,
                "Chevrolet Camaro",
                "ტრანსფორმერები",
                "https://ag-spots-2015.o.auroraobjects.eu/2015/04/11/chevrolet-camaro-ss-transformers-edition-c896511042015131900_1.jpg"
            )
        )
        list.add(
            Cars(
                6,
                "Ferrari 550 maranello",
                "ცუდი ბიჭები",
                "https://www.carpixel.net/w/1af93d1d41116ea1068757e6a5ccb81c/ferrari-550-maranello-car-wallpaper-70951.jpg"
            )
        )
        list.add(
            Cars(
                7,
                "Aston martin DB5",
                "ჯეიმს ბონდი",
                "https://www.topgear.com/sites/default/files/images/cars-road-test/2020/09/111dedbf3346cd7f5440e0e303264933/aston-martin-db5-goldfinger-jason-barlow-photo-max-earey-48-jpg.jpg"
            )
        )

        return list;
    }

    private fun goToMenu() {
        button.setOnClickListener() {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
            finish()
        }
    }

}