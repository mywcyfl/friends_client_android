package com.friends.android.result;

import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * ��������Ƭ����ʵ����
 * 
 * @author wangxinwen
 * 
 */
public class NearbyPhotoResult implements Parcelable {
	/**
	 * ��ƬID
	 */
	private String pid;
	/**
	 * ��Ƭ����
	 */
	private String image;
	/**
	 * ��Ƭ����
	 */
	private String title;
	/**
	 * ��Ƭ����
	 */
	private int count;
	/**
	 * ��Ƭ�ص�
	 */
	private String location;
	/**
	 * �������
	 */
	private String distance;
	/**
	 * ��Ƭ����
	 */
	private List<NearbyPhotoDetailResult> images;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public List<NearbyPhotoDetailResult> getImages() {
		return images;
	}

	public void setImages(List<NearbyPhotoDetailResult> images) {
		this.images = images;
	}

	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(pid);
		dest.writeString(image);
		dest.writeString(title);
		dest.writeString(location);
		dest.writeString(distance);
		dest.writeInt(count);
		dest.writeList(images);
	}

	public static final Parcelable.Creator<NearbyPhotoResult> CREATOR = new Creator<NearbyPhotoResult>() {

		@SuppressWarnings("unchecked")
		public NearbyPhotoResult createFromParcel(Parcel source) {
			NearbyPhotoResult result = new NearbyPhotoResult();
			result.setPid(source.readString());
			result.setImage(source.readString());
			result.setTitle(source.readString());
			result.setLocation(source.readString());
			result.setDistance(source.readString());
			result.setCount(source.readInt());
			result.setImages(source.readArrayList(NearbyPhotoResult.class
					.getClassLoader()));
			return result;
		}

		public NearbyPhotoResult[] newArray(int size) {
			return new NearbyPhotoResult[size];
		}
	};
}
