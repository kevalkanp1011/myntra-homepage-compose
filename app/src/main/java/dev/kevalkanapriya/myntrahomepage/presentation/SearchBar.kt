package dev.kevalkanapriya.myntrahomepage.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.kevalkanapriya.myntrahomepage.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SearchBar() {

    var searchText by remember {
        mutableStateOf("")
    }





    val interactionSource = remember { MutableInteractionSource() }
    val singleLine = true
    val enabled = true

    Box(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
        contentAlignment = Alignment.Center
    ) {

        BasicTextField(
            value = searchText,
            onValueChange = { searchText = it },
            modifier = Modifier

                .fillMaxWidth()
                .height(35.dp)
            ,
            singleLine = singleLine,
            interactionSource = interactionSource
        ) { innerTextField ->

            TextFieldDefaults.OutlinedTextFieldDecorationBox(
                value = searchText,
                innerTextField = innerTextField,
                enabled = enabled,
                singleLine = singleLine,
                visualTransformation = VisualTransformation.None,
                interactionSource = interactionSource,
                placeholder = {
                    Text(
                        text = "Search for brands and products",
                        color = Color.Black,
                        fontSize = 12.sp
                    )
                },
                leadingIcon = {
                    Icon(
                        modifier = Modifier
                            .size(15.dp)
                            .clickable { /* doSomething */ },
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = null
                    )
                },
                trailingIcon = {
                    Icon(
                        modifier = Modifier
                            .size(15.dp)
                            .clickable { /* doSomething */ },
                        painter = painterResource(id = R.drawable.camera),
                        contentDescription = null
                    )
                },
                contentPadding = TextFieldDefaults.outlinedTextFieldPadding(
                    top = 0.dp,
                    bottom = 0.dp,
                    start = 0.dp,
                    end = 0.dp
                ),
                container = {

                    TextFieldDefaults.OutlinedBorderContainerBox(
                        enabled,
                        false,
                        interactionSource,
                        TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color.Black,
                            unfocusedBorderColor = Color.Gray,
                            placeholderColor = Color.Black
                        ),
                        CircleShape
                    )
                },
            )
        }


    }


}

