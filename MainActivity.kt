import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.currency.ui.theme.CurrencyTheme // Ensure this matches your package

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrencyTheme {
                CurrencyConverterScreen()
            }
        }
    }
}

@Composable
fun CurrencyConverterScreen() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Currency Converter", style = MaterialTheme.typography.headlineMedium)
    }
}

@Preview(showBackground = true)
@Composable
fun CurrencyConverterPreview() {
    CurrencyTheme {
        CurrencyConverterScreen()
    }
}
