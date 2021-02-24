package com.example.lesson1_homework

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val TAG = "TEST_TAG"
    val firstObject: TestClass = TestClass("First object", "First object description")
    val secondObject: TestClass = firstObject.copy("Second object", "Second object description")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonTest: Button = findViewById(R.id.test_button)
        buttonTest.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d(TAG, "First object: ${firstObject.name}, ${firstObject.description}")

                val list = listOf(1, 2, 3, 4, 5, 6)
                list.forEach {
                    Log.d(TAG, it.toString())
                }
                for (i in 1..100 step 5) {
                    Log.d(TAG, i.toString())
                    print(i)
                }
                for (i in 100 downTo 1 step 5) {
                    Log.d(TAG, i.toString())

                }
                Toast.makeText(this@MainActivity, "Second object: ${secondObject.name}, ${secondObject.description}", Toast.LENGTH_SHORT).show()

            }
        })
    }
}