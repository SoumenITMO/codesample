package com.samasa.hspms.compositeprimary;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class frmRateRangeDetailsComposite implements Serializable {

    private String unitCode;
    private int rangeSeqId;
    private String rateCode;
    private String dow;
    private String occType;
    private String occInd;
    private String curCode;

    public frmRateRangeDetailsComposite() {

    }
}
