package com.oscar.mainactivity

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()
        surface_view.setOnClickListener {
            Toast.makeText(this, "MOM GET THE CAMERA", Toast.LENGTH_LONG).show()
        }
    }

}
