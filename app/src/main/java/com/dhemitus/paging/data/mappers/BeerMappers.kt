package com.dhemitus.paging.data.mappers

import com.dhemitus.paging.data.local.BeerEntity
import com.dhemitus.paging.data.remote.BeerDto
import com.dhemitus.paging.domain.Beer


fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}