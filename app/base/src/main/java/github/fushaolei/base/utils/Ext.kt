package github.fushaolei.base.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.recyclerview.widget.RecyclerView

typealias ClickHandler<T> = (T) -> Unit

typealias SimpleClickHandler = () -> Unit

fun String.fuck():String {
    return "fuck $this => "
}
