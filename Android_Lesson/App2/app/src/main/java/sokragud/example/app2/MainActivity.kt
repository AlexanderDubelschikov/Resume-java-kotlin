package sokragud.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userLogin: EditText = findViewById(R.id.user_login)
        val userPassword: EditText = findViewById(R.id.user_pass)
        val userMail: EditText = findViewById(R.id.user_email)
        val button: Button = findViewById(R.id.button_reg)

        button.setOnClickListener() {
            val login = userLogin.text.toString().trim()
            val password = userPassword.text.toString().trim()
            val mail = userMail.text.toString().trim()

            if (login == "" || mail == "" || password == "")
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            else {
                val user = User(login, password, mail)
                val db = DBHelper(this, null)
                db.addUser(user)
                Toast.makeText(this, "Пользователь $login добавлен", Toast.LENGTH_LONG).show()

                userLogin.text.clear()
                userMail.text.clear()
                userPassword.text.clear()

            }

        }
    }
}