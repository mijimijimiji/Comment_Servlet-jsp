package com.dto;

public class PostID {
	
	
	private String postId;
	private String postBoard;
	private String userId;
	private String contId;
	private String postTitle;
	private String postDate;
	private String postEditdate;
	private String postText;
	

	public PostID() {
		// TODO Auto-generated constructor stub
	}


	public PostID(String postId, String postBoard, String userId, String contId, String postTitle, String postDate,
			String postEditdate, String postText) {
		super();
		this.postId = postId;
		this.postBoard = postBoard;
		this.userId = userId;
		this.contId = contId;
		this.postTitle = postTitle;
		this.postDate = postDate;
		this.postEditdate = postEditdate;
		this.postText = postText;
	}


	public String getPostId() {
		return postId;
	}


	public void setPostId(String postId) {
		this.postId = postId;
	}


	public String getPostBoard() {
		return postBoard;
	}


	public void setPostBoard(String postBoard) {
		this.postBoard = postBoard;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getContId() {
		return contId;
	}


	public void setContId(String contId) {
		this.contId = contId;
	}


	public String getPostTitle() {
		return postTitle;
	}


	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}


	public String getPostDate() {
		return postDate;
	}


	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}


	public String getPostEditdate() {
		return postEditdate;
	}


	public void setPostEditdate(String postEditdate) {
		this.postEditdate = postEditdate;
	}


	public String getPostText() {
		return postText;
	}


	public void setPostText(String postText) {
		this.postText = postText;
	}


	@Override
	public String toString() {
		return "PostID [postId=" + postId + ", postBoard=" + postBoard + ", userId=" + userId + ", contId=" + contId
				+ ", postTitle=" + postTitle + ", postDate=" + postDate + ", postEditdate=" + postEditdate
				+ ", postText=" + postText + "]";
	}
	
	
	

}
