/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version current -pout/soong/.intermediates/system/hardware/interfaces/media/android.media.audio.common.types_interface/3/preprocessed.aidl -pout/soong/.intermediates/frameworks/native/libs/permission/framework-permission-aidl_interface/preprocessed.aidl --ninja -d out/soong/.intermediates/frameworks/av/media/libaudioclient/audioclient-types-aidl-java-source/gen/android/media/DeviceConnectedState.java.d -o out/soong/.intermediates/frameworks/av/media/libaudioclient/audioclient-types-aidl-java-source/gen -Nframeworks/av/media/libaudioclient/aidl frameworks/av/media/libaudioclient/aidl/android/media/DeviceConnectedState.aidl
 */
package android.media;
/** {@hide} */
public @interface DeviceConnectedState {
  public static final int CONNECTED = 0;
  public static final int DISCONNECTED = 1;
  public static final int PREPARE_TO_DISCONNECT = 2;
}
