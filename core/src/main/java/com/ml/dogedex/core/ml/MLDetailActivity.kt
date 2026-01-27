package com.ml.dogedex.core.ml

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import coil.request.CachePolicy
import com.ml.dogedex.core.composables.BackNavigationIcon
import com.ml.dogedex.core.dogdetail.ui.theme.DogedexTheme

class MLDetailActivity : ComponentActivity() {

    companion object {
        const val PHOTO_URI_KEY = "photo_uri"
        const val ML_KIT_INFO_KEY = "ml_kit_info"
    }

    @OptIn(ExperimentalCoilApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val photoUri = intent.getParcelableExtra<Uri>(PHOTO_URI_KEY)
        val mlKitInfo = intent.getStringExtra(ML_KIT_INFO_KEY)

        setContent {
            DogedexTheme {
                Scaffold(topBar = { ScreenTopBar(::onNavigationIconClick) }) { padding ->
                    Column {
                        Image(
                            painter = rememberImagePainter(
                                builder = {
                                    crossfade(true)
                                    diskCachePolicy(CachePolicy.DISABLED)
                                    memoryCachePolicy(CachePolicy.DISABLED)
                                },
                                data = photoUri
                            ),
                            contentDescription = null,
                            modifier = Modifier.Companion
                                .fillMaxSize()
                                .weight(1f)
                                .padding(16.dp)
                        )
                        SelectionContainer(
                            modifier = Modifier.Companion
                                .padding(16.dp)
                                .weight(1f)
                        ) {
                            Text(text = mlKitInfo ?: "")
                        }
                    }
                }

            }
        }
    }

    private fun onNavigationIconClick() {
        finish()
    }

    @Composable
    fun ScreenTopBar(
        onClick: () -> Unit
    ) {
        TopAppBar(
            title = { Text("ML Detail") },
            backgroundColor = Color.Companion.White,
            contentColor = Color.Companion.Black,
            navigationIcon = { BackNavigationIcon(onClick) }
        )
    }
}