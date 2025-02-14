package com.edu.expmdmfebrero.core.state

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import com.edu.expmdmfebrero.R

class StateView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val loadingView: View
    private val contentView: View
    private val errorView: View

    init {
        LayoutInflater.from(context).inflate(R.layout.view_state, this, true)
        loadingView = findViewById(R.id.loading_view)
        contentView = findViewById(R.id.content_view)
        errorView = findViewById(R.id.error_view)
    }

    fun setState(state: ViewState) {
        when (state) {
            ViewState.LOADING -> {
                loadingView.visibility = View.VISIBLE
                contentView.visibility = View.GONE
                errorView.visibility = View.GONE
            }
            ViewState.DATA -> {
                loadingView.visibility = View.GONE
                contentView.visibility = View.VISIBLE
                errorView.visibility = View.GONE
            }
            ViewState.ERROR -> {
                loadingView.visibility = View.GONE
                contentView.visibility = View.GONE
                errorView.visibility = View.VISIBLE
            }
        }
    }
}
