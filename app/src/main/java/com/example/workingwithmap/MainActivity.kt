package com.example.workingwithmap

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.libraries.maps.SupportMapFragment
import com.google.android.libraries.maps.model.BitmapDescriptor
import com.google.android.libraries.maps.model.BitmapDescriptorFactory
import com.google.android.libraries.maps.model.LatLng
import com.google.android.libraries.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync { map ->

            val icon = BitmapDescriptorFactory.fromBitmap(
                Bitmap.createScaledBitmap(
                    BitmapFactory.decodeResource(resources,R.drawable.ic_food),
                    80,
                    80,
                    false
                )
            )
            map.addMarker(
                MarkerOptions().position(LatLng(23.5,45.6))
                    .draggable(true)
                    .icon(icon)
            )
        }
    }
}
