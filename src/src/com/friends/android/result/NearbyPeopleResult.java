package com.friends.android.result;
/**
 * ������������ʵ����
 * @author wangxinwen
 *
 */
public class NearbyPeopleResult {
	/**
	 * �û���ID
	 */
	private String uid;
	/**
	 * �û�������
	 */
	private String name;
	/**
	 * �û���ͷ��
	 */
	private int avatar;
	/**
	 * �ϴ�ʱ��
	 */
	private String time;
	/**
	 * �������
	 */
	private String distance;
	/**
	 * �Ƿ����ͼƬ
	 */
	private boolean picture;
	/**
	 * ����λ������
	 */
	private String location;

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

	public int getAvatar() {
		return avatar;
	}

	public void setAvatar(int avatar) {
		this.avatar = avatar;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public boolean isPicture() {
		return picture;
	}

	public void setPicture(boolean picture) {
		this.picture = picture;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
