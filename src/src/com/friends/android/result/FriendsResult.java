package com.friends.android.result;

/**
 * �������ݵ�ʵ��
 * 
 * @author wangxinwen
 * 
 */
public class FriendsResult {
	/**
	 * ���ѵı��
	 */
	private String uid;
	/**
	 * ���ѵ�ͷ����
	 */
	private int avatar;
	/**
	 * ���ѵ�����
	 */
	private String name;
	/**
	 * ���ѵ�����ƴ��
	 */
	private String name_pinyin;
	/**
	 * ��������������ĸ
	 */
	private String name_first;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getAvatar() {
		return avatar;
	}

	public void setAvatar(int avatar) {
		this.avatar = avatar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_pinyin() {
		return name_pinyin;
	}

	public void setName_pinyin(String name_pinyin) {
		this.name_pinyin = name_pinyin;
	}

	public String getName_first() {
		return name_first;
	}

	public void setName_first(String name_first) {
		this.name_first = name_first;
	}
}
