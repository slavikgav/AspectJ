package com.aspectexample.codder;

public interface Codder {

	void createRepository(String playlistName);
	
	String getLastRepository();

	void throwRepositoryExist() throws Exception;
	
	void createRepositoryAround(String playlistName);
}