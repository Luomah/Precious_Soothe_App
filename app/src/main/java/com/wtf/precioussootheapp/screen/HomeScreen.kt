package com.wtf.precioussootheapp.screen

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wtf.precioussootheapp.R
import com.wtf.precioussootheapp.components.AlignBodyRow
import com.wtf.precioussootheapp.components.AlignBodySection
import com.wtf.precioussootheapp.components.FavoriteCollectionGrid
import com.wtf.precioussootheapp.components.SearchBar
import com.wtf.precioussootheapp.components.FavoriteSection
import com.wtf.precioussootheapp.ui.theme.PreciousSootheAppTheme

@Composable
fun HomeScreen(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier) {
        Text(
            text = stringResource(title),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier
                .paddingFromBaseline(top = 40.dp, bottom = 16.dp)
                .padding(horizontal = 16.dp)
        )
        content()
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .padding(16.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.height(16.dp))
        SearchBar(Modifier)
        Spacer(Modifier.height(20.dp))
        AlignBodySection(title = R.string.align_your_body) {
            AlignBodyRow(modifier)
        }
        Spacer(Modifier.height(20.dp))
        FavoriteSection(title = R.string.favorite_collections) {
            FavoriteCollectionGrid()
        }
        Spacer(Modifier.height(20.dp))
    }
}


