package com.simplemobiletools.smsmessenger.extensions

fun String.getExtensionFromMimeType(): String {
    return when (this) {
        "image/png" -> ".png"
        "image/apng" -> ".apng"
        "image/webp" -> ".webp"
        "image/svg+xml" -> ".svg"
        "image/gif" -> ".gif"
        else -> ".jpg"
    }
}

fun String.isImageMimeType(): Boolean {
    return startsWith("image")
}
