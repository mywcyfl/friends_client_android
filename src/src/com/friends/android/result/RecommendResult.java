package com.friends.android.result;

/**
 * ��Ϸ����ʵ����
 * 
 * @author wangxinwen
 * 
 */
public class RecommendResult {
	/**
	 * ����
	 */
	private String name;
	/**
	 * ͼ��
	 */
	private String icon;
	/**
	 * �Ƿ�Ϊ����
	 */
	private boolean isTitle;
	/**
	 * ��������
	 */
	private String titleName;
	/**
	 * ����
	 */
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public boolean isTitle() {
		return isTitle;
	}

	public void setTitle(boolean isTitle) {
		this.isTitle = isTitle;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
