/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java --structured --version 3 --hash c45c122528c07c449ea08f6eacaace17bb7abc38 --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/3/preprocessed.aidl --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V3-java-source/gen/android/hardware/radio/network/EmergencyMode.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V3-java-source/gen -Nhardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/3 hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/3/android/hardware/radio/network/EmergencyMode.aidl
 */
package android.hardware.radio.network;
/** @hide */
public @interface EmergencyMode {
  public static final int EMERGENCY_WWAN = 1;
  public static final int EMERGENCY_WLAN = 2;
  public static final int EMERGENCY_CALLBACK = 3;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == EMERGENCY_WWAN) return "EMERGENCY_WWAN";
      if (_aidl_v == EMERGENCY_WLAN) return "EMERGENCY_WLAN";
      if (_aidl_v == EMERGENCY_CALLBACK) return "EMERGENCY_CALLBACK";
      return Integer.toString(_aidl_v);
    }
    static String arrayToString(Object _aidl_v) {
      if (_aidl_v == null) return "null";
      Class<?> _aidl_cls = _aidl_v.getClass();
      if (!_aidl_cls.isArray()) throw new IllegalArgumentException("not an array: " + _aidl_v);
      Class<?> comp = _aidl_cls.getComponentType();
      java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "[", "]");
      if (comp.isArray()) {
        for (int _aidl_i = 0; _aidl_i < java.lang.reflect.Array.getLength(_aidl_v); _aidl_i++) {
          _aidl_sj.add(arrayToString(java.lang.reflect.Array.get(_aidl_v, _aidl_i)));
        }
      } else {
        if (_aidl_cls != int[].class) throw new IllegalArgumentException("wrong type: " + _aidl_cls);
        for (int e : (int[]) _aidl_v) {
          _aidl_sj.add(toString(e));
        }
      }
      return _aidl_sj.toString();
    }
  }
}