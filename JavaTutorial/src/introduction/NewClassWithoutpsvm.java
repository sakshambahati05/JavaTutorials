package introduction;

public class NewClassWithoutpsvm {

	// 1. Should learn python
	private String languagePreference;

	// 2.Java is more important than python
	public String importance;

	// 3. But syntax of python is more simpler of an integer difficulty level
	private int difficultyLevel;

	// 4. Java it is then, at least nothing will limit me from now on
	private String finalResult;

	public void startLearning() {
		System.out.println("This is the time to start learning. Its now or never ! ! ! ");
	}

	// Usage of a setter --- manually entered
	public void setLanguagePreference(String languagePreference) {
		this.languagePreference = languagePreference;
	}

	// Usage of a getter -- Manually entered
	public String getLanguagePreference() {
		return this.languagePreference;

	}

	// Beloe getters and setters are generated using below path and mechanism
	// Right-Click >> Source >> Generate Getters and Setters and then select
	// accordingly the insertion point and their public visibility
	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public int getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(int difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public String getFinalResult() {
		return finalResult;
	}

	public void setFinalResult(String finalResult) {
		this.finalResult = finalResult;
	}

}