package com.ssafit.rest.model.dto;

import java.time.LocalDateTime;
import java.util.List;

public class Review {
	private int reviewId;
	private String videoId;
	private int userId;

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", videoId=" + videoId + ", userId=" + userId + ", content=" + content
				+ ", parentReviewId=" + parentReviewId + ", childReviews=" + childReviews + ", createdAt=" + createdAt
				+ ", modifedAt=" + modifiedAt + "]";
	}

	private String content;

	private Integer parentReviewId; // tree 구조 상 null 이 정확하기 대문.
	private List<Review> childReviews;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;

	public Review() {
	}

	public Review(String videoId, int userId, String content) {
		this.videoId = videoId;
		this.userId = userId;
		this.content = content;
	}

	public Review(int userId, String videoId, String content, Integer parentReviewId) {
		this.userId = userId;
		this.videoId = videoId;
		this.content = content;
		this.parentReviewId = parentReviewId;
	}

	public Review(int reviewId, String videoId, int userId, String content, Integer parentReviewId,
			List<Review> childReviews, LocalDateTime createdAt, LocalDateTime modifedAt) {
		this.reviewId = reviewId;
		this.videoId = videoId;
		this.userId = userId;

		this.content = content;

		this.parentReviewId = parentReviewId;
		this.childReviews = childReviews;
		this.createdAt = createdAt;
		this.modifiedAt = modifedAt;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public Integer getParentReviewId() {
		return parentReviewId;
	}

	public void setParentReviewId(Integer parentReviewId) {
		this.parentReviewId = parentReviewId;
	}

	public List<Review> getChildReviews() {
		return childReviews;
	}

	public void setChildReviews(List<Review> childReviews) {
		this.childReviews = childReviews;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getModifedAt() {
		return modifiedAt;
	}

	public void setModifedAt(LocalDateTime modifedAt) {
		this.modifiedAt = modifedAt;
	}

}
