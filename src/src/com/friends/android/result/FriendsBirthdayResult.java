package com.friends.android.result;

/**
 * ������������ʵ����
 * 
 * @author wangxinwen
 * 
 */
public class FriendsBirthdayResult {
	/**
	 * ���ѵ�ID
	 */
	private String uid;
	/**
	 * ���ѵ�����
	 */
	private String name;
	/**
	 * ���ѵ�ͷ��
	 */
	private int avatar;
	/**
	 * ���ѵ�����
	 */
	private String birthday_date;

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

	public String getBirthday_date() {
		return birthday_date;
	}

	public void setBirthday_date(String birthday_date) {
		this.birthday_date = birthday_date;
	}
}
