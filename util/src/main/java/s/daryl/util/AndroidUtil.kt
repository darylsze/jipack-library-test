package s.daryl.util

import android.util.Log

/**
 * Created by windsze on 21/2/2018.
 */

object AndroidUtil {
    fun log(msg: String) {
        Log.d(msg::class.simpleName, msg)
    }
}