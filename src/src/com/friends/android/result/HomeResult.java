package com.friends.android.result;

/**
 * ��ҳ���ݵ�ʵ����
 * 
 * @author wangxinwen
 * 
 */
public class HomeResult {
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
	 * ���ݵ�����
	 */
	private String type;
	/**
	 * ���ݵ�ʱ��
	 */
	private String time;
	/**
	 * ���ݵı���
	 */
	private String title;
	/**
	 * ����ʲô�ͻ���
	 */
	private String from;
	/**
	 * ��������
	 */
	private int comment_count;
	/**
	 * ������
	 */
	private int like_count;
	/**
	 * ���ݵ�ͼƬ
	 */
	private String photo;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public int getComment_count() {
		return comment_count;
	}

	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}

	public int getLike_count() {
		return like_count;
	}

	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
