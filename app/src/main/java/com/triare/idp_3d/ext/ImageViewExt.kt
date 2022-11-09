package com.triare.idp_3d.ext

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.Transformation
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target

fun ImageView.load(
    url: String?,
    @DrawableRes placeholder: Int? = null,
    @DrawableRes error: Int? = null,
    requestOptions: RequestOptions = RequestOptions.centerCropTransform(),
    transformation: Transformation<Bitmap>? = null,
    successLoading: ((Drawable?) -> Unit)? = null,
    errorLoading: (() -> Unit)? = null
) {
    loadUrl(
        url,
        placeholder,
        error,
        requestOptions,
        transformation,
        successLoading,
        errorLoading
    )
}

private fun ImageView.loadUrl(
    url: String?,
    @DrawableRes placeholder: Int?,
    @DrawableRes error: Int?,
    requestOptions: RequestOptions,
    transformation: Transformation<Bitmap>? = null,
    successLoading: ((Drawable?) -> Unit)? = null,
    errorLoading: (() -> Unit)? = null
) {
    val glideUrl = GlideUrl(url)

    var builder = Glide.with(context)
        .load(glideUrl ?: url)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                errorLoading?.invoke()
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                successLoading?.invoke(resource)
                return false
            }
        })
        .placeholder(placeholder ?: 0)
        .error(error ?: 0)
        .apply(requestOptions)


    transformation?.let { builder = builder.transform(it) }
    builder.into(this)
}