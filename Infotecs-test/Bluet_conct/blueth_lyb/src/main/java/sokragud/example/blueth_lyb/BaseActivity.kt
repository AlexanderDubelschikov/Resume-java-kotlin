package sokragud.example.blueth_lyb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_list)
        initRcView()
    }

    private fun initRcView(){
        val rcView = findViewById<RecyclerView>(R.id.rcViewPaired)
        rcView.layoutManager = LinearLayoutManager(this)
        val adapter = ItemApadter()
        rcView.adapter = adapter
        adapter.submitList(createDeviceList())
    }

    private fun createDeviceList(): List<ListItem>{
        val list = ArrayList<ListItem>()
        for (i in 0 until 5){
            list.add(
                ListItem("Device $i", "34:57:21:52" )
            )
        }
        return list
    }
}