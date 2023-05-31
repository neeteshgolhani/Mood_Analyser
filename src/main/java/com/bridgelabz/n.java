package com.bridgelabz;

// Custom exception class for mood analysis errors
class moodAnalysisException extends Exception {
    // Enum to differentiate mood analysis errors
    enum ErrorType {
        NULL_MOOD, EMPTY_MOOD
    }

    private ErrorType errorType;

    // Constructor with error type
    moodAnalysisException(ErrorType errorType) {
        this.errorType = errorType;
    }

    @Override
    public String toString() {
        return "MoodAnalysisException: " + errorType;
    }
}
