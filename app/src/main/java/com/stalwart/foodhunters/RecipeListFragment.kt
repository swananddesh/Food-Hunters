package com.stalwart.foodhunters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.Fragment

/**
Created by Swanand Deshpande
 */
class RecipeListFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
        view.findViewById<ComposeView>(R.id.compose_view).apply {
            setContent {
                Column(modifier = Modifier
                    .border(border = BorderStroke(1.dp, Color.Gray))
                    .padding(16.dp)
                ) {
                    Text(text = "THIS IS A COMPOSABLE INSIDE A FRAGMENT")
                    Spacer(modifier = Modifier.padding(10.dp))
                    CircularProgressIndicator() // Jetpack Compose Progress Indicator
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "NEAT")
                    Spacer(modifier = Modifier.padding(10.dp))

                    // Below work-around is used to use custom views with Jetpack Compose
                    // e.g. Google Map Views, Any third party custom views etc.
                    // For this, we need to add <ComposeView> in a fragment's or activity's xml file.
                    val customView = HorizontalDottedProgress(requireContext())
                    AndroidView(factory = {customView})

                }
            }
        }
        return view
    }
}