package com.friends.android.result;

/**
 * ״̬���ݵ�ʵ��
 * 
 * @author wangxinwen
 * 
 */
public class StatusResult {
	/**
	 * ״̬������������
	 */
	private String name;
	/**
	 * ״̬��ʱ��
	 */
	private String time;
	/**
	 * ״̬������
	 */
	private String content;
	/**
	 * ״̬����Դ(������ҳ,Android�ͻ���)
	 */
	private String from;
	/**
	 * ״̬���۵�����
	 */
	private int comment_count;
	/**
	 * ״̬ת��������
	 */
	private int forward_count;
	/**
	 * ״̬�޵�����
	 */
	private int like_count;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public int getForward_count() {
		return forward_count;
	}

	public void setForward_count(int forward_count) {
		this.forward_count = forward_count;
	}

	public int getLike_count() {
		return like_count;
	}

	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}

}
