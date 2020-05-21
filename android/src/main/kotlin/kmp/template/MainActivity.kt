package kmp.template

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import example.HelloUserLabelRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        HelloUserLabelRepository().obtainHelloUserLabel().let { label ->
            activityMainHelloUserLabel.text = label
        }
    }
}
