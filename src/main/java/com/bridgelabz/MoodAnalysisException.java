package com.bridgelabz;
    // Custom exception class for mood analysis errors
    class MoodAnalysisException extends Exception {
        // Enum to differentiate mood analysis errors
        enum ErrorType {
            NULL_MOOD, EMPTY_MOOD
        }
        private ErrorType errorType;

        // Constructor with error type
        MoodAnalysisException(ErrorType errorType) {
            this.errorType = errorType;
        }

        public ErrorType getErrorType() {
            return errorType;
        }

        @Override
        public String toString() {
            return "MoodAnalysisException: " + errorType;
        }
    }