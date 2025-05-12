package reza.model;

import java.util.List;

/**
 * This class holds the basic information for a resume.
 */
public class Resume {

    private String fullName;
    private String email;
    private String phoneNumber;
    private String summary;
    private String education;
    private String experience;
    private List<String> skills;

    public Resume() {
    }

    public Resume(String fullName, String email, String phoneNumber, String summary,
                  String education, String experience, List<String> skills) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.summary = summary;
        this.education = education;
        this.experience = experience;
        this.skills = skills;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String formatResume() {
        return "Name: " + fullName + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phoneNumber + "\n" +
                "Summary: " + summary + "\n\n" +
                "Education:\n" + education + "\n\n" +
                "Experience:\n" + experience + "\n\n" +
                "Skills:\n" + String.join(", ", skills);
    }
}
