package mx.itson.edu.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etCelcius: EditText = findViewById(R.id.etC)
        var etKelvin: EditText = findViewById(R.id.etK)
        var etFahrenheit: EditText = findViewById(R.id.etF)

        val btnCentigrade: Button = findViewById(R.id.btnGC)
        val btnKelvin: Button = findViewById(R.id.btnGK)
        val btnFahrenheit: Button = findViewById(R.id.btnGF)

        btnCentigrade.setOnClickListener(){

            if(etFahrenheit.text.isNotEmpty()){
                var fahrenheitTemp:Float = etFahrenheit.text.toString().toFloat()

                var celciusTemp:Float = (fahrenheitTemp - 32) / 1.8f

                etCelcius.setText(celciusTemp.toString())

            }else if(etKelvin.text.isNotEmpty()){
                var kelvinTemp:Float = etKelvin.text.toString().toFloat()

                var celciusTemp:Float = kelvinTemp - 273.15f

                etCelcius.setText(celciusTemp.toString())
            }
        }

        btnKelvin.setOnClickListener(){

            if(etCelcius.text.isNotEmpty()){
                var celciusTemp:Float = etCelcius.text.toString().toFloat()

                var kelvinTemp:Float = celciusTemp + 273.15f

                etKelvin.setText(kelvinTemp.toString())

            }else if(etFahrenheit.text.isNotEmpty()){
                var fahrenheitTemp:Float = etFahrenheit.text.toString().toFloat()

                var kelvinTemp:Float = (5 * (fahrenheitTemp - 32) / 9) + 273.15f

                etKelvin.setText(kelvinTemp.toString())
            }
        }

        btnFahrenheit.setOnClickListener(){

            if(etCelcius.text.isNotEmpty()){
                var celciusTemp:Float = etCelcius.text.toString().toFloat()

                var fahrenheitTemp:Float = celciusTemp * 1.8f + 32

                etFahrenheit.setText(fahrenheitTemp.toString())

            }else if(etKelvin.text.isNotEmpty()){
                var kelvinTemp:Float = etKelvin.text.toString().toFloat()

                var fahrenheitTemp:Float = (9 * (kelvinTemp - 273.15f) / 5 ) + 32

                etFahrenheit.setText(fahrenheitTemp.toString())
            }

        }
    }
}