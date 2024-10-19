package gt.edu.Jose.Cristales.Prestamosapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import gt.edu.Jose.Cristales.Prestamosapp.ui.theme.PrestamosAppTheme
import gt.edu.Jose.Cristales.Prestamosapp.views.HomeView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrestamosAppTheme {
                HomeView()
            }
        }
    }
}