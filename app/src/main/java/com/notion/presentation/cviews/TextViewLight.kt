package com.notion.presentation.cviews

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import com.notion.di.qualifier.LightTypeface
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TextViewLight:androidx.appcompat.widget.AppCompatTextView {
    @Inject
    @LightTypeface
    lateinit var typeFace : Typeface

    constructor(context: Context):super(context){
        setTextViewTypeface()
    }

    constructor(context: Context, attrs: AttributeSet):super(context,attrs){
        setTextViewTypeface()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr:Int):super(context,attrs, defStyleAttr){
        setTextViewTypeface()
    }

    private fun setTextViewTypeface() {
        typeface = this.typeFace
    }

}