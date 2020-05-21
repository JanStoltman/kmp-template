package example

import android.os.Build

internal actual object DeviceDataRepository {

    actual val deviceName: String
        get() = Build.DEVICE
}