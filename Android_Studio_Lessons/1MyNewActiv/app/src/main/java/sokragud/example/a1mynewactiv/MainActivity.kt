package sokragud.example.a1mynewactiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity(){
var counter = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyLodMAct","OnCreate")
        //counter +=10
    }

    override fun onStart() {
        super.onStart()
        //counter -=10
        Log.d("MyLodMAct","OnStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLodMAct","OnRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLodMAct","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLodMAct","OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLodMAct","OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        //counter = 0
        Log.d("MyLodMAct","OnDestroy")
    }

}
