package expo.modules.pip

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition
import android.os.Build
import android.util.Rational
import android.app.PictureInPictureParams

class ExpoPipModule() : Module() {
    // Each module class must implement the definition function. The definition consists of components
    // that describe the module's functionality and behavior.
    // See https://docs.expo.dev/modules/module-api for more details about available components.
    override fun definition() = ModuleDefinition {
        // Sets the name of the module that JavaScript code will use to refer to the module. Takes a string as an argument.
        // Can be inferred from the module's class name, but it's recommended to set it explicitly for clarity.
        // The module will be accessible from `requireNativeModule('ExpoPip')` in JavaScript.
        Name("ExpoPip")

        // Defines a JavaScript synchronous function that runs the native code on the JavaScript thread.
        Function("enterPipMode") {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val params = PictureInPictureParams.Builder()
                    .setAspectRatio(Rational(3, 4))
                    .build()
                appContext.reactContext?.currentActivity?.enterPictureInPictureMode(params)
            }
        }
    }
}
