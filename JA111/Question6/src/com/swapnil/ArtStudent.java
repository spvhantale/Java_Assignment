package com.swapnil;

public class ArtStudent implements Student {
	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	
	public ArtStudent() {
		
	}

	public ArtStudent(int hindiMarks, int englishMarks, int historyMarks) {
		super();
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
		this.historyMarks = historyMarks;
	}

	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}


	@Override
	public double findPercentage() {
		int sum=this.historyMarks+this.hindiMarks+this.englishMarks;
		int n=3;
		double percentage=(sum/n);
		return percentage;
	}
	
	
	
}
