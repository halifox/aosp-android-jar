/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java --structured --version 3 --hash 0c86a38729dd5d560fe3a0eca6aa9d8cf83efb00 --stability vintf --min_sdk_version 29 --ninja -d out/soong/.intermediates/system/hardware/interfaces/media/android.media.audio.common.types-V3-java-source/gen/android/media/audio/common/AudioHalProductStrategy.java.d -o out/soong/.intermediates/system/hardware/interfaces/media/android.media.audio.common.types-V3-java-source/gen -Nsystem/hardware/interfaces/media/aidl_api/android.media.audio.common.types/3 system/hardware/interfaces/media/aidl_api/android.media.audio.common.types/3/android/media/audio/common/AudioHalProductStrategy.aidl
 */
package android.media.audio.common;
/** @hide */
public class AudioHalProductStrategy implements android.os.Parcelable
{
  public int id = -1;
  public android.media.audio.common.AudioHalAttributesGroup[] attributesGroups;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<AudioHalProductStrategy> CREATOR = new android.os.Parcelable.Creator<AudioHalProductStrategy>() {
    @Override
    public AudioHalProductStrategy createFromParcel(android.os.Parcel _aidl_source) {
      AudioHalProductStrategy _aidl_out = new AudioHalProductStrategy();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public AudioHalProductStrategy[] newArray(int _aidl_size) {
      return new AudioHalProductStrategy[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(id);
    _aidl_parcel.writeTypedArray(attributesGroups, _aidl_flag);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      id = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      attributesGroups = _aidl_parcel.createTypedArray(android.media.audio.common.AudioHalAttributesGroup.CREATOR);
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  public static final int VENDOR_STRATEGY_ID_START = 1000;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("id: " + (id));
    _aidl_sj.add("attributesGroups: " + (java.util.Arrays.toString(attributesGroups)));
    return "AudioHalProductStrategy" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof AudioHalProductStrategy)) return false;
    AudioHalProductStrategy that = (AudioHalProductStrategy)other;
    if (!java.util.Objects.deepEquals(id, that.id)) return false;
    if (!java.util.Objects.deepEquals(attributesGroups, that.attributesGroups)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(id, attributesGroups).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(attributesGroups);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof Object[]) {
      int _mask = 0;
      for (Object o : (Object[]) _v) {
        _mask |= describeContents(o);
      }
      return _mask;
    }
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
}
