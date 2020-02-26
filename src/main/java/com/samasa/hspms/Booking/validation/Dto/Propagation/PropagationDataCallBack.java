package com.samasa.hspms.Booking.validation.Dto.Propagation;

public class PropagationDataCallBack {

    private String status;
    private PropagationData propagationData;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PropagationData getPropagationData() {
        return propagationData;
    }

    public void setPropagationData(PropagationData propagationData) {
        this.propagationData = propagationData;
    }
}
