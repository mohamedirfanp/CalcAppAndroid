package com.example.calcapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.calcapp.ui.theme.CalcAppTheme
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalcAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp)

                    ) {

                        var mobile by remember {
                            mutableStateOf(value = "")
                        }

                        var password by remember {
                            mutableStateOf(value = "")
                        }

                        var name by remember {
                            mutableStateOf(value = "")
                        }

                        var surname by remember {
                            mutableStateOf(value = "")
                        }

//                        Image(
//                            painter = painterResource(id = R.drawable.demotest),
//                            contentDescription = "Dummy Image",
//                            modifier = Modifier.fillMaxWidth()
//                        )

                        Text(
                            fontSize = 32.sp,
                            text = "Sign Up",
                            textAlign = TextAlign.Start,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight(700)

                        )

                        Text(
                            text = "It's quick and easy",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Start
                        )

                        Divider()

                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,

                            ) {
                            TextField(
                                value = name,
                                onValueChange = { name = it },
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(end = 8.dp),

                                placeholder = { Text("Enter firstname") }
                            )
                            TextField(
                                value = surname,
                                onValueChange = { surname = it },
                                modifier = Modifier
                                    .weight(1f),
                                placeholder = { Text("Enter surname") }
                            )
                        }


                        TextField(
                            value = mobile,
                            onValueChange = { mobile = it },
                            modifier = Modifier
                                .fillMaxWidth(),
                            placeholder = { Text("Mobile number or email address") })

                        TextField(
                            value = password,
                            onValueChange = { password = it },
                            modifier = Modifier
                                .fillMaxWidth(),
                            placeholder = { Text("New Password") })

                        Text(
                            text = "By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy. You may receive SMS notifications from us and can opt out at any time.",
                            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp),
                            fontWeight = FontWeight(200),
                            fontSize = 14.sp,
                            lineHeight = 14.sp
                        )

                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(Color(0xFF358856)),
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .size(width = 200.dp, height = 50.dp)
                                .padding(top = 10.dp)
                        ) {
                            Text(text = "Sign up")
                        }


//
//                        Text(
//                            text = "Password",
//                            modifier = Modifier.fillMaxWidth(),
//                            textAlign = TextAlign.Start
//                        )
//                        TextField(
//                            value = b,
//                            onValueChange = { b = it },
//                            modifier = Modifier.fillMaxWidth(),
//                            placeholder = { Text("Enter Password") })

//                        Row(
//                            horizontalArrangement = Arrangement.SpaceEvenly,
//                            modifier = Modifier.fillMaxWidth()
//                        ) {
//                            Button(
//                                onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
//                                    Color.Blue
//                                )
//                            ) {
//                                Text(text = "Sign Up", color = Color.Magenta)
//                            }
//                            Button(onClick = { /*TODO*/ }) {
//                                Text(text = "Sign In")
//                            }
//                        }
                    }

                }
            }
        }
    }
}


