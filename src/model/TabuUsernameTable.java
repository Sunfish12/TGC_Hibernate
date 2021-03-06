package model;

// Generated 2015/1/6 �W�� 11:59:56 by Hibernate Tools 3.4.0.CR1

/**
 * TabuUsernameTable generated by hbm2java
 */
public class TabuUsernameTable implements java.io.Serializable {

	private int tabuId;
	private Member memberByTabuMemberId;
	private Member memberByToTabuMemberId;
	private String tabuReason;

	public TabuUsernameTable() {
	}

	public TabuUsernameTable(int tabuId) {
		this.tabuId = tabuId;
	}

	public TabuUsernameTable(int tabuId, Member memberByTabuMemberId,
			Member memberByToTabuMemberId, String tabuReason) {
		this.tabuId = tabuId;
		this.memberByTabuMemberId = memberByTabuMemberId;
		this.memberByToTabuMemberId = memberByToTabuMemberId;
		this.tabuReason = tabuReason;
	}

	public int getTabuId() {
		return this.tabuId;
	}

	public void setTabuId(int tabuId) {
		this.tabuId = tabuId;
	}

	public Member getMemberByTabuMemberId() {
		return this.memberByTabuMemberId;
	}

	public void setMemberByTabuMemberId(Member memberByTabuMemberId) {
		this.memberByTabuMemberId = memberByTabuMemberId;
	}

	public Member getMemberByToTabuMemberId() {
		return this.memberByToTabuMemberId;
	}

	public void setMemberByToTabuMemberId(Member memberByToTabuMemberId) {
		this.memberByToTabuMemberId = memberByToTabuMemberId;
	}

	public String getTabuReason() {
		return this.tabuReason;
	}

	public void setTabuReason(String tabuReason) {
		this.tabuReason = tabuReason;
	}

}
