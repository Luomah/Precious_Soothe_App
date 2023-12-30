package com.wtf.precioussootheapp.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wtf.precioussootheapp.R
import com.wtf.precioussootheapp.ui.theme.PreciousSootheAppTheme

@Composable
fun AlignBody(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(text),
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
fun AlignBodyRow(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier
){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        //contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ){
        items(alignBodyData) {
                item ->
            AlignBody(item.drawable, item.text)
        }
    }
}

@Composable
fun AlignBodySection(@StringRes title: Int,
                     modifier: Modifier = Modifier,
                     content: @Composable () -> Unit){
    Column(modifier) {
        Text(text = stringResource(title),
        style = MaterialTheme.typography.titleMedium)
        content()
    }
}



