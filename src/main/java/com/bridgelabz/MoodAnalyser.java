package com.bridgelabz;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        // Check if the message is null or empty
        if (message == null || message.isEmpty()) {
            throw new MoodAnalysisException("Message cannot be null or empty");
        }

        // Check if the message contains "happy" (case-insensitive)
        if (message.toLowerCase().contains("happy")) {
            return "Happy";
        }
        // Convert the message to lowercase for case-insensitive analysis
        String lowercaseMessage = message.toLowerCase();
        // Check for the keyword "sad" in the message
        if (lowercaseMessage.contains("sad")) {
            return "Sad";
        } else {
            return "HAPPY";
        }
    }
}
