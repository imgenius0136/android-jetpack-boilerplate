package com.bohemian.android_jetpack_boilerplate.compose.home

import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidViewBinding
import com.bohemian.android_jetpack_boilerplate.enum.HomeBottomTabEnum


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onPageChange: (HomeBottomTabEnum) -> Unit = {},
    onAttached: (Toolbar) -> Unit = {},
) {
    val activity = (LocalContext.current as AppCompatActivity)
}
