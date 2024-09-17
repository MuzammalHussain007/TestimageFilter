package com.inventory.testimagefilter

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.inventory.testimagefilter.databinding.ActivityMainBinding
import jp.wasabeef.glide.transformations.BlurTransformation
import jp.wasabeef.glide.transformations.gpu.BrightnessFilterTransformation
import jp.wasabeef.glide.transformations.gpu.SepiaFilterTransformation
import jp.wasabeef.glide.transformations.gpu.SketchFilterTransformation
import jp.wasabeef.glide.transformations.gpu.SwirlFilterTransformation
import jp.wasabeef.glide.transformations.gpu.ToonFilterTransformation

class MainActivity : AppCompatActivity() {
    //Github Link
    //https://github.com/wasabeef/glide-transformations
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(this).load(R.drawable.images)
              .apply(RequestOptions.bitmapTransform(ToonFilterTransformation( )))

            .into(binding.image)





    }
}