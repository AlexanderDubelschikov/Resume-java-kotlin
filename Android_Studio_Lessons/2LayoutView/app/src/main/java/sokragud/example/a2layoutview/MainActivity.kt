package sokragud.example.a2layoutview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    /*val const3:Long = 9223372036854775807
    val const:Int = 2147483647
    val const4:Short = 32767
    val const2:Byte = 127
    val constextra:UByte = 224u
    val constextra2:UShort = 65535u

    val const6: Double = 2.2
    val const7: Float = 2.2f

    val const8: Boolean = true
    val const9: Boolean = false

    val const10: String = "Hello world mane char"
    val const11: Char = 'a'

    var context = "Hello World"*/
    var testString:Boolean = "Привет, как дела?".startsWith("Привет")
    var testBoolean:Boolean = "Привет, как дела?".endsWith("Привет")
    var testInteger:Int = "Привет, как дела?".length

    var tv: TextView? = null
    lateinit var good: TextView
    //lateinit var bt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv= findViewById<TextView>(R.id.MainTextView)
        tv?.text = "Miss Me?"
        //bt = findViewById(R.id.MainButton)
        //bt.setOnClickListener{}
        //R.id.MainButton
        //R.id.MainTextView
        //var counter = 10
        //var test2:Float=counter.toFloat()
    }

    override fun onPause() {
        super.onPause()
        tv?.text = "No, no miss u"
    }

        /*fun onClickTest(view: View){
            val tvTest = findViewById<TextView>(R.id.MainTextView)
            tvTest.text = "Cool"
        }*/

    fun onClickStart(view: View){
        tv?.text = "Hey!!!"
    }
}
