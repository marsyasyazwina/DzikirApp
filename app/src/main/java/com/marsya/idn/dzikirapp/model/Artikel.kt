package com.marsya.idn.dzikirapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artikel(
    val imageArtikel: Int,
    val tittleArtikel: String,
    val descArtikel: String
):Parcelable
