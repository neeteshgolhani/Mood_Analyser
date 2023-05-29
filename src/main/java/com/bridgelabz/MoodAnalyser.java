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

    public String analyseMood() {
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
