package com.samasa.hspms.compositeprimary;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class rateRangeComposite implements Serializable {

    private String unitCode;
    private int rangeSeqId;
    private String baseRateCode;
    private String rateCode;
    private String curCode;

    public rateRangeComposite() { }
}
