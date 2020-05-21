package example

import platform.UIKit.UIDevice

internal actual object DeviceDataRepository {

    actual val deviceName: String
        get() = UIDevice().model
}