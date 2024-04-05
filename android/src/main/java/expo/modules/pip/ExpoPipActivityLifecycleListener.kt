package expo.modules.pip

import android.app.Activity
import android.os.Bundle
import expo.modules.core.interfaces.ReactActivityLifecycleListener
import androidx.core.os.bundleOf

class ExpoPipActivityLifecycleListener : ReactActivityLifecycleListener {
  // override fun onCreate(activity: Activity, savedInstanceState: Bundle?) {
  //   // Your setup code in `Activity.onCreate`.
  //   doSomeSetupInActivityOnCreate(activity)
  // }

    override fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean, newConfig: Configuration) {
        ExpoPipModule.sendEvent("onPictureInPictureModeChange", bundleOf("isInPictureInPictureMode" to isInPictureInPictureMode))
    }
}
