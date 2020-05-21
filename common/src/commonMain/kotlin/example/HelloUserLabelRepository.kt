package example

class HelloUserLabelRepository {

    fun obtainHelloUserLabel() = "Hello User from device: ${DeviceDataRepository.deviceName}"
}

internal expect object DeviceDataRepository {

    val deviceName: String
}