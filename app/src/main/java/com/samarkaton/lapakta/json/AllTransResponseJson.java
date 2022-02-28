package com.samarkaton.lapakta.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.samarkaton.lapakta.models.AllTransModel;
import com.samarkaton.lapakta.models.DriverModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ourdevelops Team on 10/19/2019.
 */

public class AllTransResponseJson {

    @Expose
    @SerializedName("message")
    private String message;

    @Expose
    @SerializedName("data")
    private List<AllTransModel> data = new ArrayList<>();

    @Expose
    @SerializedName("driver")
    private List<DriverModel> driver = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<AllTransModel> getData() {
        return data;
    }

    public void setData(List<AllTransModel> data) {
        this.data = data;
    }

    public List<DriverModel> getDriver() {
        return driver;
    }

    public void setDriver(List<DriverModel> driver) {
        this.driver = driver;
    }
}
