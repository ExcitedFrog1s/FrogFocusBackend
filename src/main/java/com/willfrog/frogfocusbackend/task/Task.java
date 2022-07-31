package com.willfrog.frogfocusbackend.task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int taskId;

    /**
     * 任务名称。
     */
    private String taskName;

    /**
     * 任务状态（完成/未完成/etc.）
     */
    private int taskStatus;

    private Date taskStartTime;

    /**
     * 完成任务的总时间。
     */
    private int taskTime;

    /**
     * 完成任务过程中中途休息的时间。
     */
    private int taskRestTime;

    /**
     * 完成任务过程中分心的时间。
     */
    private int taskDistractTime;

    /**
     * 效率时间占本任务时间的百分比。
     */
    private double efficiency;

    /**
     * 根据效率、时长等因素算出的任务得分。
     */
    private double assessment;

    public Task(){}

    /**
     * 仅新建一个未完成的任务记录。
     * @param taskName 该未完成的任务名称。
     */
    public Task(String taskName){
        this.taskName = taskName;
        this.taskStatus = 0;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskDistractTime() {
        return taskDistractTime;
    }

    public void setTaskDistractTime(int taskDistractTime) {
        this.taskDistractTime = taskDistractTime;
    }

    public int getTaskRestTime() {
        return taskRestTime;
    }

    public void setTaskRestTime(int taskRestTime) {
        this.taskRestTime = taskRestTime;
    }

    public int getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(int taskTime) {
        this.taskTime = taskTime;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public double getAssessment() {
        return assessment;
    }

    public void setAssessment(double assessment) {
        this.assessment = assessment;
    }

    public Date getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }
}
