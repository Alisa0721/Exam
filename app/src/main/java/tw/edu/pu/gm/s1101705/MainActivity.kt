package tw.edu.pu.gm.s1101705

import android.graphics.Color
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import tw.edu.pu.gm.s1101705.ui.theme.丁鈺蘋Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.Files.size

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            丁鈺蘋Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    /*
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Canvas(modifier = Modifier.fillMaxSize()) {
            val canvasWidth = size.width
            val canvasHeight = size.height
            drawRect(color = androidx.compose.ui.graphics.Color.Blue,Offset(100F,100F),Size(20F,20F)
            )
        }
    }

     */

    Column {
        Text(text = "作者:資管二B丁鈺蘋",textAlign = TextAlign.Center,modifier = Modifier.width(620.dp))
        Image(
            painter = painterResource(id = R.drawable.map),
            contentDescription = "地圖",
            modifier = Modifier.width(800.dp)
        )
    }
    /*
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        var count = remember { mutableStateOf(0) }
        Text(
            text = count.value.toString(),
            fontSize = 50.sp,
            modifier = Modifier.clickable { count.value += 1 })
    }
     */
}

/*
@Preview(showBackground = true)

 */
@Composable
fun DefaultPreview() {
    丁鈺蘋Theme {
        Greeting("Android")
    }
}
