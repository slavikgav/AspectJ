package com.aspectexample.codder;

public class GoogleCoder implements Codder {
	String currentRepository;

	public void createRepository(String repositoryName){
		currentRepository = repositoryName;
		System.out.println("Creating repository: " + currentRepository);
	}
	
	public String getLastRepository(){
		System.out.println(currentRepository + " is current repository");
		return currentRepository;
	}
	
	public void throwRepositoryExist() throws Exception {
		System.out.println("throwPlaylistExist() is running");
		throw new Exception("Sorry, this repository is already exists");
	}
	
	public void createRepositoryAround(String repositoryName){
		currentRepository = repositoryName;
		System.out.println("Creating repository around: " + currentRepository);
	}
}