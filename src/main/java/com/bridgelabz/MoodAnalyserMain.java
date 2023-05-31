package com.bridgelabz;
public class MoodAnalyserMain {
    public static void main(String[] args) throws moodAnalysisException {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
        String mood1 = moodAnalyser1.analyseMood();
        System.out.println("Mood 1: " + mood1); // Mood 1: SAD

        MoodAnalyser moodAnalyser2 = new MoodAnalyser();
        String mood2 = moodAnalyser2.analyseMood();
        System.out.println("Mood 2: " + mood2); // Mood 2: SAD

        MoodAnalyser moodAnalyser3 = new MoodAnalyser(null);
        String mood3 = moodAnalyser3.analyseMood();
        System.out.println("Mood 3: " + mood3); // Mood 3: INVALID
    }
}