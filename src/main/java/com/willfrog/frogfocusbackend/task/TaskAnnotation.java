package com.willfrog.frogfocusbackend.task;

public class TaskAnnotation{

    /**
     * 指示本任务是否是因为追赶DDL而产生的。
     */
    private int isDDL;
    /**
     * 指示本任务相对于自己规划的进度的超前或落后。
     */
    private int schedule;
    /**
     * 指示完成本任务时的精神状态（主要是困还是不困）
     */
    private int mental;

    public TaskAnnotation(){}

    public TaskAnnotation(int isDDL, int schedule, int mental){
        this.isDDL = isDDL;
        this.schedule = schedule;
        this.mental = mental;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }

    public int getIsDDL() {
        return isDDL;
    }

    public void setIsDDL(int isDDL) {
        this.isDDL = isDDL;
    }
}
