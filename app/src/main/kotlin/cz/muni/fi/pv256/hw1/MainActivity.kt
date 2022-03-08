package cz.muni.fi.pv256.hw1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var counter: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counter = findViewById(R.id.counter)
        val addButton = findViewById<Button>(R.id.addButton)
        val subButton = findViewById<Button>(R.id.subButton)
        addButton.setOnClickListener { editNumberBy(1) }
        subButton.setOnClickListener { editNumberBy(-1) }
    }
    private fun editNumberBy(number: Int) {
        var value = Integer.parseInt((counter.text).toString())
        value += number
        counter.text = value.toString()
    }
}
