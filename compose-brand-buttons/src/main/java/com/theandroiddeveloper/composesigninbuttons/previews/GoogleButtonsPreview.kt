package com.theandroiddeveloper.composesigninbuttons.previews

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.theandroiddeveloper.composesigninbuttons.Brand
import com.theandroiddeveloper.composesigninbuttons.BrandedButton


@PhoneDarkAndNightPreview
@Composable
internal fun DarkGoogleButtonPreview() {
    PreviewColumn {
        BrandedButton(
            brand = Brand.Google.DarkGoogleButton,
            label = "Sign in with Google",
            onClick = { /*TODO*/ }
        )
        Spacer(modifier = Modifier.size(16.dp))
        BrandedButton(
            brand = Brand.Google.LightGoogleButton,
            label = "Sign in with Google",
            onClick = { /*TODO*/ }
        )
    }
}

