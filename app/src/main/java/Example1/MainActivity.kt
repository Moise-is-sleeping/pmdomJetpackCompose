package Example1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.moise.pmdomjetpackcompose.ui.theme.PmdomJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PmdomJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column("Android")
                }
            }
        }
    }
}

@Composable
fun Column(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .height(100.dp)
            .background(Color.Black)
    ){

    }
}

@Preview(showBackground = true,
    heightDp = 500,
    widthDp = 300,
    showSystemUi = true,
    device = Devices.PIXEL_XL)
@Composable
fun GreetingPreview() {
    PmdomJetpackComposeTheme {
        Column("d")
    }
}