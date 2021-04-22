package valera.jesus.iniciosesion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val bundle = intent.extras
        if(bundle != null){
            val nombre = bundle.getString("name" )
            val correo = bundle.getString("email")
            this.tv_nombre.setText(nombre)
            this.tv_email.setText(correo)
        }

        this.btn_cerrar.setOnClickListener{
            finish()
        }
    }
}