package com.bridgelabz;

public class MoodAnalyser {
    private String message;

    // Default constructor
    public MoodAnalyser() {
        this.message = "";
    }

    // Constructor with parameter
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() throws moodAnalysisException {
        try {
            if (message == null) {
                throw new moodAnalysisException(moodAnalysisException.ErrorType.NULL_MOOD);
            }
            if (message.isEmpty()) {
                throw new moodAnalysisException(moodAnalysisException.ErrorType.EMPTY_MOOD);
            }

            String lowercaseMessage = message.toLowerCase();
            if (lowercaseMessage.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (moodAnalysisException e) {
            throw e;
        }
    }
}