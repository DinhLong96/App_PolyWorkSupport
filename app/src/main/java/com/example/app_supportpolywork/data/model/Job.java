package com.example.app_supportpolywork.data.model;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import java.util.Objects;

public class Job {
    private String id;
    private String avatar;
    private String title;
    private long startSalary;
    private long endSalary;
    private String salary;
    private String workForm;
    private String workPlace;
    private int startNeededNumberOfPeople;
    private int endNeededNumberOfPeople;
    private String gender;
    private String experience;
    private String description;
    private String benefits;
    private String requirement;
    private String technology;
    private String position;
    private long expiryApply;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getStartSalary() {
        return startSalary;
    }

    public void setStartSalary(long startSalary) {
        this.startSalary = startSalary;
    }

    public long getEndSalary() {
        return endSalary;
    }

    public void setEndSalary(long endSalary) {
        this.endSalary = endSalary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getWorkForm() {
        return workForm;
    }

    public void setWorkForm(String workForm) {
        this.workForm = workForm;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public int getStartNeededNumberOfPeople() {
        return startNeededNumberOfPeople;
    }

    public void setStartNeededNumberOfPeople(int startNeededNumberOfPeople) {
        this.startNeededNumberOfPeople = startNeededNumberOfPeople;
    }

    public int getEndNeededNumberOfPeople() {
        return endNeededNumberOfPeople;
    }

    public void setEndNeededNumberOfPeople(int endNeededNumberOfPeople) {
        this.endNeededNumberOfPeople = endNeededNumberOfPeople;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getExpiryApply() {
        return expiryApply;
    }

    public void setExpiryApply(long expiryApply) {
        this.expiryApply = expiryApply;
    }


    public enum WorkForm {
        FULL_TIME("Full-time"), PART_TIME ("Part-time"), REMOTE("Remote");

        public String value;
        WorkForm(String s) {
            value = s;
        }
    }

    public static DiffUtil.ItemCallback<Job> sDiffCallback = new DiffUtil.ItemCallback<Job>() {
        @Override
        public boolean areItemsTheSame(@NonNull Job oldItem, @NonNull Job newItem) {
            return Objects.equals(oldItem.id, newItem.id);
        }

        @Override
        public boolean areContentsTheSame(@NonNull Job oldItem, @NonNull Job newItem) {
            return oldItem == newItem;
        }
    };
}
