package sokragud.example.a2layoutview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val const = 10
    var context = "Hello World"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //R.id.MainButton
        //R.id.MainTextView
        var counter = 10

        }

        fun onClickTest(view: View){
            val tvTest = findViewById<TextView>(R.id.MainTextView)
            tvTest.text = "Cool"
        }
    }
