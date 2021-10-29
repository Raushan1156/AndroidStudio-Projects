package com.raushan.covid19_Tracker;

public class State_Model {
    private String Total_Cases,Todays_Cases,Total_Death,Todays_Death,Total_Active,Total_Recovery,TodaysRecovery;

    public State_Model() {

    }

    public State_Model(String total_Cases, String todays_Cases, String total_Death, String todays_Death, String total_Active, String total_Recovery, String todaysRecovery) {
        Total_Cases = total_Cases;
        Todays_Cases = todays_Cases;
        Total_Death = total_Death;
        Todays_Death = todays_Death;
        Total_Active = total_Active;
        Total_Recovery = total_Recovery;
        TodaysRecovery = todaysRecovery;
    }

    public String getTotal_Cases() {
        return Total_Cases;
    }

    public void setTotal_Cases(String total_Cases) {
        Total_Cases = total_Cases;
    }

    public String getTodays_Cases() {
        return Todays_Cases;
    }

    public void setTodays_Cases(String todays_Cases) {
        Todays_Cases = todays_Cases;
    }

    public String getTotal_Death() {
        return Total_Death;
    }

    public void setTotal_Death(String total_Death) {
        Total_Death = total_Death;
    }

    public String getTodays_Death() {
        return Todays_Death;
    }

    public void setTodays_Death(String todays_Death) {
        Todays_Death = todays_Death;
    }

    public String getTotal_Active() {
        return Total_Active;
    }

    public void setTotal_Active(String total_Active) {
        Total_Active = total_Active;
    }

    public String getTotal_Recovery() {
        return Total_Recovery;
    }

    public void setTotal_Recovery(String total_Recovery) {
        Total_Recovery = total_Recovery;
    }

    public String getTodaysRecovery() {
        return TodaysRecovery;
    }

    public void setTodaysRecovery(String todaysRecovery) {
        TodaysRecovery = todaysRecovery;
    }

    public int getState() {
        return 0;
    }
}
