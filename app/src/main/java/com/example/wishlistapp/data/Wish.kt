package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Data class representing a Wish item.
 */
@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true) val id: Long = 0L, // Unique identifier for the wish, auto-generated by Room
    @ColumnInfo(name = "wish-title") val title: String = "", // Title of the wish
    @ColumnInfo(name = "wish-description") val description: String = "" // Description of the wish
)