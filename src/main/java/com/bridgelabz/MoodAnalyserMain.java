package com.bridgelabz;
public class MoodAnalyserMain {
    public static void main(String[] args) {
        try {
            String message = "I am feeling happy today!";
            MoodAnalyser moodAnalyser = new MoodAnalyser(message);
            String mood = moodAnalyser.analyseMood();
            System.out.println("Mood: " + mood);
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}