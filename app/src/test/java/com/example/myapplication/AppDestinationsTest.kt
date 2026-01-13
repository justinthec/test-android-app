package com.example.myapplication

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import org.junit.Assert.assertEquals
import org.junit.Test

class AppDestinationsTest {
    @Test
    fun appDestinations_hasCorrectValues() {
        // Verify the number of destinations
        assertEquals(3, AppDestinations.entries.size)

        // Verify the HOME destination
        assertEquals("Home", AppDestinations.HOME.label)
        assertEquals(Icons.Default.Home, AppDestinations.HOME.icon)

        // Verify the FAVORITES destination
        assertEquals("Favorites", AppDestinations.FAVORITES.label)
        assertEquals(Icons.Default.Favorite, AppDestinations.FAVORITES.icon)

        // Verify the PROFILE destination
        assertEquals("Profile", AppDestinations.PROFILE.label)
        assertEquals(Icons.Default.AccountBox, AppDestinations.PROFILE.icon)
    }
}