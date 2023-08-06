package co.edu.sena.myapplication2687386

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.sena.myapplication2687386.ui.theme.MyApplication2687386Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication2687386Theme {
                Conversation(
                    SampleData.conversationSample
                )
            }
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {

    Row(
        modifier = Modifier
            .padding(all = 8.dp)
            .padding(start = 16.dp)
    ) {
        // Punto verde para simular conexión
        Spacer(
            modifier = Modifier
                .size(8.dp)
                .clip(CircleShape)
                .background(Color(0xFF00B908))
        )
        Image(
            painter = painterResource(R.drawable.images_gg),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colorScheme.secondaryContainer, CircleShape)
        )

        Spacer(modifier = Modifier.width(10.dp))
        var isExpanded by remember { mutableStateOf(false) }
        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
            Text(
                text = msg.author,
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(2.dp))


            Surface(
                shape = MaterialTheme.shapes.medium, shadowElevation = 3.dp,
                color = MaterialTheme.colorScheme.secondaryContainer,
                border = BorderStroke(2.dp, MaterialTheme.colorScheme.secondary)
            ) {

                Text(
                    text = msg.body,
                    modifier = Modifier.padding(all = 4.dp),
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.scrim
                )

            }
        }
    }
}

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {
    MyApplication2687386Theme {
        Surface {
            MessageCard(
                msg = Message("Camilo", "En linea")
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewConversation() {
    MyApplication2687386Theme {
        Conversation(SampleData.conversationSample)
    }
}



