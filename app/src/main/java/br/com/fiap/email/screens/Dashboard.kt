import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.email.R

@Composable
fun Dashboard(navController: NavController) {

    var search by remember() {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
        ){
            Image(
                painter = painterResource(id = R.drawable.icon),
                contentDescription = "icon",
                modifier = Modifier
                    .size(30.dp)
                    .padding(horizontal = 30.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp, 28.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ){
                Text(
                    text = "Seja bem vindo!",
                    fontWeight = FontWeight.Bold
                )

                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "icon",
                    modifier = Modifier.size(40.dp)
                )
            }

            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp, 28.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_search_24),
                        contentDescription = "Search Icon"
                    )
                },
                label = {
                    Text(text = "Pesquisar")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                textStyle = TextStyle(color = Color.Black)
            )
            Spacer(modifier = Modifier.height(15.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(colorResource(id = R.color.gray_project))
                    .fillMaxWidth()
                    .padding(30.dp, 15.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_perfil),
                    contentDescription = "icon",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (
                    modifier = Modifier.clickable {
                        navController.navigate("leituraEmail")
                    }
                ){
                    Text(
                        text = "João Pedro",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Documentação",
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                    Text(
                        text = "Lorem Ipsum is simply dummy text of the printing...",
                        fontSize = 10.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(colorResource(id = R.color.gray_project))
                    .fillMaxWidth()
                    .padding(30.dp, 15.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_perfil),
                    contentDescription = "icon",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (
                    modifier = Modifier.clickable {
                        navController.navigate("leituraEmail")
                    }
                ){
                    Text(
                        text = "Alisson",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Reunião",
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                    Text(
                        text = "Lorem Ipsum is simply dummy text of the printing...",
                        fontSize = 10.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(colorResource(id = R.color.gray_project))
                    .fillMaxWidth()
                    .padding(30.dp, 15.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_perfil),
                    contentDescription = "icon",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (
                    modifier = Modifier.clickable {
                        navController.navigate("leituraEmail")
                    }
                ){
                    Text(
                        text = "Henrique",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Trabalho",
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                    Text(
                        text = "Lorem Ipsum is simply dummy text of the printing...",
                        fontSize = 10.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(colorResource(id = R.color.gray_project))
                    .fillMaxWidth()
                    .padding(30.dp, 15.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_perfil),
                    contentDescription = "icon",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (
                    modifier = Modifier.clickable {
                        navController.navigate("leituraEmail")
                    }
                ){
                    Text(
                        text = "Lucas",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Relatório",
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                    Text(
                        text = "Lorem Ipsum is simply dummy text of the printing...",
                        fontSize = 10.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(colorResource(id = R.color.gray_project))
                    .fillMaxWidth()
                    .padding(30.dp, 15.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_perfil),
                    contentDescription = "icon",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (
                    modifier = Modifier.clickable {
                        navController.navigate("leituraEmail")
                    }
                ){
                    Text(
                        text = "Bruno",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Documentação",
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                    Text(
                        text = "Lorem Ipsum is simply dummy text of the printing...",
                        fontSize = 10.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(colorResource(id = R.color.gray_project))
                    .fillMaxWidth()
                    .padding(30.dp, 15.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_perfil),
                    contentDescription = "icon",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (
                    modifier = Modifier.clickable {
                        navController.navigate("leituraEmail")
                    }
                ){
                    Text(
                        text = "Carolina",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Dúvida",
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                    Text(
                        text = "Lorem Ipsum is simply dummy text of the printing...",
                        fontSize = 10.sp,
                        color = colorResource(id = R.color.black_text)
                    )
                }
            }

            Column(
                modifier = Modifier
                    .height(70.dp)
                    .background(colorResource(id = R.color.white_project))
                    .fillMaxWidth()
                    .padding(50.dp, 10.dp)
            ) {
                Row (
                    horizontalArrangement = Arrangement.Center
                ){
                    Column (
                        modifier = Modifier.clickable {
                            navController.navigate("dashboard")
                        },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.baseline_inbox_24),
                            contentDescription = "Responder Icon"
                        )
                        Text(
                            text = "Inbox",
                            fontSize = 12.sp
                        )
                    }

                    Spacer(modifier = Modifier.width(80.dp))

                    Column (
                        modifier = Modifier.clickable {
                            navController.navigate("dashboard")
                        },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.baseline_add_24),
                            contentDescription = "Responder Icon"
                        )
                        Text(
                            text = "Mensagem",
                            color = colorResource(id = R.color.blue_project),
                            fontSize = 12.sp
                        )
                    }

                    Spacer(modifier = Modifier.width(70.dp))

                    Column (
                        modifier = Modifier.clickable {
                            navController.navigate("calendario")
                        },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.baseline_calendar_today_black_24),
                            contentDescription = "Responder Icon"
                        )
                        Text(
                            text = "Agenda",
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }


    }
}