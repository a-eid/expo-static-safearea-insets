package expo.modules.expostaticsafeareainsets


import android.os.Build
import com.facebook.react.uimanager.PixelUtil
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition


class ExpoStaticSafeareaInsetsModule : Module() {

    override fun definition() = ModuleDefinition {
        name("ExpoStaticSafeareaIinsets")

        constants {
            getInsets()
        }
    }

    private fun getInsets(): Map<String, Number> {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val window = appContext.activityProvider?.currentActivity?.window
            val rootWindowInsets = window?.decorView?.rootWindowInsets

            val top    =  rootWindowInsets?.systemWindowInsetTop ?: 0.0
            val bottom =  rootWindowInsets?.systemWindowInsetBottom ?: 0.0
            val left   =  rootWindowInsets?.systemWindowInsetLeft ?: 0.0
            val right  =  rootWindowInsets?.systemWindowInsetRight ?: 0.0

            return mapOf(
                "top"    to PixelUtil.toDIPFromPixel(top.toFloat()),
                "bottom" to PixelUtil.toDIPFromPixel(bottom.toFloat()),
                "left"   to PixelUtil.toDIPFromPixel(left.toFloat()),
                "right"  to PixelUtil.toDIPFromPixel(right.toFloat()),
            )
        }

        return mapOf(
            "top"    to 0.0f,
            "bottom" to 0.0f,
            "left"   to 0.0f,
            "right"  to 0.0f,
        )
    }
}

