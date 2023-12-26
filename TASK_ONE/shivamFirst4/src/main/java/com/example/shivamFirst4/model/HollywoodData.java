package com.example.shivamFirst4.model;

public class HollywoodData {
	private String current_trending;
	private String upcoming_movie;
	private String upcoming_movie_id;
	private String upcoming_movie_hero;
	private String upcoming_movie_release_date;
	public String getCurrent_trending() {
		return current_trending;
	}
	public void setCurrent_trending(String current_trending) {
		this.current_trending = current_trending;
	}
	public String getUpcoming_movie() {
		return upcoming_movie;
	}
	public void setUpcoming_movie(String upcoming_movie) {
		this.upcoming_movie = upcoming_movie;
	}
	public String getUpcoming_movie_id() {
		return upcoming_movie_id;
	}
	public void setUpcoming_movie_id(String upcoming_movie_id) {
		this.upcoming_movie_id = upcoming_movie_id;
	}
	public String getUpcoming_movie_hero() {
		return upcoming_movie_hero;
	}
	public void setUpcoming_movie_hero(String upcoming_movie_hero) {
		this.upcoming_movie_hero = upcoming_movie_hero;
	}
	public String getUpcoming_movie_release_date() {
		return upcoming_movie_release_date;
	}
	public void setUpcoming_movie_release_date(String upcoming_movie_release_date) {
		this.upcoming_movie_release_date = upcoming_movie_release_date;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Upcoming_movie_id:  "+upcoming_movie_id+", Movie-name: "+upcoming_movie+", upcoming_movie_hero"+upcoming_movie_hero+", upcoming_movie_release_date: "+upcoming_movie_release_date;
	}
}
