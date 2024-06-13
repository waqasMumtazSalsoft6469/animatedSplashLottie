// package com.animatedsplashlottie

// import com.facebook.react.ReactActivity
// import com.facebook.react.ReactActivityDelegate
// import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.fabricEnabled
// import com.facebook.react.defaults.DefaultReactActivityDelegate
// import org.devio.rn.splashscreen.SplashScreen

// class MainActivity : ReactActivity() {

//   /**
//    * Returns the name of the main component registered from JavaScript. This is used to schedule
//    * rendering of the component.
//    */
//   override fun getMainComponentName(): String = "animatedSplashLottie"

//   /**
//    * Returns the instance of the [ReactActivityDelegate]. We use [DefaultReactActivityDelegate]
//    * which allows you to enable New Architecture with a single boolean flags [fabricEnabled]
//    */
//   override fun createReactActivityDelegate(): ReactActivityDelegate =
//       DefaultReactActivityDelegate(this, mainComponentName, fabricEnabled)
// }
package com.animatedsplashlottie

import android.os.Bundle
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.fabricEnabled
import com.facebook.react.defaults.DefaultReactActivityDelegate
import org.devio.rn.splashscreen.SplashScreen

class MainActivity : ReactActivity() {

    /**
     * Returns the name of the main component registered from JavaScript. This is used to schedule
     * rendering of the component.
     */
    override fun getMainComponentName(): String = "animatedSplashLottie"

    /**
     * Called when the activity is starting. This is where most initialization should go.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        SplashScreen.show(this, R.id.lottie) // Show the splash screen
        // SplashScreen.setAnimationFinished(true) // Set animation finished
        super.onCreate(savedInstanceState)
        // ...other code
    }

    /**
     * Returns the instance of the [ReactActivityDelegate]. We use [DefaultReactActivityDelegate]
     * which allows you to enable New Architecture with a single boolean flag [fabricEnabled]
     */
    override fun createReactActivityDelegate(): ReactActivityDelegate =
        DefaultReactActivityDelegate(this, mainComponentName, fabricEnabled)
}
