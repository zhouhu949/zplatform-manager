package com.zlebank.zplatform.manager.dao.object.scan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "T_ENTERPRISE_REALNAME_APPLY")
public class EnterpriseRealnameMode implements java.io.Serializable  {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2369531070364090965L;
	private long tid;
	private String memberId;
	private String enterpriseName;
	private String licenceNo;
	private String orgCode;
	private String taxNo;
	private String corporation;
	private String corpNo;
	private String contact;
	private String contactsTelNo;
	private String accName;
	private String accNum;
	private String bankNode;
	private String bankCode;
	private String status;
	private Long inUser;
	private Date inTime;
	private Long stexaUser;
	private Date stexaTime;
	private String stexaOpt;
	private Long cvlexaUser;
	private Date cvlexaTime;
	private String cvlexaOpt;
	private String notes;
	private String remarks;
	private String tn;
	private Long txnamt;
	private String bankName;
	private String busiType;
	
	public EnterpriseRealnameMode() {
	}

	public EnterpriseRealnameMode(long tid) {
		this.tid = tid;
	}

	public EnterpriseRealnameMode(long tid, String memberid,
			String enterprisename, String licenceNo, String orgCode,
			String taxNo, String corporation, String corpNo, String contact,
			String contactsTelNo, String accName, String accNum,
			String bankNode, String bankCode, String status, Long inUser,
			Date inTime, Long stexaUser, Date stexaTime, String stexaOpt,
			Long cvlexaUser, Date cvlexaTime, String cvlexaOpt, String notes,
			String remarks) {
		this.tid = tid;
		this.memberId = memberid;
		this.enterpriseName = enterprisename;
		this.licenceNo = licenceNo;
		this.orgCode = orgCode;
		this.taxNo = taxNo;
		this.corporation = corporation;
		this.corpNo = corpNo;
		this.contact = contact;
		this.contactsTelNo = contactsTelNo;
		this.accName = accName;
		this.accNum = accNum;
		this.bankNode = bankNode;
		this.bankCode = bankCode;
		this.status = status;
		this.inUser = inUser;
		this.inTime = inTime;
		this.stexaUser = stexaUser;
		this.stexaTime = stexaTime;
		this.stexaOpt = stexaOpt;
		this.cvlexaUser = cvlexaUser;
		this.cvlexaTime = cvlexaTime;
		this.cvlexaOpt = cvlexaOpt;
		this.notes = notes;
		this.remarks = remarks;
	}

	@GenericGenerator(name = "id_gen", strategy = "enhanced-table", parameters = {
            @Parameter(name = "table_name", value = "T_C_PRIMAY_KEY"),
            @Parameter(name = "value_column_name", value = "NEXT_ID"),
            @Parameter(name = "segment_column_name", value = "KEY_NAME"),
            @Parameter(name = "segment_value", value = "FOR_APPLY_ID"),
            @Parameter(name = "increment_size", value = "1"),
            @Parameter(name = "optimizer", value = "pooled-lo") })
    
	@Id
	@GeneratedValue(generator = "id_gen")
	@Column(name = "TID", unique = true, nullable = false, precision = 12, scale = 0)
	public long getTid() {
		return this.tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	@Column(name = "MEMBERID", length = 15)
	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberid) {
		this.memberId = memberid;
	}

	@Column(name = "ENTERPRISENAME", length = 128)
	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterprisename) {
		this.enterpriseName = enterprisename;
	}

	@Column(name = "LICENCE_NO", length = 32)
	public String getLicenceNo() {
		return this.licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	@Column(name = "ORG_CODE", length = 32)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "TAX_NO", length = 32)
	public String getTaxNo() {
		return this.taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	@Column(name = "CORPORATION", length = 64)
	public String getCorporation() {
		return this.corporation;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}

	@Column(name = "CORP_NO", length = 32)
	public String getCorpNo() {
		return this.corpNo;
	}

	public void setCorpNo(String corpNo) {
		this.corpNo = corpNo;
	}

	@Column(name = "CONTACT", length = 64)
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "CONTACTS_TEL_NO", length = 32)
	public String getContactsTelNo() {
		return this.contactsTelNo;
	}

	public void setContactsTelNo(String contactsTelNo) {
		this.contactsTelNo = contactsTelNo;
	}

	@Column(name = "ACC_NAME", length = 128)
	public String getAccName() {
		return this.accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	@Column(name = "ACC_NUM", length = 32)
	public String getAccNum() {
		return this.accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	@Column(name = "BANK_NODE", length = 12)
	public String getBankNode() {
		return this.bankNode;
	}

	public void setBankNode(String bankNode) {
		this.bankNode = bankNode;
	}

	@Column(name = "BANK_CODE", length = 12)
	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	@Column(name = "STATUS", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "IN_USER", precision = 10, scale = 0)
	public Long getInUser() {
		return this.inUser;
	}

	public void setInUser(Long inUser) {
		this.inUser = inUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "IN_TIME", length = 7)
	public Date getInTime() {
		return this.inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	@Column(name = "STEXA_USER", precision = 10, scale = 0)
	public Long getStexaUser() {
		return this.stexaUser;
	}

	public void setStexaUser(Long stexaUser) {
		this.stexaUser = stexaUser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "STEXA_TIME", length = 7)
	public Date getStexaTime() {
		return this.stexaTime;
	}

	public void setStexaTime(Date stexaTime) {
		this.stexaTime = stexaTime;
	}

	@Column(name = "STEXA_OPT", length = 256)
	public String getStexaOpt() {
		return this.stexaOpt;
	}

	public void setStexaOpt(String stexaOpt) {
		this.stexaOpt = stexaOpt;
	}

	@Column(name = "CVLEXA_USER", precision = 10, scale = 0)
	public Long getCvlexaUser() {
		return this.cvlexaUser;
	}

	public void setCvlexaUser(Long cvlexaUser) {
		this.cvlexaUser = cvlexaUser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CVLEXA_TIME", length = 7)
	public Date getCvlexaTime() {
		return this.cvlexaTime;
	}

	public void setCvlexaTime(Date cvlexaTime) {
		this.cvlexaTime = cvlexaTime;
	}

	@Column(name = "CVLEXA_OPT", length = 256)
	public String getCvlexaOpt() {
		return this.cvlexaOpt;
	}

	public void setCvlexaOpt(String cvlexaOpt) {
		this.cvlexaOpt = cvlexaOpt;
	}

	@Column(name = "NOTES", length = 256)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "REMARKS", length = 256)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the tn
	 */
	@Column(name = "TN")
	public String getTn() {
		return tn;
	}

	/**
	 * @param tn the tn to set
	 */
	public void setTn(String tn) {
		this.tn = tn;
	}

	/**
	 * @return the txnamt
	 */
	@Column(name = "TXNAMT")
	public Long getTxnamt() {
		return txnamt;
	}

	/**
	 * @param txnamt the txnamt to set
	 */
	public void setTxnamt(Long txnamt) {
		this.txnamt = txnamt;
	}

	/**
	 * @return the bankName
	 */
	@Column(name = "BANKNAME")
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the busiType
	 */
	@Column(name = "BUSITYPE")
	public String getBusiType() {
		return busiType;
	}

	/**
	 * @param busiType the busiType to set
	 */
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
}
