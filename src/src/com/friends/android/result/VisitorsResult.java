package com.friends.android.result;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * ����������ʵ��
 * 
 * @author wangxinwen
 * 
 */
public class VisitorsResult implements Parcelable {
	/**
	 * �����ߵı��
	 */
	private String uid;
	/**
	 * �����ߵ�����
	 */
	private String name;
	/**
	 * ���������õ�ʱ��
	 */
	private String time;
	/**
	 * ������ͷ����
	 */
	private int avatar;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getAvatar() {
		return avatar;
	}

	public void setAvatar(int avatar) {
		this.avatar = avatar;
	}

	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(uid);
		dest.writeString(name);
		dest.writeString(time);
		dest.writeInt(avatar);
	}

	public static final Parcelable.Creator<VisitorsResult> CREATOR = new Parcelable.Creator<VisitorsResult>() {

		public VisitorsResult createFromParcel(Parcel source) {
			VisitorsResult result = new VisitorsResult();
			result.setUid(source.readString());
			result.setName(source.readString());
			result.setTime(source.readString());
			result.setAvatar(source.readInt());
			return result;
		}

		public VisitorsResult[] newArray(int size) {
			return new VisitorsResult[size];
		}
	};

}
