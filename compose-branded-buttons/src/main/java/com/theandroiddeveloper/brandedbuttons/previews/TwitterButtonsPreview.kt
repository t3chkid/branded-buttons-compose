package com.theandroiddeveloper.brandedbuttons.previews

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.theandroiddeveloper.brandedbuttons.Brand
import com.theandroiddeveloper.brandedbuttons.BrandedButton

@PhoneDarkAndNightPreview
@Composable
internal fun TwitterButtonsPreview() {
    PreviewColumn {
        BrandedButton(
            brand = Brand.Twitter.DarkTwitterButton,
            label = "Sign in with Twitter",
            onClick = { /*TODO*/ }
        )
        Spacer(modifier = Modifier.size(16.dp))
        BrandedButton(
            brand = Brand.Twitter.LightTwitterButton,
            label = "Sign in with Twitter",
            onClick = { /*TODO*/ }
        )
    }
}