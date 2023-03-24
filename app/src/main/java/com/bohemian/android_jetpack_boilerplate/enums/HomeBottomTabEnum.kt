package com.bohemian.android_jetpack_boilerplate.enums

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.bohemian.android_jetpack_boilerplate.R

enum class HomeBottomTabEnum(
    @StringRes val titleResId: Int,
    @DrawableRes val drawableResId: Int
) {
    TAB_1(R.string.tab_1, R.drawable.baseline_home_512),
    TAB_2(R.string.tab_2, R.drawable.baseline_search_512),
    TAB_3(R.string.tab_3, R.drawable.baseline_add_512),
    TAB_4(R.string.tab_4, R.drawable.baseline_message_512),
    TAB_5(R.string.tab_5, R.drawable.baseline_person_512),
}
