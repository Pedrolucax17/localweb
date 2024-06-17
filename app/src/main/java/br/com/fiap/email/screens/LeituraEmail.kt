package br.com.fiap.email.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.email.R

@Composable
fun LeituraEmail(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, 28.dp)
        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Image(
                    painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                    contentDescription = "icon arrow back",
                    modifier = Modifier.size(30.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.baseline_delete_24),
                    contentDescription = "delete icon",
                    modifier = Modifier.size(30.dp)
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, 20.dp)
        ) {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "Perfil",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Column {
                    Text(
                        text = "Name",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "13:56",
                        fontSize = 10.sp,
                        color = Color.Black
                    )
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, 15.dp)
        ){
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = "Titulo",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Row(){
                    Image(
                        painter = painterResource(id = R.drawable.baseline_calendar_month_24),
                        contentDescription = "Calendar Icon",
                        modifier = Modifier.clickable {
                            navController.navigate("calendario")
                        }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Image(
                        painter = painterResource(id = R.drawable.baseline_keyboard_return_24),
                        contentDescription = "Responder Icon"
                    )
                }
            }
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, 15.dp)
        ){
            Text(
                text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                        " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                        " when an unknown printer took a galley of type and scrambled it to make a type" +
                        " specimen book. It has survived not only five centuries, but also the leap into electronic typesetting," +
                        " remaining essentially unchanged. It was popularised in the 1960s with the release of" +
                        " Letraset sheets containing Lorem Ipsum passages, and more recently with desktop " +
                        "publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                color = Color.Black
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, 15.dp)
        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Button(
                    shape = RoundedCornerShape(5
                        .dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00ACC8))
                ) {
                    Text(
                        text = "Responder com IA",
                        color = Color.White
                    )

                }
            }
        }
    }
}

