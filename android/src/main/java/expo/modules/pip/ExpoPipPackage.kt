package expo.modules.pip

import android.content.Context

import expo.modules.core.interfaces.InternalModule
import expo.modules.core.interfaces.Package

class ExpoPipPackage : Package {
  override fun createReactActivityLifecycleListeners(activityContext: Context): List<ReactActivityLifecycleListener> {
    return listOf(ExpoPipActivityLifecycleListener())
  }
}
