package services;

public class MarksService implements EligibilityChecker {
    @Override
    public boolean checkEligibility(int studentId) {
        // Logic to check CA marks >= 50%
        return true;
    }
}

