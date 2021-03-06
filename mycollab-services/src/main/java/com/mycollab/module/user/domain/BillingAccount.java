/*Domain class of table s_account*/
package com.mycollab.module.user.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("s_account")
@Alias("BillingAccount")
public class BillingAccount extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.id
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.createdTime
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.billingPlanId
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Column("billingPlanId")
    private Integer billingplanid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.accountName
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=100, message="Field value is too long")
    @Column("accountName")
    private String accountname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.status
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("status")
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.subdomain
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("subdomain")
    private String subdomain;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.reminderStatus
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("reminderStatus")
    private String reminderstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.sitename
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=255, message="Field value is too long")
    @Column("sitename")
    private String sitename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.logoPath
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=255, message="Field value is too long")
    @Column("logoPath")
    private String logopath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultTimezone
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("defaultTimezone")
    private String defaulttimezone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.faviconPath
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=225, message="Field value is too long")
    @Column("faviconPath")
    private String faviconpath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultCurrencyId
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=4, message="Field value is too long")
    @Column("defaultCurrencyId")
    private String defaultcurrencyid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultYYMMDDFormat
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("defaultYYMMDDFormat")
    private String defaultyymmddformat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultHumanDateFormat
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("defaultHumanDateFormat")
    private String defaulthumandateformat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultMMDDFormat
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("defaultMMDDFormat")
    private String defaultmmddformat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.defaultLanguageTag
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=10, message="Field value is too long")
    @Column("defaultLanguageTag")
    private String defaultlanguagetag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.displayEmailPublicly
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Column("displayEmailPublicly")
    private Boolean displayemailpublicly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.trialFrom
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Column("trialFrom")
    private Date trialfrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.trialTo
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Column("trialTo")
    private Date trialto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_account.paymentMethod
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("paymentMethod")
    private String paymentmethod;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        BillingAccount item = (BillingAccount)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1959, 119).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.id
     *
     * @return the value of s_account.id
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.id
     *
     * @param id the value for s_account.id
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.createdTime
     *
     * @return the value of s_account.createdTime
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.createdTime
     *
     * @param createdtime the value for s_account.createdTime
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.billingPlanId
     *
     * @return the value of s_account.billingPlanId
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public Integer getBillingplanid() {
        return billingplanid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.billingPlanId
     *
     * @param billingplanid the value for s_account.billingPlanId
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setBillingplanid(Integer billingplanid) {
        this.billingplanid = billingplanid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.accountName
     *
     * @return the value of s_account.accountName
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.accountName
     *
     * @param accountname the value for s_account.accountName
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.status
     *
     * @return the value of s_account.status
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.status
     *
     * @param status the value for s_account.status
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.subdomain
     *
     * @return the value of s_account.subdomain
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.subdomain
     *
     * @param subdomain the value for s_account.subdomain
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.reminderStatus
     *
     * @return the value of s_account.reminderStatus
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getReminderstatus() {
        return reminderstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.reminderStatus
     *
     * @param reminderstatus the value for s_account.reminderStatus
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setReminderstatus(String reminderstatus) {
        this.reminderstatus = reminderstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.sitename
     *
     * @return the value of s_account.sitename
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getSitename() {
        return sitename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.sitename
     *
     * @param sitename the value for s_account.sitename
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.logoPath
     *
     * @return the value of s_account.logoPath
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getLogopath() {
        return logopath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.logoPath
     *
     * @param logopath the value for s_account.logoPath
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setLogopath(String logopath) {
        this.logopath = logopath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultTimezone
     *
     * @return the value of s_account.defaultTimezone
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getDefaulttimezone() {
        return defaulttimezone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultTimezone
     *
     * @param defaulttimezone the value for s_account.defaultTimezone
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setDefaulttimezone(String defaulttimezone) {
        this.defaulttimezone = defaulttimezone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.faviconPath
     *
     * @return the value of s_account.faviconPath
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getFaviconpath() {
        return faviconpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.faviconPath
     *
     * @param faviconpath the value for s_account.faviconPath
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setFaviconpath(String faviconpath) {
        this.faviconpath = faviconpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultCurrencyId
     *
     * @return the value of s_account.defaultCurrencyId
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getDefaultcurrencyid() {
        return defaultcurrencyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultCurrencyId
     *
     * @param defaultcurrencyid the value for s_account.defaultCurrencyId
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setDefaultcurrencyid(String defaultcurrencyid) {
        this.defaultcurrencyid = defaultcurrencyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultYYMMDDFormat
     *
     * @return the value of s_account.defaultYYMMDDFormat
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getDefaultyymmddformat() {
        return defaultyymmddformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultYYMMDDFormat
     *
     * @param defaultyymmddformat the value for s_account.defaultYYMMDDFormat
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setDefaultyymmddformat(String defaultyymmddformat) {
        this.defaultyymmddformat = defaultyymmddformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultHumanDateFormat
     *
     * @return the value of s_account.defaultHumanDateFormat
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getDefaulthumandateformat() {
        return defaulthumandateformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultHumanDateFormat
     *
     * @param defaulthumandateformat the value for s_account.defaultHumanDateFormat
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setDefaulthumandateformat(String defaulthumandateformat) {
        this.defaulthumandateformat = defaulthumandateformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultMMDDFormat
     *
     * @return the value of s_account.defaultMMDDFormat
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getDefaultmmddformat() {
        return defaultmmddformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultMMDDFormat
     *
     * @param defaultmmddformat the value for s_account.defaultMMDDFormat
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setDefaultmmddformat(String defaultmmddformat) {
        this.defaultmmddformat = defaultmmddformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.defaultLanguageTag
     *
     * @return the value of s_account.defaultLanguageTag
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getDefaultlanguagetag() {
        return defaultlanguagetag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.defaultLanguageTag
     *
     * @param defaultlanguagetag the value for s_account.defaultLanguageTag
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setDefaultlanguagetag(String defaultlanguagetag) {
        this.defaultlanguagetag = defaultlanguagetag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.displayEmailPublicly
     *
     * @return the value of s_account.displayEmailPublicly
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public Boolean getDisplayemailpublicly() {
        return displayemailpublicly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.displayEmailPublicly
     *
     * @param displayemailpublicly the value for s_account.displayEmailPublicly
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setDisplayemailpublicly(Boolean displayemailpublicly) {
        this.displayemailpublicly = displayemailpublicly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.trialFrom
     *
     * @return the value of s_account.trialFrom
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public Date getTrialfrom() {
        return trialfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.trialFrom
     *
     * @param trialfrom the value for s_account.trialFrom
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setTrialfrom(Date trialfrom) {
        this.trialfrom = trialfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.trialTo
     *
     * @return the value of s_account.trialTo
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public Date getTrialto() {
        return trialto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.trialTo
     *
     * @param trialto the value for s_account.trialTo
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setTrialto(Date trialto) {
        this.trialto = trialto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_account.paymentMethod
     *
     * @return the value of s_account.paymentMethod
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public String getPaymentmethod() {
        return paymentmethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_account.paymentMethod
     *
     * @param paymentmethod the value for s_account.paymentMethod
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public enum Field {
        id,
        createdtime,
        billingplanid,
        accountname,
        status,
        subdomain,
        reminderstatus,
        sitename,
        logopath,
        defaulttimezone,
        faviconpath,
        defaultcurrencyid,
        defaultyymmddformat,
        defaulthumandateformat,
        defaultmmddformat,
        defaultlanguagetag,
        displayemailpublicly,
        trialfrom,
        trialto,
        paymentmethod;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}