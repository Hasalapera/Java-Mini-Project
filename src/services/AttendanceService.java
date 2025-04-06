package services;

public class AttendanceService implements EligibilityChecker {
    @Override
    public boolean checkEligibility(int studentId) {
        // Logic to check attendance percentage
        return true;
    }
}

