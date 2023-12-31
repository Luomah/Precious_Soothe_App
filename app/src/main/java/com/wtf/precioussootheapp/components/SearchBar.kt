package com.wtf.precioussootheapp.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.wtf.precioussootheapp.R
import com.wtf.precioussootheapp.ui.theme.Pink80
import com.wtf.precioussootheapp.ui.theme.Purple80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(modifier: Modifier = Modifier){
    TextField(value = "",
        onValueChange ={},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            unfocusedIndicatorColor = MaterialTheme.colorScheme.surface,
            focusedIndicatorColor =  Pink80,
            focusedLeadingIconColor = Purple80
        ),
        placeholder = {
            Text(text = stringResource(R.string.placeholder_search))
        },
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
        )
}