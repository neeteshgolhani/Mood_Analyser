package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class MoodAnayserTest {
    @Test
    public void testAnalyseMood_SadMessage_ReturnsSAD() throws MoodAnalysisException {
        String message = "I am in Sad Mood"; // The given message
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        // Create MoodAnalyser object with the given message
        String mood = moodAnalyser.analyseMood();
        // Call analyseMood method to get the actual mood
        Assertions.assertTrue(mood.equalsIgnoreCase("SAD"));
        // Verify that the actual mood matches the expected value "SAD"
    }
}
