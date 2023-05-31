package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class MoodAnayserTest {
    @Test
    public void testAnalyseMood_SadMessage_ReturnsSAD() throws moodAnalysisException {
        String message = "I am in Sad Mood"; // The given message
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        // Create MoodAnalyser object with the given message
        String mood = moodAnalyser.analyseMood();
        // Call analyseMood method to get the actual mood
        Assertions.assertTrue(mood.equalsIgnoreCase("SAD"));
        // Verify that the actual mood matches the expected value "SAD"
    }

    @Test
    public void testAnalyseMood_AnyOtherMessage_ReturnsHappy() throws moodAnalysisException {
        String message = "I am in Any Mood";
        // The given message not containing the word "Sad"
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        // Create MoodAnalyser object with the given message

        String mood = moodAnalyser.analyseMood();
        // Call analyseMood method to get the actual mood

        Assertions.assertEquals("HAPPY", mood);
        // Verify that the actual mood matches the expected value "HAPPY"
    }

    @Test
    public void testAnalyseMood_SadMessageInConstructor_ReturnsSad() throws moodAnalysisException {
        String message = "I am in Sad Mood";
        // The given message containing the word "Sad"
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        // Create MoodAnalyser object with the given message

        String mood = moodAnalyser.analyseMood();
        // Call analyseMood method to get the actual mood

        Assertions.assertEquals("SAD", mood);
        // Verify that the actual mood matches the expected value "SAD"
    }

    @Test
    public void testAnalyseMood_NoParameter_ReturnsSad() throws moodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        // Create MoodAnalyser object using the default constructor

        String mood = moodAnalyser.analyseMood();
        // Call analyseMood method to get the actual mood

        Assertions.assertEquals("SAD", mood);
        // Verify that the actual mood matches the expected value "SAD"
    }

    @Test
    public void testAnalyseMood_HappyMessageInConstructor_ReturnsHappy() throws moodAnalysisException {
        String message = "I am in Happy Mood";
        // The given message containing the word "Happy"
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        // Create MoodAnalyser object with the given message

        String mood = moodAnalyser.analyseMood();
        // Call analyseMood method to get the actual mood

        Assertions.assertEquals("HAPPY", mood);
        // Verify that the actual mood matches the expected value "HAPPY"
    }

    @Test
    public void testAnalyseMood_NoParameter_ReturnsHappy() throws moodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        // Create MoodAnalyser object using the default constructor

        String mood = moodAnalyser.analyseMood();
        // Call analyseMood method to get the actual mood

        Assertions.assertEquals("HAPPY", mood);
        // Verify that the actual mood matches the expected value "HAPPY"
    }
    @Test
    public void testAnalyseMood_NullMessage_ReturnsHappy() throws moodAnalysisException {
        // Given
        String message = null; // The mood message is null
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);

        // When
        String mood = moodAnalyser.analyseMood();

        // Then
        Assertions.assertEquals("HAPPY", mood);

    }
    @Test
    public void testAnalyseMood_NullMessage_ThrowsMoodAnalysisException() {
        // Given
        String message = null; // The mood message is null
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);

        // When and Then
        Assertions.assertThrows(MoodAnalysisException.class, () -> {
            moodAnalyser.analyseMood();
        });
    }
    @Test
    public void testAnalyseMood_EmptyMessage_ThrowsMoodAnalysisException() {
        // Given
        String message = ""; // The mood message is empty
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);

        // When and Then
        MoodAnalysisException exception = Assertions.assertThrows(MoodAnalysisException.class, () -> {
            moodAnalyser.analyseMood();
        });

        // Verify the exception type and error message
        Assertions.assertEquals(MoodAnalysisException.ErrorType.EMPTY_MOOD, exception.getErrorType());
        Assertions.assertEquals("MoodAnalysisException: EMPTY_MOOD", exception.toString());
    }
}
