package com.ml.dogedex.core.dogdetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.ml.dogedex.core.R
import com.ml.dogedex.core.dogdetail.ui.theme.DogedexTheme
import com.ml.dogedex.core.model.Dog

@ExperimentalCoilApi
@Composable
fun MostProbableDogsDialog(
    mostProbableDogs: MutableList<Dog>,
    onShowMostProbableDogsDialogDismiss: () -> Unit,
    onItemClicked: (Dog) -> Unit
) {
    AlertDialog(
        onDismissRequest = {
            onShowMostProbableDogsDialogDismiss()
        },
        title = {
            Text(
                text = stringResource(id = R.string.other_probable_dogs),
                color = colorResource(id = R.color.text_black),
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
        },
        text = {
            MostProbableDogsList(mostProbableDogs) {
                onItemClicked(it)
                onShowMostProbableDogsDialogDismiss()
            }
        },
        buttons = {
            Row(
                modifier = Modifier.padding(all = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { onShowMostProbableDogsDialogDismiss() }
                ) {
                    Text(stringResource(id = R.string.dismiss))
                }
            }
        }
    )
}

@ExperimentalCoilApi
@Composable
fun MostProbableDogsList(dogs: MutableList<Dog>, onItemClicked: (Dog) -> Unit) {
    Box(
        Modifier.height(250.dp)
    ) {
        LazyColumn(
            content = {
                items(dogs) { dog ->
                    MostProbableDogItem(dog = dog, onItemClicked = onItemClicked)
                }
            }
        )
    }
}

@ExperimentalCoilApi
@Composable
fun MostProbableDogItem(dog: Dog, onItemClicked: (Dog) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable(
                enabled = true,
                onClick = { onItemClicked(dog) }
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .width(40.dp)
                .height(40.dp),
            painter = rememberImagePainter(dog.imageUrl),
            contentDescription = dog.name,
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            dog.name,
            modifier = Modifier.padding(8.dp),
            color = colorResource(id = R.color.text_black),
            textAlign = TextAlign.Start
        )
    }
}

@ExperimentalCoilApi
@Composable
@Preview(showBackground = true)
fun MostProbableDogsDialogPreview() {
    DogedexTheme {
        Surface {
            MostProbableDogsDialog(getFakeDogs(), {}) {}
        }
    }
}

fun getFakeDogs(): MutableList<Dog> {
    val dogList = mutableListOf<Dog>()
    dogList.add(
        Dog(
            1, 1, "Chihuahua", "Chihuahua", "Toy",
            "19", "Brave", "12 - 15",
            "2.0", "2.5", "12.0", false
        )
    )
    dogList.add(
        Dog(
            2, 2, "Pug", "Pug", "Toy",
            "12", "Friendly", "www.pug.com",
            "10 - 12", "4.5", "12.0", true
        )
    )
    dogList.add(
        Dog(
            3, 3, "Husky", "Husky", "Sporting",
            "15", "www.husky.com", "8 - 12 ",
            "5.0", "4.5", "12.0", false
        )
    )
    return dogList
}