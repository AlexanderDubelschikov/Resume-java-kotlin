package sokragud.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.items_list)
        val items = arrayListOf<Item>()

        items.add(Item(1, "sofa", "Диван", "Удобный диван-кровать, который откроет для вас доступ к 7 сну", "Some text", "200$"))
        items.add(Item(2, "light", "Свет", "Умное освещение для вашей Кухни в уникальном дизайнерском стиле", "Some text", "400$"))
        items.add(Item(3, "kitchen", "Кухня", "Полностью готовый проект вашей новой кухни с мебелью и дизайнерским светом", "Some text", "4000$"))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}