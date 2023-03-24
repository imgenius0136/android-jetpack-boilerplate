package com.bohemian.android_jetpack_boilerplate.compose.home

import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.bohemian.android_jetpack_boilerplate.enums.HomeBottomTabEnum


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onPageChange: (HomeBottomTabEnum) -> Unit = {},
    onAttached: (Toolbar) -> Unit = {},
) {
    val activity = (LocalContext.current as AppCompatActivity)
}
