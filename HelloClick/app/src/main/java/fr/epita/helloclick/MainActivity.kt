package fr.epita.helloclick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var counter: Int = 0
    var incrementSize: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickMeButton.setOnClickListener(this@MainActivity)
        resetButton.setOnClickListener(this@MainActivity)
        reverseButton.setOnClickListener(this@MainActivity)
        normalButton.setOnClickListener(this@MainActivity)
        bigButton.setOnClickListener(this@MainActivity)
    }

    override fun onClick(clickedView: View?) {
        if (clickedView != null) {
            when (clickedView.id) {
                R.id.clickMeButton -> {
                    counter += incrementSize
                    findViewById<TextView>(R.id.counterTextView).setText(counter.toString())
                }
                R.id.resetButton -> {
                    counter = 0
                    findViewById<TextView>(R.id.counterTextView).setText(counter.toString())
                }
                R.id.reverseButton -> {
                    incrementSize *= -1
                }
                R.id.normalButton -> {
                    incrementSize = 1
                }
                R.id.bigButton -> {
                    incrementSize = 10
                }
            }
        }
    }
}
