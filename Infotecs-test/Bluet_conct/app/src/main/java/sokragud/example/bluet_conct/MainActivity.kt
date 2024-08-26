package sokragud.example.bluet_conct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sokragud.example.blueth_lyb.BaseActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, BaseActivity::class.java))
    }
}