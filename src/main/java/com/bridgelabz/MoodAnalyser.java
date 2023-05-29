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
        // Check if the message contains "sad" (case-insensitive)
        else if (message.toLowerCase().contains("sad")) {
            return "Sad";
        }

        // If the message does not contain "happy" or "sad", return "Unknown"
        return "Unknown";
    }

}
