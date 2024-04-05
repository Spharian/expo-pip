package expo.modules.pip

import android.content.Context

import expo.modules.core.interfaces.InternalModule
import expo.modules.core.interfaces.Package
import androidx.appcompat.app.AppCompatActivity
import android.content.res.Configuration
import androidx.core.os.bundleOf

class ExpoPipPackage : Package {
   inner class ExpoPipAppCompatActivity : AppCompatActivity() {
        override fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean, newConfig: Configuration) {
            ExpoPipModule().sendEvent("onPictureInPictureModeChange", bundleOf("isInPictureInPictureMode" to isInPictureInPictureMode))
        }
    }
}
