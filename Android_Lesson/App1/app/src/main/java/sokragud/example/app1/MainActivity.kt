package sokragud.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.list_view)
        //val user_data = findViewById<EditText>(R.id.user_data)
        val userData: EditText = findViewById(R.id.user_data)
        val button: Button = findViewById(R.id.button)

        //Описание list_view
        val toDo: MutableList<String> = mutableListOf()
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, toDo)
        listView.adapter = adapter

        listView.setOnItemClickListener{ adapterView, view, i, l ->
            val text = listView.getItemAtPosition(i).toString()
            adapter.remove(text)

            Toast.makeText(this, "Мы удалили: $text", Toast.LENGTH_LONG).show()

        }

        button.setOnClickListener{
            var text = userData.text.toString().trim()
            if(text != "")
                adapter.insert(text,0)
        }

    }

}